package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class GroupAnagrams {
	public List<List<String>> groupAnagrams(String[] strs) {
		
		List<List<String>> res = new ArrayList<>();
		
		HashMap<String, List<String >> map = new HashMap<String, List<String >>();
		
		if (strs.length == 0) {
			return res;
		}
		
		for (int i = 0; i < strs.length; i++) {
			char[] midchar = strs[i].toCharArray(); 
			Arrays.sort(midchar);
			String midString = new String(midchar);
			System.out.println("---string的结果"+midString);
			if (map.containsKey(midString)) {
				map.get(midString).add(strs[i]);
			}
			else {
				List<String> temp = new ArrayList<String >();
				temp.add(strs[i]);
				map.put(midString, temp);
			}
		}
		Iterator iter = (Iterator) map.values().iterator();
        while(iter.hasNext())
        {
            List<String> tempList = new ArrayList<String>((ArrayList<String>)iter.next());
            res.add(tempList);
        }
						
		return res;
	}

}
