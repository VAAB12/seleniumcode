Feature: visiting three websites
Scenario: Home Page of Google
    Given user is on Google home page "https://google.com"  
    Then user enters keyword "SQL"
    And user submits the page
    Then user waits for 5 seconds for google
    
Scenario: Home Page of Youtube 
    Given user is on Youtube home page "https://youtube.com" 
    And user waits for 5 seconds for Youtube
    
    Scenario: Facebook Homepage 
    Given user is on Facebook home page "https://facebook.com" 
    Then user waits for 5 seconds for Facebook 
    