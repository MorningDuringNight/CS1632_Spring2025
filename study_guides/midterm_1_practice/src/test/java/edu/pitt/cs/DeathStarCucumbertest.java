package edu.pitt.cs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class DeathStarCucumbertest {
	// TODO: Fill in!

	Value value;

	@Given("a Value")
	public void Start(){
		value = new Value();
	}

	@When("add value {int}")
	public void Boom(int a){
		for(int i =0; i < a; a++){
			value.incVal();
		}
	}

	@Then("confirm {int}")
	public void voices(int check){
		verify(value,times(check)).incVal();
		assertEquals(check, value.getVal());
	}
