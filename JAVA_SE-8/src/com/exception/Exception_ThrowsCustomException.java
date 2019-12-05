package com.exception;

//1.define custom exception class
class DivideByZeroException extends Exception {
	public DivideByZeroException(String message) {

		super(message);

	}

	@Override
	public String getMessage() {
		return super.getMessage() + "cant divide by zero";
	}
}

public class Exception_ThrowsCustomException {

	// 3. declare custom exception
	public static int Divide(int num1, int num2) throws DivideByZeroException {// throws exception
		if (num2 < 0)
			// 2.throw custom exception
			throw new DivideByZeroException("Can Not divide");
		return num1 / num2;
	}

	public static int Divide0(int num1, int num2) throws Exception {// throws exception
		if (num2 < 0)
			throw new Exception("Can Not divide");
		return num1 / num2;
	}

	public static void main(String[] args) throws Exception {
		System.out.println("MyException started");

		/*
		 * //example of checked exception
		 * 
		 * 
		 * try { new FileInputStream(""); } catch (FileNotFoundException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 * 
		 * if(args.length<=0) { System.out.println("please provide argment");
		 * System.exit(0);
		 * 
		 * }
		 */
		int num1, num2, result;
		num1 = num2 = result = 0;
		try {
			num1 = Integer.parseInt(args[0]);
			num2 = Integer.parseInt(args[1]);
			result = Divide(num1, num2);
			System.out.println("result" + result);
		}
		catch (ArrayIndexOutOfBoundsException ex) {
			System.err.println("please provide two arg" + ex.getMessage());
		}
		catch (NumberFormatException ex) {
			System.err.println("please provide two  numeric arg" + ex.getMessage());

		}
		catch (ArithmeticException ex) {
			System.err.println("please provide two  numeric arg > 0" + ex.getMessage());

		}

		System.out.println("MyException ended");

	}
}
