import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LamdaTest {

	public static void main(String[] args) {

	// List -> Map Conversion By using Lamda Expression Streams
	// Streams usage in Our Project also	
		
	// Difference between both : In java8 if duplicate keys came it will throw exception, need to handle the exception
	//							 In java 7 it wont print the duplicate key and value, not required to handle any exception
		
		
	List<Products> list = new ArrayList<>();
	
	list.add(new Products(101, "lokesh"));
	list.add(new Products(102, ""));
	list.add(new Products(101, "Lokeshkumar"));
	
	Map<Integer,String> finalmap = new HashMap<>();

	// By using normal Foreach loop
	
		for(Products products : list) {
			
			finalmap.put(products.getPid(), products.getPname());
		}
		System.out.println("list to map values by using java 7"+finalmap);

	// By using Lamda Expressoins
	
		finalmap = list.stream().collect(Collectors.toMap(Products :: getPid, Products :: getPname));
		System.out.println("list to map values by using java 8"+finalmap);
	
	

	/**
	 * To solve the above Duplicate key issue need to write syntax differently like below 
	 */
	
	finalmap = list.stream().collect(Collectors.toMap(Products :: getPid, Products :: getPname, (oldValue , newValue) -> newValue));
	
	System.out.println("list to map values by using java 8"+finalmap);
	}

}
