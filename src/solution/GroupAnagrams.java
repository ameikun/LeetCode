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
			
			if (map.containsKey(midString)) {
				map.get(midString).add(strs[i]);
			}
			else {
				map.put(midString, new ArrayList<String>());
				map.get(midString).add(strs[i]);
				//List<String> temp = new ArrayList<String >();
				//temp.add(strs[i]);
				//map.put(midString, temp);
			}
		}
		/*
		 * Iterator iter = map.values().iterator();
        while(iter.hasNext())
        {
        	res.add((List<String>)iter.next());
            //List<String> tempList = new ArrayList<String>((ArrayList<String>)iter.next());
            //res.add(tempList);
        }
        */
        for (String s: map.keySet()) {
            res.add(map.get(s));
        }
						
		return res;
	}

}
