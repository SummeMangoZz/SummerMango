package BuilderPattern;
/**
 * ָ�����࣬�������ƽ�����̣�Ҳ���������û��뽨����̵���ϵ
 * �ڿͻ���ֻҪʹ�ñ����������Ʒ��������Ҫ֪������Ľ������
 * @author w
 *
 */
/**
 * ������������ƽ������
 * @author w
 *
 */
public class Director {
	 private Builder builder;
	 
	 public Director(Builder builder) {
		this.builder = builder; 
	 }
	 
	 /**
	  * ������̱�ȷ�����������������ֵĽ���ϸ�ڲ���һ������˿��Ը�����ͬ�Ľ�����̣�ͨ������ϸ�ڵĲ�ͬ��
	  * ������ͬ��ʾ�Ķ���
	  * ������ģʽ���ǽ�һ�����Ӷ���Ĺ��������ı�ʾ���룬ʹ��ͬ���Ĺ������̿��Դ�����ͬ�ı�ʾ
	  * 
	  */
	 public void buildProduct(){
		 builder.buildPartA();
		 builder.buildPartB();
		 builder.buildPartC();
	 }
}
