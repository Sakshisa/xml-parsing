package com.qa.test;

import java.util.HashMap;

import com.qa.pojo.TMap;

public class TestMap {

	public static void main(String[] args) {
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(10, "1");
		map1.put(11, "2");
		map1.put(13, "3");

		// map1.put(11, TMap)
		HashMap<String, Object> map = new HashMap<String, Object>();

		map.put("10", map1);
		map.put("11", map1);
		
		
		System.out.println(map.get("10"));
		System.out.println(map.get("11"));
		
		
	}
}
