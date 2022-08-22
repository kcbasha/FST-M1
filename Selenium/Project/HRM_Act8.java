import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

//Goal: Verify that the “Directory” menu item is visible and clickable
public class HRM_Act8 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/orangehrm");
        WebElement userName = driver.findElement(By.id("txtUsername"));
        WebElement password = driver.findElement(By.id("txtPassword"));
        userName.sendKeys("orange");
        password.sendKeys("orangepassword123");
        driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();

        driver.findElement(By.xpath("//span[text()='Apply Leave']")).click();

// Select the option by index
        Select op1 = new Select(driver.findElement(By.id("applyleave_txtLeaveType")));
        op1.selectByIndex(1);
// Date selection
        driver.findElement(By.id("applyleave_txtFromDate")).clear();
        driver.findElement(By.id("applyleave_txtFromDate")).sendKeys("2022-09-25");
        driver.findElement(By.id("applyleave_txtFromDate")).sendKeys(Keys.ENTER);

        driver.findElement(By.id("applyleave_txtToDate")).clear();
        driver.findElement(By.id("applyleave_txtToDate")).sendKeys("2022-09-26");
        driver.findElement(By.id("applyleave_txtToDate")).sendKeys(Keys.ENTER);

        driver.findElement(By.id("applyleave_txtComment")).sendKeys("Leave plan for the august");
        driver.findElement(By.id("applyBtn")).click();

        driver.findElement(By.id("menu_leave_viewMyLeaveList")).click();



        //driver.quit();
    }
}