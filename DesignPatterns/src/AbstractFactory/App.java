package AbstractFactory;

public class App {
	public static void main(String[] args) throws Exception {
		//��ʵ�ʵ�MySqlIUserDaoImpl���������ϣ�����Ŀ����ʱ��ϵͳ�п��ܺܶ�������������ϣ�
		//����������ݿ�ʵ���࣬��ô����ĸĶ����Ǿ޴�ģ�Υ���˿���ԭ���������תԭ��
		//UserDao userDao = new MySqlIUserDaoImpl();
		IFactory factory = DBFactory.getDBFactory();
		UserDao userDao = factory.createUserDao();
		User user = new User();
		userDao.insertUser(user);
		userDao.deleteUser(user);
		
		ProductDao productDao = factory.createProductDao();
		Product product = new Product();
		productDao.insertProduct(product);
		productDao.deleteProduct(product);
		
	}
}
 