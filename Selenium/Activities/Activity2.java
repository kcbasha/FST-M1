import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2  {
    public static void main(String[] args) {

        //Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        //And now use this to visit the website
        driver.get("https://www.training-support.net");

        String title = driver.getTitle();
        System.out.println("Page title is: " + title);

        WebElement idL = driver.findElement(By.id("about-link"));
        System.out.println ("Text in element: " + idL.getText());

        WebElement classL = driver.findElement(By.className("inverted"));
        System.out.println("Text in element: " + classL.getText());

        WebElement cssL = driver.findElement(By.cssSelector(".green"));
        System.out.println("Text in element: " + cssL.getText());

        WebElement linkTextL = driver.findElement(By.linkText("About Us"));
        System.out.println("Text in element: " + linkTextL.getText());
        //driver.close();
    }
}