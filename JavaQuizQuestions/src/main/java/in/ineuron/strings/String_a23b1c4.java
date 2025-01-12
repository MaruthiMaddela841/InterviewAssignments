package in.ineuron.strings;

public class String_a23b1c4 {

	public static void main(String[] args) {

		String input = "a23b1c4";
		String output = expandString(input);

		if (output.isEmpty()) {
			System.out.println("Please provide a valid string");
		} else {
			System.out.println(output);
		}

	}

	private static String expandString(String str) {
		if (str == null || str.isEmpty()) {
			return "";
		}

		StringBuilder output = new StringBuilder();
		int i = 0;

		while (i < str.length()) {
			char c = str.charAt(i);
			if (!Character.isLetter(c)) {
				// Invalid format: first character must be a letter
				return "";
			}
			i++;

			StringBuilder number = new StringBuilder();
			while (i < str.length() && Character.isDigit(str.charAt(i))) {
				number.append(str.charAt(i));
				i++;
			}

			if (number.length() == 0) {
				// Invalid format: no number after a character
				return "";
			}

			int count = Integer.parseInt(number.toString());
			output.append(String.valueOf(c).repeat(Math.max(0, count)));
		}

		return output.toString();
	}
}
