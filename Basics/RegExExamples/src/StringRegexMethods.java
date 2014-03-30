public class StringRegexMethods {

	public static void main(String[] args) {

		String str = "This is an example";

		boolean isMatched = str.matches("\\w.*");
		System.out.println("The string matches: " + isMatched);

		String[] splitString = (str.split("\\s+"));
		System.out.println("Split size is : " + splitString.length);
		for (String string : splitString) {
			System.out.println(string);
		}
		// replace all whitespace with **
		System.out.println(str.replaceAll("\\s+", "**"));
	}

}
