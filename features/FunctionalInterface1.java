package features;
 
@FunctionalInterface
 interface IntOperation {
    int apply(int x, int y);
}

   
    public class FunctionalInterface1  {
    

    public static void main(String[] args) {
        
    	 IntOperation addition1 = new IntOperation() {
             @Override
             public int apply(int x, int y) {
                 return x + y;
             }
         };
         
      
        IntOperation addition = (x, y) -> x + y;
        
       
        IntOperation subtraction = (x, y) -> x - y;
        
       
        IntOperation multiplication = (x, y) -> x * y;
        
       
        IntOperation division = (x, y) -> {
            if (y == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }
            return x / y;
        };
        
       
        int a = 10;
        int b = 5;
        
        System.out.println("Addition: " + addition.apply(a, b));         
        System.out.println("Subtraction: " + subtraction.apply(a, b));   
        System.out.println("Multiplication: " + multiplication.apply(a, b)); 
        System.out.println("Division: " + division.apply(a, b));        

       
        // System.out.println("Division by zero: " + division.apply(a, 0)); 
        
        
        
        
        StringLength length1=s-> s.length();
        StringLength length2=(s)-> s.length();
        StringLength length3=(String s)-> s.length();
        System.out.println(length1.length("Sowmitha"));
        System.out.println(length2.length("abcd"));
        System.out.println(length3.length("Sowmitha"));
        
        
        Predicate testing1=(s,st) -> s.contains(st);
        Predicate testing2=(String s,String st) -> s.contains(st);
        
        System.out.println(testing1.test("sowmitha", "mitha") );
        System.out.println(testing2.test("sowmitha", "mitha"));
        System.out.println(testing1.test("sandhya", "sowmitha"));
        
        
        
        Transformer upperCase = s->s.toUpperCase();
        Transformer lowerCase = s->s.toLowerCase();
        Transformer titleCase = s->{
        	String titleCases="";
        	if(s!=null) {
        		String[] st=s.split("\\s+");
        		for(String c:st) {
        			titleCases+=Character.toUpperCase(c.charAt(0));
        			titleCases+=c.substring(1).toLowerCase();
        			titleCases+=" ";
        		}
        		 return titleCases.toString().trim();
        		
        		
        }
        	else {
        		return "String Empty";
        	}
        };
        
        System.out.println(upperCase.transform("sowmitha"));
        System.out.println(lowerCase.transform("SOWMITHA"));
        System.out.println(titleCase.transform("sowmitha"));
        System.out.println(titleCase.transform("sowmitha reddy aadhya"));
        		
        		
        
        
                
             
                MathOperation modulus = (c, d) -> c % d;
                
               
                MathOperation power = (c, d) -> Math.pow(c, d);
                
             
                double num1 = 10;
                double num2 = 3;
                double num3 = 2;
                
                System.out.println("Modulus of " + num1 + " % " + num2 + " = " + modulus.calculate(num1, num2)); 
                System.out.println("Power of " + num1 + " ^ " + num3 + " = " + power.calculate(num1, num3)); 
      

        
        
        
        
    }

	
}
/*Create a functional interface StringLength with a method int length(String s).
Use a lambda expression to implement this interface to return the length of a given
string.
Approach: Define the interface with int length(String s). Implement it using a
lambda expression */
    
    @FunctionalInterface
    interface StringLength {
    	int length(String s);
   }
    
    /*Implement a functional interface Predicate<T> to check if a string contains a given
substring. Use a lambda expression for the implementation.
Approach: Define a functional interface Predicate<T> with a method boolean
test(String s, String substring). Implement it using a lambda expression
that checks substring presence. */
    
    @FunctionalInterface
    interface Predicate<T> {
    	boolean test(String s, String substring);
   }
    
    
    /*Define a functional interface Transformer with a method String
transform(String input). Implement this interface using lambda expressions to
convert the string to lowercase, uppercase, and title case. */
    
    @FunctionalInterface
    interface Transformer {
    	String transform(String input);

		
   }
    
    
    @FunctionalInterface
    interface MathOperation {
        double calculate(double a, double b);
    }


	
