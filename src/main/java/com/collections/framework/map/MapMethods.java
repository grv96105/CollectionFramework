package com.collections.framework.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapMethods {

	
	public static void main(String[] args) {
		
		//HashMap O(1) 
		//no duplicate keys 
		//unordered sequence
		Map<String,String> map = new HashMap<String, String>();
		
		map.put("US","United States");
		map.put("IN","India");
		map.put("CN","China");
		map.put("JP","Japan");
		
		System.out.println("Map :"+ map);
		System.out.println();
		
		Map<String,String> map1 = new HashMap<String, String>();
		map1.put("US","United States");
		map1.put("IN","India");
		
		System.out.println("Map1 :"+ map1);
		System.out.println();
		
		map.putAll(map1); //won't take duplicate keys
		System.out.println("Map :"+ map);
		System.out.println();
		
		map1.put("KR","Korea");
		map1.put("CN","Canada");
		
		System.out.println("Map1 :"+ map1);
		System.out.println();
		
		map.putAll(map1);//will update the CN key with the new value. 
		System.out.println("Map :"+ map);
		System.out.println();
		
		System.out.println("Map contains the key {IN}: " + map.containsKey("IN"));
		System.out.println();
		System.out.println("Map contains the value {India}: " + map.containsValue("India"));
		System.out.println();
		System.out.println("Get the value of {US}: "+ map.getOrDefault("US", "Russia"));
		System.out.println();
		System.out.println("Get the value of {FR}: "+ map.getOrDefault("FR", "Russia"));
		System.out.println();
		
		//keySet()
		Set<String> keySet = map.keySet();
		System.out.println("KeySet: "+ keySet);
		System.out.println();
		
		//Values()
//		Set<String> valueSet = (Set<String>) map.values();
		System.out.println("Values: "+ map.values());
		System.out.println();
		
		//EntrySet()
		Set<Entry<String,String>> entrySet = map.entrySet();
		System.out.println("EntrySet: "+ entrySet);
		System.out.println();
	}
}
