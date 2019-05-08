package questions;

/**
 * @author Farhan Zaur
 *	Where does the code create compilation error?
 *	(A)Line 15
 *	(B)Line 20
 *	(C)Line 15 and 20 both
 */
public class Q20 {

	String name;
	int age = 25;
	
	public Q20(String name){
		this();
		setName(name);
	}
	
	public Q20(String name, int age){
		Q20(name);
		setAge(age);
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String show(){
		return name + " " + age + " " + 1;
	}
	

}
