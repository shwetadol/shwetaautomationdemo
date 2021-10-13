package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.loginpageobjects;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	WebDriver driver=null;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    System.out.println("user is on login page");
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\gupts11\\eclipse-workspace\\DemoProject\\src\\test\\resources\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	   
	    
	    driver.get("https://qa2.labcorplink.com/ui/");
	    driver.manage().window().maximize();
	}

	@When("^user enter (.*) and (.*)$")
	public void user_enter_user_name_and_password(String username, String password) {
		 loginpageobjects login=new loginpageobjects(driver);
		 login.entervalidusername(username);
		 login.enterpassword(password);
		//System.out.println("user enter user name and password");
		//driver.findElement(By.id("username")).sendKeys(username);
	//	driver.findElement(By.id("password")).sendKeys(password);
		
	}

	@When("click on login button")
	public void click_on_login_button() {
		System.out.println("click on login button");
		loginpageobjects login=new loginpageobjects(driver);
		login.clicklogin();
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		System.out.println("user is navigated to home page");
		driver.quit();
	}


}
