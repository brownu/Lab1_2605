import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
		ArrayList<Integer> testInts = new ArrayList();
		
		testInts.add(12);
		testInts.add(18);
		testInts.add(21);
		testInts.add(85);
		testInts.add(50);

		System.out.println(Problem1.sumOfAll(testInts));
	}

}
