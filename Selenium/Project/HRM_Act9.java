import jdk.swing.interop.SwingInterOpUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.List;


//Goal: Verify that the “Directory” menu item is visible and clickable
public class HRM_Act9 {
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
//Navigate to Emergency contacts:
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[1]/ul/li[9]/a")).click();
        driver.findElement(By.id("addWorkExperience")).click();
        driver.findElement(By.xpath("//a[text()='Emergency Contacts']")).click();
//Getting info from table

        WebElement table = driver.findElement(By.id("emgcontact_list"));
        List<WebElement> allRows = table.findElements(By.tagName("tr"));
        for (WebElement row : allRows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            for (WebElement cell : cells) {
                System.out.println("emergency contacts list >>   " + cell.getText());
            }
        }
        //driver.quit();
    }
}