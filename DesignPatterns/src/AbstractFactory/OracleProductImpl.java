package AbstractFactory;

public class OracleProductImpl implements ProductDao {

	@Override
	public void insertProduct(Product product) {
		System.out.println("��oracle�в���һ����Ʒ");
	}

	@Override
	public void deleteProduct(Product product) {
		System.out.println("��oracle��ɾ��һ����Ʒ");
	}

}
