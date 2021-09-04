Feature: Customer Registration

Scenario Outline: Registering with Multiple Users

Given I load the url "https://webapps.tekstac.com/CustomerRegistration/"
Then I enter name <username>
And I enter age <age>
And I enter address <address>
And I enter number <number>
And I enter email <email>
Then I click submit button

Examples: 
|username|age|address|number|email|
|vcentry|4|Guindy|1234567|vcentry@gmail.com|
|vcentry|5|Adyar|789546|vcentry@gmail.com|
