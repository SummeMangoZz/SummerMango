package StrategyPattern;

import java.util.HashMap;
import java.util.Map;

public class CushSuperFactory{
	private static Map<String,CushSuper> cushMap = new HashMap<String,CushSuper>();
	static{
		//利用map来取消if-else语句和switch语句
		cushMap.put("1", new CushRebate(1));
		cushMap.put("2", new CushRebate(0.8));
		cushMap.put("3", new CushReturn(300,100));
	}
	public static CushSuper getCushSuper(String strategy){
		return cushMap.get(strategy);
	}
}
