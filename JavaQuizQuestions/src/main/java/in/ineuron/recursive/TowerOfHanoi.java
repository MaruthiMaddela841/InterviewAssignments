package in.ineuron.recursive;

public class TowerOfHanoi {

	public static void main(String[] args) {
		int n=3;
		towerOfHanoi(n, "S", "H", "D");

	}

	private static void towerOfHanoi(int n, String s, String h, String d) {
		if (n == 1) {
            System.out.println("Move disk 1 from " + s + " to " + d);
            return;
        }
		towerOfHanoi(n-1,s,d,h);
		 System.out.println("Move disk " + n + " from " + s + " to " + d);
		towerOfHanoi(n-1,h,s,d);
	}

}
