package com.lowes.qa.selenium.uimap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class UIMapHeader_New {
	WebDriver driver;
	
	public UIMapHeader_New(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
		
	}

	@FindBy(css=".store-info>a")
	public WebElement welText;
	
	@FindBy(xpath="//a[@class='js-find-a-store']")
	public WebElement findstorelink;
	
	@FindBy(xpath="(//*[@class='js-store-locator-search'])[1]")
	public WebElement storeName;
	
	@FindBy(css=".store-hours")
	public WebElement storeHours;
	
	@FindBy(xpath="//*[contains(@class,'store-hours')]/i[@class='icon-arrow-down']")
	public WebElement downArrow;
	
	@FindBy(xpath="//a[contains(@class,'top-align-bar')]/i")
	public WebElement orderStatusAndicon;
	
	@FindBy(xpath="//*[@class='bar-icon-group']/a")
	public WebElement orderstatusLink;
	
	@FindBy(xpath="//*[@class='bar-icon-group']/a/i[contains(@class,'icon-credit-card')]")
	public WebElement creditcardicon;
	
	@FindBy(xpath="(//div[@class='bar-icon-group']/a)[2]")
	public WebElement creditcardLink;
	
	@FindBy(xpath="//a[@class='strong']/i[contains(@class,'icon-book')]")
	public WebElement weeklyAdAndbookicon;
	
	@FindBy(xpath="(//div[@class='bar-icon-group']/a)[3]")
	public WebElement weeklyAddBoookLink;
	
	@FindBy(xpath="//span[contains(@class,'truncate-store-name')]")
	public WebElement FindaStoreLink;
	
	@FindBy(xpath="//div[@id='store-locator-modal']")
	public WebElement findastorePopUp;
	
	@FindBy(xpath="//div[@class='js-SL-list find-a-store-list']/ul/li[3]")
	public WebElement storClickOnPopUp;
	
	@FindBy(id="search-box")
	public WebElement searchZip;
	
	@FindBy(xpath="//ul[@id='storeList']/li/div")
	public WebElement clickListStores;
	
	@FindBy(xpath="//a[@class='js-store-locator-search']/span")
	public WebElement zipinstore;
	
	@FindBy(id="store-locator-modal")
	public WebElement storelocatorPopup;
	
	@FindBy(xpath="(//button[contains(@class,'js-store-locator-select-store')])[1]")
	public WebElement popupselectstore;
	
	//Verify new masthead - Below Blue Bar Section- Dotcom-Desktop
	@FindBy(xpath="//div[contains(@class,'lowes-logo')]/a")
	public WebElement loweslogo;
	
	@FindBy(css=".lowes-logo>a")
	public WebElement loweslogosummary;
	
	@FindBy(xpath="//button[contains(@class,'btn-search')]")
	public WebElement searchicon;
	
	@FindBy(xpath="//div[@class='nav-dropdown']/a")
	public WebElement shopLink;
	
	@FindBy(xpath="//a[contains(@class,'navigation-item-add') and @title='Services']")
	public WebElement serviceLink;
	
	@FindBy(xpath="//a[contains(@class,'navigation-item-add') and @title='Savings']")
	public WebElement savingsLink;
	
	@FindBy(xpath="//ul[@class='list-horizontal']//following-sibling::li[3]/a")
	public WebElement mylowesicon;
	
	@FindBy(xpath="//a[@class='display-block']")
	public WebElement carticon;
	
	@FindBy(xpath="//span[contains(@class,'cart-count')]")
	public WebElement cartcount;
	
	@FindBy(xpath="//div[contains(@class,'account-dropdown')]")
    public WebElement accountbox;
	
	@FindBy(xpath="//div[contains(@class,'dropdown-content')]")
	public WebElement flyoutmenu;
	
	//Verify new masthead - Search Section  and Cart - Dotcom-Desktop
	@FindBy(id="search-query")
	public WebElement searchbox;
	
	@FindBy(xpath="//*[@class='art-checkorderstatus']")
	public WebElement orderSatusPage;
	
	@FindBy(xpath="//*[@class='title section']/h1")
	public WebElement creditcardpage;
	
	@FindBy(xpath="//input[@placeholder='Search for it here...']")
	public WebElement placeholderforSearchbox;
	
	@FindBy(xpath="//*[contains(@class,'btn-search')]/i")
	public WebElement searchbutton;
	
	@FindBy(xpath="//p[contains(text(),'AquaPower DHE Pro 24 240-Volt 24-kW 1-Year Lim')]")
	public WebElement clickOnItem;
	
	@FindBy(xpath="//*[@class='art-plp-lblh1']")
	public WebElement searchDetails;
	
	@FindBy(xpath="//span[contains(@class,'search-clear')]/button")
	public WebElement clearButton;
	
	@FindBy(xpath="//ul[contains(@class,'js-predictive-suggestion-results')]//following-sibling::li/a")
    public WebElement searchtextlist;
	
	@FindBy(css=".predictive-result-image-anchor>img")
	public WebElement searchimagelist;
	
	@FindBy(xpath="//button[contains(@class,'clear-search')]")
	public WebElement closesearch;
	
	@FindBy(xpath="//button[contains(@class,'js-zip-in-modal-close')]")
	public WebElement closePopup;
	
	@FindBy(xpath="//button[contains(@class,'btn-add')]")
	public WebElement addtocart;
	
	@FindBy(xpath="//button[contains(@class,'art-ac-addCartloseBtn')]")
	public WebElement closecartpopup;
	
	//verify signup page
	
	@FindBy(id="user-email")
	public WebElement userEmailField;
	
	@FindBy(id="user-password")
	public WebElement userPasswordField;
	
	@FindBy(xpath="//button[contains(@class,'js-track-gauge')]")
	public WebElement signinButton;
	
	@FindBy(xpath="//*[@class='guest-menu']/a[2]")
	public WebElement signinlink;
	
	@FindBy(xpath="//ul[@class='list-horizontal']//following-sibling::li[3]/a/div")
	public WebElement accountName;
	
	@FindBy(css=".js-signout")
	public WebElement signout;
	
	@FindBy(xpath="//span[contains(@class,'h1 art-sc-cartEmptymsg')]")
	public WebElement emptycartMessage;
	
	//verify logo displayed at center
	@FindBy(xpath="//button[contains(@class,'js-secure-checkout')]")
	public WebElement checkoutclick;
	
	@FindBy(xpath="//div[contains(@class,'global-message-bar')]")
	public WebElement globalMessage;
	
	@FindBy(xpath="(//*[contains(@class,'art-co-del-diff-comName')])[2]")
	public WebElement txtboxOrganisationName;
	
	@FindBy(css=".art-co-del-diff-fName")
	public WebElement txtGrpNewFirstName;
	
	@FindBy(css=".art-co-del-diff-lName")
	public WebElement txtGrpNewLastName;
	
	@FindBy(css=".art-co-del-diff-addrLine1")
	public WebElement txtGrpNewAddress1;
	
	@FindBy(css=".art-co-del-diff-city")
	public WebElement txtGrpNewCity;
	
	@FindBy(css=".art-co-del-diff-state")
	public WebElement selGrpNewState;
	
	@FindBy(css=".art-co-del-diff-zip")
	public WebElement txtGrpNewZipCode;
	
	@FindBy(css=".art-co-del-diff-useAddressBtn")
	public WebElement btnUseThisAddress;
	
	@FindBy(css=".js-order-continue")
	public WebElement continueButton;
	
	@FindBy(css=".navbar")
	public WebElement navbar;
	
	
	public  final String pageLoadedText = "2018 Lowe's. All rights reserved. Lowe's and the gable design are registered trademarks of LF, LLC";
	
	
	
	
	
	
	

}
