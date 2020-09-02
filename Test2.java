
public class Test2 {

	public static void main(String[] args) {


		Problem2 p1 = new Problem2(10, 8, 2001);
		Problem2 p2 = new Problem2(2, 10, 1987);
		
		if (p1.compareTo(p2) == 1) {
			System.out.println(p1 + " is later than " + p2);
			
		}else if(p1.compareTo(p2) == -1) {
			System.out.println(p1 + " is earlier than " + p2);
			
		}else {
			System.out.println(p1 + " & " + p2 + " are the same. ");
			
		}

	}

}
