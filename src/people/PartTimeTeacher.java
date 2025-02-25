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
        //the following line rounds the real salary to three decimal points
        realSalary = Math.round(realSalary * 1000.0) / 1000.0;
        setSalary(realSalary);
    }
}
