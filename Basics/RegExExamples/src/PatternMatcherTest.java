
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest {

	public static void main(String[] args) {

		String str = "This is an example";

		Pattern pattern = Pattern.compile("\\w+");
		Matcher matcher = pattern.matcher(str);

		while (matcher.find()) {
			System.out.print("Start index: " + matcher.start());
			System.out.print(" End index: " + matcher.end() + " ");
			System.out.println(matcher.group());
		}

		//Create new pattern/matcher to replace space with two star
		Pattern replace = Pattern.compile("\\s+");
		Matcher matcher2 = replace.matcher(str);
		System.out.println("New:" + matcher2.replaceAll("**"));
	}

}
