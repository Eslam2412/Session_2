package testCases;

import base.BaseTests;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxes extends BaseTests {

    @Test

    public void testCheckBox() {
        driver.findElement(By.xpath("//id")).click();
        driver.findElement(By.xpath("//input[type='checkbox']")).click();

    }
}
