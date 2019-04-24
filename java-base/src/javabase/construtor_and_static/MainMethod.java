package javabase.construtor_and_static;

/**
 * constructor and static 
 * @author DanielYeee
 *
 */
public class MainMethod {

	public static void main(String[] args) {
		/*Retangle r = new Retangle(10,20);
		System.out.println(r.getArea());
		System.out.println(r.getWidth());
		*/
		
		/*Employee e = new Employee("Peter Park","9527",10000);
		System.out.println(e);*/
		
		Static s = new Static();
		s.country = "china";
		Static s2 = new Static();
		s2.country = "america";
		Static.print();//print america
		
	}

}
