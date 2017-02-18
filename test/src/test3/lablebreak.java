package test3;
/**
 * 标签一定要刚好在迭代的前面
 * 引进标签的目的：
 * 在之前的单纯的break,contiue关键字的使用，只能中断当前循环(不能结束当前循环外面的父循环)；
 * 结合标签使用，能使程序执行跳转到标签处，也就是跳转处整个循环
 * continue lable调跳到标签处会重新进入迭代；
 * break lable会跳过迭代执行其他语句
 * @author w
 *
 */
public class lablebreak {
	public static void main(String[] args) {
		int i = 0;
		lable:
		//每次进行for循环迭代时，会先检查布尔表达式，如果没有初始化，先执行前面的赋值语句。
		for(int j=0;j<=1;j++){
			System.out.println("..");
			for(;true;){
				i = i++;
				System.out.println(i);
				continue lable;
			}
		}
		System.out.println("lable is work");
	}
}
