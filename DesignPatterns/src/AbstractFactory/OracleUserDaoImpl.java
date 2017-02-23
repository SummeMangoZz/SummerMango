package AbstractFactory;

public class OracleUserDaoImpl implements UserDao{

	@Override
	public void insertUser(User user) {
		System.out.println("在oracle中插入一个用户");
	}

	@Override
	public void deleteUser(User user) {
		System.out.println("在oracle中删除一个用户");
	}

}
