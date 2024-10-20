package com.demoqa.test.scripts;

import com.demoqa.test.base.BaseTest;
import org.testng.annotations.Test;


public class TestElements extends BaseTest {
    @Test
    public void testTextBox(){
        var elementsPage = homePage.clickElements();
        var textboxPage = elementsPage.clickListItemTextBox();
        textboxPage.enterFullName("JP Praxides");
        textboxPage.enterEmail("jp@praxides.com");
        textboxPage.enterCurrentAddress("26 Apple Street, Project 10, Lincoln City");
        textboxPage.enterPermanentAddress("93 Kalayaan Avenue, Galas, Quezon City");
        textboxPage.clickSubmitButton();
        softAssert.assertEquals(textboxPage.getOutputName(),"Name:JP Praxides");
        softAssert.assertEquals(textboxPage.getOutputEmail(),"Email:jp@praxides.com");
        softAssert.assertEquals(textboxPage.getOutputCurrentAddress(),"Current Address:26 Apple Street, Project 10, Lincoln City");
        softAssert.assertEquals(textboxPage.getOutputPermanentAddress(),"Permanent Address :93 Kalayaan Avenue, Galas, Quezon City");
        softAssert.assertAll();
    }
}
