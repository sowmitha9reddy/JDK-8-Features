package features;

import java.util.ArrayList;

public class ForEach {
  public static void main(String[] args) {
	  ArrayList<Integer> ar= new ArrayList();
	  ar.add(10);
	  ar.add(30);
	  ar.add(50);
	  ar.forEach(i -> System.out.print(i +" "));
	  
  }
}
