package com.demoqa.pages;

import org.openqa.selenium.By;

public class TextBoxPage extends BasePage{
    private By fullName = By.xpath("//label[text()='Full Name']/following::input[1]");
    private By eMail = By.xpath("//label[text()='Email']/following::input[1]");
    private By currentAddress = By.xpath("//label[text()='Current Address']/following::textarea[1]");
    private By permanentAddress = By.xpath("//label[text()='Permanent Address']/following::textarea[1]");
    private By submitButton = By.xpath("//button[text()='Submit']");
    private By outputName = By.xpath("//*[@id='output']//*[@id='name']");
    private By outputEmail = By.xpath("//*[@id='output']//*[@id='email']");
    private By outputCurrentAddress = By.xpath("//*[@id='output']//*[@id='currentAddress']");
    private By outputPermanentAddress = By.xpath("//*[@id='output']//*[@id='permanentAddress']");


    public void enterFullName(String text){
        set(fullName,text);
    }

    public void enterEmail(String text){
        set(eMail,text);
    }

    public void enterCurrentAddress(String text){
        set(currentAddress,text);
    }

    public void enterPermanentAddress(String text){
        set(permanentAddress,text);
    }

    public void clickSubmitButton(){
        click(submitButton);
    }

    public String getOutputName(){
        return getText(outputName);
    }

    public String getOutputEmail(){
        return getText(outputEmail);
    }

    public String getOutputCurrentAddress(){
        return getText(outputCurrentAddress);
    }

    public String getOutputPermanentAddress(){
        return getText(outputPermanentAddress);
    }

}
