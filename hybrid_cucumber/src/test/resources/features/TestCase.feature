Feature: To Test the OrangeHrm Application

Background: To Test the Login Functionality of OrangeHrm
Given to Launch the Browser and Navigate to Url
When To Enter Username and Pasword
Then to click the Submit button
Then to Take the Screenshot and get Title

#Scenario: To Test the Login Functionality of OrangeHrm
#Given to Launch the Browser and Navigate to Url
#When To Enter Username and Pasword
#Then to click the Submit button
#Then to Take the Screenshot and get Title
#Then to Close the browser


Scenario Outline: To Test the Admin Functionality of OrangeHrm
    Given To Open Admin functionlity of OrangeHrm
    When To Enter "<Username>"
    Then Select "<UserRole>" 
    Then To Enter EmployeeName
    Then Select Status
    Then Click Search Button
    Then Take the Screenshot and the Title
    Then Close the browser
    
    Examples: 
    |Username| UserRole|
    |Chinmaye| Admin |
    |Mula| All |
       