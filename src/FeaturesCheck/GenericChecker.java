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

public class GenericChecker {
	
	public static void main(String args[])
	{
		Integer intarray[]={1,2,3,4,5};
		Character chararray[]= {'a','b','c','d','e'};
		
		genericcheck(intarray);
		genericcheck(chararray);
	}
	
	public static<E> void genericcheck(E[] array)
	{
		for(E element:array)
		{
			System.out.println(element);
		}
	}

}
