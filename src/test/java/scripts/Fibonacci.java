package scripts;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) 
	{
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Type the number");
		int n=sc.nextInt();
		
		int a=0,b=1, c;
		System.out.println(a);
		System.out.println(b);
		c=a+b;
		System.out.println(c);
		while (c<n)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.println(c);
		}
		
		

	}

}
