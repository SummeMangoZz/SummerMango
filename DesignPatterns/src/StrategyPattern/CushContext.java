package StrategyPattern;

/**
 * ����ģʽ�ͼ򵥹�����ϣ����׵��������㷨���ڲ�ʵ��ϸ�ڣ�ͬʱ���⿪��һ���򵥵Ľӿڹ��ⲿ���ã�����������
 * �ó���Ŀ���չ��
 * @author w
 *
 */
/**
 * ʹ�÷�Χ����ʲô����¿��ǲ���ʲô��ʽ����ͬ�龳��Ӧ��ͬ�Ĵ�������������Կ��ǲ��ò���ģʽ
 * @author w
 *
 */
public class CushContext {
	private CushSuper cushSuper;
	public CushContext(String strategy){
		cushSuper = CushSuperFactory.getCushSuper(strategy);
	}
	public double getresult(double salary){
		return cushSuper.acceptCush(salary);
	}
}
