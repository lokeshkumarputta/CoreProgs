import java.util.Optional;

public class OptionalExample {  
    public static void main(String[] args) {  
        // Below code throws null pointer exception.
    	
    	/*String[] str = new String[10];  
        String lowercaseString = str[5].toLowerCase();  
        System.out.print(lowercaseString);  */
    	
    	// By using Optional Class we can resolve the issue like below
    	String[] str = new String[10]; 
    	//str[5] = "JAVA OPTIONAL CLASS EXAMPLE";
    	Optional nullcheck = Optional.ofNullable(str[5]);
    	//nullcheck.ifPresent(System.out::println);
    	if(nullcheck.isPresent()){
    		String lowercaseString = str[5].toLowerCase();  
            System.out.print(lowercaseString); 
    	}else
    		System.out.println("data is null Please pass the value");
    }  
}  