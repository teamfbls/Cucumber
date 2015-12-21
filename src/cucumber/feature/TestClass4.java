package cucumber.feature;

import cucumber.api.junit.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestClass4 {
	
	 WebDriver driver=null;
	    
	    @Given("^User is on Website4$")
	    public void goToWebsiteindex(){
	    driver=new FirefoxDriver();
	   driver.navigate().to("http://localhost:8080/mavenproject1/");
	  
	    }
	    
	        
	    @When("^User clicked on Webpage LatestEntry$")
	    public void goToWebsite4(){
	    	 driver.findElement(By.id("autolas")).click();
	   
	    }
	     @When ("User clicked on first entry")   
		public void clickonEntry(){
	    	 driver.findElement(By.cssSelector("button[data-target*=myModal0]")).click();;
	   
	    }
	    @Then("^Check if table is there$")
	    public void check(){
	    	
	    	driver.findElement(By.cssSelector("table[class*=table-striped]"));
	    }

}
