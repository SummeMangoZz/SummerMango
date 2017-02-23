package AbstractFactory;

public class OracleFactoryImpl implements IFactory {

	@Override
	public UserDao createUserDao() {
		return new OracleUserDaoImpl();
	}

	@Override
	public ProductDao createProductDao() {
		return new OracleProductImpl();
	}

}
