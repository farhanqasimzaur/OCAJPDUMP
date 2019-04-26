package questions;

public class Q15 {

	public static void main(String[] args) {
		
		int[] intArr = {15, 30, 45, 60, 75};
		intArr[2] = intArr[4];
		intArr[4] = 90;
		
		
		/*What are the values of each element in intArr after above code has executed? */
		
		/*
		 * (A)15,60,45,90,75
		 * (B)15,90,45,90,75
		 * (C)15,30,75,60,90
		 * (D)15,30,90,60,90
		 * (E)15,4,45,60,90
		 */
		
		
		for(int i=0; i<intArr.length;i++){
			System.out.print(intArr[i] + " ");
		}

	}

}
