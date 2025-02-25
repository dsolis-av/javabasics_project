package people;

import utils.Utils;

import java.util.Random;

public class Student extends Person {
    private int age;

    public Student(String name, int age) {
        this.age = age;
        setName(name);
        //we set the id automatically as a random number between 0 and 999
        setId(Utils.rand.nextInt(1000));
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printStudentDetails(){
        System.out.println("Student ID: " + getId() + "\nName: " + getName() + "\nAge: " + getAge() + "\n");
    }
}
