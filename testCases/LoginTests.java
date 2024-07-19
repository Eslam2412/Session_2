package testCases;
import base.BaseTests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class LoginTests extends BaseTests {


    @Test

    public void testSuccessfulLogin(){

        driver.findElement(By.xpath("//a[contains(text(),'Form Authentication')]")).click();
        driver.findElement(By.cssSelector("input#username")).sendKeys("tomsmith");
        driver.findElement((By.id("password"))).sendKeys("SuperSecretPassword!");
        driver.findElement(By.className("radius")).click();
        String actualResult = driver.findElement(By.id("flash")).getText();
        String expectedResult = "You logged into a secure area!";
        assertTrue(actualResult.contains(expectedResult));
    }

    @Test

    public void testInvalidPassword(){

        driver.findElement(By.linkText("Form Authentication")).click();
        driver.findElement(By.cssSelector("input#username")).sendKeys("tomsmith");
        driver.findElement(By.cssSelector("[id=password")).sendKeys("SuperSecret");
        driver.findElement(By.cssSelector("button.radius")).click();
        String actualResult = driver.findElement(By.cssSelector("#flash")).getText();
        String expectedResult = "Your password is invalid!";
        assertTrue(actualResult.contains(expectedResult));

    }

    @Test

    public void testInvalidUsername (){

        driver.findElement(By.linkText("Form Authentication")).click();
        driver.findElement(By.cssSelector("input#username")).sendKeys("eslam");
        driver.findElement(By.cssSelector("input#password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector("button.radius")).click();
        String actualResult = driver.findElement(By.cssSelector("div#flash")).getText();
        String expectedResult = "Your username is invalid!";
        assertTrue(actualResult.contains(expectedResult));


    }


}