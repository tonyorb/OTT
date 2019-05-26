package ru.gorbunov;

import org.junit.Assert;

import io.restassured.RestAssured;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BasicActions {

	public void SuggestRequest (String requestText, Locale locale) {
		RequestSpecification request = RestAssured.given().log().method().log().uri().log().headers()
				.formParam("query", requestText)
				.formParam("limit",locale.GetLimit())
				.formParam("lang",locale.GetLang())
				.formParam("locale",locale.GetLocale())
				.formParam("currency",locale.GetCurrency());
		Response response = request.when().get(Config.baseUrl);
		response.then().log().status();
		SuggestResponse suggestResponse = response.as(SuggestResponse.class, ObjectMapperType.JACKSON_1);
		Assert.assertEquals("Код ответа не 200", 200, response.getStatusCode());
		for (int i=0;i<suggestResponse.getResult().size();i++){
			Assert.assertNotNull("В карточке обекта отсутствует поле ID", suggestResponse.getResult().get(i).getId());
			Assert.assertNotNull("В карточке обекта отсутствует поле type", suggestResponse.getResult().get(i).getType());
			Assert.assertNotNull("В карточке обекта отсутствует поле name", suggestResponse.getResult().get(i).getName());
			Assert.assertNotNull("В карточке обекта отсутствует поле country", suggestResponse.getResult().get(i).getCountry());
			Assert.assertNotNull("В карточке обекта отсутствует поле city_id", suggestResponse.getResult().get(i).getCityId());
			Assert.assertNotNull("В карточке обекта hotel отсутствует поле city_slug", suggestResponse.getResult().get(i).getCitySlug());
			if (suggestResponse.getResult().get(i).getType().equals("hotel")){
				Assert.assertNotNull("В карточке обекта hotel отсутствует поле stars", suggestResponse.getResult().get(i).getStars());
			}
		}
	}
}
