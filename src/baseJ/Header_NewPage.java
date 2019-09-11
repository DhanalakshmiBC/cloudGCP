package com.lowes.qa.selenium.components;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.lowes.framework.Status;
import com.lowes.qa.selenium.support.ReusableLibrary_MOW;
import com.lowes.qa.selenium.support.ScriptHelper;
import com.lowes.qa.selenium.uimap.UIMapDeliverySummary_LFP;
import com.lowes.qa.selenium.uimap.UIMapHeader_New;
import com.lowes.qa.selenium.uimap.UIMapHomePage;
import com.thoughtworks.selenium.webdriven.commands.WaitForPopup;

public class Header_NewPage extends ReusableLibrary_MOW {

	UIMapHeader_New UIMapHeader_New;
	Actions action = new Actions(driver);

	public Header_NewPage(ScriptHelper scriptHelper) {
		super(scriptHelper);
		// TODO Auto-generated constructor stub
		UIMapHeader_New = PageFactory.initElements(driver, UIMapHeader_New.class);
		// verifyPageLoaded(UIMapHeader_New.pageLoadedText);// per each page
	}

	public void signout_click() throws InterruptedException {
		UIMapHeader_New.loweslogo.click();
		Thread.sleep(4000);
		action.moveToElement(UIMapHeader_New.mylowesicon).build().perform();
		UIMapHeader_New.signout.click();
	}

	public void signin_click() throws InterruptedException {
		Thread.sleep(3000);
		action.moveToElement(UIMapHeader_New.mylowesicon).build().perform();
		UIMapHeader_New.signinlink.click();
		UIMapHeader_New.userEmailField.sendKeys("test0015@test.com");
		UIMapHeader_New.userPasswordField.sendKeys("Lowes123");
		UIMapHeader_New.signinButton.click();
	}

	/**
	 * This function verifies left header in blue bar
	 * 
	 * @throws Exception
	 * @author Dhanalakshmi
	 * @Date 7/24/2019
	 */

	public void verifyHeader_Bluebar() throws Exception {

		try {
			verifyElementTextContains(UIMapHeader_New.welText, "Welcome to Lowe's,");

			if (isElementDisplayed(UIMapHeader_New.findstorelink))
				report.updateTestLog("verify find a store link is displayed", "Find a store link is displayed",
						Status.PASS);
			else
				report.updateTestLog("verify find a store link is displayed", "Find a store link is not displayed",
						Status.FAIL);

			UIMapHeader_New.findstorelink.click();
			UIMapHeader_New.searchZip.sendKeys("509");
			Actions action = new Actions(driver);
			action.sendKeys(Keys.ENTER).build().perform();

			UIMapHeader_New.clickListStores.click();

			if (isElementDisplayed(UIMapHeader_New.storeName))
				report.updateTestLog("verify store name is displayed", "store name is displayed", Status.PASS);
			else
				report.updateTestLog("verify store name is displayed", "store name is not displayed", Status.FAIL);
			String store1 = UIMapHeader_New.storeName.getText();
			System.out.println(UIMapHeader_New.storeName.getText());

			if (isElementDisplayed(UIMapHeader_New.storeHours))
				report.updateTestLog("verify store open hours is displayed", "store open hours is displayed",
						Status.PASS);
			else
				report.updateTestLog("verify store open hours is displayed", "store open hours is not displayed",
						Status.FAIL);

			System.out.println(UIMapHeader_New.storeHours.getText());

			if (isElementDisplayed(UIMapHeader_New.downArrow))
				report.updateTestLog("verify store down arrow is displayed", "store down arrow is displayed",
						Status.PASS);
			else
				report.updateTestLog("verify store down arrow is displayed", "store down arrow is not displayed",
						Status.FAIL);

			UIMapHeader_New.storeName.sendKeys(Keys.ENTER);

			UIMapHeader_New.popupselectstore.click();

			String store2 = UIMapHeader_New.storeName.getText();

			if (store1.equals(store2))
				report.updateTestLog("verify user is able to zip-in into another store",
						"user is not able to zip-in into another store", Status.FAIL);
			else
				report.updateTestLog("verify user is able to zip-in into another store",
						"user is able to zip-in into another store", Status.PASS);

			UIMapHeader_New.loweslogo.click();

		} catch (Exception e) {

			if (isElementDisplayed(UIMapHeader_New.storeName))
				report.updateTestLog("verify store name is displayed", "store name is displayed", Status.PASS);
			else
				report.updateTestLog("verify store name is displayed", "store name is not displayed", Status.FAIL);
			String store1 = UIMapHeader_New.storeName.getText();
			System.out.println(UIMapHeader_New.storeName.getText());

			if (isElementDisplayed(UIMapHeader_New.storeHours))
				report.updateTestLog("verify store open hours is displayed", "store open hours is displayed",
						Status.PASS);
			else
				report.updateTestLog("verify store open hours is displayed", "store open hours is not displayed",
						Status.FAIL);

			System.out.println(UIMapHeader_New.storeHours.getText());

			if (isElementDisplayed(UIMapHeader_New.downArrow))
				report.updateTestLog("verify store down arrow is displayed", "store down arrow is displayed",
						Status.PASS);
			else
				report.updateTestLog("verify store down arrow is displayed", "store down arrow is not displayed",
						Status.FAIL);

			UIMapHeader_New.storeName.click();

			System.out.println(UIMapHeader_New.storelocatorPopup.getText());

			UIMapHeader_New.popupselectstore.click();

			String store2 = UIMapHeader_New.storeName.getText();

			if (store1.equals(store2))
				report.updateTestLog("verify user is able to zip-in into another store",
						"user is not able to zip-in into another store", Status.FAIL);
			else
				report.updateTestLog("verify user is able to zip-in into another store",
						"user is able to zip-in into another store", Status.PASS);
			UIMapHeader_New.loweslogo.click();

		}
		if (isElementDisplayed(UIMapHeader_New.orderStatusAndicon))
			report.updateTestLog("verify order status link and icon is displayed",
					"order status link and icon is displayed", Status.PASS);
		else
			report.updateTestLog("verify order status link and icon is displayed",
					"order status link and icon is not displayed", Status.FAIL);

		if (isElementDisplayed(UIMapHeader_New.creditcardicon))
			report.updateTestLog("verify credit card link and icon is displayed",
					"credit card link and icon is displayed", Status.PASS);
		else
			report.updateTestLog("verify credit card link and icon is displayed",
					"credit card link and icon is not displayed", Status.FAIL);

		if (isElementDisplayed(UIMapHeader_New.weeklyAddBoookLink))
			report.updateTestLog("verify weekly add link and icon is displayed",
					"weekly add link and icon is displayed", Status.PASS);
		else
			report.updateTestLog("verify weekly add link and icon is displayed",
					"weekly add link and icon is not displayed", Status.FAIL);

		Thread.sleep(2000);
		UIMapHeader_New.orderstatusLink.click();
		verifyTitleContainsReport("Check Order Status");

		navigateBack();

		UIMapHeader_New.creditcardLink.click();
		verifyTitleEqualsReport("Lowe's Credit Center");

		navigateBack();

		UIMapHeader_New.weeklyAddBoookLink.click();
		verifyTitleEqualsReport("Lowe's Weekly Ad");

		navigateBack();

	}

	/**
	 * This function verifies header below blue bar
	 * 
	 * @throws Exception
	 * @author Dhanalakshmi
	 * @Date 7/24/2019
	 */

	public void verifyHeader_menuLinksbelowbluebar() throws Exception {

		if (isElementDisplayed(UIMapHeader_New.loweslogo))
			report.updateTestLog("verify lowes logo", "logo is displayed", Status.PASS);
		else
			report.updateTestLog("verify lowes logo", "logo is not displayed", Status.FAIL);

		UIMapHeader_New.loweslogo.click();
		verifyTitleEqualsReport("Lowe's Home Improvement | Hardware Store");

		if (isElementDisplayed(UIMapHeader_New.shopLink))
			report.updateTestLog("verify shop menu", "shop menu is displayed", Status.PASS);
		else
			report.updateTestLog("verify shop menu", "shop menu is not displayed", Status.FAIL);

		UIMapHeader_New.shopLink.click();

		if (isElementDisplayed(UIMapHeader_New.flyoutmenu))
			report.updateTestLog("verify flyout menu", "flyout menu is displayed", Status.PASS);
		else
			report.updateTestLog("verify flyout menu", "flyout menu is not displayed", Status.FAIL);

		if (isElementDisplayed(UIMapHeader_New.serviceLink))
			report.updateTestLog("verify service link", "service link is displayed", Status.PASS);
		else
			report.updateTestLog("verify service link", "service link is not displayed", Status.FAIL);

		UIMapHeader_New.serviceLink.click();
		verifyTitleEqualsReport("Lowe's Installation Services for your Home");

		navigateBack();
		if (isElementDisplayed(UIMapHeader_New.savingsLink))
			report.updateTestLog("verify savings link", "savings link is displayed", Status.PASS);
		else
			report.updateTestLog("verify savings link", "savings link is not displayed", Status.FAIL);

		UIMapHeader_New.savingsLink.click();
		verifyTitleEqualsReport("Find Savings and Deals at Lowe's Home Improvement");

		navigateBack();

		String placeholderText = returnAttributeValue(UIMapHeader_New.searchbox, "placeholder");
		if (placeholderText.equals("What can we help you find today?"))
			report.updateTestLog("verify placeholder text", "palceholder text is right", Status.PASS);
		else
			report.updateTestLog("verify placeholder text", "placeholder text is wrong", Status.FAIL);

		if (isElementDisplayed(UIMapHeader_New.searchicon))
			report.updateTestLog("verify search icon", "search icon is displayed", Status.PASS);
		else
			report.updateTestLog("verify search icon", "search icon is not displayed", Status.FAIL);

		if (isElementDisplayed(UIMapHeader_New.mylowesicon))
			report.updateTestLog("verify mylowes icon", "mylowes icon is displayed", Status.PASS);
		else
			report.updateTestLog("verify mylowesicon", "mylowes icon is not displayed", Status.FAIL);

		action.moveToElement(UIMapHeader_New.mylowesicon).build().perform();
		if (isElementDisplayed(UIMapHeader_New.accountbox))
			report.updateTestLog("verify signup slide", "signup slide is displayed", Status.PASS);
		else
			report.updateTestLog("verify signup slide", "signup slide is not displayed", Status.FAIL);

		String cartcount = getElementText(UIMapHeader_New.cartcount);

		if (cartcount.equals(""))
			report.updateTestLog("verify cart count", "cart is empty", Status.PASS);
		else
			report.updateTestLog("verify cart count", "cart is not empty", Status.FAIL);

		if (isElementDisplayed(UIMapHeader_New.carticon))
			report.updateTestLog("verify cart icon", "cart icon is displayed", Status.PASS);
		else
			report.updateTestLog("verify cart icon", "cart icon is not displayed", Status.FAIL);
		UIMapHeader_New.carticon.click();
		verifyTitleEqualsReport("Shopping Cart");

	}

	/**
	 * This function verifies search bar
	 * 
	 * @throws Exception
	 * @author Dhanalakshmi
	 * @Date 7/24/2019
	 */

	public void verifyHeader_SearchBoxAndcartfunctionality() throws Exception {
		UIMapHeader_New.searchbox.sendKeys("hot water heaters");

		List<WebElement> list = driver.findElements(By.xpath(
				"//ul[@class='js-predictive-suggestion-results predictive-suggestion-results']//following-sibling::li/a"));

		Iterator<WebElement> it = list.iterator();

		while (it.hasNext()) {
			String listtext = it.next().getText().toString();
			if (listtext.contains("Water Heater"))
				report.updateTestLog("verify related search list are displayed", "related seach list are displayed",
						Status.PASS);
			else
				report.updateTestLog("verify related search list are displayed",
						"related search list are not displayed", Status.FAIL);
		}

		List<WebElement> listimag = driver.findElements(By.cssSelector(".predictive-result-image-anchor>img"));

		Iterator<WebElement> itim = listimag.iterator();
		while (itim.hasNext()) {
			if (itim.next().isDisplayed())
				report.updateTestLog("verify images are displayed for each list", "images are displayed for each list",
						Status.PASS);
			else
				report.updateTestLog("verify images are displayed for each list",
						"images are not displayed for each list", Status.FAIL);

		}

		// check cart count for 1 after clicking an item from autocomplete
		// dropdown
		String cartcountbefore = getElementText(UIMapHeader_New.cartcount);
		System.out.println("before" + cartcountbefore);

		list.get(1).click();
		UIMapHeader_New.addtocart.click();
		UIMapHeader_New.closecartpopup.click();
		String cartcountafter = getElementText(UIMapHeader_New.cartcount);
		System.out.println("after" + cartcountafter);
		if (cartcountafter.equals(cartcountbefore))
			report.updateTestLog("verify item is added to cart", "item is not added to cart", Status.FAIL);
		else
			report.updateTestLog("verify item is added to cart", "item is added to cart", Status.PASS);

		UIMapHeader_New.searchbox.click();
		UIMapHeader_New.searchbox.sendKeys("hot water heaters");

		action.sendKeys(Keys.ENTER).build().perform();

		verifyElementTextContains(UIMapHeader_New.searchDetails, "Top results for \"hot water heaters\"");

		navigateBack();

		UIMapHeader_New.searchbox.sendKeys("hot water heaters");

		if (isElementDisplayed(UIMapHeader_New.closesearch))
			report.updateTestLog("verify close button is displayed", "close button is displayed", Status.PASS);
		else
			report.updateTestLog("verify close button is displayed", "close button is not displayed", Status.FAIL);

		UIMapHeader_New.closesearch.click();
		verifyElementTextContains(UIMapHeader_New.closesearch, "");

		UIMapHeader_New.searchbox.sendKeys("");
		String currentTitle = driver.getTitle();
		action.sendKeys(Keys.ENTER).build().perform();
		if (driver.getTitle().equals(currentTitle))
			report.updateTestLog("verify if appln is on same page after user hits enter for empty search field",
					"User is on same page", Status.PASS);
		else
			report.updateTestLog("verify if appln is on same page after user hits enter for empty search field",
					"User is redirected to different page", Status.FAIL);

		// check cart for 2 count
		String cartcountdefault = getElementText(UIMapHeader_New.cartcount);

		System.out.println("before" + cartcountdefault);
		UIMapHeader_New.searchbox.sendKeys("28180");
		action.sendKeys(Keys.ENTER).build().perform();
		UIMapHeader_New.addtocart.click();

		String cartcountadded = getElementText(UIMapHeader_New.cartcount);
		System.out.println("after" + cartcountadded);
		if (cartcountadded.equals(cartcountdefault))
			report.updateTestLog("verify cart count", "item is not added to cart", Status.FAIL);
		else
			report.updateTestLog("verify cart count", "item is added to cart", Status.PASS);
		Thread.sleep(1000);
		UIMapHeader_New.loweslogo.click();

	}

	/**
	 * This function verifies search bar
	 * 
	 * @throws Exception
	 * @author Dhanalakshmi
	 * @Date 7/24/2019
	 */

	public void verifyHeader_signUp() throws Exception {
		action.moveToElement(UIMapHeader_New.mylowesicon).build().perform();

		if (isElementDisplayed(UIMapHeader_New.signinlink))
			report.updateTestLog("verify sign up link is displayed", "sign up link is displayed", Status.PASS);
		else
			report.updateTestLog("verify sign up link is displayed", "sign up link is not displayed", Status.FAIL);

		signin_click();

		verifyTitleEqualsReport("Lowe's Home Improvement | Hardware Store");

		String username = getElementText(UIMapHeader_New.accountName);
		if (username.equals(""))
			report.updateTestLog("verify loggedin user name is displayed", "user name is not displayed", Status.FAIL);
		else
			report.updateTestLog("verify loggedin user name is displayed", "user name is displayed", Status.PASS);
		System.out.println(UIMapHeader_New.accountName.getText());

		UIMapHeader_New.searchbox.sendKeys("28180");
		action.sendKeys(Keys.ENTER).build().perform();

		UIMapHeader_New.addtocart.click();

		UIMapHeader_New.loweslogo.click();

		action.moveToElement(UIMapHeader_New.mylowesicon).build().perform();
		if (isElementDisplayed(UIMapHeader_New.signout))
			report.updateTestLog("verify sign out link is displayed", "sign out link is displayed", Status.PASS);
		else
			report.updateTestLog("verify sign out link is displayed", "sign out link is not displayed", Status.FAIL);

		UIMapHeader_New.signout.click();

		Thread.sleep(3000);
		verifyTitleEqualsReport("Lowe's Home Improvement | Hardware Store");

		String accountname = getElementText(UIMapHeader_New.accountName);

		if (accountname.equals(""))
			report.updateTestLog("verify user name", "user name is empty", Status.PASS);
		else
			report.updateTestLog("verify user name", "user name is not empty", Status.FAIL);

		String before = getElementText(UIMapHeader_New.cartcount);

		System.out.println(before);
		if (before.equals(""))
			report.updateTestLog("verify cart count", "cart is not empty", Status.FAIL);
		else
			report.updateTestLog("verify cart count", "cart is empty", Status.PASS);

		Thread.sleep(3000);
		UIMapHeader_New.loweslogo.click();

	}

	public void verify_Logoincenter() throws InterruptedException {
		signin_click();

		boolean title = verifyTitleContains("Lowe's Home Improvement | Hardware Store");
		System.out.println(title);
		if (title == true) {
			UIMapHeader_New.searchbox.sendKeys("135898");
			action.sendKeys(Keys.ENTER).build().perform();
		} else
			System.out.println("wrong page title");

		UIMapHeader_New.addtocart.click();
		Thread.sleep(2000);
		UIMapHeader_New.carticon.click();

		UIMapHeader_New.checkoutclick.click();

		if (isElementDisplayed(UIMapHeader_New.storeName))
			report.updateTestLog("verify store name is displayed", "store name is  displayed", Status.FAIL);
		else
			report.updateTestLog("verify store name is displayed", "store name is not displayed", Status.PASS);

		if (isElementDisplayed(UIMapHeader_New.searchbox))
			report.updateTestLog("verify search box is displayed", "search box is  displayed", Status.FAIL);
		else
			report.updateTestLog("verify search box is displayed", "search box is notdisplayed", Status.PASS);

		if (isElementDisplayed(UIMapHeader_New.mylowesicon))
			report.updateTestLog("verify mylowes icon", "mylowes icon is  displayed", Status.FAIL);
		else
			report.updateTestLog("verify mylowesicon", "mylowes icon is not displayed", Status.PASS);
		if (isElementDisplayed(UIMapHeader_New.carticon))
			report.updateTestLog("verify cart icon", "cart icon is displayed in delivery summary page", Status.FAIL);
		else
			report.updateTestLog("verify cart icon", "cart icon is not displayed in delivery summary page",
					Status.PASS);

		if (isElementDisplayed(UIMapHeader_New.globalMessage))
			report.updateTestLog("verify global message is displayed", "global message is displayed", Status.FAIL);
		else
			report.updateTestLog("verify global message is displayed", "global message is not displayed", Status.PASS);

		int countx = UIMapHeader_New.loweslogosummary.getLocation().getX();
		int county = UIMapHeader_New.loweslogosummary.getLocation().getY();
		System.out.println(countx);
		System.out.println(county);

		UIMapHeader_New.txtboxOrganisationName.sendKeys("Test");
		UIMapHeader_New.txtGrpNewFirstName.sendKeys("test");
		UIMapHeader_New.txtGrpNewLastName.sendKeys("test");
		UIMapHeader_New.txtGrpNewAddress1.sendKeys("Test Store 6962 Lowe's 509 RIVER HIGHWAY Mooresville, NC  28117");
		UIMapHeader_New.txtGrpNewCity.sendKeys("Mooresville");
		UIMapHeader_New.selGrpNewState.sendKeys("North Carolina");
		UIMapHeader_New.txtGrpNewZipCode.sendKeys("28117");
		UIMapHeader_New.btnUseThisAddress.click();
		UIMapHeader_New.continueButton.click();

		if (isElementDisplayed(UIMapHeader_New.storeName))
			report.updateTestLog("verify store name is displayed", "store name is  displayed payment and review",
					Status.FAIL);
		else
			report.updateTestLog("verify store name is displayed", "store name is not displayed payment and review",
					Status.PASS);

		if (isElementDisplayed(UIMapHeader_New.searchbox))
			report.updateTestLog("verify search box is displayed", "search box is  displayed payment and review",
					Status.FAIL);
		else
			report.updateTestLog("verify search box is displayed", "search box is notdisplayed payment and review",
					Status.PASS);

		if (isElementDisplayed(UIMapHeader_New.mylowesicon))
			report.updateTestLog("verify mylowes icon", "mylowes icon is  displayed payment and review", Status.FAIL);
		else
			report.updateTestLog("verify mylowesicon", "mylowes icon is not displayed payment and review", Status.PASS);

		if (isElementDisplayed(UIMapHeader_New.carticon))
			report.updateTestLog("verify cart icon", "cart icon is displayed payment and review", Status.FAIL);
		else
			report.updateTestLog("verify cart icon", "cart icon is not displayed in payment and review", Status.PASS);

		if (isElementDisplayed(UIMapHeader_New.globalMessage))
			report.updateTestLog("verify global message is displayed", "global message is displayed payment and review",
					Status.FAIL);
		else
			report.updateTestLog("verify global message is displayed",
					"global message is not displayed payment and review", Status.PASS);

		signout_click();

	}

	public void verifyHeader_service() throws InterruptedException {

		signin_click();
		boolean title = verifyTitleContains("Lowe's Home Improvement | Hardware Store");
		System.out.println(title);

		if (title == true) {
			UIMapHeader_New.searchbox.sendKeys("135898");
			action.sendKeys(Keys.ENTER).build().perform();
		} else
			System.out.println("wrong page title");

		if (isElementDisplayed(UIMapHeader_New.storeName))
			report.updateTestLog("verify store name is displayed", "store name is  displayed", Status.FAIL);
		else
			report.updateTestLog("verify store name is displayed", "store name is not displayed", Status.PASS);

		if (isElementDisplayed(UIMapHeader_New.searchbox))
			report.updateTestLog("verify search box is displayed", "search box is  displayed", Status.FAIL);
		else
			report.updateTestLog("verify search box is displayed", "search box is not displayed", Status.PASS);

		if (isElementDisplayed(UIMapHeader_New.mylowesicon))
			report.updateTestLog("verify mylowes icon", "mylowes icon is  displayed", Status.FAIL);
		else
			report.updateTestLog("verify mylowesicon", "mylowes icon is not displayed", Status.PASS);
		if (isElementDisplayed(UIMapHeader_New.carticon))
			report.updateTestLog("verify cart icon", "cart icon is displayed", Status.FAIL);
		else
			report.updateTestLog("verify cart icon", "cart icon is not displayed", Status.PASS);

		if (isElementDisplayed(UIMapHeader_New.globalMessage))
			report.updateTestLog("verify global message is displayed", "global message is displayed", Status.FAIL);
		else
			report.updateTestLog("verify global message is displayed", "global message is not displayed", Status.PASS);

	}

	public void verifyheader_stickymasthead() throws InterruptedException {
		Thread.sleep(2000);
		action.moveToElement(UIMapHeader_New.mylowesicon).build().perform();

		UIMapHeader_New.signinlink.click();
		UIMapHeader_New.userEmailField.sendKeys("test0015@test.com");
		UIMapHeader_New.userPasswordField.sendKeys("Lowes123");
		UIMapHeader_New.signinButton.click();

		Thread.sleep(2000);
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		if (isElementDisplayed(UIMapHeader_New.navbar))
			report.updateTestLog("verify sticky navbar is displayed", "sticky navbar is displayed", Status.FAIL);
		else
			report.updateTestLog("verify sticky navbar is displayed", "sticky navbar is not displayed", Status.PASS);
		Thread.sleep(2000);
		je.executeScript("window.scrollBy(0,-1000)");

		if (isElementDisplayed(UIMapHeader_New.navbar))
			report.updateTestLog("verify sticky navbar is displayed", "sticky navbar is displayed", Status.PASS);
		else
			report.updateTestLog("verify sticky navbar is displayed", "sticky navbar is not displayed", Status.FAIL);

	}

	public void verifyheader_signinlogocenter() {
		action.moveToElement(UIMapHeader_New.mylowesicon).build().perform();
		UIMapHeader_New.signinlink.click();

	}

	public void verifyheader_signuplogocenter() {

	}

}
