package people;

import utils.Utils;

import java.util.Random;

public class Student extends Person {
    private int age;

    public Student(String name, int age) {
        this.age = age;
        setName(name);
        setId(Utils.rand.nextInt());
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStudentDetails(){
        return "ID:" + getId() + "\nName:" +  "\nAge:" + getAge();
    }
}
