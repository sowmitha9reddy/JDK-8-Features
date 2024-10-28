package features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaExpressionexmpl {

public static void main(String[] args) {
	    
	  /*11. Use lambda expressions to sort a list of integers in descending order.
Approach: Convert the list to a stream, use sorted with a comparator for descending
order. */
	  
	  ArrayList<Integer> al=new ArrayList<Integer>();
	  al.add(10);
	  al.add(50);
	  al.add(30);
	  al.add(5);
	  al.add(60);
	  
	  List<Integer> sortedNumbers=al.stream()
			            .sorted((a,b) -> b-a )
			            .collect(Collectors.toList());
	  sortedNumbers.forEach(number -> System.out.println(number));
	  
	 
	  
	  /*Use a lambda expression to filter a list of strings to include only those that are
non-empty.
Approach: Convert the list to a stream, use filter(s -> !s.isEmpty()). */
	  
	  List<String> strings=Arrays.asList("sowmitha","abcd","aadhya","rabbit","","");
	  
	  List<String> nonEmptystrings=strings.stream()
			  .filter(s -> !s.isEmpty())
			  .collect(Collectors.toList());
	  nonEmptystrings.forEach(st ->System.out.println(st +" : closed"));
	  
	  
	  /*Create a lambda expression to find the maximum value in a list of integers.
Approach: Convert the list to a stream, use max(Integer::compareTo). */
	  
	  List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 34, 7, 8, 9, 10);
	  
	  Optional<Integer> max=numbers.stream()
			  .max(Integer::compareTo);
	  
	  System.out.println(max.get());
	   
	  /*Implement a lambda expression to concatenate a list of strings with a comma separator.
Approach: Convert the list to a stream, use collect(Collectors.joining(",")). */
	  
	  List<String> string=Arrays.asList("I","Love","My","Country.");
	  
	  String concateString = string.stream()
			        .collect(Collectors.joining(" "));
	  System.out.println(concateString);
	  
	  
	  /*Use lambda expressions to map a list of integers to their squares.
Approach: Convert the list to a stream, use map(n -> n * n). */
	  List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 34, 7, 8, 9, 10);
	  
	  List<Integer> sqnums=nums.stream()
			  .map(n -> n * n)
			  .collect(Collectors.toList());
	  
	  sqnums.forEach(n ->System.out.println(n));
	  
	  
			  
	  
	  
	  
  }
}
