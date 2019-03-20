import java.util.Scanner;
import java.lang.Math;
public class Interest {
	public static void main(String[] args) {
		double rate,timePeriod,principalAmount,simpleInterest,compountInterest;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter interest rate");
		rate=sc.nextDouble();
		System.out.print("enter time period");
		timePeriod=sc.nextDouble();
		System.out.print("enter Principal Amount");
		principalAmount=sc.nextDouble();
		simpleInterest=principalAmount*timePeriod*rate/100;
		compountInterest=(principalAmount*Math.pow((1+(rate/100)),timePeriod))-principalAmount;
		System.out.println("simple interest is"+"="+simpleInterest);
		System.out.println("compound interest is"+"="+compountInterest);

	}

}
