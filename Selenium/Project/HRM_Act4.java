import io.netty.util.internal.ThreadLocalRandom;
import org.apache.commons.compress.harmony.pack200.NewAttribute;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import java.util.Random;

//Goal: Add an employee and their details to the site
public class HRM_Act4 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/orangehrm");

        WebElement userName = driver.findElement(By.id("txtUsername"));
        WebElement password = driver.findElement(By.id("txtPassword"));
        userName.sendKeys("orange");
        password.sendKeys("orangepassword123");
        driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
//Navigate to PIM
        driver.findElement(By.id("menu_pim_viewPimModule")).click();
        driver.findElement(By.id("btnAdd")).click();

// Generating random integers in range 0 to 9
        int max = 100;
        int min = 1;
        Random randomNum = new Random();
        int R1 = min + randomNum.nextInt(max);
//Create Emp with FN/LN
        driver.findElement(By.id("firstName")).sendKeys("Basha",(Integer.toString(R1)));
        driver.findElement(By.id("lastName")).sendKeys("kalamalla",(Integer.toString(R1)));
        driver.findElement(By.id("btnSave")).click();
//Search for the EMP FN/LN
        driver.findElement(By.xpath("//*[@id=\"menu_pim_viewEmployeeList\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"empsearch_employee_name_empName\"]")).isSelected();
        driver.findElement(By.xpath("//*[@id=\"empsearch_employee_name_empName\"]")).sendKeys("Basha",(Integer.toString(R1)));
        driver.findElement(By.xpath("//*[@id=\"empsearch_employee_name_empName\"]")).sendKeys(Keys.TAB);
        driver.findElement(By.id("searchBtn")).click();
//Verify the created EMP FN LN.
        String eFN= driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr[1]/td[3]")).getText();
        String eLN= driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr[1]/td[4]")).getText();
        Assert.assertEquals(eFN, "Basha"+(R1));
        Assert.assertEquals(eLN, "kalamalla"+(R1));
        System.out.println("Employee First Name is: " + eFN);
        System.out.println("Employee Last Name  is: " + eLN);

        //driver.quit();
    }
}