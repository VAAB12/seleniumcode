Feature: login with different credentials in a demo site 
Background: 
Given login to demo website "https://admin-demo.nopcommerce.com/login" 
@tag1 
Scenario Outline: use different credentials 
When I type userName = "<userName>" and password = "<password>" 
And I press login button 
Then message display "<text>" text 
Examples: 
| userName             | password | text |
| admin                | admin124 | Dashboard|
| admin@yourstore.com  | admin    | Dashboard|