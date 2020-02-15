
public class CompoundInterest {
	public CompoundInterest(double principle, double rateOfInterest, double time) {
		
		double amount=(principle*Math.pow(1+(rateOfInterest/100), time))-principle;
		System.out.println("the compound interest is : "+amount);
	}

}
