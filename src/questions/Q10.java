package questions;

public class Q10 {

	/**
	 * @param args
	 * What is the output of the program?
	 * 
	 * (A)Compilation Fails
	 * (B)10 Hello Universe!
	 * (C)10 Hello World!
	 * (D)9 Hello World!
	 */
	public static void main(String[] args) {
		int aVar = 9;
		if(aVar ++  < 10){
			System.out.println(aVar + " Hello World!");
		}else{
			System.out.println(aVar + " Hello Universe!");
		}
	}

}
