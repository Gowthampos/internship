package javawork;

public class ex10 {

	public static void main(String[] args) {
		/* Suppose the values of variables 'a' and 'b' are 6 and 8 
		 * respectively, write two programs to swap the values of the two variables.
1 - first program by using a third variable
2 - second program without using any third variable
*/
       int a=6,b=8;
       //Swap using third variable
      int c=a;
      a=b;
      b=c;
      System.out.println("Before Swap the value of a is "+a+" b is "+b);
      System.out.println("After Swap using third variable the value of a is "+a+" b is "+b);
      a=6;
      b=8;
      //Swap without a variable
      a=a+b;
      b=a-b;
      a=a-b;
      System.out.println("After Swap without using third variable the value of a is "+a+" b is "+b);
	}

}
