package ApiCommonFunctions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.Assert;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import AirBoundPojo.AirBound;
import AirBoundPojo.Contact;
import AirBoundPojo.FrequentFlyerCards;
import AirBoundPojo.Itinerary;
import AirBoundPojo.Promotion;
import AirBoundPojo.SearchPreferences;
import AirBoundPojo.Traveler;
import Enrollment.Address;
import Enrollment.Enrollment;
import Enrollment.Fqtv;
import Enrollment.MemberProfile;
import Enrollment.Phone;
import PracticeSchema.PetStore;
import PracticeSchema.Category;
import PracticeSchema.Tag;
import io.restassured.path.json.JsonPath;
import stepDefinitions.Hooks;
import utilities.RestAssuredGenericMethods;

public class PetStoreRestMethods {	

	String petId = "";
	String deleteMessage = "";	
	String orderDeleteMessage = "";
	String orderId = "";
	JsonPath jpath = null;
	List <Integer> numberOfPetsByTag = new ArrayList<Integer>();	
	List <Integer> numberOfPetsByTagAfter = new ArrayList<Integer>();	
	Map<String, Object> headers = new HashMap<String, Object>();
	public static int numberBeforeDelete = 0;
	public static int numberAfterDelete = 0;
	public static boolean successfulDeletion;

	
	public void userCreatesEnrollment() {
		try {
			
			Enrollment enrollObj = new Enrollment();
			
			  MemberProfile MemberProfileObj = new MemberProfile();	
			  MemberProfileObj.setAddress(new ArrayList<Address>());
			  MemberProfileObj.setPhones(new ArrayList<Phone>());
			  MemberProfileObj.setSpecialNeeds(new ArrayList<String>());
			  MemberProfileObj.setFqtv(new Fqtv());
			  
			  
			  
			  enrollObj.setMemberProfile(MemberProfileObj); 
			 

			ObjectMapper obj=new ObjectMapper();
			System.out.println(obj.writerWithDefaultPrettyPrinter().writeValueAsString(enrollObj));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}

	public void userCreatesContacts() {
		try {
			
			List<Contact> ContactList = new ArrayList<Contact>();
			List<String> travelIdList = new ArrayList<String>();
			List<String> travelIdList1 = new ArrayList<String>();
			
			Contact ContactObj = new Contact();
			Contact ContactObj1 = new Contact();
			
			ContactObj.setDeviceType("mobile");
			ContactObj.setCountryPhoneExtension("51");
			ContactObj.setNumber("43422345");
			travelIdList.add("SKT-14-TKT");			
			ContactObj.setTravelerIds(travelIdList);
			ContactList.add(ContactObj);
			
			ContactObj1.setContactType("Email");
			ContactObj1.setAddress("arsfTest@ae-qa1-aircanada.mailinator.com");
			ContactObj1.setCategory("business");
			ContactObj1.setPurpose("standard");
			travelIdList1.add("SKT-14-TKT");
			travelIdList1.add("SKT-15-TKT");
			ContactObj1.setTravelerIds(travelIdList1);
			
			ContactList.add(ContactObj1);

			ObjectMapper obj=new ObjectMapper();
			System.out.println(obj.writerWithDefaultPrettyPrinter().writeValueAsString(ContactList));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}	

	public void userCreatesAirBound() {
		try {
			String pax = "ADT,CHD,INS";
			String[] paxArr = pax.split(",");

			AirBound airBoundObj = new AirBound();
			List<Traveler> travellObj = new ArrayList<Traveler>();
			List<String> farelObj = new ArrayList<String>();
			FrequentFlyerCards frequentFlyerCardsObj = new FrequentFlyerCards();
			Promotion PromotionObj = new Promotion();
			SearchPreferences SearchPreferencesObj = new SearchPreferences();
			List<Itinerary> ItinerariesObj = new ArrayList<Itinerary>();

			for(int i=0;i<paxArr.length;i++) { 
				Traveler trObj = new Traveler();
				trObj.setPassengerTypeCode(paxArr[i]);
				travellObj.add(trObj); 
			}

			Itinerary itObj1 = new Itinerary();
			Itinerary itObj2 = new Itinerary();

			itObj1.setOriginLocationCode("YYZ");
			itObj1.setDestinationLocationCode("YVR");
			itObj1.setDepartureDateTime("2021-01-01");
			itObj1.setIsRequestedBound(true);

			itObj2.setOriginLocationCode("YVR");
			itObj2.setDestinationLocationCode("YYZ");
			itObj2.setDepartureDateTime("2021-01-19");


			ItinerariesObj.add(itObj1);
			ItinerariesObj.add(itObj2);


			frequentFlyerCardsObj.setCardNumber("123456789");
			PromotionObj.setCode("PRWWJ");
			farelObj.add("REWARD");

			airBoundObj.setTravelers(travellObj);
			airBoundObj.setCommercialFareFamilies(farelObj);
			airBoundObj.setCorporateCodes(farelObj);
			airBoundObj.setFrequentFlyerCards(frequentFlyerCardsObj);
			airBoundObj.setItineraries(ItinerariesObj);
			airBoundObj.setPromotion(PromotionObj);
			airBoundObj.setSearchPreferences(SearchPreferencesObj);

			ObjectMapper obj=new ObjectMapper();
			System.out.println(obj.writerWithDefaultPrettyPrinter().writeValueAsString(airBoundObj));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}

	public void userCreatesPet(String nameOfPet) {
		try {
			Category catObj = new Category();
			List<Tag> tlObj = new ArrayList<Tag>();

			for(int i=0;i<2;i++) {
				Tag tObj = new Tag();
				tlObj.add(tObj);
			}

			PetStore airBoundObj1 = new PetStore();
			airBoundObj1.toString();
			airBoundObj1.setTags(tlObj);
			airBoundObj1.setCategory(catObj);

			ObjectMapper obj=new ObjectMapper();
			System.out.println(obj.writerWithDefaultPrettyPrinter().writeValueAsString(airBoundObj1));

			RestAssuredGenericMethods.apiResponse = RestAssuredGenericMethods.accessPost(headers,obj.writerWithDefaultPrettyPrinter().writeValueAsString(airBoundObj1), "/pet" ,200);

			petId = RestAssuredGenericMethods.apiResponse.jsonPath().get("id").toString();		

			Hooks.scenario.log("Payload created: "+obj.writerWithDefaultPrettyPrinter().writeValueAsString(airBoundObj1));
			Hooks.scenario.log("Response: "+RestAssuredGenericMethods.apiResponse.prettyPrint());
		}
		catch (Exception e) {
			e.getMessage();
			Assert.fail("The Pet Id is not created successfully");
		}
	}

	public void userDeletsPet() {
		try {	
			Map<String, Object> params1 = new HashMap<String, Object>();
			params1.put("petId", petId);

			RestAssuredGenericMethods.apiResponse = RestAssuredGenericMethods.accessDelete(params1, headers, "/pet/{petId}" ,200);					

			deleteMessage = RestAssuredGenericMethods.apiResponse.jsonPath().get("message");	

			if(!petId.equals(deleteMessage))
				Assert.fail("The Pet created is not deleted successfully");
		}
		catch (Exception e) {
			e.getMessage();
		}
	}

	public void getNumberOfPetsByTag(String nameOfPet) {
		try {	
			Map<String, Object> params1 = new HashMap<String, Object>();
			params1.put("tags", nameOfPet);			

			RestAssuredGenericMethods.apiResponse = RestAssuredGenericMethods.accessGetWithQueryParams(params1, headers,
					RestAssuredGenericMethods.getValue("appUrl").toString() ,200);

			numberOfPetsByTag = RestAssuredGenericMethods.apiResponse.jsonPath().get("id");	

			Hooks.scenario.log("number Of Pets By Tag: "+numberOfPetsByTag);
			Hooks.scenario.log("Response: "+RestAssuredGenericMethods.apiResponse.prettyPrint());

			numberBeforeDelete = numberOfPetsByTag.size();
		}
		catch (Exception e) {
			e.getMessage();
		}
	}

	public int getNumberOfPetsByTagAfterDeleteion (String nameOfPet) {
		try {	
			Map<String, Object> params1 = new HashMap<String, Object>();
			params1.put("tags", nameOfPet);

			RestAssuredGenericMethods.apiResponse = RestAssuredGenericMethods.
					accessGetWithQueryParams(params1, headers, "/pet/findByTags" ,200);

			numberOfPetsByTagAfter = RestAssuredGenericMethods.apiResponse.jsonPath().get("id");	
			numberAfterDelete = numberOfPetsByTagAfter.size();
		}
		catch (Exception e) {
			e.getMessage();
		}
		return numberBeforeDelete-numberAfterDelete;
	}

	@SuppressWarnings("unchecked")
	public void userCreatesOrderPet(String numberOfPets, String shipDate, String status) {
		try {									
			JSONObject objMain = new JSONObject();			

			objMain.put("petId",0);
			objMain.put("id", 0);
			objMain.put("quantity", 20);
			objMain.put("shipDate", shipDate);
			objMain.put("complete", true);
			objMain.put("status", "status");

			RestAssuredGenericMethods.apiResponse = RestAssuredGenericMethods.accessPost(headers,objMain.toString(), "/store/order" ,200);

			orderId = RestAssuredGenericMethods.apiResponse.jsonPath().get("id").toString();									
		}
		catch (Exception e) {
			e.getMessage();
			Assert.fail("The order is not created successfully");
		}
	}

	public void deletsOrderById () {
		try {	
			Map<String, Object> params1 = new HashMap<String, Object>();
			params1.put("orderId", orderId);

			RestAssuredGenericMethods.apiResponse = RestAssuredGenericMethods.
					accessGetWithPathParams(params1, headers, "/store/order/{orderId}" ,200);

			RestAssuredGenericMethods.apiResponse = RestAssuredGenericMethods.
					accessDelete(params1, headers, "/store/order/{orderId}" ,200);

			orderDeleteMessage = RestAssuredGenericMethods.apiResponse.jsonPath().get("message");	

			if(!orderId.equals(orderDeleteMessage))
				Assert.fail("The order created is not deleted successfully");

		}
		catch (Exception e) {
			e.getMessage();
		}		
	}

}
