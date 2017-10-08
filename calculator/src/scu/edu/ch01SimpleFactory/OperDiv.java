package scu.edu.ch01SimpleFactory;

public class OperDiv extends Operation{
	
	public double GetResult()
	{
		double result = 0;
		if(numB == 0)
			try {
				throw new Exception("0!!!");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		result = numA / numB;
		return result;
	}
}
