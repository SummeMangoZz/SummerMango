package test5;

public class app {
	public static void main(String[] args) {
		UserDao userdao = new UserDao(); 
		UserDao dao = (UserDao)new CiglibProxyFactory(userdao).getObjectInstance();
		dao.save();
	}
}
