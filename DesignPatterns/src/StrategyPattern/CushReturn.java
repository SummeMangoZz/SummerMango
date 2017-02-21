package StrategyPattern;

public class CushReturn implements CushSuper {
	private double moneyCondition;
	private double moneyReturn;
	public CushReturn(double moneyCondition,double moneyReturn) {
		this.moneyCondition = moneyCondition;
		this.moneyReturn = moneyReturn;
	}

	@Override
	public double acceptCush(double salary) {
		double result = 0;
		if(salary>=this.moneyCondition){
			result = salary-Math.floor(salary/this.moneyCondition)*this.moneyReturn;
		}
		return result;
	}

}





