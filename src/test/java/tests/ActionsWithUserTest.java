package tests;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.ButtonsPage;
import pageobjects.WebTablePage;
public class ActionsWithUserTest extends BaseTest {
    @Test
    @Description("The test is checking positive case for adding and editing user data")
    public void testAddEditUser() {
        WebTablePage webTablePage = new WebTablePage(driver);
        webTablePage.addUser("ok", "okk", "ok@gm.co",
                "35", "15000", "okkk");

        Assert.assertEquals(webTablePage.findAddingUser(), "ok@gm.co",
                "Adding user data has not been successful");

        webTablePage.editUser("ey", "ey");

        Assert.assertEquals(webTablePage.findEditingUser(), "okey",
                "Editing user data has not been successful");
    }
}
