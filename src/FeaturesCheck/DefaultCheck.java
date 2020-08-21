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
interface I
{
	default void show()
	{
		System.out.println("Inside I");
	}
}

interface J
{
	default void show()
	{
		System.out.println("Inside J");
	}
}

class C
{
	public void show()
	{
		System.out.println("Inside C");
	}
}
public class DefaultCheck extends C implements I{

	public static void main(String args[])
	{
		I obj=new DefaultCheck();
		obj.show();
	}
}
