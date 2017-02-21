package StrategyPattern;

/**
 * ����ģʽ�ͼ򵥹�����ϣ����׵��������㷨���ڲ�ʵ��ϸ�ڣ�ͬʱ���⿪��һ���򵥵Ľӿڹ��ⲿ���ã�����������
 * �ó���Ŀ���չ��
 * @author w
 *
 */
public class CushContext {
	private CushSuper cushSuper;
	public CushContext(String strategy){
		switch (strategy) {
		case "1":
			cushSuper = new CushRebate(1);
			break;
		case "2":
			cushSuper = new CushRebate(0.8);
			break;
		case "3":
			cushSuper = new CushReturn(300,100);
			break;
		}
	}
	public double getresult(double salary){
		return cushSuper.acceptCush(salary);
	}
}
