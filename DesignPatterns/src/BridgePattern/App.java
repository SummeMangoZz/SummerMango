package BridgePattern;

public class App {
	public static void main(String[] args) {
		Window window = new IconWindow();
		window.setWindowImpl(new LinuxWindowImpl());
		window.drawWindow();
	}
}
