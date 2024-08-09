package features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
 

//call by method passing function to function

interface Parser{
	String parse(String str);
}
class StringParser{
	public static String convert(String s) {
		if(s.length()>=3) {
			return s.toUpperCase();
		}
		return s.toLowerCase();
		
	
	}
}


class MyPrinter{
	public void print(String str,Parser p) {
		str=p.parse(str);
		System.out.println(str);
	}
}

public class MethodReferance {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("sow","thu","lak","sudh","prathy","nih");
		
		Consumer<String> con=new Consumer<String>() {
			public void accept(String s) {
				System.out.print(s + " ");
			}
		};
		
		
		names.forEach(con);
		System.out.println();
		names.forEach(name ->System.out.println(name));
		System.out.println();
		names.forEach(System.out::println); //call by method passing function to function
		
		System.out.println();
		
		
		
		
		
		
		String str="Sowmitha";
		MyPrinter mp=new MyPrinter();
		mp.print(str,new Parser()
				{
			         public String parse(String s) {
			        	return  StringParser.convert(s);
			         }
		          
		
				}	);
		mp.print(str,s-> StringParser.convert(s));
		mp.print( str,(StringParser::convert));
		
		
		
	}

}

