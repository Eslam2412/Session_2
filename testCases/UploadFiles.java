package testCases;

import base.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadFiles extends BaseTests {

    @Test

    public void uploadFiles (){

        String filePath ="C:\\Users\\lenovo\\OneDrive\\Desktop\\Test Images\\ekko.png";

        driver.findElement(By.linkText("File Upload")).click();       // m4 3arf agebo bel Css selector
        driver.findElement(By.cssSelector("input#file-upload")).sendKeys(filePath);
        driver.findElement(By.cssSelector("input#file-submit")).click();
        String actualResult = String.valueOf(driver.findElement(By.cssSelector("div#uploaded-files")).getText());
        String expectedResult = "ekko.png";
        Assert.assertTrue(actualResult.contains(expectedResult));    // m3rft4 a3ml assert equals


    }

}
