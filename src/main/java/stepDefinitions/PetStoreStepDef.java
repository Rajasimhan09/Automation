package stepDefinitions;

import org.testng.Assert;

import ApiCommonFunctions.PetStoreRestMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.RestAssuredGenericMethods;

public class PetStoreStepDef {

	PetStoreRestMethods PetStoreRestMethodsObject = new PetStoreRestMethods();

	@Given("^user enters application with baseUrl as (.+)$")
	public void setBaseUrl(String applicationUrl){		
		RestAssuredGenericMethods.setBaseUrl(applicationUrl);		
	}

	@And("^user creates post method to add new pet as (.+) to the store$")
	public void userCreatesPet(String nameOfPet){	
		PetStoreRestMethodsObject.userCreatesEnrollment();
		PetStoreRestMethodsObject.userCreatesPet(nameOfPet);		
	}

	@And("^user finds the total number of pets by tag name as (.+)$")
	public void getNumberOfPetsByTag(String nameOfPet){		
		PetStoreRestMethodsObject.getNumberOfPetsByTag(nameOfPet);		
	}

	@And("^user deletes the pet recently added to the store$")
	public void userDeletsPet(){		
		PetStoreRestMethodsObject.userDeletsPet();		
	}

	@Then("^verify the number of pets available is reduced by one for (.+)$")
	public void userTransferAmount(String nameOfPet){				
		Assert.assertEquals(PetStoreRestMethodsObject.getNumberOfPetsByTagAfterDeleteion(nameOfPet), 1, "The created Pet is not deleted since the difference is not equal to 1");
	}

	@And("^user place order for (.+) on (.+) and (.+)$")
	public void user_place_order_for_on_and(String numberOfPets, String shipDate, String status) {		
		PetStoreRestMethodsObject.userCreatesOrderPet(numberOfPets, shipDate, status);
	}

	@And("^user deletes the order for the pet$")
	public void deletsOrderById(){		
		PetStoreRestMethodsObject.deletsOrderById();		
	}
}