package scu.edu.ch07proxy;

public class Pursuit {
	
	SchoolGirl mm;
	
	public Pursuit(SchoolGirl mm) {
		this.mm = mm;
	}
	
	public void GiveDolls() {
		System.out.println(mm.getName() + ",give you dolls");
	}
	
	public void GiveFlowers() {
		System.out.println(mm.getName() + ",give you flowers");
	}
	
	public void GiveChocolate() {
		System.out.println(mm.getName() + ",give you chocolate");
	}

}
