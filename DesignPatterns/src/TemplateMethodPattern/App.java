package TemplateMethodPattern;

public class App {
	public static void main(String[] args) {
		MyInputStream<Integer> mis = new MyDataInputStream();
		mis.getStringFromConsole();
	}
}
