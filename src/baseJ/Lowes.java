package baseJ;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Lowes {
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dbc\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://dev0015.d.lowes.com/");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//button[@class='close'])[2]")).click();
		
		//boolean text=driver.findElement(By.xpath("//a[@class='strong']/i[@class='icon-credit-card hide-tablet hide-mobile']")).isDisplayed();
		//System.out.println(text);
		
		//String credit=driver.findElement(By.xpath("(//a[@class='strong'])[2]")).getText();
	//	System.out.println(credit);
		
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@class='bar-icon-group']/a")).click();
		//if(driver.getTitle().equals("Check Order Status"))
		//	System.out.println("redirected successfully");
		//else
		//	System.out.println("wrong xpath");
		
		//driver.navigate().back();
		//Thread.sleep(2000);
		/*driver.findElement(By.id("search-query")).sendKeys("hot water heaters");
		System.out.println(driver.findElement(By.id("search-query")).getAttribute("placeholder"));
		Actions action=new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
		
		String produ=driver.findElement(By.xpath("//*[@class='art-plp-lblh1']")).getText();
		if(produ.equals("Top results for \"hot water heaters\""))
			System.out.println("true");
		else
			System.out.println("false");*/
		
		
		/*driver.navigate().back();
		
		driver.findElement(By.xpath("//span[@class='input-group-btn input-group-icon-btn search-clear']/button")).click();
		driver.findElement(By.id("search-query")).sendKeys("hot water heaters");
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='js-predictive-suggestion-results predictive-suggestion-results']//following-sibling::li/a"));
		
		Iterator<WebElement> it = list.iterator();
			
			while(it.hasNext())
			{
				String listtext=it.next().getText().toString();
				if(listtext.contains("Water Heater"))
					System.out.println("related search");
				else
					System.out.println("not related search");
			}
		
		/*List<WebElement> listimag = driver.findElements(By.cssSelector(".predictive-result-image-anchor>img"));
		int countimg=listimag.size();
		System.out.println("imagecount"+countimg);
		Iterator<WebElement> itim = listimag.iterator();
		while(itim.hasNext())
		{
		if(itim.next().isDisplayed())
			System.out.println("image tag is present");
		else 
			System.out.println("image is not present");
		
		}*/
		
		
	/*	String text=driver.findElement(By.xpath("(//div[@class='navigation-menu']/a)[2]")).getAttribute("href");
		
		System.out.println(text);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@class='navigation-menu']/a)[2]")).click();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		if(text.equals(url))
			System.out.println("passs");
		else
			System.out.println("fail");
		


		
		String[] str=text.split("/");
		
		System.out.println("speci"+str[4]);
		
		for(String pri:str)
			System.out.println("some:"+pri);*/
		
//		Thread.sleep(2000);
//		WebElement ele = driver.findElement(By.xpath("(//ul[@class='list-horizontal']//following-sibling::li[3]/a)[1]"));
//		Actions action=new Actions(driver);
//		action.moveToElement(ele).build().perform();
//		
//		driver.findElement(By.xpath("//*[@class='guest-menu']/a[2]")).click();
//		driver.findElement(By.id("user-email")).sendKeys("test0015@test.com");
//		driver.findElement(By.id("user-password")).sendKeys("Lowes123");
//		driver.findElement(By.xpath("//button[contains(@class,'js-track-gauge')]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.id("search-query")).sendKeys("28180");
//		
//		action.sendKeys(Keys.ENTER).build().perform();
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("//button[contains(@class,'btn-add')]")).click();
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//a[@class='display-block']")).click();
//		System.out.println("this is count"+driver.findElement(By.xpath("//span[@class='cart-count']")).getText());
//		
//		System.out.println("---------------------");
//		
//		
//		
//		
//		driver.findElement(By.xpath("//button[contains(@class,'js-secure-checkout')]")).click();
//		
//		int logox=driver.findElement(By.xpath("//div[contains(@class,'lowes-logo')]/a")).getLocation().getX();
//		int logoy=driver.findElement(By.xpath("//div[contains(@class,'lowes-logo')]/a")).getLocation().getY();
//		
//		System.out.println(logox);
//		System.out.println(logoy);
		
//		 Dimension coun = driver.manage().window().getSize();
//		 System.out.println(coun.getHeight());
//		 System.out.println(coun.getWidth());
//		 
//		 int width = coun.getWidth();
//		 int div=width/2;
//		 System.out.println(div);
		 //action.moveByOffset(xOffset, yOffset)		
		//driver.findElement(By.xpath("(//*[@class='js-store-locator-search'])[1]")).sendKeys(Keys.ENTER);
		/*JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("document.getElementsByClassName('js-store-locator-search')[0].click();");*/
		
		
		
		
		JavascriptExecutor je=(JavascriptExecutor)driver;
		je.executeScript("window.scrollTo(0,document.body.scrollHeight)");	
		
		WebElement ele = driver.findElement(By.xpath("//span[@class='js-the-game-is-up']"));
		
		Actions action=new Actions(driver);
		action.moveToElement(ele).doubleClick().build().perform();

		
		
	}

}
