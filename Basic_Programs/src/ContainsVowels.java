
public class ContainsVowels {

	public static void main(String[] args) {
		
		System.out.println(containsVowels("TV"));
		
		
	}

	public static Boolean containsVowels(String string) {
	
		return string.toLowerCase().matches(".*[aeiou].*");
	}
}
