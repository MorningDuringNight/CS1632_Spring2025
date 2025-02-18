

	package edu.pitt.cs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;
public class ValueStepDefinitions {


	// TODO: Fill in!

	private DeathStar realDeathStar;
	private Planet Alderan;

	@Given("DeathStars")
	public void DeathStars(){
		realDeathStar = new DeathStar();
	}

	@Given("Alderan with health {int}")
	public void Planet(Integer health){
		Alderan = new Planet(health);
	}

	@When("Boom said the DeathStar")
	public void Boom(){
		realDeathStar.shoot(Alderan);
	}

	@Then("voices cried")
	public void voices(){
		assertEquals(-90, Alderan.getHitPoints());
	}

}

