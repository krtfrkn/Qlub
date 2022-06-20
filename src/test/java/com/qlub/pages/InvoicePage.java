package com.qlub.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InvoicePage extends BasePage {

    @FindBy(xpath = "//strong[.='Your bill']")
    public WebElement billStatement;

}
