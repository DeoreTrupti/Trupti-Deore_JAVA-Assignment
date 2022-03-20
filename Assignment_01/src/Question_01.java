/*
 Write a program called Fibonacci to display the first 20 Fibonacci numbers F(n),where F(n)=F(n–1)+F(n–2) and F(1)=F(2)=1. Also compute their average. The output shall look like:
 	The first 20 Fibonacci numbers are:
		1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765
				 	The average is 885.5
 */

public class Question_01 {
	public static void main(String[] args) {
		int a=1, b=1, range, c, sum=0; 
		range=1;
		System.out.println("The first 20 Fibonacci numbers are:"); 
		   while( range<=20 )
		   {
		     
		     System.out.print(a +" ");
		      sum =sum+ a;
		      c = a + b;
		      a = b;
		      b = c;
		      range++;
		   }
	       
		   System.out.printf("The average is  %.4f \n", (double)sum /20);
	
	}
}


