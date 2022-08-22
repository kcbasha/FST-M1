import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

//Goal: Edit a user’s information
public class HRM_Act5 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/orangehrm");

        WebElement userName = driver.findElement(By.id("txtUsername"));
        WebElement password = driver.findElement(By.id("txtPassword"));
        userName.sendKeys("orange");
        password.sendKeys("orangepassword123");
        driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
//Navigate to myInfo
        driver.findElement(By.id("menu_pim_viewMyDetails") ).click();
        driver.findElement(By.id("btnSave")).click();
//Edit myInfo
        driver.findElement(By.id("personal_txtEmpFirstName")).clear();
        driver.findElement(By.id("personal_txtEmpLastName")).clear();

        driver.findElement(By.id("personal_txtEmpFirstName")).sendKeys("Jhon");
        driver.findElement(By.id("personal_txtEmpLastName")).sendKeys("Doe");

        Select Nationality =new Select(driver.findElement(By.id("personal_cmbNation")));
        Nationality.selectByVisibleText("Indian");
        Select Marital =new Select(driver.findElement(By.id("personal_cmbMarital")));
        Marital.selectByVisibleText("Married");

        driver.findElement(By.id("personal_DOB")).clear();
        WebElement dateBox = driver.findElement(By.id("personal_DOB"));
        dateBox.sendKeys("1996-03-07");
        driver.findElement(By.id("personal_DOB")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("btnSave")).click();

        driver.quit();
    }
}