package people;

public class PartTimeTeacher extends Teacher {
    private double baseSalary;

    public PartTimeTeacher(String name, double yearsOfExperience, double weeklyHours, double baseSalary) {
        super(name, yearsOfExperience, weeklyHours);
        this.baseSalary = baseSalary;
        //we have to calculate the real salary at the moment the object is instantiated. The real salary is going to be stored in the original salary attribute defined in the parent class Teacher
        calculateSalary();
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    //here, we implement the abstract method calculateSalary declared in the parent class Teacher
    public void calculateSalary(){
        //for part time teachers, real salary corresponds to the base salary * 110%
        double realSalary = getBaseSalary()*1.1;
        //the following line rounds the real salary to three decimal points
        realSalary = Math.round(realSalary * 1000.0) / 1000.0;
        setSalary(realSalary);
    }
}
