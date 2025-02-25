import people.FullTimeTeacher;
import people.*;
import administration.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //teachers
        FullTimeTeacher fullTeacher1, fullTeacher2;
        PartTimeTeacher partTeacher1, partTeacher2;
        ArrayList<Teacher> initialTeachers = new ArrayList<>(Arrays.asList(
                fullTeacher1 = new FullTimeTeacher("Felipe Suarez", 2.2, 48.2, 2000.2),
                fullTeacher2 = new FullTimeTeacher("Andres Lopez", 5.2, 40.3, 3000.6),
                partTeacher1 = new PartTimeTeacher("Mario Hernandez", 9.2, 30.3, 5000.6),
                partTeacher2 = new PartTimeTeacher("Julio Rodriguez", 2.2, 46.3, 1000.39)
        ));

        //students
        Student student1, student2, student3, student4, student5, student6;
        ArrayList<Student> group1 = new ArrayList<>(Arrays.asList(
                student1 = new Student("Omar Perez", 18),
                student2 = new Student("Laura Martinez", 20),
                student3 = new Student("Carlos Gonzalez", 22)
        ));
        ArrayList<Student> group2 = new ArrayList<>(Arrays.asList(
                student4 = new Student("Ana Ramirez", 19),
                student5 = new Student("David Lopez", 21),
                student6 = new Student("Maria Fernandez", 23)
        ));
        ArrayList<Student> mergedGroups = new ArrayList<>();
        mergedGroups.addAll(group1);
        mergedGroups.addAll(group2);

        //classes
        CollegeClass class1, class2, class3, class4;
        ArrayList<CollegeClass> initialClasses = new ArrayList<>(Arrays.asList(
            class1 = new CollegeClass("Chemistry", "201", fullTeacher1, group1),
            class2 = new CollegeClass("Math", "302-B", partTeacher1, group2),
            class3 = new CollegeClass("Physics", "402-A", fullTeacher2, new ArrayList<>(group1)),
            class4 = new CollegeClass("Geography", "402-A", partTeacher2, new ArrayList<>(group2))
        ));
        //university
        University university = new University(initialTeachers, mergedGroups, initialClasses);

        //main menu
        Scanner scanner = new Scanner(System.in);
        String selectedOption = "";

        while(!selectedOption.equals("E")){
            System.out.println("------------------------------------");
            System.out.println("Please select an option or enter \"E\" to exit");
            System.out.println("Enter \"1\" - Print all professors");
            System.out.println("Enter \"2\" - Print all students");
            System.out.println("Enter \"3\" - Print all classes");
            System.out.println("Enter \"4\" - Create a new student");
            System.out.println("Enter \"5\" - Create a new class");
            System.out.println("Enter \"6\" - List all classes for a student");
            System.out.print("Please enter your option: ");
            selectedOption = scanner.nextLine();
            System.out.print("\n");
            switch (selectedOption) {
                case "1":
                    university.listAllTeachers();
                    break;
                case "2":
                    university.listAllStudents();
                    break;
                case "3":
                    university.listAllClasses();
                    System.out.print("Enter a class ID to see more detailed information: ");
                    int classId = scanner.nextInt();
                    CollegeClass classById = university.findClassById(classId);
                    if (classById != null) {
                        classById.printClassDetails();
                    } else {
                        System.out.println("There's no class with such class ID. Please try again with a correct class ID" + "\n");
                    }
                    scanner.nextLine();
                    break;
                case "4":
                    System.out.print("Enter the name of the new student: ");
                    String newStudentName = scanner.nextLine();
                    System.out.print("Enter the age of the new student: ");
                    int newStudentAge = scanner.nextInt();
                    System.out.print("Enter the ID of an existing class to enroll the student: ");
                    int existingClassId = scanner.nextInt();
                    CollegeClass foundClass = university.findClassById(existingClassId);
                    if (foundClass != null) {
                        Student newStudent = new Student(newStudentName, newStudentAge);
                        foundClass.addStudent(newStudent);
                        university.addStudent(newStudent);
                        System.out.println("Student added successfully!" + "\n");
                    } else {
                        System.out.println("The entered class ID does not exist. Please try again with a correct class ID" + "\n");
                    }
                    scanner.nextLine();
                    break;
                case "5":
                    System.out.print("Enter the class name: ");
                    String newClassName = scanner.nextLine();
                    System.out.print("Enter the classroom: ");
                    String newClassRoom = scanner.nextLine();
                    System.out.print("Enter an existing teacher ID to be assigned to the class: ");
                    int newTeacherId = scanner.nextInt();
                    scanner.nextLine();
                    Teacher newTeacher = university.findTeacherById(newTeacherId);
                    System.out.print("Enter the student IDs to be enrolled separated by commas: ");
                    String newStudents = scanner.nextLine();
                    String[] studentIdStrings = newStudents.split(",");
                    int[] studentIds = new int[studentIdStrings.length];
                    for (int i = 0; i < studentIdStrings.length; i++) {
                        studentIds[i] = Integer.parseInt(studentIdStrings[i].trim());
                    }
                    ArrayList<Student> foundStudents = university.findStudentsById(studentIds);
                    if(newTeacher != null && !foundStudents.isEmpty()){
                        CollegeClass newClass = new CollegeClass(newClassName, newClassRoom, newTeacher, foundStudents);
                        university.addClass(newClass);
                        System.out.println("Class added successfully!");
                    }else{
                        System.out.println("Couldn't create class. Please verify that the teacher ID exists or that any of the given student IDs exists");
                    }
                    break;
                case "6":
                    System.out.print("Enter the ID of the student: ");
                    int studentId = scanner.nextInt();
                    university.printStudentClasses(studentId);
                    scanner.nextLine();
                    break;
                case "E":
                    System.out.println("Goodbye!");
                    break;
            }
        }
    }
}