import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/dynamic-controls");
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);

        WebElement CheckboxIN = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[1]/input"));
        System.out.println("The checkbox Input is displayed: " + CheckboxIN.isDisplayed());
        driver.findElement(By.id("toggleCheckbox")).click();
        System.out.println("The checkbox Input is displayed: " + CheckboxIN.isDisplayed());

//Add checkbox and verify again display.
        driver.findElement(By.xpath("//*[@id=\"toggleCheckbox\"]")).click();
        System.out.println("The checkbox Input is displayed: " + CheckboxIN.isDisplayed());
    }

}