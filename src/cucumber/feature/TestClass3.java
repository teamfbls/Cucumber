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

public class TestClass3 {
	
	 WebDriver driver=null;
	    
	    @Given("^User is on Website3$")
	    public void goToWebsiteindex(){
	    driver=new FirefoxDriver();
	   driver.navigate().to("http://localhost:8080/mavenproject1/");
	  
	    }
	    
	        
	    @When("^User clicked on Webpage$")
	    public void goToWebsitean(){
	    	 driver.findElement(By.id("autoan")).click();
	   
	    }
	        
	        
	    @Then("^Check if entry is there$")
	    public void checktable(){
	    	
	    	driver.findElement(By.cssSelector("table[class*=table-bordered]"));
	    }

}
