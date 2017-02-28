package BridgePattern;
//���ڳ����࣬����õ�һЩ�д��ڵĳ������
public abstract class Window {
	private WindowImpl windowImpl;
	
	public void setWindowImpl(WindowImpl windowImpl){
		this.windowImpl = windowImpl;
	}
	
	public WindowImpl getWindowImpl(){
		return this.windowImpl;
	}
	
	//������������ֻ����������Ի�������ͼ��
	public abstract void DrawText();
	public abstract void DrawRec();
}
