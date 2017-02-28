package BridgePattern;
//����һ����ʱ�Ự����
public class TransientWindow extends Window{

	@Override
	public void DrawText() {
		System.out.println("this is an Transient text");
		
		getWindowImpl().DevDrawText();
	}

	@Override
	public void DrawRec() {
		System.out.println("this is an Transient rec");
		
		getWindowImpl().DevDrawRec();
	}

}
