package scu.edu.ch07proxy;

public class Proxier implements GiveGift {
	
	Pursuit persuit;
	
	public Proxier(Pursuit persuit) {
		this.persuit = persuit;
		
	}

	public void GiveChocolate() {
		// TODO Auto-generated method stub
		persuit.GiveChocolate();

	}

	public void GiveDolls() {
		// TODO Auto-generated method stub
		persuit.GiveDolls();

	}

	public void GiveFlowers() {
		// TODO Auto-generated method stub
		persuit.GiveFlowers();

	}

}
