package AbstractFactory;

public class MySqlProductDaoImpl implements ProductDao {

	@Override
	public void insertProduct(Product product) {
		System.out.println("��mysql������һ����Ʒ");
	}

	@Override
	public void deleteProduct(Product product) {
		System.out.println("��mysql��ɾ��һ����Ʒ");
	}

}
