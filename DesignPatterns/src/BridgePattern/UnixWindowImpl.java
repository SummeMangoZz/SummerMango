package BridgePattern;

public class UnixWindowImpl extends WindowImpl {

	@Override
	public void DevDrawText() {
		System.out.println("this is Unix text window");
	}

	@Override
	public void DevDrawRec() {
		System.out.println("this is Unix rec window");
	}

}
