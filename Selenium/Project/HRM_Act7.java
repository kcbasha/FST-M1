import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//Goal: Verify that the “Directory” menu item is visible and clickable
public class HRM_Act7 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/orangehrm");
        WebElement userName = driver.findElement(By.id("txtUsername"));
        WebElement password = driver.findElement(By.id("txtPassword"));
        userName.sendKeys("orange");
        password.sendKeys("orangepassword123");
        driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
//Navigate to MYinfo:
        driver.findElement(By.id("menu_pim_viewMyDetails") ).click();
        driver.findElement(By.id("btnSave")).click();
//to Qualification :
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[1]/ul/li[9]/a")).click();
        driver.findElement(By.id("addWorkExperience")).click();
//Add details    :
        driver.findElement(By.id("experience_employer")).sendKeys("IBM");
        driver.findElement(By.id("experience_jobtitle")).sendKeys("SW Engineer");
        // Date selection
        driver.findElement(By.id("experience_from_date")).clear();
        driver.findElement(By.id("experience_from_date")).sendKeys("2018-01-01");
        driver.findElement(By.id("experience_from_date")).sendKeys(Keys.ENTER);

        driver.findElement(By.id("experience_to_date")).clear();
        driver.findElement(By.id("experience_to_date")).sendKeys("2022-01-01");
        driver.findElement(By.id("experience_to_date")).sendKeys(Keys.ENTER);

        driver.findElement(By.id("experience_comments")).sendKeys("full time employment");
        driver.findElement(By.id("btnWorkExpSave")).click();
        //driver.quit();
    }
}