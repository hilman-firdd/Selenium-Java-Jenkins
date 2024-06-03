package Pages;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.io.IOException;

import static Tests.SeleniumTest.*;

public class ProductPage {

    public static String formalShoes_xpath = "/html/body/div[2]/center/h2";

    public static String formalSport_xpath = "/html/body/div[3]/center/h2";

    public static String formalSneakers_xpath = "/html/body/div[4]/center/h2";

    public static String formalShoesdropdown_xpath = "/html/body/div[2]/center/div/i[1]";

    public static String formalSportdropdown_xpath = "/html/body/div[3]/center/div/i[1]";

    public static String formalSneakerdropdown_xpath = "/html/body/div[4]/center/div/i[1]";

    public static String formalShoes_firstshoesname = "/html/body/div[2]/table/tbody/tr[1]/td[1]";

    public static String formalSport_firstshoesname = "/html/body/div[3]/table/tbody/tr[1]/td[1]";


    public static void formalShoes_verifyTitle() throws IOException, IOException {
        String expectedTitleFS = "Formal Shoes";
        String actualTitleFS = driver.findElement(By.xpath(formalShoes_xpath)).getText();
        Assert.assertEquals(expectedTitleFS, actualTitleFS);
        if(expectedTitleFS.equals(actualTitleFS)) {
            test.log(Status.PASS, "Test Passed for title verification");
            test.log(Status.PASS, test.addScreenCaptureFromPath(capture(driver))+ "Test Passed");
        }else if(false){
            test.fail(MediaEntityBuilder.createScreenCaptureFromBase64String("base64").build());
        }
    }

    public static void sportsShoes_verifyTitle() {
        String expectedTitleSS= "Sports Shoes";
        String actualTitleSS = driver.findElement(By.xpath(formalSport_xpath)).getText();
        Assert.assertEquals(actualTitleSS, expectedTitleSS);
        if(expectedTitleSS.equals(actualTitleSS)) {
            test.log(Status.PASS, "Test Passed for first shoe name of formal shoe i.e classic cheltanham");
        }else{
            test.log(Status.FAIL, "Test Fail get cheltanham");
        }
    }

    public static void sneaker_verifyTitle() {
        String expectedTitleSn = "Sneakers";
        String actualTitleSn = driver.findElement(By.xpath(formalSneakers_xpath)).getText();
        Assert.assertEquals(actualTitleSn, expectedTitleSn);
        if(expectedTitleSn.equals(actualTitleSn)) {
            test.log(Status.PASS, "Test Passed for first shoe name of sport shoe i.e ultimate");
        }else{
            test.log(Status.FAIL, "Test Fail get ultimate");

        }
    }

    public static void formalShoes_firstshoe_verify() {
        String expectedFirstFormalShoe = "   Classic Cheltenham";
        driver.findElement(By.xpath(formalShoesdropdown_xpath)).click();
        String actualFirstFormalShoe = driver.findElement(By.xpath(formalShoes_firstshoesname)).getText();
        Assert.assertEquals(expectedFirstFormalShoe, actualFirstFormalShoe);
    }

    public static void sportShoes_firstshoes_verify() {
        String expectedFirstSportShoe = "   Ultimate";
        driver.findElement(By.xpath(formalSportdropdown_xpath)).click();
        String actualFirstSportShoe = driver.findElement(By.xpath(formalSport_firstshoesname)).getText();
        Assert.assertEquals(expectedFirstSportShoe, actualFirstSportShoe);
    }
}
