package BridgePattern;

public class LinuxWindowImpl extends WindowImpl {

	@Override
	public void DevDrawText() {
		System.out.println("this is Linux text window");
	}

	@Override
	public void DevDrawRec() {
		System.out.println("this is Linux Rec window");
	}

}
