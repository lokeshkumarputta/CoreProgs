import java.util.function.Consumer;

public class MyConsumer implements Consumer<Integer>, TestInterface{


	@Override
	public void accept(Integer t) {
		System.out.println("My Consumer implementation value" +t);
		
	}

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}