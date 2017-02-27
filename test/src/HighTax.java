
public class HighTax implements Tax{

	@Override
	public double payTaxes(double salary) {
		return salary*0.1;
	}
}
