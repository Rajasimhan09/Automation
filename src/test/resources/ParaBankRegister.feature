Feature: Parabank Registration 

@WebTest @assessment1
Scenario Outline: Parabank Online Register
Given user launches the Parabank application with <browser>
And user clicks on register button to create new account
And user enters first and Last name as <firstNameVal>, <lastNameVal>
And user enters address details as <street>, <city>, <stateVal>
And user enters contact details as <code>, <number>, <ssn>
And user enters username and password as <username>, <password>
And user confirms new account is created
And user opens new account for <type>
And user confirms the new account is created and funds transferred

Examples:

|browser|firstNameVal|lastNameVal|street     |city |stateVal|code |number    |ssn      |username  |password    |type   |
|Chrome |Raja        |Simhan     |26 St Louis|Miami|Florida |00000|9445380562|123456789|Rajasimhan@123|Alliswell!11|SAVINGS| 
 
