package AbstractFactory;

public class MySqlIUserDaoImpl implements UserDao {

	@Override
	public void insertUser(User user) {
		System.out.println("��mysql��������һ���û�");
	}

	@Override
	public void deleteUser(User user) {
		System.out.println("��mysql����ɾ��һ���û�");
	}

}
