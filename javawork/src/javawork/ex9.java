package javawork;

public class ex9 {

	public static void main(String[] args) {
		/*If the marks of Robert in three subjects are 78,45 and 62 respectively 
		 * (each out of 100 ), write a program to calculate his total 
		 * marks and percentage marks.
		 */
         double a=78,b=45,c=62;
         double total = a+b+c;
         double d = total/300;
         System.out.println("Total marks :"+total);
         System.out.println("Percentage :"+String.format("%.2f",d*100));

	}

}
