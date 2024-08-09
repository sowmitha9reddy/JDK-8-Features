package features;

import java.util.ArrayList;
import java.util.function.Consumer;

//class Consumerim implements Consumer<Integer>
//{
//
//	@Override
//	public void accept(Integer t) {
//		System.out.println(t);
//		
//	}
//
//}

public class ConsumerInterface {
	public static void main(String[] args) {
		ArrayList<Integer> ar= new ArrayList();
		  ar.add(10);
		  ar.add(30);
		  ar.add(50);
		// Consumer c=new Consumerim();
		// ar.forEach(c);
		  
		  //Anyonomous class
		  
//		  Consumer c= new Consumer<Integer>() 
//				  {
//			  public void accept(Integer t) {
//					System.out.println(t);
//					
//				}
//				  };
//		
		  ar.forEach(i -> System.out.print(i +" "));
        Consumer c= i -> System.out.println(i+ " ");
 
		  ar.forEach(c);
	}

}



