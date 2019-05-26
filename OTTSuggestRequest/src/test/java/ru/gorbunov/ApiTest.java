package ru.gorbunov;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ApiTest extends BasicActions{
	@Test
    public void SuggestRequestRu()
    {
		SuggestRequest("Moscow",Config.langRUlocalRUcurrRUB);
    }
	@Test
    public void SuggestRequestPl()
    {
		SuggestRequest("Krakov",Config.langPLlocalPLcurrPLN);
    }
	
	@Before
	public void DisableWarning() {
	    System.err.close();
	    System.setErr(System.out);
	}
	@BeforeClass
	public static void CheckAvailability() {
	    System.err.close();
	    System.setErr(System.out);
		Response response = RestAssured.given().log().method().log().uri()
	            .when().redirects().follow(false).head(Config.baseUrl);
		response.then().log().status();
		Assert.assertEquals("Код ответа не 200", 200, response.getStatusCode());		
	}
}