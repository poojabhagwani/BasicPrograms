import java.util.*;

public class RemoveRepeatedElementsInArray {
	
	public static void main(String[] args) {
		
		int[] array = {9,4,6,7,4,8,9,7,8,9};
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i=0; i<array.length;i++)
		{
		hs.add(array[i]);
		}
		Iterator i = hs.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		
	}

}
