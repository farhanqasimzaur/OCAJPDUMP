package questions;

/**
 * @author Farhan Zaur
 *	Question: Which of the following options when written inside after line N1 fail to compile?
 *
 *	(A)employee.salary = 50_000;
 *	(B)director.salary = 80_000;
 *	(C)employee.budget = 200_000;
 *	(D)manager.budget = 1_000_000;
 *	(E)manager.stockOption = 500;
 *	(F)director.stockOption = 1_000;
 */

public class Q22 {

	public static void main(String[] args) {
		Employee employee = new Employee();
		Manager manager = new Manager();
		Director director = new Director();
		//Line N1
		
		/* I am putting all and commenting those which fail to run ;) */
		employee.salary = 50_000;
		director.salary = 80_000;
		/*employee.budget = 200_000;*/
		manager.budget = 1_000_000;
		/*manager.stockOptions = 500;*/
		director.stockOptions = 1_000;
	}

}

class Employee{
	public int salary;
}
class Manager extends Employee{
	public int budget;
}
class Director extends Manager{
	public int stockOptions;
}