package com.suntaragali.restapiSerenity;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import com.suntaragali.steps.CountriesSearchSteps;


@RunWith(SerenityRunner.class)
public class CountriesSearchTests 
{
	@Steps
	CountriesSearchSteps countriesSearchSteps;
	
	@Test
	public void verifyThatWeCanFindUSAUsingTheCodeUS() {
		countriesSearchSteps.searchCountryByCode("US");
		countriesSearchSteps.searchIsExecutedSuccessfully();
		countriesSearchSteps.iShouldFindCountry("United States");
		
	}
	
	@Test
	public void verifyThatWeCanFindIndiaUsingTheCodeIN() {
		countriesSearchSteps.searchCountryByCode("IN");
		countriesSearchSteps.searchIsExecutedSuccessfully();
		countriesSearchSteps.iShouldFindCountry("India");
		
	}
	
	@Test
	public void verifyThatWeCanFindBrazilUsingTheCodeBR() {
		countriesSearchSteps.searchCountryByCode("BR");
		countriesSearchSteps.searchIsExecutedSuccessfully();
		countriesSearchSteps.iShouldFindCountry("Brazil");
		
	}
    
}
