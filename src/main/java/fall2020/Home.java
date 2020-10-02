package fall2020;

import java.util.HashMap;

public class Home {
	public String homeName  = new String();
	
	public String type      = new String();
	public String material  = new String();
	public String placement = new String();
	public String pets      = new String();
	public String amenties  = new String();
	
	public String airConditioning = new String();
	public String balcony         = new String();
	public String elevator        = new String();
	public String firePlace       = new String();
	public String garageParking   = new String();
	public String swimmingPool    = new String();
	
	
	public int price=0,area=0,bedrooms=0,bathrooms=0,leaseLength=0;
	
	
	
	
	
	
	
	public String[] tokens1,tokens2,tokens3;
	
	
	public Home(String s1 , String s2 ) {
		
		homeName = s1+" | "+s2;
		
		
		tokens1 = s1.split("_");
		tokens2 = s2.split("_");
		
		
		
		type      = tokens1[0];
		material  = tokens1[1];
		placement = tokens1[2];
		pets      = tokens1[3];
		amenties  = tokens1[4];
		
		
		tokens3 = amenties.split(",");
		
		
		for(int i=0 ; i < tokens3.length ; i++) {
			switch(tokens3[i]) {
			      case"AIRCONDITIONING":
			          airConditioning = "AIRCONDITIONING";
			          break;
			      case"BALCONY":
                      balcony = "BALCONY";
                      break;
			      case"ELEVATOR":
                      elevator = "ELEVATOR";
                      break;
			      case"FIREPLACE":
                      firePlace = "FIREPLACE";
                      break;
			      case"GARAGEPARKING":
                      garageParking = "GARAGEPARKING";
                      break;
			      case"SWIMMINGPOOL":
                      swimmingPool = "SWIMMINGPOOL";
                      break;
			      default:
			    	  break;
			}
			
			
			price       = Integer.parseInt(tokens2[0]);
			area        = Integer.parseInt(tokens2[1]);
			bedrooms    = Integer.parseInt(tokens2[2]);
			bathrooms   = Integer.parseInt(tokens2[3]);
			leaseLength = Integer.parseInt(tokens2[4]);
			
			
			
			
			}
		}
		
		
		
		
	}


