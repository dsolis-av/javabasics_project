package people;
import utils.Utils;


public abstract class Teacher extends Person {
    private double salary;
    private double yearsOfExperience;
    private double weeklyHours;

    public Teacher(String name, double yearsOfExperience, double weeklyHours) {
        setName(name);
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

    public abstract void calculateSalary();
}
