package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.SignUpPage;

public class SignUpTest extends BaseTest {

	@Test
	public void testValidSignUp() {
		SignUpPage signUp = new SignUpPage(driver);
		String email = "testuser" + System.currentTimeMillis() + "@test.com";
		signUp.register(email, "Test@12345");
		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
	}
}