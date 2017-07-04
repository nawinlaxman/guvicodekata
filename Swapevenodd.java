package guvi;
import java.util.Scanner;
public class Swapevenodd 
{
		public static void main(String[] args) 
		{
			Scanner s=new Scanner(System.in);
			char tmp;
			System.out.println("Enter a string");
			String str;
			str=s.nextLine();
			char[] c=str.toCharArray();
			 for(int i=0;i<str.length();i=i+2)
			 {
			     tmp = c[i];
			     c[i] = c[i+1];
			     c[i+1] = tmp;
			     }
			 String r=new String(c);
			 System.out.println("The result is");
			 System.out.println(r);
		}

	}

