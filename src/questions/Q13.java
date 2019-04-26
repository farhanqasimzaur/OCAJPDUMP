package questions;

class D{
	public void test(){
		System.out.println("A");
	}
}

class E extends D{
	public void test(){
		System.out.println("B");
	}
}
class F extends E{
	public void test(){
		System.out.println("C");
	}
}

/**
 * @author Farhan Zaur
 *	What is the result?
 *	(A)A B
 *	(B)A C
 *	(C)C C
 */
public class Q13 {

	public static void main(String[] args) {
		D b1 = new D();
		D b2 = new F();
		b1 = (D)b2;
		D b3 = (E) b2;
		b1.test();
		b3.test();
		

	}
}

