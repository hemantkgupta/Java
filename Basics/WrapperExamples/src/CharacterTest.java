
public class CharacterTest {

	public static void main(String[] args) {
		Character ch = 'a';
		Character ch2 = '1';
		
		 System.out.println(" isLetter test "+ Character.isLetter(ch));
		 System.out.println(" isdigit test "+ Character.isDigit(ch2));
		 System.out.println(" neumeric value  test "+ Character.getNumericValue(ch));
		 System.out.println(" islowercase test "+ Character.isLowerCase(ch));
		 System.out.println(" to uppercase test "+ Character.toUpperCase(ch));
	}

}
