package fall2020;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FinderApp {
	
	private Map<String , String> theMap = new HashMap<String , String >();
	private String mapKey = new String();
	private String mapValue = new String();
	public String searchWord = new String();
	public ArrayList <Home> home = new ArrayList<Home>()  ;
	public ArrayList <Home> tempHome = new ArrayList<Home>()  ;
	public Home c;
	public Home q,h;
	private int i =0;
	public int search1,search2;
	public String[] temp ;
	public String [] temp1 ;
	public String type      = new String();
	public String material  = new String();
	public String placement = new String();
	public String pets      = new String();
	public String amenities  = new String();
	public int leaseLength =0 ;
	public int lessThanPrice=0 , numberOfBedrooms = 0, numberOfBathrooms =0 , lessThanArea=0 , rangeLowerPrice =0 ,rangeLowerArea =0 , rangeUpperPrice =0 , rangeUpperArea =0 ;
	private SendEmail sendemail = new SendEmail();
	
	public void setRepository(Map <String , String> feature_repository) {
		 theMap = feature_repository;
		    for (Map.Entry<String, String> set : theMap.entrySet()) {
			    c = new Home(set.getKey(),set.getValue());
			    home.add(c);
			    i++;
		
	}

}
	public void setSearchWord(String string) {
		searchWord = string;
	}
	
	
	public void matchPlacement() {
		for(int count=0 ; count < i ; count++ ) {
			q = home.get(count);
			
			
			
			if(q.placement.equals(searchWord)) {
				h=q;
				System.out.println(q.homeName+"\n");
		      }
		}
	}
	
	public boolean  matchMaterial() {
		for(int count=0 ; count < i ; count++ ) {
			q = home.get(count);
			
			
			
			if(q.material.equals(searchWord)) {
				h=q;
				System.out.println(q.homeName+"\n");
				return true;
		      }
			
		}
		return false;
	}
	
	
	public boolean matchPets() {
		for(int count=0 ; count < i ; count++ ) {
			q = home.get(count);
			
			
			
			if(q.pets.equals(searchWord)) {
				h=q;
				System.out.println(q.homeName+"\n");
				return true;
		      }
		}
		return false;
	}
	
	public void matchType() {
		for(int count=0 ; count < i ; count++ ) {
			q = home.get(count);
			
			
			
			if(q.type.equals(searchWord)) {
				h=q;
				System.out.println(q.homeName+"\n");
		      }
		}
	}
	
	
	public void matchLeaseLength() {
	    for(int count=0 ; count < i ; count++ ) {
		q = home.get(count);
		
		
		if(searchWord.equals("short term_6 months")&&q.leaseLength == 6) {
			h=q;
			System.out.println(q.homeName+"\n");
			
			}
		
		else if(searchWord.equals("long term_year")&&q.leaseLength == 12) {
			h=q;
			System.out.println(q.homeName+"\n");
			
			}
		
	}
	}
	
	
	public String matchAmenities() {
		
		for(int count=0 ; count < i ; count++ ) {
			q = home.get(count);
			temp = searchWord.split(",");
			for(int i=0 ; i < temp.length ; i++) {
			if(q.airConditioning.equals(temp[i])) {
		       System.out.println(q.homeName+"\n");
		       h=q;
		       return q.airConditioning;
			}
			else if(q.balcony.equals(temp[i])) {
				 System.out.println(q.homeName+"\n");
			       h=q;
			       return q.balcony;
			}
			else if (q.elevator.equals(temp[i])) {
				 System.out.println(q.homeName+"\n");
			       h=q;
			       return q.elevator;
			}
			else if(q.firePlace.equals(temp[i])) {
				 System.out.println(q.homeName+"\n");
			       h=q;
			       return q.firePlace;
			}
			else if(q.garageParking.equals(temp[i])) {
				 System.out.println(q.homeName+"\n");
			       h=q;
			       return q.garageParking;
			}
			else if(q.swimmingPool.equals(temp[i])){
				 System.out.println(q.homeName+"\n");
			       h=q;
			       return q.swimmingPool;
			}
			}
		}
		return "";
	}
	
	public void setSearch1(Integer int1) {
		search1 = int1;
	}
	
	
	public void matchPriceSpecification() {
		for(int count=0; count< i ; count++) {
			q = home.get(count);
			
			if(q.price < search1) {
				h=q;
				System.out.println(q.homeName+"\n");
		}
		}
		
	}
	
	public void matchAreaSpecification() {
		for(int count=0; count< i ; count++) {
			q = home.get(count);
			
			if(q.area < search1) {
				h=q;
				System.out.println(q.homeName+"\n");
		}
		}
		
	}
	
	
	public void setSearch1And2(Integer int1 ,Integer int2){
		search1 = int1;
		search2 = int2;
		
	}
	
	public void matchPriceRange() {
		for(int count=0; count< i ; count++) {
			q = home.get(count);
			
			if(q.price >= search1 && q.price <= search2) {
				h=q;
				System.out.println(q.homeName+"\n");
		}
		}
	}
	
	
	public void matchAreaRange() {
		for(int count=0; count< i ; count++) {
			q = home.get(count);
			
			if(q.area >= search1 && q.area <= search2) {
				h=q;
				System.out.println(q.homeName+"\n");
		}
		}
	}
	
	
	public boolean matchNumberOfBathrooms() {
		for(int count=0; count< i ; count++) {
			q = home.get(count);
			
			if(q.bathrooms == search1 ) {
				h=q;
				
				System.out.println(q.homeName+"\n");
				return true;
		}
		}
		return false;
	}
	
	public boolean matchNumberOfBedrooms() {
		for(int count=0; count< i ; count++) {
			q = home.get(count);
			
			if(q.bedrooms == search1 ) {
				h=q;
				
				System.out.println(q.homeName+"\n");
				return true;
		}
		}
		return false;
	}
	
	
	
	
	
	public void searchWithSpecifications(String string, String string2, Integer int1, Integer int2, Integer int3, Integer int4, Integer int5, Integer int6, String string3, String string4, String string5, String string6,String string7, String string8 ) {
		placement = string ; 
		material = string2 ;
		lessThanPrice = int1 ;
		rangeLowerPrice =int2;
		rangeUpperPrice =int3 ;
		lessThanArea = int4 ;
		rangeLowerArea = int5 ;
		rangeUpperArea = int6 ;
		numberOfBedrooms = (string3.equals("NULL") ? 0 : Integer.parseInt(string3));
		numberOfBathrooms = (string4.equals("NULL") ? 0 : Integer.parseInt(string4));
		pets = string5 ;
		type = string6 ;
		if(string7.equals("short term_6 months")) {
			leaseLength= 6;
		}
		else if(string7.equals("long term_year")) {
			leaseLength = 12;
		}
		  
		amenities = string8 ;
		temp1 = amenities.split(",");
		
		
			
	}
	
	public boolean matchSpecifications() {
		int sizeOfArray = home.size();
		boolean flag = true;
		for(int m=0;m<sizeOfArray;m++) {
			q = home.get(m);
			tempHome.add(q);
			
		}
         
		
		for(int k=0 ; k< sizeOfArray ;k++) {
			
			if(flag == true) {
				 q = tempHome.get(k);
			}
			else if (flag == false) {
				q= tempHome.get(k-1);
			}
			flag =true;
		   
		if(!q.placement.equals(placement) || !q.material.equals(material) || !q.type.equals(type) || !q.pets.equals(pets)|| q.leaseLength != leaseLength || q.bedrooms != numberOfBedrooms || q.bathrooms != numberOfBathrooms ) {
			tempHome.remove(q);
			flag =false;
			
			continue;
			
		}
		 if( (q.area < rangeLowerArea || q.area > rangeUpperArea) && q.area >= lessThanArea) {
			 tempHome.remove(q);
			flag = false;
			
			continue;
		}
		 if((q.price < rangeLowerPrice || q.price > rangeUpperPrice) && q.price >= lessThanPrice) {
			 tempHome.remove(q);
			
			flag = false;
			continue;
		}
		
		
		
			for(int j=0 ; j < temp1.length ; j++) {
		 if (q.airConditioning.equals(temp1[j])||q.balcony.equals(temp1[j])||q.elevator.equals(temp1[j])||q.firePlace.equals(temp1[j])||q.garageParking.equals(temp1[j])||q.swimmingPool.equals(temp1[j])) {
			continue;
		 }
		
		 else {
			 tempHome.remove(q);
			 flag =false;
			
		 }
		 
			}
			
		
		
			
		
		}for(int y=0 ; y <tempHome.size(); y++) {
			q=tempHome.get(y);
			h=q;
			
			System.out.println(q.homeName+"\n");
			return true;
			
		}
		return false;
	}
	
	public void sendEmail(String to,String massage) {
		sendemail.sendEmail(to, massage);
	}
	
	
	
	
	
	
	
	
	
	
	


	public FinderApp() {
		super();
	}
	public void setEmailService(SendEmail sendemail) {
		this.sendemail = sendemail;
		
	}
}
