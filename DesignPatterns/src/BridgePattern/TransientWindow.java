package BridgePattern;
//����һ����ʱ�Ự����
public class TransientWindow extends Window{

	@Override
	public void drawWindow() {
		getWindowImpl().DevDrawWindow();
	}
}
