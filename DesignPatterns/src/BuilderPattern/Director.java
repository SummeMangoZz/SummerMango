package BuilderPattern;
/**
 * ָ�����࣬�������ƽ�����̣�Ҳ���������û��뽨����̵���ϵ
 * �ڿͻ���ֻҪʹ�ñ����������Ʒ��������Ҫ֪������Ľ������
 * @author w
 *
 */
public class Director {
	 private Builder builder;
	 
	 public Director(Builder builder) {
		this.builder = builder; 
	 }
	 
	 public void buildProduct(){
		 builder.buildPartA();
		 builder.buildPartB();
		 builder.buildPartC();
	 }
}
