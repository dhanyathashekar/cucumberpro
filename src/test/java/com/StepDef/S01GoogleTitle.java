package com.StepDef;

import io.cucumber.java.en.*;

public class S01GoogleTitle 

{

	@Given("open google")
	public void open_google() {
	    System.out.println("Opening google...");
	}

	@When("Read title")
	public void read_title() {
		System.out.println("Reading the title");
	}

	@Then("Title should be google")
	public void title_should_be_google() {
		System.out.println("Verifying the title");
	}
}
