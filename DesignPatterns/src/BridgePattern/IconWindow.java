package BridgePattern;

public class IconWindow extends Window{
	
	@Override
	public void DrawText() {
		System.out.println("this is an Icon text");
		
		//调用具体的实现
		WindowImpl windowImpl = getWindowImpl();
		if(windowImpl != null){
			windowImpl.DevDrawText();
		}
	}
	

	@Override
	public void DrawRec() {
		System.out.println("this is an Icon rec");
		
		WindowImpl windowImpl = getWindowImpl();
		if(windowImpl != null){
			windowImpl.DevDrawRec();
		}
		
	}
	
}
