package utilities;


import static io.restassured.RestAssured.given;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Map;
import java.util.Properties;

import org.json.simple.JSONObject;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class RestAssuredGenericMethods {

	public static Response apiResponse = null;
	static RequestSpecification reqSpecObj;
	static ResponseSpecification resSpecObj;
	
	
	public static void setBaseUrl(String applicationUrl) {
		try {		
			PrintStream psObj =new PrintStream(new FileOutputStream("logging.txt"));
			reqSpecObj=new RequestSpecBuilder().setBaseUri(applicationUrl)
					 .addFilter(RequestLoggingFilter.logRequestTo(psObj)).build();
			
			resSpecObj = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		}
		catch (Exception e) {
			e.getMessage();
		}
	}
	
	public static String getValue(String key) throws IOException {
		Properties obj = new Properties();
		FileInputStream fis = new FileInputStream("src/test/resources/config.properties");
		obj.load(fis);
		return obj.getProperty(key);	
	}
	
	public static Response accessGet(Map<String,Object> headers,
			String resorceUrl, int statusCode) {			
		return given().spec(reqSpecObj).urlEncodingEnabled(false).when().headers(headers).log().all().get(resorceUrl)
				.then().assertThat().statusCode(statusCode).log().all().extract().response();
	}
	
	public static Response accessPost(Map<String,Object> headers, String jObj,
			String resorceUrl, int statusCode) {		
		return given().spec(reqSpecObj).urlEncodingEnabled(false).when().headers(headers).log().all().body(jObj).post(resorceUrl)
				.then().assertThat().statusCode(statusCode).log().all().extract().response();
	}
	
	public static Response accessPost(Map<String,Object> headers, JSONObject jObj,
			String resorceUrl, int statusCode) {		
		return given().spec(reqSpecObj).urlEncodingEnabled(false).when().headers(headers).log().all().body(jObj).post(resorceUrl)
				.then().assertThat().statusCode(statusCode).log().all().extract().response();
	}
	
	public static Response accessDelete(Map<String,Object> params, Map<String,Object> headers,
			String resorceUrl, int statusCode) {
		return given().spec(reqSpecObj).urlEncodingEnabled(false).when().pathParams(params).headers(headers).log().all().delete(resorceUrl)
				.then().assertThat().statusCode(statusCode).log().all().extract().response();
	}

	public static Response accessGetWithPathParams(Map<String,Object> params, Map<String,Object> headers,
			String resorceUrl, int statusCode) {
		return given().spec(reqSpecObj).urlEncodingEnabled(false).when().pathParams(params).headers(headers).log().all().get(resorceUrl)
				.then().assertThat().statusCode(statusCode).log().all().extract().response();
	}

	public static Response accessPostWithPathParams(Map<String,Object> params, Map<String,Object> headers,
			String resorceUrl, int statusCode) {
		return given().spec(reqSpecObj).urlEncodingEnabled(false).when().pathParams(params).headers(headers).log().all().post(resorceUrl)
				.then().assertThat().statusCode(statusCode).log().all().extract().response();
	}

	public static Response accessGetWithQueryParams(Map<String,Object> params, Map<String,Object> headers,
			String resorceUrl, int statusCode) {
		return given().spec(reqSpecObj).when().queryParams(params).headers(headers).log().all().get(resorceUrl)
				.then().assertThat().statusCode(statusCode).log().all().extract().response();
	}

	public static Response accessPostWithQueryParams(Map<String,Object> params, Map<String,Object> headers,
			String resorceUrl, int statusCode) {
		return given().spec(reqSpecObj).urlEncodingEnabled(false).when().queryParams(params).headers(headers).log().all().log().all().post(resorceUrl)
				.then().assertThat().statusCode(statusCode).log().all().extract().response();
	}

	public static Response accessGetWithPathAndQueryParams(Map<String,Object> pathParams, Map<String,Object> queryParams, Map<String,Object> headers,
			String resorceUrl, int statusCode) {
		return given().spec(reqSpecObj).urlEncodingEnabled(false).when().pathParams(pathParams).queryParams(queryParams).headers(headers).log().all().get(resorceUrl)
				.then().assertThat().statusCode(statusCode).log().all().extract().response();
	}

	public static Response accessPostWithPathAndQueryParams(Map<String,Object> pathParams, Map<String,Object> queryParams, Map<String,Object> headers,
			String resorceUrl, int statusCode) {
		return given().spec(reqSpecObj).urlEncodingEnabled(false).when().pathParams(pathParams).queryParams(queryParams).headers(headers).log().all().post(resorceUrl)
				.then().assertThat().statusCode(statusCode).log().all().extract().response();
	}
	
	public static Response accessGetWithPathParams(Map<String,Object> params, Map<String,Object> headers,
			String resorceUrl) {
		return given().spec(reqSpecObj).urlEncodingEnabled(false).when().pathParams(params).headers(headers).log().all().get(resorceUrl)
				.then().log().all().extract().response();
	}

	public static Response accessPostWithPathParams(Map<String,Object> params, Map<String,Object> headers,
			String resorceUrl) {
		return given().spec(reqSpecObj).urlEncodingEnabled(false).when().pathParams(params).headers(headers).log().all().post(resorceUrl)
				.then().log().all().extract().response();
	}

	public static Response accessGetWithQueryParams(Map<String,Object> params, Map<String,Object> headers,
			String resorceUrl) {
		return given().spec(reqSpecObj).urlEncodingEnabled(false).when().queryParams(params).headers(headers).log().all().get(resorceUrl)
				.then().log().all().extract().response();
	}

	public static Response accessPostWithQueryParams(Map<String,Object> params, Map<String,Object> headers,
			String resorceUrl) {
		return given().spec(reqSpecObj).urlEncodingEnabled(false).when().queryParams(params).headers(headers).log().all().post(resorceUrl)
				.then().log().all().extract().response();
	}

	public static Response accessGetWithPathAndQueryParams(Map<String,Object> pathParams, Map<String,Object> queryParams, Map<String,Object> headers,
			String resorceUrl) {
		return given().spec(reqSpecObj).urlEncodingEnabled(false).when().pathParams(pathParams).queryParams(queryParams).headers(headers).log().all().get(resorceUrl)
				.then().log().all().extract().response();
	}

	public static Response accessPostWithPathAndQueryParams(Map<String,Object> pathParams, Map<String,Object> queryParams, Map<String,Object> headers,
			String resorceUrl) {
		return given().spec(reqSpecObj).urlEncodingEnabled(false).when().pathParams(pathParams).queryParams(queryParams).headers(headers).log().all().post(resorceUrl)
				.then().log().all().extract().response();
	}
}
