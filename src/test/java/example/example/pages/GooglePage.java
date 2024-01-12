package example.example.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * The Class represents GooglePage.
 *
 */
public class GooglePage extends BasePage {
	
	/** The searchinput. */
	@FindBy(name = "q")
	private WebElement searchinput;

	/** The First search result. */
	@FindBy(xpath = "(//h3)[1]")
	public WebElement searchresult;

	/**
	 * Instantiates a new google page.
	 *
	 * @param driver the driver
	 */
	public GooglePage(WebDriver driver) {
		super(driver);
	}

	/**
	 * Searches the given text.
	 *
	 * @param key the key
	 */
	public void searchText(String key) {
		searchinput.sendKeys(key + Keys.ENTER);
	}

}
