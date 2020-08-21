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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

interface LambdaCheck {
	public void display(int i[]);

	default void show() {
		System.out.println("ji");
	}

}

public class LambdaAndStreamChecker {

	@SuppressWarnings("unchecked")
	public static void main(String args[]) {

		LambdaCheck l1 = (int a[]) -> {
			for (int i : a)
				System.out.println(i);
		};

//		LambdaCheck l1=new LambdaCheck()
//				{
//					public void display(int i)
//					{
////						for(int i:a)
//						System.out.println(i);
//					}
//				};
//				
		int a[] = { 1, 4, 3, 4, 9 };
		l1.display(a);
//                List<Integer> values=new ArrayList();
		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);

		Function<Integer, Integer> f = new Function<Integer, Integer>() {
			@Override
			public java.lang.Integer apply(java.lang.Integer i) {
				// TODO Auto-generated method stub
				return i * 2;
			}
		};
		Stream<Integer> s = values.stream();
		Stream<Integer> s1 = values.stream().map(i->i*2);
		
//		Stream<Integer> s2=s.filter(i->i<2);
//		System.out.println(s2);

		
		
		
		Integer Result= (Integer) values.stream().map(i->i*2).reduce(0,(i,j)-> i + j );

		System.out.println(values.stream().map(LambdaAndStreamChecker::mapToDouble).filter(LambdaAndStreamChecker::checkOdd).findFirst());
		System.out.println(values.stream().map(i->i*2).reduce(Integer::sum ));

	} 
        public static int mapToDouble(int x)
        {
            System.out.println("Inside double func");
            return x*3;
        }
        public static boolean checkOdd(int x)
        {
            System.out.println("Inside Even func");
            return !(x%2==0);
        }


}
