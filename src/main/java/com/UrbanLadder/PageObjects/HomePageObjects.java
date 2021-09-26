package com.UrbanLadder.PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.UrbanLadder.UiStore.HomePageUi;


public class HomePageObjects {

	WebDriver driver;
	HomePageUi h=new HomePageUi();
	public HomePageObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement SearchBox()
	{
		return driver.findElement(h.searchBox);
	}
	
	public WebElement SearchButton()
	{
		return driver.findElement(h.searchButton);
	}
	
	public WebElement CheckChair()
	{
		return driver.findElement(h.firstChairCheck);
	}
	
	public WebElement ClosePopup()
	{
		return driver.findElement(h.closePopup);
	}
	
	public WebElement Tv()
	{
		return driver.findElement(h.TvUnits);
	}
	
	public WebElement FstTv()
	{
		return driver.findElement(h.firstTv);
	}
	
	public WebElement FstTvName()
	{
		return driver.findElement(h.tvname);
	}
	
	public WebElement GiftCards()
	{
		return driver.findElement(h.gift);
	}
	public WebElement Digitalcards()
	{
		return driver.findElement(h.dc);
	}
	
	public WebElement ClickInsta()
	{
		return driver.findElement(h.insta);
	}
	
	public WebElement GetPosts()
	{
		return driver.findElement(h.posts);
	}
	public WebElement SearchItem()
	{
		return driver.findElement(h.Item);
	}
	public WebElement Addtocart()
	{
		return driver.findElement(h.addcart);
	}
	public WebElement SelectQuantity()
	{
		return driver.findElement(h.quantity);
	}
	public WebElement FinalPrice()
	{
		return driver.findElement(h.price);
	}
	public WebElement ChatFrame()
	{
		return driver.findElement(h.chat);
	}
	public WebElement ClickChatFrame()
	{
		return driver.findElement(h.cchat);
	}
	public WebElement ChatWithBot()
	{
		return driver.findElement(h.chatwithus);
	}
	public WebElement ChattextBox()
	{
		return driver.findElement(h.chattext);
	}
	public WebElement Emailenter()
	{
		return driver.findElement(h.email);
	}
	public WebElement Passwordenter()
	{
		return driver.findElement(h.pass);
	}
	public WebElement TrackOrder()
	{
		return driver.findElement(h.track);
	}
	public WebElement Stores()
	{
		return driver.findElement(h.store);
	}
	public WebElement Morecities()
	{
		return driver.findElement(h.more);
	}
	public WebElement Orderid()
	{
		return driver.findElement(h.orderid);
	}
	public WebElement PhoneNumber()
	{
		return driver.findElement(h.phno);
	}
	public WebElement Sheos()
	{
		return driver.findElement(h.Shoe);
	}
	public WebElement Particularsheo()
	{
		return driver.findElement(h.partisheo);
	}
	public WebElement GetsheoPrice()
	{
		return driver.findElement(h.sheoprice);
	}
	public WebElement GetCheckBox()
	{
		return driver.findElement(h.Checkbox);
	}
	public WebElement GetProductsCount()
	{
		return driver.findElement(h.productCount);
	}
	public WebElement GetStudyTable()
	{
		return driver.findElement(h.StudyTable);
	}
	public WebElement GetHelp()
	{
		return driver.findElement(h.Help);
	}
	public WebElement GetHelpSearch()
	{
		return driver.findElement(h.HelpSearch);
	}
	public List<WebElement> GetHelpSearchQuestions()
	{
		return driver.findElements(h.HelpQs);
	}
	public List<WebElement> GetCities()
	{
		return driver.findElements(h.cities);
	}
	public WebElement Recommended()
	{
		return driver.findElement(h.rec1);
	}
	public WebElement RecommendedLow2High()
	{
		return driver.findElement(h.rec2);
	}
	public WebElement HoverPrice()
	{
		return driver.findElement(h.PriceHover);
	}
	public WebElement SetHoverPrice()
	{
		return driver.findElement(h.setPrice);
	}
}

