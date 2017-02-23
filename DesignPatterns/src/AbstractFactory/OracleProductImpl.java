package AbstractFactory;

public class OracleProductImpl implements ProductDao {

	@Override
	public void insertProduct(Product product) {
		System.out.println("在oracle中插入一个产品");
	}

	@Override
	public void deleteProduct(Product product) {
		System.out.println("在oracle中删除一个产品");
	}

}
