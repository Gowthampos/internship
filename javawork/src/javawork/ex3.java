package javawork;

public class ex3 {

	public static void main(String[] args) {
		/*Write a program to add 8 to the number 2345 
		 * and then divide it by 3. Now, the modulus of 
		 * the quotient is taken with 5 and then multiply 
		 * the resultant value by 5. Display the final result.
		 */
		int a = 2345;
		int b = a+8;
		int c = b/3;
		int d = c%5;
		System.out.println(d);

	}

}
