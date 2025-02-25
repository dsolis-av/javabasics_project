package ui;

import people.FullTimeTeacher;
import people.PartTimeTeacher;
import people.Teacher;
import people.Student;
import administration.CollegeClass;
import administration.University;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //here we instantiate teachers and define the initial teachers list for our university
        FullTimeTeacher fullTeacher1, fullTeacher2;
        PartTimeTeacher partTeacher1, partTeacher2;
        ArrayList<Teacher> initialTeachers = new ArrayList<>(Arrays.asList(
                fullTeacher1 = new FullTimeTeacher("Felipe Suarez", 2.2, 48.2, 2000.2),
                fullTeacher2 = new FullTimeTeacher("Andres Lopez", 5.2, 40.3, 3000.6),
                partTeacher1 = new PartTimeTeacher("Mario Hernandez", 9.2, 30.3, 5000.6),
                partTeacher2 = new PartTimeTeacher("Julio Rodriguez", 2.2, 46.3, 1000.39)
        ));
        //here we instantiate students and define the initial student groups for our university
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
        //we merge the two groups of students to set up a global list of students for our university
        ArrayList<Student> mergedGroups = new ArrayList<>();
        mergedGroups.addAll(group1);
        mergedGroups.addAll(group2);

        //here we instantiate the initial classes for our university. Note that the group of students has to be a separate reference for each class
        CollegeClass class1, class2, class3, class4;
        ArrayList<CollegeClass> initialClasses = new ArrayList<>(Arrays.asList(
                class1 = new CollegeClass("Chemistry", "201", fullTeacher1, group1),
                class2 = new CollegeClass("Math", "302-B", partTeacher1, group2),
                class3 = new CollegeClass("Physics", "402-A", fullTeacher2, new ArrayList<>(group1)),
                class4 = new CollegeClass("Geography", "402-A", partTeacher2, new ArrayList<>(group2))
        ));
        //here we instantiate our university and start the ui
        University university = new University(initialTeachers, mergedGroups, initialClasses);
        UniversityUI ui = new UniversityUI(university);
        ui.start();
    }
}
