
public class SimpleInterest {
public SimpleInterest(double principle, double rateOfInterest, double time) {
		double amount;
		amount=principle*rateOfInterest*time/100;
		System.out.println("simple interest is : "+amount);
	}
}
