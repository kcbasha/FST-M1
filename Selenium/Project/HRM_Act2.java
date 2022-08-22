import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

//Goal: Print the url of the header image to the console
public class HRM_Act2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/orangehrm");

        WebElement HDname =driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/img"));
        System.out.println("url of the header image: "+ HDname.getAttribute("src"));

       driver.quit();
    }
}

