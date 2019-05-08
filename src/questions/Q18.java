package questions;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Farhan Zaur
 *
 *	Given the code, which part inserted at line 18 enables the code to print mike found.
 *
 * Options
 * (A) int f = ps.indexOf(p2);
 * (B) int f = ps.indexOf(Patient("Mike"));
 * (C) int f = ps.indexOf(new Patient "Mike"));
 * (D) Patient p = new Patient("Mike");
 * 	   Int f = ps.indexOf(p);
 */
public class Q18 {

	public static void main(String[] args) {
		List ps = new ArrayList<>();
		Patient p2 = new Patient("Mike");
		ps.add(p2);
		//INSERT CODE here
		if(f >= 0){
			System.out.println("Mike Found");
		}
	}

}

class Patient{
	String name;
	public Patient(String name){
		this.name = name;
	}
}
