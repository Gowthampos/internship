package javawork;

public class ex12 {

	public static void main(String[] args) {
		/* The total number of students in a class are 90 out of which 45 are boys. 
		 * If 50% of the total students secured grade 'A' out of which 20 are boys, 
		 * then write a program to calculate the total number of girls 
		 * getting grade 'A'.
		 */
		int total =90;
		// 50% of total is 45
		int per = total/2;
		int girls_secured = per - 20;
		System.out.println("Girls who got A grade are :"+girls_secured);
	}

}
