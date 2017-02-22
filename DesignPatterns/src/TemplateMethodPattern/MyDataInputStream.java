package TemplateMethodPattern;

import java.io.DataInputStream;
import java.io.IOException;

public class MyDataInputStream extends MyInputStream <Integer>{
	
	@Override
	public void getDataType() {
		System.out.println("������һ��������:");
	}

	@SuppressWarnings("deprecation")
	@Override
	public Integer read() {
		DataInputStream dis = new DataInputStream(System.in);
		Integer result = null;
		try {
			result = Integer.parseInt(dis.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

}






