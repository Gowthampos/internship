package javawork;

public class ex8 {

	public static void main(String[] args) {
		/* Assign values of variables 'a' and 'b' as 55 and 70
		 * respectively and then check if both the conditions 
		 * 'a < 50' and 'a < b' check if atleast one of 
		 * the condition is true.
		 */
		int a=55,b=70;
		if(a<50 || a<b)
		{
			System.out.println("True");
		}
		else
			System.out.println("False");
	}

}
