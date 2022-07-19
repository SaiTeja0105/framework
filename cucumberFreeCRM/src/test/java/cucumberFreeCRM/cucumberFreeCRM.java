package cucumberFreeCRM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class cucumberFreeCRM {
	WebDriver driver = null;

	@Given("Browser is open")
	public void Browser_is_open() {
		System.out.println("Inside Step: Browser is open");
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().window().maximize();
	}

	@And("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("Inside Step: user is on login page");
		driver.navigate().to("https://ui.freecrm.com/");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("Inside Step: user enters username and password");
		driver.findElement(By.name("email")).sendKeys("saitejamudiraj171@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Goodtimes@0105");
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();

	}

	@Then("user is navigated to HomePage")
	public void user_is_navigated_to_HomePage() {
		System.out.println("Inside Step: user is navigated to HomePage ");
		driver.findElement(By.xpath("//*[@id=\"top-header-menu\"]/div[2]/div[2]/div/i")).click();
		driver.findElement(By.xpath("//*[@id=\"top-header-menu\"]/div[2]/div[2]/div/div/a[5]/span")).click();
		driver.quit();

	}

}