package AbstractFactory;

public class DBFactory {
	private static String DBName = "MySql";
	public static IFactory getDBFactory() throws Exception{
		IFactory factory = null;
		Class<?> DBFactory = Class.forName("AbstractFactory."+DBName+"FactoryImpl");
		factory = (IFactory)DBFactory.newInstance();
		return factory;
	}
}
