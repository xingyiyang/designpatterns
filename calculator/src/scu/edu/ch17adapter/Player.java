package scu.edu.ch17adapter;

public abstract class Player {
	
	protected String name;
	
	public Player(String name) {
		this.name = name;
	}
	
	public abstract void Attack();
	public abstract void Defense();

}
