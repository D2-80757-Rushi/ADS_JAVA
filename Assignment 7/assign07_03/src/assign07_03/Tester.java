package assign07_03;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Tester {

	public static void main(String[] args) {
		String s = "my name is sunny, i my studying in cdac completing my PG-DAC course";
		String[] line = s.split(" ");
		Hashtable<String, Integer> h = new Hashtable<>();
		
		for(int i=0; i<line.length; i++) {
			if(h.containsKey(line[i])) {
				h.put(line[i] , h.get(line[i])+1);
			}
			else {
				h.put(line[i], 1);
			}
			
		}
		
		Set<Map.Entry<String, Integer>> e = h.entrySet();
		
		for(Iterator<Entry<String,Integer>> i = e.iterator(); i.hasNext();) {
			Entry<String,Integer> temp = i.next();
			System.out.println(temp.getKey() +" "+ temp.getValue());
		}
		
	}

}
