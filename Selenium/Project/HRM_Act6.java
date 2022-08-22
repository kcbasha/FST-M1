import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

//Goal: Verify that the “Directory” menu item is visible and clickable
public class HRM_Act6 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/orangehrm");

        WebElement userName = driver.findElement(By.id("txtUsername"));
        WebElement password = driver.findElement(By.id("txtPassword"));
        userName.sendKeys("orange");
        password.sendKeys("orangepassword123");
        driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
//Navigate to DIR
        WebElement directory = driver.findElement(By.id("menu_directory_viewDirectory"));
        boolean displayed = directory.isDisplayed();
        System.out.println("Directory menu is displayed "+displayed);
        directory.isEnabled();
//Search DIR
        String Hname = driver.findElement(By.xpath("//h1[text()='Search Directory']")).getText();
        Assert.assertEquals(Hname, "Search Directory");
        System.out.println("Heading of the page is: " + Hname);

        //driver.quit();
    }
}