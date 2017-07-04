package guvi;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int n,fact=1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		n=s.nextInt();
		if(n<0)
		System.out.println("type a positive number");
		else
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial of "+n+"is"+fact);
	}

}
