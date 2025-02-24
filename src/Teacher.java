public abstract class Teacher {
    private String name;
    private double salary;
    private int yearsOfExperience;
    private int weeklyHours;

    public Teacher(String name, int yearsOfExperience, int weeklyHours) {
        this.name = name;
        this.yearsOfExperience = yearsOfExperience;
        this.weeklyHours = weeklyHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public int getWeeklyHours() {
        return weeklyHours;
    }

    public void setWeeklyHours(int weeklyHours) {
        this.weeklyHours = weeklyHours;
    }

    public abstract void calculateSalary();
}
