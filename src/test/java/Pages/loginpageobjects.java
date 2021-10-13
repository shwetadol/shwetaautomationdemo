package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpageobjects {
	WebDriver driver;
	By username= By.id("username");
	By password= By.id("password");
	By login_button= By.xpath("//button[@type='submit']");
	
	
	public loginpageobjects(WebDriver driver) {
		this.driver=driver;
	}
	
	

	public void entervalidusername(String userid) {
		
		driver.findElement(username).sendKeys(userid);
	}
	
	public void enterpassword(String userpswd) {
		driver.findElement(password).sendKeys(userpswd);
	}
	public void clicklogin() {
		driver.findElement(login_button).click();
	}
	public void validuserlogin(String userid,String userpswd) {
		driver.findElement(username).sendKeys(userid);
		driver.findElement(password).sendKeys(userpswd);
		driver.findElement(login_button).click();
		
	}
}
