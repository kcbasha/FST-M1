import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelDemo {
    public static void main(String[] args) {
    	WebDriver driver = new FirefoxDriver();
	//driver.get("http://www.google.com");

	//OR

	String URL = "http://www.google.com";
	driver.get(URL);
	
	//driver.getTitle();

	//OR

	String pageTitle = driver.getTitle();
	System.out.println(pageTitle);
    }
}
    
