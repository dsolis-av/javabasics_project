public class PartTimeTeacher extends Teacher {
    private double baseSalary;

    public PartTimeTeacher(String name, int yearsOfExperience, int weeklyHours, double baseSalary) {
        super(name, yearsOfExperience, weeklyHours);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }


    public void calculateSalary(){
        double realSalary = getBaseSalary()*1.1;
        setSalary(realSalary);
    }
}
