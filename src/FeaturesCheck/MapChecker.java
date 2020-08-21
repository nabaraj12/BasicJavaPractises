/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FeaturesCheck;

/**
 *
 * @author lll
 */
import java.util.*;
import java.util.Map.Entry;

public class MapChecker {
	
	public static void main(String arg[])
	{
		Map<Integer,String> map=new HashMap();
		
		map.put(120, "Sachin");
		map.put(150, "Dravid");
		map.put(102, "Ganguly");
		map.put(106, "Kumble");

		Set s=map.entrySet();
		
		Iterator itr=s.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry m=(Map.Entry)itr.next();
		}
		
		
		map.entrySet()
			.stream()
			.sorted(Map.Entry.comparingByKey())
			.forEach(System.out::println);
		
		System.out.println("\n");
		
		map.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByValue())
		.forEach(System.out::println);
	
		
//		for(Entry<Integer, String> m:map.entrySet())
//		{
//			System.out.println(m.getKey()+m.getValue());
//		}
	}
	
	

}
