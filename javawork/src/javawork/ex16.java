package javawork;
import java.util.*;
public class ex16 {

	public static void main(String[] args) {
		// Write a program to reverse a 3-digit number. E.g.-Number : 132        Output : 231
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a 3 digit no:");
    int n =sc.nextInt();
    int reverse = 0;
    while(n>0)
    {
    	reverse = reverse*10 + n%10;
    	n/=10;
    }
    System.out.println(reverse);
	}

}
