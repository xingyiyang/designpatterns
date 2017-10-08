package scu.edu.ch07proxy;

public class Proxy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		SchoolGirl fty = new SchoolGirl();
		fty.setName("fty");
		Pursuit pursuit = new Pursuit(fty);
		Proxier yi = new Proxier(pursuit);
		
		yi.GiveDolls();
		yi.GiveFlowers();
		yi.GiveChocolate();

	}

}
