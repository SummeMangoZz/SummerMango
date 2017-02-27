
public class LowTax implements Tax{

	@Override
	public double payTaxes(double salary) {
		return salary*0.01;
	}
}
