import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

//Goal: Open the site and login with the credentials provided
public class HRM_Act3 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/orangehrm");

        WebElement userName = driver.findElement(By.id("txtUsername"));
        WebElement password = driver.findElement(By.id("txtPassword"));
        userName.sendKeys("orange");
        password.sendKeys("orangepassword123");

        driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();

        WebElement Homepage = driver.findElement(By.cssSelector(".head > h1:nth-child(1)"));
        Assert.assertEquals(Homepage.getText(), "Dashboard");
        System.out.println("Homepage has opened ---> " + Homepage.getText());

        driver.quit();
    }
}