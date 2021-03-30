package javawork;
import java.util.*;
public class ex11 {

	public static void main(String[] args) {
		// Write a program to convert Fahrenheit into Celsius.
       Scanner sc = new Scanner(System.in);
       double a;
       System.out.println("Enter Fahrenheit value:");
       a=sc.nextDouble();
       double res=((a-32)*5)/9;
       System.out.println("Celcius temperature is "+String.format("%.2f",res));
       
	}

}
