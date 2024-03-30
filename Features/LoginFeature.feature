Feature:Login

Scenario: Successful Login with valid Credentials
Given User launch chrome browser
When User opens URL ":/http/admin-demo.nopcommerce.com/login"
And User enters Emails as "admin@yourstore.com" and Password as "admin"
And click on Login
Then Page Title should be "Dashboard / nopCommerce administration"
When User click on Log out link 
Then Page Title should be "Your store Login"
And close browser