package com.snr.sample;

import java.util.HashMap;
import java.util.Map;

public class Sample {
	
	public static void getname(String name) {
		char[] charector = name.toCharArray();
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(Character ch : charector) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch, 1);
			}
		}
		for(Map.Entry<Character,Integer> em : map.entrySet()) {
			System.out.println(em.getKey() + "-" + em.getValue());
		}
	}
	
	public static void main(String[] args) {
		String name = "MicroServies";
		Sample.getname(name);
	}

}
