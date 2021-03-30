package javawork;

public class ex6 {

	public static void main(String[] args) {
		// Write a program to print the power of 7 raised to 5
        int a=7;
        int b= 5;
        long res=1;
        while(b!=0)
        {
        	res*=a;
        	b--;
        }
        System.out.println("Power of 7 raised to 5 is "+res);
	}

}
