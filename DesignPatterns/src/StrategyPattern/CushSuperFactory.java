package StrategyPattern;

import java.util.HashMap;
import java.util.Map;

public class CushSuperFactory{
	private static Map<String,CushSuper> cushMap = new HashMap<String,CushSuper>();
	static{
		//利用map来取消if-else语句和switch语句
		//如果要增加一种算法的话，还是要修改这段代码的，所以并不完全符合开必原则
		cushMap.put("1", new CushRebate(1));
		cushMap.put("2", new CushRebate(0.8));
		cushMap.put("3", new CushReturn(300,100));
	}
	public static CushSuper getCushSuper(String strategy){
		return cushMap.get(strategy);
	}
}
