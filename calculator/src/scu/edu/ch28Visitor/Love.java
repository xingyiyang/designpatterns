package scu.edu.ch28Visitor;

public class Love extends Action {

	@Override
	public void GetManConclusion(Man concreteElementA) {
		// TODO Auto-generated method stub
		System.out.println("When " + concreteElementA.getClass().getName() + " is " 
				+ this.getClass().getName() + ",he is love");

	}

	@Override
	public void GetWomanConclusion(Woman concreteElementB) {
		// TODO Auto-generated method stub
		System.out.println("When " + concreteElementB.getClass().getName() + " is " 
				+ this.getClass().getName() + ",she is love");

	}

}
