
public class NoTax implements Tax{

	@Override
	public double payTaxes(double salary) {
		return 0;
	}
	
}
