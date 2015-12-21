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

public class TestClass2 {
	
	 WebDriver driver=null;
	    
	    @Given("^User is on Website2$")
	    public void goToWebsiteindex(){
	    driver=new FirefoxDriver();
	   driver.navigate().to("http://localhost:8080/mavenproject1/");
	   driver.findElement(By.id("autolo")).click();
	    }
	    
	        
	    @When("^User clicked on Checkbox$")
	    public void goToWebsitehin(){
	    	driver.findElement(By.id("checkb4")).click();
	   
	    }
	    
	           
	  
	        
	        
	    @Then("^Delete entry$")
	    public void ok(){
	    	
	    	driver.findElement(By.name("buttonlo")).click();
	    }

}
