package payroll;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class payrollAllTest {

	@Test
	void test() {
		payrollAll p = new payrollAll();

        employee c = new Contractor("Alice", 50);
        employee h = new hourly("Horace", 10);
        employee s = new salary("Sam", 30);

        c.setHoursWorked(30);
        h.setHoursWorked(45);

        p.addEmployee(c);
        p.addEmployee(h);
        p.addEmployee(s);

        double[] pay = p.payAllEmployees();

        assertEquals(1500.0, pay[0], 0.001);
        assertEquals(475.0, pay[1], 0.001);
        assertEquals(1200.0, pay[2], 0.001);
	}

}
