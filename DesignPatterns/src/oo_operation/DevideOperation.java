package oo_operation;

public class DevideOperation implements Operation {

	@Override
	public double operat(double firNum, double secNum) throws Exception {
		if(secNum!=0){
			return firNum*secNum;
		}else{
			throw new Exception("除数不能为0");
		}
	}

}
