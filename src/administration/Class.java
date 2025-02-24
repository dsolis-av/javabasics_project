package administration;

import people.Student;
import people.Teacher;
import utils.Utils;

import java.util.ArrayList;

public class Class {
    private int id;
    private String className;
    private String classRoom;
    private ArrayList<Student> students;
    private Teacher teacher;

    public Class(String className, String classRoom, Teacher teacher, ArrayList<Student> students) {
        this.className = className;
        this.classRoom = classRoom;
        this.teacher = teacher;
        this.students = students;
        this.id = Utils.rand.nextInt(1000);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void addStudent(Student student){
        this.students.add(student);
    }
}
