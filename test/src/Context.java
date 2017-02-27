
public class Context {
	private Tax tax;
	public Context(Tax tax) {
		this.tax = tax;
	}
	public double shouldPayTaxes(double salary){
		return tax.payTaxes(salary);
	}
}
