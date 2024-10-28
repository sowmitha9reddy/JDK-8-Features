package features;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class StreamSum {

	public static void main(String[] args) {
	

	
		    
		        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		       
		        int sumOfEvenNumbers = numbers.stream()             
		                                      .filter(n -> n % 2 == 0) 
		                                      .mapToInt(Integer::intValue) 
		                                      .sum();                   

		       
		        System.out.println( sumOfEvenNumbers); 
		    
	
		        
		        List<String> strings=Arrays.asList("sowmitha","abcd","aadhya","rabbit");
		        String longestString=strings.stream()
		        		                 .max(Comparator.comparingInt(String::length))
                                         .orElse("no strings found");
                         System.out.println(longestString);

		        		
                /*Given a list of names, use the Stream API to count the number of names starting with
               the letter "J".
              Approach: Convert the list to a stream, filter names starting with "J", and use count(). */
                         List<String> names=Arrays.asList("sowmitha","mourya","aadhya","charvi","jassu","jaswanth");
                         long countJNames=names.stream()
        		                   .filter(na -> na.startsWith("j"  ))
        		                	.count();
        		                   
                           System.out.println("count of names starts with J are: " +countJNames);      
                         
                           /*Use the Stream API to find the average of a list of double values.
Approach: Convert the list to a stream, use mapToDouble, and then average(). */
                           
                           List<Double> number = Arrays.asList(1.0, 2.3, 3.0, 4.5, 5.6, 6.9, 7.0, 8.9, 9.9, 10.0);

            		       
           		        OptionalDouble  averageOfNumbers = number.stream()             
           		                                     .mapToDouble(Double::doubleValue) 
           		                                      .average();                 
  
                         
                         System.out.println(averageOfNumbers.getAsDouble());
                         
                         
/*Given a list of employees, use the Stream API to group employees by their department.
Approach: Define an Employee class with department. Convert the list to a stream
and use collect(Collectors.groupingBy(Employee::getDepartment)). */
                       List<Employee> employees=Arrays.asList(new Employee("sowmitha","it",2000),
                    		                                  new Employee("sindhu","it",2000),
                    		                                  new Employee("mourya","it",2000),
                    		                                  new Employee("aadhya","hr",2000),
                    		                                  new Employee("sandhya","hr",3000),
                    		                                  new Employee("charvi","hr",3000),
                    		                                  new Employee("lakku","business",2500),
                    		                                  new Employee("pranu","business",2000),
                    
                    		                                  new Employee("nihi","business",2500));
                       Map<String, List<Employee>> groupByDept = employees.stream()
                               .collect(Collectors.groupingBy(Employee::getDept));
                       
                    groupByDept.forEach((department, empList) -> {
                        System.out.println("Department: " + department);
                        empList.forEach(System.out::println);
                    });

                       

	}

}
