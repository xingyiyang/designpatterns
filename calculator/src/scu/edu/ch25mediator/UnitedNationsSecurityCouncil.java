package scu.edu.ch25mediator;

public class UnitedNationsSecurityCouncil extends UnitedNations {
	
	private USA colleague1;
	private Iraq colleague2;
	

	public void setColleague1(USA colleague1) {
		this.colleague1 = colleague1;
	}


	public void setColleague2(Iraq colleague2) {
		this.colleague2 = colleague2;
	}


	@Override
	public void Declare(String message, Country colleague) {
		// TODO Auto-generated method stub
		if (colleague == colleague1) {
			colleague2.getMessage(message);
		} else {
			colleague1.getMessage(message);
		}

	}

}
