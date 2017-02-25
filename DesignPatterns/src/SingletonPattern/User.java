package SingletonPattern;

public class User {
	//����ʽ������ֻ���ڵ���getInstanceʱ�Ż�ʵ����һ����������
	public static User user; 
	public static Integer key  = new Integer(4);
	private User(){
		
	}
	
	public static User getInstance(){
		//���жϸ�user�����Ƿ�Ϊ�գ����Ϊ�գ�����ͬ������飬�ò�����Ϊstep1
		if(user == null){
			synchronized (key) {
				//���ڿ��ܶ���̶߳�������step1,�����������ƣ�һ���߳̽���ô����ʱ�������߳�
				//�����Ŷӽ���ô���飬��������жϣ���ǰ�̼߳�ʹ������ʵ������һ���߳��ֻᴴ��һ��ʵ��
				if(user==null){
					user = new User();
				}
			}
		}
		return user;
		
	}
}





