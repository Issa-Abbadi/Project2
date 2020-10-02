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
	private ArrayList <Home> home = new ArrayList<Home>()  ;
	private Home c ,q;
	private int i =0;
	private int search1,search2;
	public String[] temp ;
	public String [] temp1 ;
	public String type      = new String();
	public String material  = new String();
	public String placement = new String();
	public String pets      = new String();
	public String amenities  = new String();
	public int leaseLength =0 ;
	public int lessthanprice=0 , numberOfBedrooms = 0, numberOfBathrooms =0 , lessthanprice2=0 , rangelower1 =0 ,rangelower2 =0 , rangeupper1 =0 , rangeupper2 =0 ;

	

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
			temp = searchWord.split(",");
			for(int i=0 ; i < temp.length ; i++) {
			if(q.airConditioning.equals(temp[i])||q.balcony.equals(temp[i])||q.elevator.equals(temp[i])||q.firePlace.equals(temp[i])||q.garageParking.equals(temp[i])||q.swimmingPool.equals(temp[i])) {
		       System.out.println(q.homeName+"\n");
			}
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
	
	@When("I search about home by specifications {string} {string} {int} {int} {int} {int} {int} {int} {string} {string} {string} {string} {string} {string}")
	public void iSearchAboutHomeBySpecifications(String s1, String s2, Integer i1, Integer i2, Integer i3, Integer i4, Integer i5, Integer i6, String s3, String s4, String s5, String s6,String s7, String s8 ) {
		placement = s1 ; 
		material = s2 ;
		lessthanprice = i1 ;
		rangelower1 =i2;
		rangeupper1 =i3 ;
		lessthanprice = i4 ;
		rangelower2 = i5 ;
		rangeupper2 = i6 ;
		numberOfBedrooms = (s3.equals("NULL") ? 0 : Integer.parseInt(s3));
		numberOfBathrooms = (s4.equals("NULL") ? 0 : Integer.parseInt(s4));
		pets = s5 ;
		type = s6 ;
		if(s7.equals("short term_6 months")) {
			leaseLength= 6;
		}
		else if(s7.equals("long term_year")) {
			leaseLength = 12;
		}
		  
		amenities = s8 ;
		temp1 = amenities.split(",");
			
	}
	
	@Then("a list of home that  matches the specifications should be returned and printed on the console")
	public void aListOfHomesThatMatchesTheSpecificationsShouldBeReturnedAndPrintedOnTheConsole() {
		
		for(int i=0 ; i< home.size() ;i++) {
		q = home.get(i);
		if(!q.placement.equals(placement) || !q.material.equals(material) || !q.type.equals(type) || !q.pets.equals(pets)|| q.leaseLength != leaseLength || q.bedrooms != numberOfBedrooms || q.bathrooms != numberOfBathrooms ) {
			home.remove(q);
		}
		
		for(int j=0 ; j < temp1.length ; j++) {
		 if (q.airConditioning.equals(temp1[j])||q.balcony.equals(temp1[j])||q.elevator.equals(temp1[j])||q.firePlace.equals(temp1[j])||q.garageParking.equals(temp1[j])||q.swimmingPool.equals(temp1[j])) {
			continue;
		}
		 else {
			 home.remove(q);
		 }
		}
		if(home.isEmpty() == false) {
			System.out.println(q.homeName+"\n");
		}
		}
		
	}
	  
	
	








}
