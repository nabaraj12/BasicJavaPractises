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

public class ListChecker {
	
	public static void main(String args[])
	{
		
		
		List<String> list1=new ArrayList();
		
		list1.add("Data1");
		list1.add("Data2");
		list1.add("Data1");
		list1.add("Data4");
		Arraylistimplementation(list1);
		
		LinkedList<String> ll_list=new LinkedList();
		
		ll_list.add("Data1");
		ll_list.add("Data2");
		ll_list.add("Data1");
		ll_list.add("Data4");
		Linkedlistimplementation(ll_list);
		
		Set<String> hashset=new HashSet();
		
		hashset.add("Data1");
		hashset.add("Data2");
		hashset.add("Data1");
		hashset.add("Data4");
		HashSetimplementation(hashset);
		
		
		
		
		
	}
	 static void Arraylistimplementation(List list1)
	{
		System.out.println("****List Implementation*****");
		 Iterator itr=list1.iterator();
			
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
	}
	 static void Linkedlistimplementation(LinkedList list1)
		{
			System.out.println("****LinkedList Implementation*****");
			 Iterator itr=list1.iterator();
				
				while(itr.hasNext())
				{
					System.out.println(itr.next());
				}
		}
	 static void HashSetimplementation(Set list1)
		{
			System.out.println("****Set Implementation*****");
			 Iterator itr=list1.iterator();
				
				while(itr.hasNext())
				{
					System.out.println(itr.next());
				}
		}


}
