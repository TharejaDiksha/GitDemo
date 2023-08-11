Feature: PreHome Page

 
  Background:
     Given The user opens DS Algo Portal link
    @driversetup   
  Scenario: PreHome Page URL

    When The user enters DS Algo link
    Then The user should land in DS Algo portal page

  Scenario: Click on PreHome Page
    When The user clicks the Get Started Button
    Then The user should be redirected to homepage
    And The user should see seven panes
