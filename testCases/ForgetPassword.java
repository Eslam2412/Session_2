package testCases;
import base.BaseTests;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgetPassword extends BaseTests {

    @Test


    public void forgetPassword (){
        driver.findElement(By.linkText("Forgot Password")).click();
        driver.findElement(By.cssSelector("input#email")).sendKeys("eslam@gmail.com");
        driver.findElement(By.cssSelector("button.radius")).click();
        String actualResult = String.valueOf(driver.findElement(By.xpath("//*[text()='Internal Server Error']")));
        String expectedResult = "Internal Server Error";
        Assert.assertTrue(actualResult.contains(expectedResult));


    }
}
