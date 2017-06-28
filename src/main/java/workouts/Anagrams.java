package workouts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagrams {

	public static void main(String[] args) {
		String[] strs = {"god", "cat", "dog", "act"};
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		for(String str : strs) {
			char[] temp = str.toCharArray();
			Arrays.sort(temp);
			String sortedString = String.valueOf(temp);
			List<String> li;
			if(map.containsKey(sortedString)) {
				li = map.get(sortedString);
			} else {
				li = new ArrayList<String>();
			}
			li.add(str);
			map.put(sortedString, li);
			
		}
		System.out.println(map);

	}

}
