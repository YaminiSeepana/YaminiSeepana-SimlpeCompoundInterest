import java.util.Scanner;

public class SimpleCompoundInterest {

	public static void calculator() {
		double principle,time;
		double rateOfInterest;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the principle amount:");
		principle=sc.nextDouble();
		System.out.println("enter the rate of interest:");
		rateOfInterest=sc.nextDouble();
		System.out.println("enter the time duration:");
		time=sc.nextDouble();
		SimpleInterest si=new SimpleInterest(principle,rateOfInterest,time);
		CompoundInterest ci=new CompoundInterest(principle,rateOfInterest,time);
	}
}
