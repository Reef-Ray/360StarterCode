package payroll;

public class salary extends employee {

    public salary (String name, float hourlyRate) {
        super(name, hourlyRate);
    }

    @Override
    public double calculatePay() {
        return 40 * hourlyRate;
    }
}