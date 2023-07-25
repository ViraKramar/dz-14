package tests;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.ButtonsPage;

public class ButtonClickTest extends BaseTest {

    @Test
    @Description("The test is checking positive case for [Click Me] button")
    public void testClickMe() {
        ButtonsPage buttonsPage = new ButtonsPage(driver);
        buttonsPage.getClickMe();

        Assert.assertEquals(buttonsPage.getClickMe(),
                "You have done a dynamic click",
                "Message is wrong");
    }
}

