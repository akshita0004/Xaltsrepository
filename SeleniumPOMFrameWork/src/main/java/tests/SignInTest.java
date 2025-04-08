package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class SignInTest extends BaseTest {

	@Test
	public void testValidLogin() {
		LoginPage login = new LoginPage(driver);
		login.login("existinguser@test.com", "Test@12345");
		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
	}
}