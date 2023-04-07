package AutomationExercises;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import static org.junit.Assert.*;

public class C01 extends TestBase {

//    1. Launch browser
//2. Navigate to url 'http://automationexercise.com'
//            3. Verify that home page is visible successfully
//4. Click on 'Signup / Login' button
//5. Verify 'New User Signup!' is visible
//6. Enter name and email address
//7. Click 'Signup' button
//8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
//9. Fill details: Title, Name, Email, Password, Date of birth
//10. Select checkbox 'Sign up for our newsletter!'
//            11. Select checkbox 'Receive special offers from our partners!'
//            12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
//13. Click 'Create Account button'
//            14. Verify that 'ACCOUNT CREATED!' is visible
//15. Click 'Continue' button
//16. Verify that 'Logged in as username' is visible
//17. Click 'Delete Account' button
//18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button


    @Test
    public void test01() {
        driver.get("http://automationexercise.com");

        // 3. Verify that home page is visible successfully
       String baslik = driver.getTitle();
        assertTrue(baslik.contains("Automation"));

//4. Click on 'Signup / Login' button
        driver.findElement(By.linkText("Signup / Login")).click();

//5. Verify 'New User Signup!' is visible
        WebElement newUser =driver.findElement(By.xpath("(//h2)[3]"));
        assertTrue(newUser.isDisplayed());

//6. Enter name and email address
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("zeyneppp");
        driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("emailzeynep@gmail.com");


//7. Click 'Signup' button
        driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();


//8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        WebElement enterAccount = driver.findElement(By.xpath("//b"));
        assertTrue(enterAccount.isDisplayed());


//9. Fill details: Title, Name, Email, Password, Date of birth
        driver.findElement(By.id("id_gender1")).click();
        driver.findElement(By.id("password")).sendKeys("12345888");

        Actions actions =new Actions(driver);
        actions.sendKeys(Keys.TAB).sendKeys("12").
        sendKeys(Keys.TAB).sendKeys("January").
        sendKeys(Keys.TAB).sendKeys("2000").
        sendKeys(Keys.TAB).
        sendKeys(Keys.TAB).
        sendKeys(Keys.TAB).
 //10. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        sendKeys("Ankara").sendKeys(Keys.TAB).
        sendKeys("Adana").sendKeys(Keys.TAB).
        sendKeys("bireysel").sendKeys(Keys.TAB).
        sendKeys("yeni mah. 115. sk").sendKeys(Keys.TAB).
        sendKeys(Keys.TAB).
        sendKeys("Canada").sendKeys(Keys.TAB).
        sendKeys("Montreal").sendKeys(Keys.TAB).
        sendKeys("Toronto").sendKeys(Keys.TAB).
        sendKeys("4556668888").sendKeys(Keys.TAB).
        sendKeys("455500000").sendKeys(Keys.TAB).
 //     11. Click 'Create Account button'
       sendKeys(Keys.ENTER).perform();

//      12. Verify that 'ACCOUNT CREATED!' is visible
        WebElement account = driver.findElement(By.xpath("//b"));
        Assert.assertTrue(account.isDisplayed());

//13. Click 'Continue' button
        driver.findElement(By.xpath("//a[@data-qa='continue-button']")).click();

//14. Verify that 'Logged in as username' is visible

        WebElement logged = driver.findElement(By.xpath("//i[@class='fa fa-user']"));
    assertTrue(logged.isDisplayed());

//15. Click 'Delete Account' button
      //  driver.findElement(By.xpath("//a[@href='/delete_account']")).click();

//16. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
      //  WebElement delete = driver.findElement(By.xpath("//b"));
      //  assertTrue(delete.isDisplayed());

    }
}
