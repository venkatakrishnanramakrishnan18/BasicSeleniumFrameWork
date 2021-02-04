package main.java.pageEvents;

import main.java.pageObjects.LoginPageObjects;
import main.java.utils.ElementFetch;
import org.testng.Assert;
import org.testng.internal.BaseTestMethod;
import test.java.BaseTest;

public class LoginPageEvents {
    public void amazonLoginScreenValidation() throws Exception{
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("Verifying that the login page opened or not.");
        Assert.assertTrue(elementFetch.getListWebElements("XPATH", LoginPageObjects.loginText).size()>0,"Amazon");
    }

    public void enterEmailAddress(String emailId) throws Exception{
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("About to perform entering email address.");
        elementFetch.getWebElement("ID",LoginPageObjects.emailAddress).sendKeys(emailId);
        ///////elementFetch.getWebElement("ID",LoginPageObjects.emailAddress).
    }
}
