package guvi;
import java.util.Scanner; 
public class Minsbtwtime 
{
	public static void main(String[] args) 
	{
	Scanner s=new Scanner(System.in);
    System.out.println("Enter time1");
    int h1=s.nextInt();
    int m1=s.nextInt();
    int t1=(h1*60)+m1;
    System.out.println("Enter time2");
    int h2=s.nextInt();
    int m2=s.nextInt();
    int t2=(h2*60)+m2;
    int mins=t1-t2;
    System.out.println("Difference in time :"+mins+"mins");
    }
}