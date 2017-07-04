package guvi;
import java.util.Scanner;
public class Checkingdays 
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a day");
	String s=sc.next();
	if(s.equalsIgnoreCase("Sunday"))
	{			
		System.out.println(false);
			
	}
	else
	{
		System.out.println(true);
	}
	}
}
