package com.qlub.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage{
    @FindBy(xpath = "//div[@class='text-base font-medium text-black']")
    public WebElement viewTheMenuButton;

    @FindBy(xpath = "//div[@class='text-base font-medium text-black grow']")
    public WebElement payTheBillButton;
}
