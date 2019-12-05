
interface Calculator {
	int Add(int num1, int num2);

	int Sub(int num1, int num2);
}



class BasicCalculator implements Calculator {

	@Override
	public int Add(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}

	@Override
	public int Sub(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 - num2;
	}
	
}

interface Advcalculator extends Calculator {

	int mul(int num1, int num2);

	int div(int num1, int num2);
}

class AdvBasicCalculator extends BasicCalculator implements AdvCalculator {
	@Override
	public int mul(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int div(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 / num2;
	}

}

public class Test_Interfaces {

	public static void main(String[] args) {

		

		Calculator calculator = new BasicCalculator();
		System.out.println("Add" + calculator.Add(10, 2));
		System.out.println("Sub" + calculator.Sub(10, 2));
		// System.out.println(calculator.mul(10, 2));
		// System.out.println(calculator.div(10, 2));

		Advcalculator cal = new AdvBasicCalculator();
		// System.out.println(calculator.Add(10, 2));
		// System.out.println(calculator.sub(10, 2));
		System.out.println("Mul " + cal.mul(10, 2));
		System.out.println("Div " + cal.div(10, 2));

		AdvBasicCalculator basiccalc = new AdvBasicCalculator();
		System.out.println(basiccalc.Add(10, 2));
		System.out.println(basiccalc.Sub(10, 2));
		System.out.println("Mul " + basiccalc.mul(10, 2));
		System.out.println("Div " + basiccalc.div(10, 2));

	}

}
