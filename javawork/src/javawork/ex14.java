package javawork;
import java.util.*;
public class ex14 {

	public static void main(String[] args) {
		/* Take a 4 digit number. Write a program to display a number whose digits are 2 greater than the corresponding digits of the number TAKEN.
For example, if the number which was taken is 5696, then the displayed number should be 7818.*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a four digit number");
		int n=sc.nextInt();
		int total=0,x;
		while(n>0)
		{
			x=n%10+2;
			while(x>=10)
			{
				x=x/10;
			}
			total = total*10 +x;
			//System.out.println(total);
			n=n/10;
		}
		int res=0;
		while(total>0)
		{
			res = res*10 + total%10;
			total/=10;
		}
		System.out.println(res);
		
	}

}
