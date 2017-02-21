package StrategyPattern;

import java.io.DataInputStream;
import java.io.IOException;

public class Tab {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		DataInputStream dis = new DataInputStream(System.in);
		System.out.println("请输入商品的单价:");
		String price = dis.readLine();
		System.out.println("请输入商品的数量");
		String num = dis.readLine();
		System.out.println("请选择商品的促销方式:");
		System.out.println("1.正常收费");
		System.out.println("2.打八折");
		System.out.println("3.满300返100");
		String strategy = dis.readLine();
		
		/**
		 * 采用策略模式。彻底地屏蔽了算法实现细节，同时向外提供了一个简单地接口供外部调用。
		 */
		CushContext context = new CushContext(strategy);
		double total = 0;
		total += context.getresult(Double.parseDouble(price)*Double.parseDouble(num));
		System.out.println("总价为:"+total);
	}
}





