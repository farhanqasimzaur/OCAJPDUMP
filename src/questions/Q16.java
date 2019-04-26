package questions;



/**
 * @author Farhan Zaur
 *	Given the following code:
 *
 *	What is the ouput?
 *	
 *	(A)
 *		planets
 *		Earth
 *		1
 *
 *	(B)
 *		[Lquestions.Planet;@15db9742
 *		Earth
 *		1
 *	(C)
 *		[Lquestions.Planet;@15db9742
 *		questions.Planet@6d06d69c
 *		1
 *		
 *	(D)
 *		[Lquestions.Planet;@15db9742
 *		questions.Planet@6d06d69c
 *		[Lquestions.moon;@7852e922
 *	(E)
 *		[Lquestions.Planet;@15db9742
 *		Venus
 *		0
 *		
 *		
 *
 */
public class Q16 {
	public static void main(String[] args) {
		Planet[] planets = {
				new Planet("Mercury",0),
				new Planet("Venus",0),
				new Planet("Earth",1),
				new Planet("Mars",2)
		};
		
		System.out.println(planets);
		System.out.println(planets[2]);
		System.out.println(planets[2].moons);
		
	}

}

class Planet{
	public String name;
	public int moons;
	
	public Planet(String name, int moons){
		this.name = name;
		this.moons = moons;
	}
}
