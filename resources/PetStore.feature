Feature: Pet Store 

@assessment
Scenario Outline: Add pet to the store and verify if its deleted 

Given user enters application with baseUrl as <applicationUrl>
And user creates post method to add new pet as <nameOfPet> to the store
And user deletes the pet recently added to the store

Examples:

|applicationUrl                |nameOfPet   	|
|https://petstore.swagger.io/v2|Golden Retriever|


@assessment
Scenario Outline: Add Delete and verify number of pets available in the store

Given user enters application with baseUrl as <applicationUrl>
And user creates post method to add new pet as <nameOfPet> to the store
And user finds the total number of pets by tag name as <nameOfPet>
And user deletes the pet recently added to the store
Then verify the number of pets available is reduced by one for <nameOfPet>

Examples:

|applicationUrl                |nameOfPet   	|
|https://petstore.swagger.io/v2|Golden Retriever| 

@assessment
Scenario Outline: Place Order and Add Delete and verify number of pets available in the store

Given user enters application with baseUrl as <applicationUrl>
And user creates post method to add new pet as <nameOfPet> to the store
And user finds the total number of pets by tag name as <nameOfPet>
And user deletes the pet recently added to the store
Then verify the number of pets available is reduced by one for <nameOfPet>
And user place order for <numberOfPets> on <shipDate> and <status>
And user deletes the order for the pet

Examples:

|applicationUrl                |nameOfPet   	|numberOfPets|shipDate  |status|
|https://petstore.swagger.io/v2|Golden Retriever|20          |2021-05-11|placed|














