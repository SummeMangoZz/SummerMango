package test3;
/**
 * ��ǩһ��Ҫ�պ��ڵ�����ǰ��
 * ������ǩ��Ŀ�ģ�
 * ��֮ǰ�ĵ�����break,contiue�ؼ��ֵ�ʹ�ã�ֻ���жϵ�ǰѭ��(���ܽ�����ǰѭ������ĸ�ѭ��)��
 * ��ϱ�ǩʹ�ã���ʹ����ִ����ת����ǩ����Ҳ������ת������ѭ��
 * continue lable��������ǩ�������½��������
 * break lable����������ִ���������
 * @author w
 *
 */
public class lablebreak {
	public static void main(String[] args) {
		int i = 0;
		lable:
		//ÿ�ν���forѭ������ʱ�����ȼ�鲼�����ʽ�����û�г�ʼ������ִ��ǰ��ĸ�ֵ��䡣
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
