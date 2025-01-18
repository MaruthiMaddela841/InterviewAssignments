package in.ineuron.strings;

public class StringCompression {

	public static void main(String[] args) {
		
		String str="aabbbbssdddff";
		StringBuilder sb=new StringBuilder("");
		StringBuilder result=new StringBuilder("");
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(i==0) {
				sb.append(c);
			}
			else if(i>0 && Character.toString(sb.charAt(sb.length()-1)).equals(Character.toString(c))) {
				sb.append(c);
			}
			else {
				result.append(sb.charAt(0));
				result.append(sb.length());
				sb=new StringBuilder("");
				sb.append(c);
			}
		}
		result.append(sb.charAt(0));
		result.append(sb.length());
		System.out.println(result);
	}

}
