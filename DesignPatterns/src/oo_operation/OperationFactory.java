package oo_operation;

public class OperationFactory {
	
	public static Operation getOperation(String operation) {
		Operation opera = null;
		
		switch (operation) {
		case "+":
			opera = new AddOperation();
			break;
		case "-":
			opera = new DeleteOperation();
			break;
		case "*":
			opera = new MulitplyOperation();
			break;
		case "/":
			opera = new DevideOperation();
			break;
		}
		return opera;
		
	}
}
