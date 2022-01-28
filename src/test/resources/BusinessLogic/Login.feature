Feature: Login Functionality
Background: user is successfully logged in
Given user open "Chrome" browser with exe
Given user enter url as


@SmokeTest
Scenario: user login with valid username and password
When user click on cancel button
When user move on Login DropDown
When user click on My Profile
When user enter username as 9527895955
When user enter password as sidpatole123
When user click on login button
Then user will login successfully

