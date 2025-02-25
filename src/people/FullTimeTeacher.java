package people;

public class FullTimeTeacher extends Teacher {
    private double baseSalary;

    public FullTimeTeacher(String name, double yearsOfExperience, double weeklyHours, double baseSalary) {
        super(name, yearsOfExperience, weeklyHours);
        this.baseSalary = baseSalary;
        calculateSalary();
    }

    public double getBaseSalary() {
        return baseSalary;
    }


    public void calculateSalary(){
        double realSalary = getBaseSalary()*getWeeklyHours();
        setSalary(realSalary);
    }
}
