package BridgePattern;

public class IconWindow extends Window{
	@Override
	public void drawWindow() {
		System.out.println("iconͼ�괰�ڴ���");
		getWindowImpl().DevDrawWindow();
	}
}
