package src.main;

/**
 * @author Farhan Zaur
 *	Given the code fragment:
 *	What is the result?
 *	(A)10 : 10
 *	(B)5 : 5
 *	(C)5 : 10
 *	(D)Compilation Fails
 */
public class Q4 {

	static int count  = 0;
	int i = 0;
	
	public void changeCount(){
		while(i < 5){
			i++;
			count++;
		}
	}
	
	public static void main(String[] args) {
		Q4 check1 = new Q4();
		Q4 check2 = new Q4();
		check1.changeCount();
		check2.changeCount();
		System.out.println(check1.count + " : " + check2.count);
	}

}
