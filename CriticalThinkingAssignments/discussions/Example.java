package discussions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Example {
  
	   public static void main(String[] args) {
	       List<String> carMake = new ArrayList<>();

	       carMake.add("Chevy");
	       carMake.add("Ford");
	       carMake.add("Ford");
	       carMake.add("Dodge"); 

	        System.out.println("Car Makes:");
	        for (String makes : carMake) {
	            System.out.println(makes);
	        }

	        Set<String> carModel = new HashSet<>();

	        carModel.add("Blazer");
	        carModel.add("F150");
	        carModel.add("F150");
	        carModel.add("Charger"); 
	        System.out.println("\nCar Models:");
	        for (String makes : carModel) {
	            System.out.println(makes);
	        }
	    }
	}
	




