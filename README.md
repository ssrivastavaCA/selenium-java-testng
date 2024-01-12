selenium-testng-framework
---

---
A sample framework based on Page Object Model, Selenium, TestNG using Java.

This framework is based in **Page Object Model (POM).**

The framework uses:

1. Java
2. Selenium
3. TestNG
4. ExtentReport
5. Log4j

Steps to create test cases:
----
Let's say we want to automate Google search test.  

1.Create GoogleSearchPage in **pages** package.  
  A page class typically should contain all the elements that are present on the page and corresponding action methods.
  
  ```
  public class GooglePage extends BasePage {
	
	@FindBy(name = "q")
	private WebElement searchinput;

	public GooglePage(WebDriver driver) {
		super(driver);
	}

	public void searchText(String key) {
		searchinput.sendKeys(key + Keys.ENTER);
	}

}
```
