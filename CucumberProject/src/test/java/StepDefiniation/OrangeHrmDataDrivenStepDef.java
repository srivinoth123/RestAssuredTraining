package StepDefiniation;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class OrangeHrmDataDrivenStepDef {
	WebDriver driver;
	
	@Given("user is on the application home page")
	public void user_is_on_the_application_home_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\driver\\chromedriver1.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	}

	@When("user enter the {string} and {string}")
	public void user_enter_the_and(String UserName, String Password)  throws InterruptedException {
		Thread.sleep(3000);
	    WebElement uName = driver.findElement(By.xpath("//input[@name='username']"));
	    Thread.sleep(3000);
		uName.sendKeys(UserName);
		Thread.sleep(3000);
		WebElement pWord = driver.findElement(By.xpath("//input[@name='password']"));
		pWord.sendKeys(Password);
	}

	@When("user click on the login button")
	public void user_click_on_the_login_button() {
		WebElement login =driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
	    
	}

	@Then("user should success to navigated the next page")
	public void user_should_success_to_navigated_the_next_page() {
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("OrangeHRM")) {
			System.out.println("The name is presented");		
		}else {
			System.out.println("The name is not presented");
		}


	}
	    
	}


