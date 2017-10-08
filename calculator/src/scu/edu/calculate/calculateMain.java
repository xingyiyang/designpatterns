package scu.edu.calculate;

public class calculateMain {

	public static void main(String[] args) {
		Operation  operation = OperationFactory.createOperation("-");
		double result = operation.getResult(5.0, 3.0);
		System.out.println(result);
	}
}
