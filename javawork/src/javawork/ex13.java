package javawork;
import java.util.*;
public class ex13 {

	public static void main(String[] args) {
		/* Write a program to calculate the sum of the first and the second last digit of a 5 digit.
E.g.- NUMBER : 12345        OUTPUT : 1+4=5*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5Digit no:");
		long n= sc.nextLong();
		long x;
		n/=10;
		n/=10;
		x=n%10;
		while(n>=10)
		{
			n=n/10;
		}
		System.out.println("Sum of first digit "+n+" last digit is "+x+" is "+(n+x));
		
		
		

	}

}
