package tests;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Ignore;

import fall2020.Home;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {
	private Map<String , String> theMap = new HashMap<String , String >();
	private String mapKey = new String();
	private String mapValue = new String();
	private String searchWord = new String();
	private ArrayList<Home> home = new ArrayList<Home>()  ;
	private Home c ,q;
	private int i =0;
	private int search1,search2;

	

	@Given("these homes are contained in the system")
	public void theseHomesAreContainedInTheSystem(Map <String , String> feature_repository ) {
		
	    theMap = feature_repository;
	    for (Map.Entry<String, String> set : theMap.entrySet()) {
		    c = new Home(set.getKey(),set.getValue());
		    home.add(c);
		    i++;
		}
	    
	}

	

	@When("I search about home by {string}")
	public void iSearchAboutHomeBy(String string) {
	   searchWord = string;
	
		
		}
	
	
	
	
/*	@Then("A list of homes that matches the  type specification should be returned and printed on the console")
	public void aListOfHomesThatMatchesTheTypeSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
	  
			for(int count=0 ; count < i ; count++ ) {
		q = home.get(count);
		
		
		if(q.placement.equals(searchWord)) {
				System.out.println(q.homeName+"\n");
		}
		
		else if(q.material.equals(searchWord)) {
		System.out.println(q.homeName+"\n");
		}
		
		else if(q.pets.equals(searchWord)) {
			System.out.println(q.homeName+"\n");
			}
		
		else if(q.type.equals(searchWord)) {
			System.out.println(q.homeName+"\n");
			}
		
		else if(q.airConditioning.equals(searchWord)||q.balcony.equals(searchWord)||q.elevator.equals(searchWord)||q.firePlace.equals(searchWord)||q.garageParking.equals(searchWord)||q.swimmingPool.equals(searchWord)) {
			System.out.println(q.homeName+"\n");
			
			}
		
		else if(searchWord.equals("short term_6 months")&&q.leaseLength == 6) {
			System.out.println(q.homeName+"\n");
			
			}
		
		else if(searchWord.equals("long term_year")&&q.leaseLength == 12) {
			System.out.println(q.homeName+"\n");
			
			}
		
		}
		
	}*/

	
	
	
	@Then("A list of homes that matches the placement specification should be returned and printed on the console")
	public void aListOfHomesThatMatchesThePlacementSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
	
		for(int count=0 ; count < i ; count++ ) {
			q = home.get(count);
			
			
			
			if(q.placement.equals(searchWord)) {
				System.out.println(q.homeName+"\n");
		      }
			
		}
	}
	
	

	@Then("A list of homes that matches the material specification should be returned and printed on the console")
	public void aListOfHomesThatMatchesTheMaterialSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
	
		for(int count=0 ; count < i ; count++ ) {
			q = home.get(count);
			
			
			
			if(q.material.equals(searchWord)) {
				System.out.println(q.homeName+"\n");
		      }
			
		}
	}
	
	
	
	@Then("A list of homes that matches the pets specification should be returned and printed on the console")
	public void aListOfHomesThatMatchesThePetsSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
	
		for(int count=0 ; count < i ; count++ ) {
			q = home.get(count);
			
			
			
			if(q.pets.equals(searchWord)) {
				System.out.println(q.homeName+"\n");
		      }
			
		}
	}
	
	@Then("A list of homes that matches the type specification should be returned and printed on the console")
	public void aListOfHomesThatMatchesTheTypeSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
	
		for(int count=0 ; count < i ; count++ ) {
			q = home.get(count);
			
			
			
			if(q.type.equals(searchWord)) {
				System.out.println(q.homeName+"\n");
		      }
			
		}
	}
	
	@Then("A list of homes that matches the lease length specification should be returned and printed on the console")
	public void aListOfHomesThatMatchesTheLeaseLengthSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
	
		for(int count=0 ; count < i ; count++ ) {
			q = home.get(count);
			
			
			if(searchWord.equals("short term_6 months")&&q.leaseLength == 6) {
				System.out.println(q.homeName+"\n");
				
				}
			
			else if(searchWord.equals("long term_year")&&q.leaseLength == 12) {
				System.out.println(q.homeName+"\n");
				
				}
			
		}
	}
	
	
	@Then("A list of homes that matches the amenities specification should be returned and printed on the console")
	public void aListOfHomesThatMatchesTheAmenitiesSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
	
		for(int count=0 ; count < i ; count++ ) {
			q = home.get(count);
			
			
			if(q.airConditioning.equals(searchWord)||q.balcony.equals(searchWord)||q.elevator.equals(searchWord)||q.firePlace.equals(searchWord)||q.garageParking.equals(searchWord)||q.swimmingPool.equals(searchWord)) {
		       System.out.println(q.homeName+"\n");
			}
		}
	}
	
	
	
		
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@When("I search about home with price less than {int}")
	public void iSearchAboutHomeWithPriceLessThan(Integer int1) {
	   search1 = int1;
	
		
		}
	@Then("A list of homes that matches the price specification should be returned and printed on the console")
	 public void aListOfHomesThatMatchesThePriceSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
		for(int count=0; count< i ; count++) {
			q = home.get(count);
			
			if(q.price < search1) {
				System.out.println(q.homeName+"\n");
		}
			
			
			
		}
		
		
		
	}
	
	
	
	@When("I search about home with area less than {int}")
	public void iSearchAboutHomeWithAreaLessThan(Integer int1) {
	   search1 = int1;
	
		
		}
	@Then("A list of homes that matches the area specification should be returned and printed on the console")
	 public void aListOfHomesThatMatchesTheAreaSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
		for(int count=0; count< i ; count++) {
			q = home.get(count);
			
			if(q.area < search1) {
				System.out.println(q.homeName+"\n");
		}
		}
	}
	
	
	
	@When("I search about home with price between {int} and {int}")
	 public void iSearchAboutHomeWithPriceBetweenAnd(Integer int1,Integer int2) {
		search1 = int1;
		search2 = int2;
	}
	
	
	@Then("A list of homes that matches the price range should be returned and printed on the console")
	 public void aListOfHomesThatMatchesThePriceRangeShouldBeReturnedAndPrintedOnTheConsole() {
		for(int count=0; count< i ; count++) {
			q = home.get(count);
			
			if(q.price >= search1 && q.price <= search2) {
				System.out.println(q.homeName+"\n");
		}
		}
	}
	
	
	
	
	@When("I search about home with area between {int} and {int}")
	 public void iSearchAboutHomeWithAreaBetweenAnd(Integer int1,Integer int2) {
		search1 = int1;
		search2 = int2;
	}
	
	
	@Then("A list of homes that matches the area range should be returned and printed on the console")
	 public void aListOfHomesThatMatchesTheAreaRangeShouldBeReturnedAndPrintedOnTheConsole() {
		for(int count=0; count< i ; count++) {
			q = home.get(count);
			
			if(q.area >= search1 && q.area <= search2) {
				System.out.println(q.homeName+"\n");
		}
		}
	}
	
	
	
	@When("I search about home with {int} bedrooms")
	 public void iSearchAboutHomeWithBedrooms(Integer int1) {
		search1 = int1;
	}
	
	@Then("A list of homes that matches the number of bedrooms should be returned and printed on the console")
	public void aListOfHomesThatMatchesTheNumberOfBedroomsShouldBeReturnedAndPrintedOnTheConsole() {
		
		for(int count=0; count< i ; count++) {
			q = home.get(count);
			
			if(q.bedrooms == search1 ) {
				System.out.println(q.homeName+"\n");
		}
		}
		
		
	}
	
	
	
	
	
	@When("I search about home with {int} bathrooms")
	 public void iSearchAboutHomeWithBathrooms(Integer int1) {
		search1 = int1;
	}
	
	@Then("A list of homes that matches the number of bathrooms should be returned and printed on the console")
	public void aListOfHomesThatMatchesTheNumberOfBathroomsShouldBeReturnedAndPrintedOnTheConsole() {
		
		for(int count=0; count< i ; count++) {
			q = home.get(count);
			
			if(q.bathrooms == search1 ) {
				System.out.println(q.homeName+"\n");
		}
		}
		
		
	}
	  
	
	








}
