package wk6_lecture;

public class PayrollSystemTest {
	public static void main(String[] args) {
		CommissionEmployee commissionEmployee = new CommissionEmployee("Bob", "Barker", "111-11-1111", 10000, .06);

		System.out.printf("%s%n%s: $%.2f%n%n", commissionEmployee, "Earned", commissionEmployee.earnings());

		HourlyEmployee hourlyEmployee = new HourlyEmployee("Paul", "Walker", "222-22-2222", 16.75, 40);

		System.out.printf("%s%n%s: $%.2f%n%n", hourlyEmployee, "Earned", hourlyEmployee.earnings());

		SalariedEmployee salariedEmployee = new SalariedEmployee("Michael", "Jordan", "333-33-3333", 1000000);

		System.out.printf("%s%n%s: $%.2f%n%n", salariedEmployee, "Earned", salariedEmployee.earnings());

		///////////////////////////////////////////////////////////////////////////////////////////////////////////

		System.out.println("////////////////////////////////////////////////////////////////////////////////////////\n");

		Employee[] employees = new Employee[] { commissionEmployee, hourlyEmployee, salariedEmployee };
		for (Employee emp : employees) {
			System.out.printf("%s%n%s: $%.2f%n%n", emp, "Earned", emp.earnings());
		}
	}
}
