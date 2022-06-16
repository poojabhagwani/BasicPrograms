import java.util.*;

public class FrequencyOfAlbhabetsInString {
	
	public static void main(String[] args) {
		
		String str="poojabhagwani";
		char[] array = str.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for(char i:array)
		{
			if(hm.containsKey(i))
				hm.put(i,hm.get(i)+1);
			else
				hm.put(i, 1);
		}
		
		for(Map.Entry entry:hm.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
