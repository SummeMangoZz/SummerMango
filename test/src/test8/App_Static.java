package test8;

public class App_Static {
	static int i;
	//ֻҪʹ�������࣬�����ǵ���ʵ�����������Ǿ�̬�������������class�ļ�
	//��̬��ֻ�����״α�����������ظ����Ӧ��class�ļ�����װ�ɶ�Ӧ��class����ʱ���ִ��
	static {
		i = ++i;
		System.out.println(i);
	}
	public static void test(){
		System.out.println("this is test");
	}
	
	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("test8.App_Static");
		Class.forName("test8.App_Static");
	}
}
