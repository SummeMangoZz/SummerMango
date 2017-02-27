
public class MiddleTax implements Tax{

	@Override
	public double payTaxes(double salary) {
		return salary*0.05;
	}
	
}
