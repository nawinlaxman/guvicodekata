package guvi;

import java.util.Scanner;

public class Reversedigits {

	public static void main(String[] args) {
		int n,rev=0;
		Scanner s= new Scanner(System.in);
		System.out.println("enter the number");
		n=s.nextInt();
		while(n!=0)
		{
		rev= rev*10;
		rev= rev+n%10;
		n=n/10;
		}
		System.out.println("Reverse of that number is "+rev);
	}

}
