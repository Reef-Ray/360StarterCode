package payroll;

public abstract class employee {
    protected String name;
    protected double hourlyRate;
    protected double hoursWorked;

    public employee(String name, double hourlyRate) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = 0;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public String getName() {
        return name;
    }

    public abstract double calculatePay();
}

