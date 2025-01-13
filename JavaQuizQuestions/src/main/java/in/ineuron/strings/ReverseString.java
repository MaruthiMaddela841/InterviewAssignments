package in.ineuron.strings;

public class ReverseString {

	public static void main(String[] args) {
		
		String str="maruthi";
		int i=0,j=str.length()-1;
		char[] arr=str.toCharArray();
		while(i!=j) {
			char temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		System.out.println(String.valueOf(arr));
		System.out.println(new String(arr));

	}

}
