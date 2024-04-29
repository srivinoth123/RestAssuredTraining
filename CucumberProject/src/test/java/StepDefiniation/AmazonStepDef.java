package StepDefiniation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonStepDef {
	WebDriver driver;
	
	@Given("user is on amazon home page")
	public void user_is_on_amazon_home_page() {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\driver\\chromedriver1.exe");
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	 
	}

	@When("user click on best sellers option")
	public void user_click_on_best_sellers_option() {
		WebElement bestSellerButton = driver.findElement(By.partialLinkText("Best Sellers"));
		bestSellerButton.click();
	  
	}

	@Then("user select baby products option which is available in left side")
	public void user_select_baby_products_option_which_is_available_in_left_side() {
		WebElement babyProducts = driver.findElement(By.partialLinkText("Baby Products"));
		babyProducts.click();
	  
	}

	@Then("it should navicated to baby products page")
	public void it_should_navicated_to_baby_products_page() {
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Amazon.in Bestsellers: The most popular items in Baby Products")) {
			System.out.println("The correct statement is printed " + title);
			
		}else {
			System.out.println("Not printed the correct statement");
		}
	   
	}

}
