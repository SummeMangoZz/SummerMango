package AbstractFactory;

public class MySqlProductDaoImpl implements ProductDao {

	@Override
	public void insertProduct(Product product) {
		System.out.println("在mysql中增加一个产品");
	}

	@Override
	public void deleteProduct(Product product) {
		System.out.println("在mysql中删除一个产品");
	}

}
