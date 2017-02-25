package SingletonPattern;

public class User {
	//懒汉式单例，只有在调用getInstance时才会实例化一个单例对象
	public static User user; 
	public static Integer key  = new Integer(4);
	private User(){
		
	}
	
	public static User getInstance(){
		//先判断该user变量是否为空，入股为空，进入同步代码块，该步假设为step1
		if(user == null){
			synchronized (key) {
				//由于可能多个线程都进入了step1,由于锁定机制，一个线程进入该代码块时，其他线程
				//仍在排队进入该代码块，如果不做判断，当前线程即使创造了实例，下一个线程又会创造一个实例
				if(user==null){
					user = new User();
				}
			}
		}
		return user;
		
	}
}





