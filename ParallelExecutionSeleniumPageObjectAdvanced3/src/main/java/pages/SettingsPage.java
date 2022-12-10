package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettingsPage {
	private WebDriver driver;

	public SettingsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// Define all the WebElements

	@FindBy(css = "button#react-burger-menu-btn")
	private WebElement settingMenuBtn;

	@FindBy(css = "nav.bm-item-list>a")
	private List<WebElement> itemList;

	@FindBy(xpath = "//a[contains(text(),'Logout')]")
	private WebElement logOutBtn;

	public WebElement getSettingMenu() {
		return settingMenuBtn;
	}

	public List<WebElement> itemList() {
		return itemList;
	}

	public LoginPage performLogOut() {
		 logOutBtn.click();
		 return new LoginPage(driver);
	}

}
