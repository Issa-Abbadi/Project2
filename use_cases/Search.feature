Feature: Search about suitable home

Background: The System has a repository of homes with their specifications (type-material-placement-pets-amenties-price-area-bedrooms-bathrooms-leaselength)
Given  these homes are contained in the system
       |HOUSE_WOOD_VILLAGE_NO_GARAGEPARKING,FIREPLACE,ELEVATOR|510_150_3_2_6|
       |APARTMENT_BRICK_CITY_NO_ELEVATOR|230_120_4_2_12|
               
               
  Scenario Outline: Search home by placement
  When I search about home by <placement>
  Then A list of homes that matches the placement specification should be returned and printed on the console
  And Send email to "eisaabbadi2@gmail.com"
  
  Examples:
  |placement|
  |"VILLAGE"|
  |"CITY"|



Scenario Outline: Search home by material
  When I search about home by <material>
  Then A list of homes that matches the material specification should be returned and printed on the console
  And Send email to "eisaabbadi2@gmail.com"
  Examples:
  |material|
  |"STONE"|
  |"BRICK"|
  |"WOOD"|
  
  
  Scenario: Search about home with less than a specific price
    When I search about home with price less than 400
    Then A list of homes that matches the price specification should be returned and printed on the console
    And Send email to "eisaabbadi2@gmail.com"
   
  Scenario: Search about home with price between range of prices
    When I search about home with price between 100 and 400 
    Then A list of homes that matches the price range should be returned and printed on the console
    And Send email to "eisaabbadi2@gmail.com"
    
    
  Scenario: Search about home with less than a specific area
    When I search about home with area less than 400
    Then A list of homes that matches the area specification should be returned and printed on the console
    And Send email to "eisaabbadi2@gmail.com"
   
  Scenario: Search about home with area between range of areas
    When I search about home with area between 100 and 400 
    Then A list of homes that matches the area range should be returned and printed on the console
    And Send email to "eisaabbadi2@gmail.com"
    
  Scenario Outline: Search about home with a number of bedrooms
    When I search about home with <number> bedrooms
    Then A list of homes that matches the number of bedrooms should be returned and printed on the console
    And Send email to "eisaabbadi2@gmail.com"
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
    And Send email to "eisaabbadi2@gmail.com"
  Examples:  
  |number|
  |1     |
  |2     |
  |3     |
  
  Scenario Outline: Search home by pets
  When I search about home by <pets>
  Then A list of homes that matches the pets specification should be returned and printed on the console
  And Send email to "eisaabbadi2@gmail.com"
  
  Examples:
  |pets|
  |"YES"|
  |"NO"|
  
  
  Scenario Outline: Search home by type
  When I search about home by <type>
  Then A list of homes that matches the type specification should be returned and printed on the console
  And Send email to "eisaabbadi2@gmail.com"
  Examples:
  |type|
  |"HOUSE"|
  |"APARTMENT"|
  
  
  Scenario Outline: Search home by lease length
  When I search about home by <lease length>
  Then A list of homes that matches the lease length specification should be returned and printed on the console
  And Send email to "eisaabbadi2@gmail.com"
  Examples:
  |lease length|
  |"short term_6 months"|
  |"long term_year"|
  
  
  Scenario Outline: Search home by amenities
  When I search about home by <amenities>
  Then A list of homes that matches the amenities specification should be returned and printed on the console
  And Send email to "eisaabbadi2@gmail.com"
  Examples:
  |amenities|
  |"AIRCONDITIONING"|
  |"BALCONY"|
  |"ELEVATOR"|
  |"FIREPLACE"|
  |"GARAGEPARKING"|
  |"SWIMMINGPOOL"|
  
 Scenario Outline: Search home by combination of at least 2 or above 
  When I search about home by specifications <placement> <material> 600 100 700 400 100 400 <bedrooms> <bathrooms> <pets> <type> <lease length> <amenities>
  Then a list of home that  matches the specifications should be returned and printed on the console
  And Send email to "eisaabbadi2@gmail.com"
    
     
#  Scenario Outline: Search home by combination of at least 2 or above 
#  When I search about home by <placement>
#  And I search about home by <material>
#  And I search about home with price less than 400
#  And I search about home with price between 100 and 400 
#  And I search about home with area less than 400
#  And I search about home with area between 100 and 400
#  And I search about home with <number1> bedrooms
#  And I search about home with <number2> bathrooms
#  And I search about home by <pets>
#  And I search about home by <type>
#  And I search about home by <lease length>
#  And I search about home by <amenities>
#  Then a list of home that  matches the specifications should be returned and printed on the console
# 
#  
#    
 Examples:
  |placement |  |material  |   |bedrooms | |bathrooms|    |pets  |  |type       |  |lease length         |  |amenities        |
  |"VILLAGE" |  |"STONE"   |   |"1"      | |"1"      |    |"YES" |  |"HOUSE"    |  |"short term_6 months"|  |"AIRCONDITIONING"|
  |"CITY"    |  |"BRICK"   |   |"2"      | |"2"      |    |"NO"  |  |"APARTMENT"|  |"long term_year"     |  |"BALCONY"        |
  |"NULL"    |  |"WOOD"    |   |"3"      | |"3"      |    |"NULL"|  |"NULL"     |  |"NULL"               |  |"ELEVATOR"       |
  |"NULL"    |  |"NULL"    |   |"4"      | |"NULL"   |    |"NULL"|  |"NULL"     |  |"NULL"               |  |"FIREPLACE"      |
  |"NULL"    |  |"NULL"    |   |"5"      | |"NULL"   |    |"NULL"|  |"NULL"     |  |"NULL"               |  |"GARAGEPARKING"  |
  |"NULL"    |  |"NULL"    |   |"NULL"   | |"NULL"   |    |"NULL"|  |"NULL"     |  |"NULL"               |  |"SWIMMINGPOOL"   |
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   