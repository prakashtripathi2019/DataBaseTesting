package testcom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class FirstSeleniumTest {
	
public static void main(String[]args) {
	WebDriver driver =new FirefoxDriver();
	driver.get("https://www.oracle.com/index.html");
	System.out.println("Completed");
}
}
