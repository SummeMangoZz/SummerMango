
public class App {
	public static void main(String[] args) {
		Tax tax = null;
		double salary = 10000;
		if(salary<=3000){
			tax = new NoTax();
		}else if (salary>3000 && salary<=5000) {
			tax = new LowTax();
		}else if(salary>5000 && salary<=10000){
			tax = new MiddleTax();
		}else {
			tax = new HighTax();
		}
		Context context = new Context(tax);
		System.out.println(context.shouldPayTaxes(salary));
	}
}



