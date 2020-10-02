Feature: Search about suitable home

Background: The System has a repository of homes with their specifications (type-material-placement-pets-amenties-price-area-bedrooms-bathrooms-leaselength)
Given  these homes are contained in the system
       |HOUSE_WOOD_VILLAGE_NO_GARAGEPARKING,FIREPLACE,ELEVATOR|510_150_3_2_6|
       |APARTMENT_BRICK_CITY_NO_ELEVATOR|230_120_4_2_12|
               
               
  Scenario Outline: Search home by placement
  When I search about home by <placement>
  Then A list of homes that matches the placement specification should be returned and printed on the console
  
  Examples:
  |placement|
  |"CITY"|
  |"VILLAGE"|



Scenario Outline: Search home by material
  When I search about home by <material>
  Then A list of homes that matches the material specification should be returned and printed on the console
  
  Examples:
  |material|
  |"STONE"|
  |"BRICK"|
  |"WOOD"|
  
  
  Scenario: Search about home with less than a specific price
    When I search about home with price less than 400
    Then A list of homes that matches the price specification should be returned and printed on the console
   
  Scenario: Search about home with price between range of prices
    When I search about home with price between 100 and 400 
    Then A list of homes that matches the price range should be returned and printed on the console
    
    
  Scenario: Search about home with less than a specific area
    When I search about home with area less than 400
    Then A list of homes that matches the area specification should be returned and printed on the console
   
  Scenario: Search about home with area between range of areas
    When I search about home with area between 100 and 400 
    Then A list of homes that matches the area range should be returned and printed on the console
    
  Scenario Outline: Search about home with a number of bedrooms
    When I search about home with <number> bedrooms
    Then A list of homes that matches the number of bedrooms should be returned and printed on the console
  Examples:  
  |number|
  |1     |
  |2     |
  |3     |
  |4     |
  |5     |
  
  
  Scenario Outline: Search about home with a number of bathrooms
    When I search about home with <number> bathrooms
    Then A list of homes that matches the number of bathrooms should be returned and printed on the console
  Examples:  
  |number|
  |1     |
  |2     |
  |3     |
  
  Scenario Outline: Search home by pets
  When I search about home by <pets>
  Then A list of homes that matches the pets specification should be returned and printed on the console
  
  Examples:
  |pets|
  |"YES"|
  |"NO"|
  
  
  Scenario Outline: Search home by type
  When I search about home by <type>
  Then A list of homes that matches the type specification should be returned and printed on the console
  
  Examples:
  |type|
  |"HOUSE"|
  |"APARTMENT"|
  
  
  Scenario Outline: Search home by lease length
  When I search about home by <lease length>
  Then A list of homes that matches the lease length specification should be returned and printed on the console
  
  Examples:
  |lease length|
  |"short term_6 months"|
  |"long term_year"|
  
  
  Scenario Outline: Search home by amenities
  When I search about home by <amenities>
  Then A list of homes that matches the amenities specification should be returned and printed on the console
  
  Examples:
  |amenities|
  |"AIRCONDITIONING"|
  |"BALCONY"|
  |"ELEVATOR"|
  |"FIREPLACE"|
  |"GARAGEPARKING"|
  |"SWIMMINGPOOL"|
  
  Scenario Outline: Search home by combination of at least 2 or above 
  When I search about home by specifications <placement> <material> 1 2 3 4 5 6 <bedrooms> <bathrooms> <pets> <type> <lease length> <amenities>
  Then a list of home that  matches the specifications should be returned and printed on the console
  
  Examples:
 
  |placement||material| |type       |  |pets  | |amenities        | |bedrooms|   |bathrooms  | |lease length         |
  |"VILLAGE"   ||"WOOD" | |"HOUSE"    |  |"NO" | |"GARAGEPARKING,FIREPLACE,ELEVATOR"| |"3"       | |"2"        | |"short term_6 months"|
#  |"CITY"   ||"STONE" | |"HOUSE"    |  |"YES" | |"AIRCONDITIONING"| |"1"       | |"1"        | |"short term_6 months"|
#  |"VILLAGE"||"BRICK" | |"APARTMENT"|  |"NO"  | |"AIRCONDITIONING"| |"2"       | |"2"        | |"long term_year"     |
#  |  "NULL" ||"WOOD"  | |"NULL"     |  |"NULL"| |"BALCONY"        | |"3"       | |"3"        | |"NULL"               |
#  |  "NULL" ||"NULL"  | |    "NULL" |  |"NULL"| |"ELEVATOR"       | |"4"       | |"NULL"     | |     "NULL"          |
#  |  "NULL" || "NULL" | |   "NULL"  |  |"NULL"| |"FIREPLACE"      | |"5"       | | "NULL"    | |   "NULL"            |
#  |  "NULL" || "NULL" | |    "NULL" |  |"NULL"| |"GARAGEPARKING"  | |"NULL"    | |    "NULL" | |     "NULL"          |
#  |   "NULL"||"NULL"  | | "NULL"    |  |"NULL"| |"SWIMMINGPOOL"   | |"NULL"    | |   "NULL"  | |    "NULL"           |
#  | "NULL"  || "NULL" | |    "NULL" |  |"NULL"|	|"NULL"           | |"NULL"    | |    "NULL" | |         "NULL"      |
#  
 

 
    
     
  
 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   