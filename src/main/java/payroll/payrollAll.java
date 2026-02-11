package payroll;

import java.util.ArrayList;
import java.util.List;

public class payrollAll {

    private List<employee> employees;

    public payrollAll() {
        employees = new ArrayList<>();
    }

    public void addEmployee(employee employee) {
        employees.add(employee);
    }

    public double[] payAllEmployees() {
        double[] payments = new double[employees.size()];

        for (int i = 0; i < employees.size(); i++) {
            payments[i] = employees.get(i).calculatePay();
        }

        return payments;
    }
}