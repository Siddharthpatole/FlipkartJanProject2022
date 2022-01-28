Feature: Manage Address Functionality

Background: user is on Flipkart main page and mouse over login window
Given user open "Chrome" browser with exe
Given user enter url as
Given user click on cancel button
Given user move on Login DropDown
Given user click on My Profile
Given user enter username as 9527895955
Given user enter password as sidpatole123
Given user click on login button

@SmokeTest
Scenario: Manage address functionality with valid data
When user click on manage addresses
When user click on add a new address
When user enter "Sid Patole" as name
When user enter "8668631972" as mobile number
When user enter "414001" as pincode
When user enter "Savedi" as locality
When user enter "Zopadi Cantene" as address
When user select Home as address type
When user click on Save button
Then Application shows new adddress added successfully  

