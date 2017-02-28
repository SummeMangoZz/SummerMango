package BridgePattern;
//创建一个临时会话窗口
public class TransientWindow extends Window{

	@Override
	public void drawWindow() {
		getWindowImpl().DevDrawWindow();
	}
}
