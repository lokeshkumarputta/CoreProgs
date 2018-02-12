import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.StringJoiner;
import java.util.TreeMap;

public class Java8Features {

	public static void main(String[] args) {
/** For Each Example Starts **/

		/*		List<Integer> li = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			li.add(i);
		}
		for (Iterator iterator = li.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println("integer value ::" + integer);
		}
		
		for (Integer integer : li) {
			System.out.println("integer value ::" + integer);
		}
		
		li.forEach(
				new Consumer<Integer>() {
					public void accept(Integer i){
						System.out.println("For each annonymous calss value ::::"+i );
					}

				}
				);
		MyConsumer action = new MyConsumer();
		li.forEach(action);
	*/
	
/** For Each Example Ends **/

		
/** Parllel array sorting Example Starts **/
		/*int arr[] = {1,8,6,5,9,0,12,15,18};
		
		for (int i : arr){
			System.out.println("i value before sorting ::" +i);
		}
		Arrays.parallelSort(arr,0,6);
		
		for (int i : arr){
			System.out.println("i value after sorting ***" +i);
		}*/
		
/** Parllel array sorting Example Ends **/
/** LamdaExpression Example Starts **/
		
		List<String> li = new ArrayList<String>();
		li.add("Lokesh1");
		li.add("Lokesh2");
		li.add("Lokesh3");
		li.add("Lokesh4");
		
		li.forEach(n -> System.out.println(n));
		
		TestInterface test = (int a,int b)-> {
			return(a+b);
		};
		
		System.out.println(test.add(100, 200));
		
		System.out.println("************************************************");
		System.out.println("************************************************");
		
		List<Product> list = new ArrayList<Product>();
		
		list.add(new Product(101, "lokesh", 132f));
		list.add(new Product(102, "Sree", 132f));
		list.add(new Product(103, "Abhi", 132f));
		
		/*Collections.sort(list,(p1,p2)->{
			return p1.name.compareTo(p2.name);
		});
		
		Collections.sort(list, new Comparator<Product>() {
		    public int compare(Product obj1, Product obj2) {
		        return obj1.id - obj2.id;
		    }
		});*/
		
		Map<Integer, String> result = new HashMap<>();

		for(Product r : list) {
			result.put(r.getId(), r.getName());
		
		}
//		result = list.stream().collect(Collectors.toMap(Product::getId, Product::getName));

		System.out.println("Result by using lamda java 8: " + result);	
		System.out.println("Result by using normal java 7 : " + result);		
		
//		System.out.println(list);
		System.out.println("************************************************");
		System.out.println("************************************************");
/** LamdaExpression Example Ends **/
		
/** String Joiner Example Starts **/		

		StringJoiner stringjoiner = new StringJoiner(",");
		
		stringjoiner.add("lokesh");
		stringjoiner.add("sree");
		stringjoiner.add("putta");
		
		System.out.println("String joiner comes as:: "+stringjoiner);
		
/** String Joiner Example Ends **/
		
		HashMap<String, String> map = new HashMap<>();
		map.put("1", "B");
		map.put("7", "D");
		map.put("6", "A");
		
		Map<String,String> treeMap = new TreeMap<>(map);
		// Sorting Based on Keys
		for(String str : treeMap.keySet()) {
			System.out.println("values in sorting order"+str);
		}
		
		// Sorting Based on Values
		
		
		
		for(Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println("Keys = " +entry.getKey() + " \t " + "Values = "  +entry.getValue());
			
		}
		
		Set<Map.Entry<String, String>> 	entrySet = map.entrySet();
		for (Entry<String, String> entry : entrySet) {
			
			List sortedList = new ArrayList();
			
			System.out.println("Keys : " +entry.getKey() + "\t" + "Values : " +entry.getValue());
			
		}
		
		
	}
}


