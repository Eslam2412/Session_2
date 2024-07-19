package testCases;

import base.BaseTests;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class StatusCode extends BaseTests {

    @BeforeMethod
    public void mainLink (){
        driver.findElement(By.cssSelector("a[href='/status_codes']")).click();

    }


    @Test

    public void Status200 (){
       // driver.findElement(By.cssSelector("a[href='/status_codes']")).click();
        driver.findElement(By.cssSelector("a[href='status_codes/200']")).click();
        String actualResult = driver.findElement(By.xpath("//*[contains(text(),'This page returned a 200 status code.')]")).getText();
        String expectedResult = "This page returned a 200 status code.";
        Assert.assertTrue(actualResult.contains(expectedResult));

    }

    @Test

    public void Status301 (){
      //  driver.findElement(By.cssSelector("a[href='/status_codes']")).click();
        driver.findElement(By.cssSelector("a[href='status_codes/301']")).click();
        String actualResult= driver.findElement(By.xpath("//*[contains(text(),'This page returned a 301 status code.')]")).getText();
        String expectedResult ="This page returned a 301 status code.";
        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Test
    public void Status404 (){
       // driver.findElement(By.cssSelector("a[href='/status_codes']")).click();
        driver.findElement(By.cssSelector("a[href='status_codes/404']")).click();
        String actualResult= driver.findElement(By.xpath("//*[contains(text(),'This page returned a 404 status code.')]")).getText();
        String expectedResult ="This page returned a 404 status code.";
        Assert.assertTrue(actualResult.contains(expectedResult));

    }
    @Test
    public void Status500 () {
        // driver.findElement(By.cssSelector("a[href='/status_codes']")).click();
        driver.findElement(By.cssSelector("a[href='status_codes/500']")).click();
        String actualResult= driver.findElement(By.xpath("//*[contains(text(),'This page returned a 500 status code.')]")).getText();
        String expectedResult ="This page returned a 500 status code.";
        Assert.assertTrue(actualResult.contains(expectedResult));

    }

}
