package in.ineuron.recursive;

public class PowerOfTwo {

	public static void main(String[] args) {
		
		int n=4;
		int res=1;
		for(int i=0;i<n;i++) {
			res=res*2;
		}
		System.out.println("Using For::"+res);
		System.out.println("Using recursive::"+powerOfTwo(n,1));
	}

	private static int powerOfTwo(int n,int res) {
		if(n==0) {
			return res;
		}
		res=res*2;
		return powerOfTwo(n-1,res);
	}

}
