package payroll;

public class hourly extends employee {

    public hourly(String name, float hourlyRate) {
        super(name, hourlyRate);
    }

    @Override
    public double calculatePay() {
        if (hoursWorked <= 40) {
            return hoursWorked * hourlyRate;
        } else {
            double overtimeHours = hoursWorked - 40;
            return (40 * hourlyRate) + (overtimeHours * hourlyRate * 1.5);
        }
    }
}