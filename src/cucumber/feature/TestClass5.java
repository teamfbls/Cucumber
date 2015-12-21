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

public class TestClass5 {
	
	 WebDriver driver=null;
	    
	    @Given("^User is on Website5$")
	    public void goToWebsiteindex(){
	    driver=new FirefoxDriver();
	   driver.navigate().to("http://localhost:8080/mavenproject1/");
	   
	    }
	    
	        
	    @When("^User clicked on Webpage Auto suchen$")
	    public void goToWebsitesu(){
	    	driver.findElement(By.id("autosearch")).click();
	   
	    }
	    
	    @When("^User Inputs SearchString$")
	    public void searchString(){
	    	 Select dropdowntueren =new Select(driver.findElement(By.id("datacolumn")));
	    	    dropdowntueren.selectByValue("Verkaufspreis");
	    	    
	    	driver.findElement(By.id("datasuchwort")).sendKeys("15");
	   
	    }
	     
	  
	        
	        
	    @Then("^User clicked on search$")
	    public void clickedonsearch(){
	    	
	    	driver.findElement(By.cssSelector("input[class*=btn-success]")).click();
	    }
	    
	    @Then("^See result$")
	    public void seeresult(){
	    	
	    	driver.findElement(By.cssSelector("table[class*=table-bordered]"));
	    }

}
