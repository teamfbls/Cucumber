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


public class TestClass {
    WebDriver driver=null;
    
    @Given("^User is on Website$")
    public void goToWebsiteindex(){
    driver=new FirefoxDriver();
   driver.navigate().to("http://localhost:8080/mavenproject1/");
    }
    
        
    @When("^User clicked on Auto Hinzufügen$")
    public void goToWebsitehin(){
    driver.findElement(By.id("autohin")).click();
    }
    
           
  
        
    @When("^Fill in Textbox$")
    public void fillText(){
    	
    driver.findElement(By.id("datafetchverkaufspreis")).sendKeys("15000");
    driver.findElement(By.id("datafetchkilometeranzahl")).sendKeys("30000");
driver.findElement(By.id("dataFetchZustand2")).click();
    Select dropdownfarbe =new Select(driver.findElement(By.id("datafetchFarbe")));
    dropdownfarbe.selectByValue("3");
    
    Select dropdowntueren =new Select(driver.findElement(By.id("dataFetchTueren")));
    dropdowntueren.selectByValue("1");
    
    Select dropdownbaujahr =new Select(driver.findElement(By.id("datafetchBaujahr")));
    dropdownbaujahr.selectByValue("3");
    
    
    Select dropdownhersteller =new Select(driver.findElement(By.id("datafetchHersteller")));
    dropdownhersteller.selectByValue("1");

   Select dropdownkraftstoff =new Select(driver.findElement(By.id("dataFetchKraftstoff")));
   dropdownkraftstoff.selectByValue("2");
   
   Select dropdownleistung =new Select(driver.findElement(By.id("dataFetchLeistung")));
   dropdownleistung.selectByValue("4");
   
   Select dropdownModell =new Select(driver.findElement(By.id("dataFetchModell")));
   dropdownModell.selectByValue("7");
    }
    
        
    @Then("^Ok$")
    public void ok(){
    	
    	driver.findElement(By.name("buttonhinz")).click();
    }
    
   
  
    
}
