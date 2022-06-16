
public class ReverseWordsInString {
	
	public static void main(String[] args) {
		
		String originalStr ="Computer Science is a course";
		String words[] = originalStr.split("\\s");
		String reversedString = "";
		for (int i = 0; i < words.length; i++) { 
			if(i==words.length-1)
				reversedString=words[i]+reversedString;
			else
				reversedString=" "+words[i]+reversedString;
		}
		
		System.out.print("Reversed string : " + reversedString);
	}

}
