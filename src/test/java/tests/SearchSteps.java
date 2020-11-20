package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Ignore;

import fall2020.FinderApp;
import fall2020.Home;
import fall2020.MockSendEmail;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {
	public int i=1;
	public String[] temp ;
	

	FinderApp finder = new FinderApp();
	MockSendEmail mocksendemail = new MockSendEmail(finder);

	
	public SearchSteps (FinderApp finder , MockSendEmail mocksendemail) {
		this.finder = finder;
		this.mocksendemail = mocksendemail;
		
	}
	

	@Given("these homes are contained in the system")
	public void theseHomesAreContainedInTheSystem(Map <String , String> feature_repository ) {
		finder.setRepository(feature_repository);
		
	   
		}
	    
	

	

	@When("I search about home by {string}")
	public void iSearchAboutHomeBy(String string) {
	   finder.setSearchWord(string);
	
		
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
	    
		finder.matchPlacement();
		
		assertEquals(finder.h.placement ,finder.searchWord);
		
		
		}
	
	
	

	@Then("A list of homes that matches the material specification should be returned and printed on the console")
	public void aListOfHomesThatMatchesTheMaterialSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
	
	boolean result =finder.matchMaterial();
	if(result == true)
	assertEquals(finder.h.material ,finder.searchWord);
	
	}
	
	@And("Send email to {string}")
	public void sendEmailTo(String s1) {
		finder.sendEmail(s1, "Hello");
		
		
		
	}
	
	
	
	@Then("A list of homes that matches the pets specification should be returned and printed on the console")
	public void aListOfHomesThatMatchesThePetsSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
	
		boolean result =finder.matchPets();
		if(result == true)
		assertEquals(finder.h.pets ,finder.searchWord);
	}
	
	@Then("A list of homes that matches the type specification should be returned and printed on the console")
	public void aListOfHomesThatMatchesTheTypeSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
	
		finder.matchType();
		assertEquals(finder.h.type ,finder.searchWord);
	}
	
	@Then("A list of homes that matches the lease length specification should be returned and printed on the console")
	public void aListOfHomesThatMatchesTheLeaseLengthSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
	
		finder.matchLeaseLength();
		if(finder.h.leaseLength == 6)
		assertEquals("short term_6 months" ,finder.searchWord);
		else if(finder.h.leaseLength == 12)
			assertEquals("long term_year" ,finder.searchWord);
	}
	
	
	@Then("A list of homes that matches the amenities specification should be returned and printed on the console")
	public void aListOfHomesThatMatchesTheAmenitiesSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
	
		
		String result = finder.matchAmenities();
		if(result !="")
			assertEquals(result,finder.searchWord);
		
	}
	
	
	
		
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@When("I search about home with price less than {int}")
	public void iSearchAboutHomeWithPriceLessThan(Integer int1) {
	   finder.setSearch1(int1);
	
		
		}
	@Then("A list of homes that matches the price specification should be returned and printed on the console")
	 public void aListOfHomesThatMatchesThePriceSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
		finder.matchPriceSpecification();
		assertTrue(finder.h.price<finder.search1);
		
		
	}
	
	
	
	@When("I search about home with area less than {int}")
	public void iSearchAboutHomeWithAreaLessThan(Integer int1) {
	   finder.setSearch1(int1);
	
		
		}
	@Then("A list of homes that matches the area specification should be returned and printed on the console")
	 public void aListOfHomesThatMatchesTheAreaSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
		finder.matchAreaSpecification();
		assertTrue(finder.h.area<finder.search1);
	}
	
	
	
	@When("I search about home with price between {int} and {int}")
	 public void iSearchAboutHomeWithPriceBetweenAnd(Integer int1,Integer int2) {
		finder.setSearch1And2(int1, int2);
	}
	
	
	@Then("A list of homes that matches the price range should be returned and printed on the console")
	 public void aListOfHomesThatMatchesThePriceRangeShouldBeReturnedAndPrintedOnTheConsole() {
		finder.matchPriceRange();
		assertTrue((finder.h.price >= finder.search1 )&&(finder.h.price <= finder.search2));
	}
	
	
	
	
	@When("I search about home with area between {int} and {int}")
	 public void iSearchAboutHomeWithAreaBetweenAnd(Integer int1,Integer int2) {
		finder.setSearch1And2(int1, int2);
	}
	
	
	@Then("A list of homes that matches the area range should be returned and printed on the console")
	 public void aListOfHomesThatMatchesTheAreaRangeShouldBeReturnedAndPrintedOnTheConsole() {
		finder.matchAreaRange();
		
		assertTrue((finder.h.area >= finder.search1 )&&(finder.h.area <= finder.search2));
	}
	
	
	
	@When("I search about home with {int} bedrooms")
	 public void iSearchAboutHomeWithBedrooms(Integer int1) {
		finder.setSearch1(int1);
		
	}
	
	@Then("A list of homes that matches the number of bedrooms should be returned and printed on the console")
	public void aListOfHomesThatMatchesTheNumberOfBedroomsShouldBeReturnedAndPrintedOnTheConsole() {
		
		boolean result = finder.matchNumberOfBedrooms();
		if(result == true)
		assertEquals(finder.h.bedrooms , finder.search1);
		
	}
	
	
	
	
	
	@When("I search about home with {int} bathrooms")
	 public void iSearchAboutHomeWithBathrooms(Integer int1) {
		finder.setSearch1(int1);
	}
	
	@Then("A list of homes that matches the number of bathrooms should be returned and printed on the console")
	public void aListOfHomesThatMatchesTheNumberOfBathroomsShouldBeReturnedAndPrintedOnTheConsole() {
		
		boolean result =finder.matchNumberOfBathrooms();
		if(result ==true)
		assertEquals(finder.h.bathrooms , finder.search1);
		
		
	}
	



	
	@When("I search about home by specifications {string} {string} {int} {int} {int} {int} {int} {int} {string} {string} {string} {string} {string} {string}")
	public void iSearchAboutHomeBySpecifications(String string, String string2, Integer int1, Integer int2, Integer int3, Integer int4, Integer int5, Integer int6, String string3, String string4, String string5, String string6,String string7, String string8 ) {
		finder.searchWithSpecifications(string, string2, int1, int2, int3, int4, int5, int6, string3, string4, string5, string6, string7, string8);
		
			
	}
	
	@Then("a list of home that  matches the specifications should be returned and printed on the console")
	public void aListOfHomesThatMatchesTheSpecificationsShouldBeReturnedAndPrintedOnTheConsole() {
		
		boolean result = finder.matchSpecifications();
		if(result == true)
		assertEquals(finder.h.bathrooms , finder.numberOfBathrooms);
		
		
		
		
//		aListOfHomesThatMatchesTheNumberOfBathroomsShouldBeReturnedAndPrintedOnTheConsole();
//		aListOfHomesThatMatchesTheNumberOfBedroomsShouldBeReturnedAndPrintedOnTheConsole();
//		aListOfHomesThatMatchesTheAreaRangeShouldBeReturnedAndPrintedOnTheConsole();
//		aListOfHomesThatMatchesThePriceRangeShouldBeReturnedAndPrintedOnTheConsole();
//		aListOfHomesThatMatchesTheAreaSpecificationShouldBeReturnedAndPrintedOnTheConsole();
//		aListOfHomesThatMatchesThePriceSpecificationShouldBeReturnedAndPrintedOnTheConsole();
//		aListOfHomesThatMatchesTheAmenitiesSpecificationShouldBeReturnedAndPrintedOnTheConsole();
//		aListOfHomesThatMatchesTheLeaseLengthSpecificationShouldBeReturnedAndPrintedOnTheConsole();
//		aListOfHomesThatMatchesTheTypeSpecificationShouldBeReturnedAndPrintedOnTheConsole();
//		aListOfHomesThatMatchesThePetsSpecificationShouldBeReturnedAndPrintedOnTheConsole();
//		aListOfHomesThatMatchesTheMaterialSpecificationShouldBeReturnedAndPrintedOnTheConsole();
//		aListOfHomesThatMatchesThePlacementSpecificationShouldBeReturnedAndPrintedOnTheConsole();
		}
		
		
		
		
	
	  
	
	








}
