package AbstractFactory;

public class MySqlFactoryImpl implements IFactory {

	@Override
	public UserDao createUserDao() {
		return new MySqlIUserDaoImpl();
	}

	@Override
	public ProductDao createProductDao() {
		return new MySqlProductDaoImpl();
	}

}
