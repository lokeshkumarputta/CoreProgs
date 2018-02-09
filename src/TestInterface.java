@FunctionalInterface
public interface TestInterface {

//	public void accept(Integer t);
	
	default void method1(){
		System.out.println("default method in interface");
	}
	
	static void method2(){
		System.out.println("static method in interface");
	}
	public int add(int a , int b);
//	public void normalMethod3();
}
