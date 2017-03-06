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
		//��һ�λ��գ��������û����дfinalize����������finalize�����Ѿ�ִ�У���ֱ�ӻ��գ��������һ��F-Queue����
		//�ڽ���ö��к�gc��ִ�ж����finalize������������finalize������ֻҪ�������������ϵĶ���������
		//���ܷ�ֹ�Լ�������
		SAVE_HOOK = null;
		System.gc();//ִ������������ 
		
		Thread.sleep(500);//��Ϊfinalize���ȼ��ܵͣ����Եȴ�0.5��ȴ�finalize����ִ��
		if(SAVE_HOOK != null){
			SAVE_HOOK.isAlive();
		}else{
			System.out.println("no,i'm dead");
		}
		
		
		//���ڸö���֮ǰ�Ѿ�ִ����finalize����������ֱ�ӻ���
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










