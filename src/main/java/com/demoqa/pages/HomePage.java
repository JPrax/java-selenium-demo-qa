package com.demoqa.pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage {

    private By elements = By.xpath("//h5[text()='Elements']");
    private By forms = By.xpath("//h5[text()='Forms']");
    private By framesAlertsWindows = By.xpath("//h5[text()='Alerts, Frame & Windows']");
    private By widgets = By.xpath("//h5[text()='Widgets']");
    private By interactions = By.xpath("//h5[text()='Interactions']");

    public ElementsPage clickElements(){
        click(elements);
        return new ElementsPage();
    }

    public FormsPage clickForms(){
        click(forms);
        return new FormsPage();
    }

    public FramesAlertsWindowsPage clickFramesAlertsWindows(){
        click(framesAlertsWindows);
        return new FramesAlertsWindowsPage();
    }

    public WidgetsPage clickWidgets(){
        click(widgets);
        return new WidgetsPage();
    }

    public InteractionPage clickInterActions(){
        click(interactions);
        return new InteractionPage();
    }

}
