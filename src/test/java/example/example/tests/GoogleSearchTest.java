package example.example.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import example.example.factory.PageinstancesFactory;
import example.example.pages.GooglePage;

/**
 * The Class GoogleSearchTest.
 *
 */
@Test(testName = "Google search test", description = "Test description")
public class GoogleSearchTest extends BaseTest {

	/**
	 * Google search test.
	 */
	@Test
	public void googleSearchTest() {
		driver.get("https://www.google.com/");
		GooglePage googlePage = PageinstancesFactory.getInstance(GooglePage.class);
		googlePage.searchText("java");
		Assert.assertTrue(googlePage.searchresult.getText().contains("Java"), "Title contain java : Test Passed");
	}
}
