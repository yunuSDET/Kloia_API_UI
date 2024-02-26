package com.kloia.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{


    @FindBy(className = "facebookBtn")
    public WebElement facebookBtn;


    @FindBy(id="email")
    public WebElement inputEmail;

    @FindBy(id="pass")
    public WebElement inputPassword;

    @FindBy(id = "u_0_0_Hk")
    public WebElement loginBtn;


}
