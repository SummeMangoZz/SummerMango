package AbstractFactory;

public class OracleUserDaoImpl implements UserDao{

	@Override
	public void insertUser(User user) {
		System.out.println("��oracle�в���һ���û�");
	}

	@Override
	public void deleteUser(User user) {
		System.out.println("��oracle��ɾ��һ���û�");
	}

}
