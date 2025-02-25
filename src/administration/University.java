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
        for(int i = 0; i < this.classes.size(); i++){
            this.classes.get(i).printClassPartialDetails();
        }
    }

    public CollegeClass findClassById(int id){
        for(int i = 0; i < this.classes.size(); i++){
            if(this.classes.get(i).getId() == id){
                return this.classes.get(i);
            }
        }
        return null;
    }

    public Teacher findTeacherById(int id){
        for(int i = 0; i < this.teachers.size(); i++){
            if(this.teachers.get(i).getId() == id){
                return this.teachers.get(i);
            }
        }
        return null;
    }

    public void addStudent(Student student){
        this.students.add(student);
    }

    public void printStudentClasses(int studentId){
        ArrayList<CollegeClass> studentClasses = new ArrayList<>();
        for (CollegeClass currentClass : this.classes) {
            ArrayList<Student> currentClassStudents = currentClass.getStudents();
            for (Student currentClassStudent : currentClassStudents) {
                if (currentClassStudent.getId() == studentId) {
                    studentClasses.add(currentClass);
                }
            }
        }
        if(studentClasses.isEmpty()){
            System.out.println("No classes were found. Please check the student ID and try again" + "\n");
        }else{
            for(int i = 0; i < studentClasses.size(); i++){
                studentClasses.get(i).printClassPartialDetails();
            }
        }
    }

    public void listAllStudents(){
        for(Student student: this.students){
            student.printStudentDetails();
        }
    }

    public ArrayList<Student> findStudentsById(int[] studentIds){
        ArrayList<Student> foundStudents = new ArrayList<>();
        for(int i = 0; i < studentIds.length; i++){
            int currentId = studentIds[i];
            for(Student student: this.students){
                if(currentId == student.getId()){
                    foundStudents.add(student);
                }
            }
        }
        return foundStudents;
    }
}
