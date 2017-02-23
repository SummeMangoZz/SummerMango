package AbstractFactory;

public class MySqlIUserDaoImpl implements UserDao {

	@Override
	public void insertUser(User user) {
		System.out.println("在mysql中已增加一个用户");
	}

	@Override
	public void deleteUser(User user) {
		System.out.println("在mysql中已删除一个用户");
	}

}
