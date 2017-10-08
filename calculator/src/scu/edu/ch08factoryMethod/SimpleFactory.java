package scu.edu.ch08factoryMethod;

public class SimpleFactory {
	
	public static LeiFeng CreateLeiFeng(String type) {
		
		LeiFeng result = null;
		
		switch(type.charAt(0)) {
		case 'u':
			result = new Undergraduate();
			break;
		case 'v':
			result = new Volunteer();
			break;
		}
		
		return result;
	}

}
