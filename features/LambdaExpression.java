package features;
interface A{
	void show(int i);
	
}
//class XYZ implements A
//{
//	public void show() {
//		System.out.println("Hello");
//	}
//}
public class LambdaExpression {
  public static void main(String[] args) {
//	  A obj;
//	  obj=new XYZ();
//	  obj.show();
	  
	  
	  
	  
	  A obj;
//	  obj= new A() 
//	  {
//		  public void show() {
//			  System.out.println("Hello");
//		  }
//	  };
	  obj=(i) -> {System.out.println("Hello JDK" + i);};
	  A o= i-> System.out.println("hii JDK " + i);  // when only one paramter is there we can write like this
	  A n= (int i)-> System.out.println("i am dealing with jdk " + i );
	  obj.show(8);
	  o.show(9);
	  n.show(10);;
	  
	  
  }
}
