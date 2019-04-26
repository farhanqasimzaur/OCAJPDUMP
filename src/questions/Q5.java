package questions;

/**
 * @author Farhan Zaur
 *	What is the result?
 *	(A)400 200
 *	(B)200 200
 *	(C)400 400
 *	(D)Compilation Fails
 */
public class Q5 {

	public static void main(String[] args){
		int var1 = 200;
		System.out.println(doCalc(var1));
		System.out.println(" "+var1);
	}
	
	static int doCalc(int var1){
		var1 = var1 * 2;
		return var1;
	}
	
}
