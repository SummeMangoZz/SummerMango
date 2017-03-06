package testJVM;

public class FinalizeEscapeGC {
	public static FinalizeEscapeGC SAVE_HOOK = null;
	
	public void isAlive(){
		System.out.println("yes,i'm alive");
	}
	
	@Override
	public void finalize(){
		SAVE_HOOK = this;
	}
	
	public static void main(String[] args) throws Exception {
		SAVE_HOOK = new FinalizeEscapeGC();
		//第一次回收，如果对象没有重写finalize方法，或者finalize方法已经执行，则直接回收，否则进入一个F-Queue队列
		//在进入该队列后，gc会执行对象的finalize方法，对象在finalize方法中只要重新与引用链上的对象建立连接
		//就能防止自己被回收
		SAVE_HOOK = null;
		System.gc();//执行垃圾回收器 
		
		Thread.sleep(500);//因为finalize优先级很低，所以等待0.5秒等待finalize方法执行
		if(SAVE_HOOK != null){
			SAVE_HOOK.isAlive();
		}else{
			System.out.println("no,i'm dead");
		}
		
		
		//由于该对象之前已经执行了finalize方法，所以直接回收
		SAVE_HOOK = null;
		System.gc();
		Thread.sleep(500);
		if(SAVE_HOOK != null){
			SAVE_HOOK.isAlive();
		}else{
			System.out.println("no,i'm dead");
		}
		
	}
}










