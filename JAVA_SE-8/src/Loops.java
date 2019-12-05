
public class Loops {
	public static void main(String[] args) {
		// for
		int index;

		// string to int
		int loopUntil = Integer.parseInt(args[0]);
		for (index = 0; index <= loopUntil; index++) {
			System.out.println(index + "\t");

		}

		System.out.println("");

		// while
		index = 0;
		while (index <= loopUntil) {
			System.out.println(index + "\t");
			index++;
		}
		System.out.println();

		// do while

		index = 0;
		do {
			System.out.println(index + "\t");
			index++;
		} while (index <= loopUntil);

	}

}
