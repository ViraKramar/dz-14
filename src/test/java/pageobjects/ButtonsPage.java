package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ButtonsPage extends AbstractPageObject{

    private final By buttons = By.cssSelector("#item-4");
    private final By buttonClickMeId = By.cssSelector("#Fkwtj");
    private final By dynamicClickMessage = By.cssSelector("#dynamicClickMessage");

    private final By buttonClickMe = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/button");

    public ButtonsPage(WebDriver driver) {
        super(driver);
        driver.get("https://demoqa.com/elements");
    }

    public String getClickMe(){
        clickOnElementWithJs(buttons);
        clickOnElementWithJs(buttonClickMe);
        return getElement(dynamicClickMessage).getText();
    }

}
