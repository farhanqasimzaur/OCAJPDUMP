package questions;

public class Q12 {

	public static void main (String[] args){
	//Given the below array
		
		String shirts[][] = new String[2][2];
		shirts[0][0] = "red";
		shirts[0][1] = "blue";
		shirts[1][0] = "small";
		shirts[1][1] = "medium";
	// Which code fragment prints red:blue:small:medium
		
		System.out.println("Option A");
		
		for(int index = 1; index < 2; index++){
			for(int idx = 1; idx < 2; idx++){
				System.out.print(shirts[index][idx] + ":");
			}
		}
		System.out.println("");
		
		System.out.println("Option B");
		
		for(int index = 0; index < 2; ++index){
			for(int idx = 0; idx < index; ++idx){
				System.out.print(shirts[index][idx] + ":");
			}
		}
		
		/*
		System.out.println();
		System.out.println("Option C");
		System.out.println();
		
		for(String c : colors){
			for(String s: sizes){
				System.out.println(s + ":");
			}
		}*/
		//Hint: The above does not print :P
		
		System.out.println();
		System.out.println("Option D");
		
		for(int index = 0; index < 2;){
			for(int idx = 0; idx < 2;){
				System.out.print(shirts[index][idx]+":");
				idx++;
			}
			index++;
		}
	}
}
