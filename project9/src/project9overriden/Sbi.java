package project9overriden;

public class Sbi extends Rbi{
	
	public float getRateOfInterest()
	
	{
		System.out.println(super.getRateOfInterest());
		return 4.4f;
	}

}
