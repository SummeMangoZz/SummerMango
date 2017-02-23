package AbstractFactory;

public class App {
	public static void main(String[] args) throws Exception {
		//与实际的MySqlIUserDaoImpl类产生了耦合，当项目过大时，系统中可能很多类有这样的耦合，
		//如果更换数据库实现类，那么代码的改动将是巨大的，违反了开闭原则和依赖倒转原则
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
 