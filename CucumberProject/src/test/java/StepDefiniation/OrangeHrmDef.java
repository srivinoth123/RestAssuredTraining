package StepDefiniation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class OrangeHrmDef {
	ChromeDriver driver;

	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\driver\\chromedriver1.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

	}

	@When("user enter username and password") 
	public void user_enter_username_and_password(DataTable dataTable) throws InterruptedException {
		Thread.sleep(3000);
		List<String> credentials = dataTable.asList(String.class);
		String username = credentials.get(0);
		String password = credentials.get(1);
		WebElement uName = driver.findElement(By.xpath("//input[@name='username']"));
		uName.sendKeys(username);
		Thread.sleep(3000);
		WebElement pWord = driver.findElement(By.xpath("//input[@name='password']"));
		pWord.sendKeys(password);
	}

	@When("user click on enter button") 
	public void user_click_on_enter_button(){
		WebElement login =driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();

	}

	@Then("user should be navicated to the home page") 
	public void user_should_be_navicated_to_the_home_page() {
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("OrangeHRM")) {
			System.out.println("The name is presented");		
		}else {
			System.out.println("The name is not presented");
		}


	}



}
