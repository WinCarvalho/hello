
public class Calculator {
public static void main(String[] args) {
	int num1 = Integer.parseInt(args[0]);
	int num2 = Integer.parseInt(args[1]);
	String operator = (args[2]);
	int result;
	
	
	if (operator.equals("+")) {
		result = add(num1,num2);
		System.out.println("Add.."+result);
	}
	else if (operator.equals("-")) {
		result = sub(num1,num2);
		System.out.println("Sub.."+result);
	}
	else if (operator.equals("/")) {
		result = Div(num1,num2);
		System.out.println("Div.."+result);
	}
	else if (operator.equals("m")) {
		result = Mul(num1,num2);
		System.out.println("Mul.."+result);
	}
}


public static int add(int num1, int num2) {
	return(num1 + num2);
}

public static int sub(int num1, int num2) {
	return(num1 - num2);
}

public static int Div(int num1, int num2) {
	return(num1 / num2);
}

public static int Mul(int num1, int num2) {
	return(num1 * num2);
}







}
