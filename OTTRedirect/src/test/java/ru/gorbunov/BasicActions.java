package ru.gorbunov;

import org.junit.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class BasicActions {
	public String GetRedirectLocationFrom(String baseUrl) {

        Response response = RestAssured.given().log().method().log().uri()
	            .when().redirects().follow(false).get(baseUrl);	
        response.then().log().status().log().headers();
		Assert.assertEquals("Код ответа не 301", 301, response.getStatusCode());
		return response.header("Location");
	}
}
