package com.UrbanLadder.Runner;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.UrbanLadder.PageObjects.HomePageObjects;
import com.UrbanLadder.ResuableComponents.Base;
import com.UrbanLadder.ResuableComponents.ReusableMethods;
import com.UrbanLadder.Utilities.ExcelReader;
import com.UrbanLadder.Utilities.PropertyFileReader;

public class AllTestcases extends Base{

	@BeforeMethod
	public void in() throws IOException
	{
		driver=initializedriver();
		ReusableMethods.Implicitwait(driver);
		OpenUrl();
	}
	@Test(priority=0)
	public void SearchForItem() throws IOException, InterruptedException
	{
		
		HomePageObjects hpo= new HomePageObjects(driver);
		hpo.ClosePopup().click();
		Thread.sleep(5000);
		hpo.SearchBox().sendKeys("Chair");
		hpo.SearchButton().click();
		
		if(hpo.CheckChair().isDisplayed()) {
		System.out.println("Chair Present"+hpo.CheckChair());
		logger.info("Chair Present"+hpo.CheckChair());
		}
		else
		{
			System.out.println("Chair not present");
			logger.info("Chair not present");
		}

	}
	
	@Test(priority=1)
	public void GetCities() throws IOException, InterruptedException
	{
		
		HomePageObjects hpo= new HomePageObjects(driver);
		hpo.ClosePopup().click();
		Thread.sleep(5000);
		hpo.Morecities().click();
		String mainWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        Iterator<String> iterator = allWindowHandles.iterator();
        for(String handle: allWindowHandles)
        {
            if(!handle.equals(mainWindowHandle)) 
            {
            driver.switchTo().window(handle);
            System.out.println(" "+driver.getTitle());
          int ss=driver.findElements(By.cssSelector(".col-lg-3.col-sm-6.location__taxon__state")).size();
            System.out.println("No of delivering  states : "+ss);
            logger.info("No of delivering  states : "+ss);
            List<WebElement> allLinks=driver.findElements(By.cssSelector(".col-lg-3.col-sm-6.location__taxon__state"));
            for(WebElement link:allLinks) {
            	System.out.print(link.getText()+",");
            	logger.info(link.getText()+",");
            }
            }
	}
       
	}
	
	@Test(priority=2)
	public void TvPrice() throws IOException, InterruptedException
	{
		
		HomePageObjects hpo= new HomePageObjects(driver);
		hpo.ClosePopup().click();
		Thread.sleep(5000);
		hpo.Tv().click();
		System.out.println("Tv name  :"+hpo.FstTvName().getAttribute("title"));
		logger.info("Tv name  :"+hpo.FstTvName().getAttribute("title"));
		System.out.println("Tv Price  :"+hpo.FstTv().getText());
		logger.info("Tv Price  :"+hpo.FstTv().getText());
	
	}
	
	@Test(priority=4)
	public void VerifyGiftCard() throws IOException, InterruptedException
	{
		
		HomePageObjects hpo= new HomePageObjects(driver);
		hpo.ClosePopup().click();
		Thread.sleep(5000);
		hpo.GiftCards().click();
		if(hpo.Digitalcards().isDisplayed())
		{
			System.out.println("Digital cards is present");
			logger.info("Digital cards is present");
		}
		else
		{
			System.out.println("Digital cards is not present");
			logger.error("Digital cards is not present");
		}
		
	}
	

	@Test(priority=3)
	public void GetTwitterFollowers() throws IOException, InterruptedException
	{
		
		HomePageObjects hpo= new HomePageObjects(driver);
		hpo.ClosePopup().click();
		Thread.sleep(5000);
		hpo.ClickInsta().click();
		String mainWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        Iterator<String> iterator = allWindowHandles.iterator();
        for(String handle: allWindowHandles)
        {
            if(!handle.equals(mainWindowHandle)) 
            {
            driver.switchTo().window(handle);
            System.out.println(" "+driver.getTitle());
            logger.info(" "+driver.getTitle());
            System.out.println("Twitter Followers Count : "+hpo.GetPosts().getText());
            logger.info("Twitter Followers Count : "+hpo.GetPosts().getText());
            }
        }
      
	}
	
	@Test(priority=5)
	public void CheckoutItem() throws IOException, InterruptedException
	{
		
		HomePageObjects hpo= new HomePageObjects(driver);
		hpo.ClosePopup().click();
		Thread.sleep(5000);
		hpo.SearchBox().sendKeys("Sofa");
		hpo.SearchButton().click();
		hpo.SearchItem().click();
		hpo.Addtocart().click();
		int n=2;
		for(int i=1;i<n;i++) {
		hpo.SelectQuantity().sendKeys(Keys.ARROW_DOWN);
		}
		hpo.SelectQuantity().sendKeys(Keys.ENTER);
		System.out.println("Final Price For quantity "+n+" :"+hpo.FinalPrice().getText());
		logger.info("Final Price For quantity "+n+" :"+hpo.FinalPrice().getText());
		
	}
	
	@Test(priority=6)
	public void ChatSupportCkeck() throws IOException, InterruptedException
	{
	
		HomePageObjects hpo= new HomePageObjects(driver);
		hpo.ClosePopup().click();
		Thread.sleep(5000);
		driver.switchTo().frame(hpo.ChatFrame());
		Thread.sleep(15000);
		hpo.ClickChatFrame().click();
		Thread.sleep(15000);
		hpo.ChatWithBot().click();
		hpo.ChattextBox().sendKeys("Hello");
		hpo.ChattextBox().sendKeys(Keys.ENTER);
		driver.switchTo().defaultContent();
		logger.info("Chat ok");
		
	}
	
	@Test(priority=7)
	public void NoOfLinksinStoresPage() throws IOException, InterruptedException
	{
		
		HomePageObjects hpo= new HomePageObjects(driver);
		hpo.ClosePopup().click();
		Thread.sleep(5000);
		hpo.Stores().click();
		System.out.println("No of links in stores page : "+driver.findElements(By.tagName("a")).size());
		logger.info("No of links in stores page : "+driver.findElements(By.tagName("a")).size());
	}
	
	@Test(dataProvider="getData",priority=8)
	public void TrackOrder(String ordi,String Phno) throws IOException, InterruptedException
	{
		
		HomePageObjects hpo= new HomePageObjects(driver);
		hpo.ClosePopup().click();
		Thread.sleep(5000);
		hpo.TrackOrder().click();
		hpo.Orderid().sendKeys(ordi);
		hpo.PhoneNumber().sendKeys(Phno);
		logger.info("details entered");
	}
	
	@DataProvider
	public Object[][] getData() throws IOException
	{
		prop=PropertyFileReader.LoadFile();
		String p=prop.getProperty("path");
		String file=prop.getProperty("fileName");
		String sheet=prop.getProperty("sheetName");
		Object[][] data=ExcelReader.readExcel(p,file,sheet);
		
		return data;
	}
	
	@Test(priority=9)
	public void SelectRecommendations() throws IOException, InterruptedException
	{
		
		HomePageObjects hpo= new HomePageObjects(driver);
		hpo.ClosePopup().click();
		Thread.sleep(5000);
		hpo.SearchBox().sendKeys("Chair");
		hpo.SearchButton().click();
		  Actions action = new Actions(driver);
		  action.moveToElement(hpo.Recommended()).perform();
		  action.moveToElement(hpo.RecommendedLow2High()).click().perform();
		  logger.info("Selected low 2 high");

	}
	@AfterMethod
	public void closeDriverM()
	{
		logger.info("driver closed");
		driver.quit();
		
	}
}
