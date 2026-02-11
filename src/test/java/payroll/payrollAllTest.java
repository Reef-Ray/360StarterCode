package payroll;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class payrollAllTest {

	@Test
	void test() {
		payrollAll payroll = new payrollAll();

        employee c = new Contractor("Alice", 50);
        employee h = new hourly("Horace", 10);
        employee s = new salary("Sam", 30);

        c.setHoursWorked(30);
        h.setHoursWorked(45);

        payroll.addEmployee(c);
        payroll.addEmployee(h);
        payroll.addEmployee(s);

        double[] pay = payroll.payAllEmployees();

        assertEquals(1500.0, pay[0], 0.001);
        assertEquals(475.0, pay[1], 0.001);
        assertEquals(1200.0, pay[2], 0.001);
	}

}
