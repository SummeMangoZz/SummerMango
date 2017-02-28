package BridgePattern;
//创建一个临时会话窗口
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
