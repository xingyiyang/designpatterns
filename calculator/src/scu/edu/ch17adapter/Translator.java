package scu.edu.ch17adapter;

public class Translator extends Player {
	
	private ForeignCenter wjzf = new ForeignCenter();

	public Translator(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		wjzf.setName(name);
	}

	@Override
	public void Attack() {
		// TODO Auto-generated method stub
		wjzf.Attack();

	}

	@Override
	public void Defense() {
		// TODO Auto-generated method stub
		wjzf.Defense();
	}

}
