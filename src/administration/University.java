package administration;

import people.Student;
import people.Teacher;

import java.util.ArrayList;

public class University {
    private ArrayList<Teacher> teachers;
    private ArrayList<Student> students;
    private ArrayList<CollegeClass> classes;

    public University(ArrayList<Teacher> teachers, ArrayList<Student> students, ArrayList<CollegeClass> classes) {
        this.teachers = teachers;
        this.students = students;
        this.classes = classes;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<CollegeClass> getClasses() {
        return classes;
    }

    public void setClasses(ArrayList<CollegeClass> classes) {
        this.classes = classes;
    }

    public void addClass(CollegeClass aClass){
        classes.add(aClass);
    }

    public void listAllTeachers(){
        for(int i = 0; i < this.teachers.size(); i++){
            this.teachers.get(i).printTeacherDetails();
        }
    }

    public void listAllClasses(){
        //method to print all university classes
        for(int i = 0; i < this.classes.size(); i++){
            this.classes.get(i).printClassPartialDetails();
        }
    }

    public CollegeClass findClassById(int id){
        //method to get a CollegeClass by its id, traversing the class list and returning a class with matching id, and null otherwise
        for(int i = 0; i < this.classes.size(); i++){
            if(this.classes.get(i).getId() == id){
                return this.classes.get(i);
            }
        }
        return null;
    }

    public Teacher findTeacherById(int id){
        //method to get a Teacher by its id, traversing the teacher list and returning a teacher with matching id, and null otherwise
        for(int i = 0; i < this.teachers.size(); i++){
            if(this.teachers.get(i).getId() == id){
                return this.teachers.get(i);
            }
        }
        return null;
    }

    public void addStudent(Student student){
        //add student to the GLOBAL list of students
        this.students.add(student);
    }

    public void printStudentClasses(int studentId){
        //method get the asociated classes for an student id.
        //first, we set up the list of found studentClasses
        ArrayList<CollegeClass> studentClasses = new ArrayList<>();
        //next, we traverse the GLOBAL list of classes
        for (CollegeClass currentClass : this.classes) {
            //now, for each class, we traverse its list of students
            ArrayList<Student> currentClassStudents = currentClass.getStudents();
            for (Student currentClassStudent : currentClassStudents) {
                //if there's an student with matching id in the list of students for the class, it means that the student with the querying id is enrolled in that class
                if (currentClassStudent.getId() == studentId) {
                    //so we add it to the list
                    studentClasses.add(currentClass);
                }
            }
        }
        if(studentClasses.isEmpty()){
            System.out.println("No classes were found. Please check the student ID and try again" + "\n");
        }else{
            //print the class partial details for the found classes
            for(int i = 0; i < studentClasses.size(); i++){
                studentClasses.get(i).printClassPartialDetails();
            }
        }
    }

    public void listAllStudents(){
        //list all students in the GLOBAL student list
        for(Student student: this.students){
            student.printStudentDetails();
        }
    }

    public ArrayList<Student> findStudentsById(int[] studentIds){
        //method to find a group of students based on an array of ids.
        //first, we define the list of foundStudents
        ArrayList<Student> foundStudents = new ArrayList<>();
        //now, we traverse the array of querying ids
        for(int i = 0; i < studentIds.length; i++){
            //for each id in the querying ids array, we check the GLOBAL list of students
            int currentId = studentIds[i];
            for(Student student: this.students){
                //if there's a match, we add the student to the list of found students
                if(currentId == student.getId()){
                    foundStudents.add(student);
                }
            }
        }
        return foundStudents;
    }
}
