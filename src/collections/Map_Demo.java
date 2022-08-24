package collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

import java8.SoftwareEngineer;

public class Map_Demo {
	public static void main(String args[]) {
		Maps maps = new Maps();
		maps.doHashMap();
		maps.operateHashMap();
		HashMap<SoftwareEngineer, Integer> hmap = new HashMap<SoftwareEngineer, Integer>();
		hmap.put(new SoftwareEngineer(90000, "yns", "syd"), 90000);
		hmap.put(new SoftwareEngineer(92000, "ys", "sd"), 92000);
		hmap.put(new SoftwareEngineer(92500, "ays", "swd"), 92500);
		ConcurrentHashMap<SoftwareEngineer, Integer> ch = new ConcurrentHashMap<SoftwareEngineer, Integer>(hmap);

		for(Entry<SoftwareEngineer, Integer> mp:ch.entrySet()) {
			System.out.println("------------"+mp.getKey()+mp.getValue());
			if(mp.getValue()>90000) {
				hmap.remove(mp.getKey());
				System.out.println("----:"+mp.getKey()); 
				
			}
			
		}
		



	}

	public void operateHashMap() {
	}
}
