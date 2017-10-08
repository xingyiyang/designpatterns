package scu.edu.ch08factoryMethod;

public class VolunteerFactory implements IFactory {

	public LeiFeng CreateLeiFeng() {
		// TODO Auto-generated method stub
		return new Volunteer();
	}

}
