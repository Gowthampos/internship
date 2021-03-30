package javawork;
import java.util.*;
public class ex15 {

	public static void main(String[] args) {
		/* Write a program to calculate the sum of the digits of a 3-digit number.
Number : 132        Output : 6*/
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a 3 digit no");
       int n = sc.nextInt();
       int res=0;
       while(n>0)
       {
    	   res = res + n%10;
    	   n/=10;
       }
       System.out.println(res);
	}

}
