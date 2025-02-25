package people;
import utils.Utils;


public abstract class Teacher extends Person {
    //here we define an abstract class Teacher that inherits from Person. The reason this is an abstract class is because every full time or part time teacher will have a salary, years of experience and weekly active hours, so we save code by defining this properties in an abstract class
    private double salary;
    private double yearsOfExperience;
    private double weeklyHours;

    public Teacher(String name, double yearsOfExperience, double weeklyHours) {
        setName(name);
        //we set the id automatically as a random number between 0 and 999
        setId(Utils.rand.nextInt(1000));
        this.yearsOfExperience = yearsOfExperience;
        this.weeklyHours = weeklyHours;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(double yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public double getWeeklyHours() {
        return weeklyHours;
    }

    public void setWeeklyHours(double weeklyHours) {
        this.weeklyHours = weeklyHours;
    }

    public void printTeacherDetails(){
        System.out.println("Teacher ID: " + getId() + "\nName: " + getName() + "\nSalary: " + getSalary() + "\nYears of Experience: " + getYearsOfExperience() + "\nWeekly hours: " + getWeeklyHours() + "\n");
    }

    //abstract method that will enforce polymorphism for the child classes FullTimeTeacher and PartTimeTeacher. The reason for this is that the salary has to be calculated in both classes, but each one of them does it differently
    public abstract void calculateSalary();
}
