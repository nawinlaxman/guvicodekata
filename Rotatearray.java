package guvi;
import java.util.*;
import java.io.*;

public class Rotatearray 
{
	public static void main(String []args)
	{
		int n,k;
		Scanner in=new Scanner(System.in);
		System.out.println("enter the limit of array");
	    n=in.nextInt();
		System.out.println("enter the number steps to be rotated");
	    k=in.nextInt();
	    int []num=new int[n];
		System.out.println("enter the elements of array");
	    for(int i=0;i<n;i++)
	    {
	    num[i]=in.nextInt();
	    }
	    while(k>0)
	    {
	    int temp=num[n-1];
	    int i;
	    for(i=n-1;i>0;i--)
	    {
	    num[i]=num[i-1];
	    }
	    num[0]=temp;
	    k--;
	    }
	    System.out.println("Rotated Array is");
	    for(int i=0;i<n;i++)
	    {
	    System.out.print(num[i]);
	    }
	}
}
