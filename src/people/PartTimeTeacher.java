package people;

public class PartTimeTeacher extends Teacher {
    private double baseSalary;

    public PartTimeTeacher(String name, double yearsOfExperience, double weeklyHours, double baseSalary) {
        super(name, yearsOfExperience, weeklyHours);
        this.baseSalary = baseSalary;
        calculateSalary();
    }

    public double getBaseSalary() {
        return baseSalary;
    }


    public void calculateSalary(){
        double realSalary = getBaseSalary()*1.1;
        setSalary(realSalary);
    }
}
