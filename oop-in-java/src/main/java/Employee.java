public class Employee {
    private int baseSalary;
    private int hourlyRate;
    public static int numberOfEmployees;

    public  Employee(int baseSalary, int hourlyRate) {
        setHourlyRate(hourlyRate);
        SetBaseSalary(baseSalary);
        numberOfEmployees++;
    }

    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }

    public int calculateWage() {
        return calculateWage(0);
    }

    public void SetBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("baseSalary cannot be 0 or less.");
        else
            this.baseSalary = baseSalary;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }
}
