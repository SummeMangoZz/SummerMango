package AbstractFactory;

public interface IFactory {
	public UserDao createUserDao();
	public ProductDao createProductDao();
}
