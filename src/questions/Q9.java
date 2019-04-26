package questions;

public class Q9 {
	
	/**
	 * @param args
	 * What is the output?
	 * (A)C B A
	 * (B)C
	 * (C)A B C
	 * (D)Compilation fails at line 23 and 24
	 */
	public static void main(String[] args) {
		C c = new C();
	}
}

class A{
	public A(){
		System.out.print("A ");
	}
}
class B extends A{
	public B(){
		System.out.print("B ");
	}
}
class C extends B{
	public C(){
		System.out.print("C ");
	}

}
