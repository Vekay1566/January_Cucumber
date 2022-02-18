#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template



Feature: Check Service Drop down and job placement Link text Functionality 
User launches Transfotech academy page and Service Drop down is visible

Scenario: Service Drop down button and Job placement functionality

Given User loads Transfotech homepage
When  User mouse hover on Service Drop menu
And   User clicks on Job Placement link
And   User lands on Job placement page
And   User clicks on Book an Appointment button

