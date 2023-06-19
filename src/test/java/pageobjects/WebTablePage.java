package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTablePage extends AbstractPageObject{

    private final By addButton = By.cssSelector("#addNewRecordButton");
    private final By firstNameInput = By.cssSelector("#firstName");
    private final By lastNameInput = By.cssSelector("#lastName");
    private final By userEmailInput = By.cssSelector("#userEmail");
    private final By ageInput = By.cssSelector("#age");
    private final By salaryInput = By.cssSelector("#salary");
    private final By departmentInput = By.cssSelector("#department");
    private final By submitButton = By.cssSelector("#submit");
    private final By editButton = By.cssSelector("#edit-record-4");
    private final By deleteButton = By.cssSelector("#delete-record-4");
    private final By elementXpath1 =
            By.xpath("//div[contains(text(), 'ok@gm.co')]");
    private final By elementXpath2 =
            By.xpath("//div[contains(text(), 'okey')]");


    public WebTablePage(WebDriver driver) {
        super(driver);
        driver.get("https://demoqa.com/webtables");
    }
    public WebTablePage addUser(String firstName, String lastName, String userEmail,
                                String age, String salary, String department){
        clickOnElementWithJs(addButton);
        getElement(firstNameInput).sendKeys(firstName);
        getElement(lastNameInput).sendKeys(lastName);
        getElement(userEmailInput).sendKeys(userEmail);
        getElement(ageInput).sendKeys(age);
        getElement(salaryInput).sendKeys(salary);
        getElement(departmentInput).sendKeys(department);
        clickOnElementWithJs(submitButton);
        return this;
    }
    public String findAddingUser(){

        return driver.findElement(elementXpath1).getText();
    }

    public WebTablePage editUser(String firstName, String lastName){
        clickOnElementWithJs(editButton);
        getElement(firstNameInput).sendKeys(firstName);
        getElement(lastNameInput).sendKeys(lastName);
        clickOnElementWithJs(submitButton);
        return this;
    }
    public String findEditingUser(){

        return driver.findElement(elementXpath2).getText();
    }

}

