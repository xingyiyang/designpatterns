package scu.edu.ch13builder;

import java.awt.Frame;
import java.awt.Graphics;

public class BuilderMain extends Frame{
  private int x;
  private int y;
  private boolean drawOval;

  public static void main(String []args)
  {
	  new BuilderMain().print();
  }

  public BuilderMain()
  {
	  x = 200;
	  y = 200;
	  drawOval = false;
	  this.setSize(400,400);
	  this.setVisible(true);
  }

  public void print(){

	  drawOval = true;
	  repaint();
  }

  public void paint(Graphics g)
  {

	  if(drawOval) {
		  PersonThinBuilder ptb = new PersonThinBuilder(g);
		  PersonDirector pThin = new PersonDirector(ptb);
		  pThin.CreatePerson();
		  PersonFatBuilder pfb = new PersonFatBuilder(g);
		  PersonDirector pFat = new PersonDirector(pfb);
		  pFat.CreatePerson();
	  }
  }
} 
