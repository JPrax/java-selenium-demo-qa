package com.demoqa.pages;

import org.openqa.selenium.By;

public class ElementsPage extends BasePage{
    private By listItemTextBox = By.xpath("//li/span[text()='Text Box']");

    public TextBoxPage clickListItemTextBox(){
        find(listItemTextBox).click();
        return new TextBoxPage();
    }
}
