Feature: Register

Scenario: Register on TestMeApp
When user open TestMeApp
And user click signup
And enter userName as "Rohinii12"
And enter FirstName as "Rohini"
And enter LastName as "Nerkar"
And enter Password as "Rajendra1"
And enter Confirm Password as "Rajendra1"
And enter Gender as "female"
And enter Email as "r.r@gmail.com"
And enter MobileNumber as "9887876768"
And enter DOB as "01/06/1997"
And enter Address as "mq=129,sundernagar,nagpur"
And enter SecurityQuestion as "What is your favour color?"
And enter Answer as "black"
Then user click on Register


@Login
Scenario: Login using datatable
Given users open TestMeApp
When user clicks signin
And user enters credentials as
| lalitha | Password123 |

@product
Scenario: product search
Given users open TestMe
When user clicks sign
And user enters credential as
| lalitha | Password123 |
When user search product
|head|
And product display
And product is added to cart



