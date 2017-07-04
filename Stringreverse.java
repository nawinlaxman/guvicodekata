package guvi;

import java.util.Scanner;

public class Stringreverse 
{
	public static void main (String args[])
	{
		Scanner s=new Scanner (System.in);
		String s1;
		System.out.println("enter the string");
		s1=s.next();
		int s1len=s1.length();
		s1len--;
		char s2[]=s1.toCharArray();
		char temp;
		for(int i=0;i<s2.length/2;i++)
		{
		temp=s2[i];
		s2[i]=s2[s1len];
		s2[s1len]=temp;
		s1len--;	
		}
		s1=new String(s2);
		System.out.println(s1);
	}

}
