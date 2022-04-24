package com.qa.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.qa.pojo.TMap;

public class MapKeytoObject {

	public static void main(String[] args) {
		HashMap<Object, TMap> map1 = new HashMap<Object, TMap>();
		
		
		TMap E1 = new TMap(1, "100", "2020");
		
		TMap E2 = new TMap(2, "200", "2021");
		
		TMap E3 = new TMap(3, "300", "2022");
		
		map1.put(E1.getcheckID(), E1);
		map1.put(E1.getcheckID(), E1);
		map1.put(E1.getcheckID(), E1);
	
		
		
		Set<Entry<Object, TMap>> m1= map1.entrySet();
		
		for(Map.Entry<Object, TMap> emp : m1)
			
		{
			//emp.getKey();
	       String map = emp.getValue().getcheckID();
	       System.out.println("CHECKID  :  "+  map);
	       int sum2 = emp.getValue().getsum();
	     
	       System.out.println("SUMMMM  :  "+  sum2);
	       
			
		}

		
		
		
	}
}
