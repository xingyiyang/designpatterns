package scu.edu.ch02stratege;

public class CashRebate extends CashSuper {
	
	private double moneyRebate = 1d;
	
	public CashRebate(String moneyRebate){
		this.moneyRebate = Double.parseDouble(moneyRebate);
	}

	@Override
	public double acceptCash(double money) {
		// TODO Auto-generated method stub
		return money * moneyRebate;
	}

}
