import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.time.Duration;

public class Activity5_3 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/dynamic-controls");
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);

        WebElement textInput = driver.findElement(By.xpath("//input[@type='text']"));
        System.out.println("The checkbox is selected: " + textInput.isEnabled());
        driver.findElement(By.id("toggleInput")).click();
        System.out.println("The checkbox is selected: " + textInput.isEnabled());
    }

}