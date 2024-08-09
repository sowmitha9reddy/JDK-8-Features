package features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamAPI {
	
	public static void main(String[] args) {
		 
		List<Integer> nums=Arrays.asList(4,5,6,8,9,2);
//		Stream<Integer> data=nums.stream(); // creating stream  for list values
//		Stream<Integer> mappedData=data.map(n-> n*2); // doubling the values of in a stream
//		mappedData.forEach(n-> System.out.println(n ));
		
//		Predicate<Integer> predi=new Predicate<Integer>()
//		{
//          @Override
//			public boolean test(Integer n) {
//				if(n%2==0) {
//					return true;
//				}
//				return false;
//			}
//		};
		
//		Predicate<Integer> predi=new Predicate<Integer>()
//		{
//          @Override
//			public boolean test(Integer n) {
//				
//				return n%2==0;
//			}
//		};
		Predicate<Integer> predi= n -> n%2==0;
		
		
		int result=nums.stream()
		.filter(predi)
		  // .filter(n->n%2==0)  //predicate method
		   .sorted()
		   .map(n ->n*3)
		   .reduce(0,(c,e)->c+e); //  .forEach(n->System.out.println(n)); //in single line
		System.out.println(result);
				
		
//		long count=data.count();
//		System.out.println(count);
		//Stream<Integer> sortedData=data.sorted();
		//data.forEach(n-> System.out.println(n ));
		//sortedData.forEach(n-> System.out.println(n ));//Exception
		
		
		
		
//		for(int n:nums) {
//			System.out.println(n*2);
//		}
		
		
		
	}

}
