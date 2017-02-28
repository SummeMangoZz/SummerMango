package BridgePattern;

public class IconWindow extends Window{
	@Override
	public void drawWindow() {
		System.out.println("icon图标窗口创建");
		getWindowImpl().DevDrawWindow();
	}
}
