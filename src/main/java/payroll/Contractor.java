package payroll;

public class Contractor extends employee {

    public Contractor(String name, float hourlyRate) {
        super(name, hourlyRate);
    }

    @Override
    public double calculatePay() {
        return hoursWorked * hourlyRate;
    }
}