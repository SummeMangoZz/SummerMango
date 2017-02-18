package test8;

public class App_Static {
	static int i;
	//只要使用啦该类，不管是调用实例方法，还是静态方法，都会加载class文件
	//静态块只会在首次被类加载器加载该类对应的class文件并包装成对应的class对象时会别执行
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
