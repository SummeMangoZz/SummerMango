package BridgePattern;
//窗口抽象类，定义得到一些列窗口的抽象操作
public abstract class Window {
	private WindowImpl windowImpl;
	
	public void setWindowImpl(WindowImpl windowImpl){
		this.windowImpl = windowImpl;
	}
	
	public WindowImpl getWindowImpl(){
		return this.windowImpl;
	}
	
	//这里假设这两种基本操作可以绘制所有图形
	public abstract void DrawText();
	public abstract void DrawRec();
}
