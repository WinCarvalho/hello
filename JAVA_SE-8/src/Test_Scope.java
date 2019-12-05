class A {
	int a;

	public void showA() {
		System.out.println("A" + a);
	}
}

class B extends A {
	int b;

	public void showB() {
		System.out.println("B" + b);
	}
}

class C extends B {
	int c;

	public void showC() {
		System.out.println("C" + c);
	}

	public void showABC() {
		// accessing variables
		a = 1;
		b = 2;
		c = 3;
		// accessing methods


	}
}

public class Test_Scope {
	public static void main(String[] args) {

		C cs = new C();
		cs.showC();
		
	}
}
