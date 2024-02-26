package com.kloia.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(css = ".btnSignIn")
    public WebElement loginLink;



}
