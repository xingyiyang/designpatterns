package scu.edu.ch16state;

public class SleepingState extends State {

	@Override
	public void WriteProgram(Work work) {
		// TODO Auto-generated method stub
		System.out.println("Current time is " + work.getHour() + " o'clock,I'm asleep!");

	}

}
