package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.DashboardPage;
import pages.LoginPage;

public class SignOutTest extends BaseTest {

	@Test
	public void testSignOut() {
		LoginPage login = new LoginPage(driver);
		login.login("existinguser@test.com", "Test@12345");

		DashboardPage dashboard = new DashboardPage(driver);
		dashboard.signOut();

		Assert.assertTrue(driver.getCurrentUrl().contains("login"));
	}
}