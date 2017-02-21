package StrategyPattern;

public class CushRebate implements CushSuper {
	private double rebate;
	public CushRebate(double rebate) {
		this.rebate = rebate;
	}
	@Override
	public double acceptCush(double salary) {
		return salary*this.rebate;
	}

}
