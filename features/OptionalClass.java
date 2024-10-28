package features;

import java.util.Optional;

public class OptionalClass {

	 static Optional<String> getOptionalString(String value) {
	        return Optional.ofNullable(value); 
	    }

	public static void main(String[] args) {
	 
		
		/*Create a method that returns an Optional<String> containing a value if a string is
not null, otherwise return Optional.empty().
Approach: Use Optional.ofNullable() to wrap the string and return it. */
		

		
		   
		    
		       
		        String nonNullString = "Hello, World!";
		        String nullString = null;

		     
		        Optional<String> nonNullOptional = getOptionalString(nonNullString);
		        Optional<String> nullOptional = getOptionalString(nullString);

		    
		        System.out.println("Non-null Optional: " + nonNullOptional);
		        System.out.println("Null Optional: " + nullOptional);
		        
		        
		        nonNullOptional.ifPresent(value -> System.out.println("Value is present: " + value));
		        nullOptional.ifPresent(value -> System.out.println("This won't be printed because value is absent."));
		        
		    
		        /*17. Write a method that takes an Optional<String> and prints the string in uppercase if it
is present, otherwise prints "No value".
+
Approach: Use ifPresentOrElse() to handle both cases. */
		

		
		
	}

}
