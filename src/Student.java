import java.util.Random;

public class Student {
    private String name;
    private int id;
    private int age;

    public Student(String name, int age) {
        Random rand = new Random();
        this.name = name;
        this.age = age;
        this.id = rand.nextInt(1000);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
