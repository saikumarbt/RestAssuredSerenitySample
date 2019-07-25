package com.suntaragali.steps;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.Matchers.contains;

public class CountriesSearchSteps {
	
	private String CODE_SEARCH = "https://restcountries-v1.p.rapidapi.com/alpha/";
	private Response response;
	
	@Step("I try to search the country by {0} code")
	public void searchCountryByCode(String code) {
		response = SerenityRest.given().header("X-RapidAPI-Host", "restcountries-v1.p.rapidapi.com").
				header("X-RapidAPI-Key", "b637bb27ddmsh1fcb0d2fe729508p1f063ajsn2a38c56d6056").
				param("codes", code).when().get(CODE_SEARCH);
	}
	
	@Step("I try to validate the Status code")
	public void searchIsExecutedSuccessfully() {
		response.then().statusCode(200);
	}
	
	@Step("I should be able to find {0} as country name in my response")
	public void iShouldFindCountry(String country) {
		response.then().body("name", contains(country));
	}

}
