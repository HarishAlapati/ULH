package com.UrbanLadder.UiStore;

import org.openqa.selenium.By;

public class HomePageUi {

	public By searchBox=By.id("search");
	public By searchButton=By.id("search_button");
	
	public By closePopup=By.cssSelector("a[data-gaaction=\"popup.auth.close\"]");
	
	public By firstChairCheck=By.cssSelector("img[title=\"Galen Study Chair (Black, Nylon Chair Base)\"]");
	
	public By firstTv=By.xpath("//*[@id=\"content\"]/div[4]/div/ul/li[1]/div/div[5]/a/div[2]/span");
	public By TvUnits=By.cssSelector("a[href=\"/tv-units?src=explore_categories\"]");
	public By tvname=By.cssSelector("a[	title=\"Zephyr Large TV Unit (Teak Finish)\"]");
	
	public By gift=By.cssSelector("a[href=\"../../gift-cards?src=header\"]");
	
	public By dc=By.xpath("//h5[normalize-space()='Digital Cards']");
	
	public By insta=By.className("icofont-social-twitter");
	public By posts=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div[1]/div/div[2]/div/div/div[1]/div/div[5]/div[2]/a/span[1]/span");
	
	public By Item=By.cssSelector("a[data-id=\"94869\"]");
	public By addcart=By.id("add-to-cart-button");
	public By quantity=By.id("select_0_quantity");
	public By price=By.className("final-price");
	
	public By chat=By.id("fc_widget");
	public By cchat=By.className("icon-ic_chat_icon");
	public By chatwithus=By.className("channel-name");
	public By chattext=By.id("app-conversation-editor");
	
	public By email=By.id("spree_user_email");
	public By pass=By.id("spree_user_password");
	
	public By track=By.cssSelector("[href=\"/orders?src=track-order\"]");
	public By orderid=By.name("orderNumber");
	public By phno=By.name("phoneNumber");
	
	public By store=By.xpath("//*[@id=\"header\"]/section/div/ul[2]/li[1]/a");
	public By more=By.cssSelector("[href=\"/locations?src=footer\"]");
	
	public By Shoe=By.cssSelector("[href=\"/shoe-rack?src=explore_categories\"]");
	public By partisheo=By.cssSelector("[title=\"Webster Shoe Cabinet With Lock (Walnut Finish, 32 Pair Capacity)\"]");
	public By sheoprice=By.xpath("//*[@id=\"content\"]/div[4]/div/ul/li[1]/div/div[3]/a/div[2]/span");
	
	public By Checkbox=By.cssSelector("[id=\"filters_availability_In_Stock_Only\"]");
	
	public By productCount=By.cssSelector("[class=\"results-count\"]");
	
	public By StudyTable=By.cssSelector("[href=\"/study-table?src=explore_categories\"]");
	
	public By Help=By.cssSelector("[href=\"/help?src=g_footer\"]");
	public By HelpSearch=By.id("help-center-search-input");
	public By HelpQs=By.cssSelector(".col-sm-11.col-md-11.col-lg-11.text");
	
	public By cities=By.cssSelector(".col-lg-3.col-sm-6.location__taxon__state");
	
	public By rec1=By.xpath("//*[@id=\"search-results\"]/div[2]/div[1]/div/div/div/div/div[2]/div[1]");
	public By rec2=By.xpath("//*[@id=\"search-results\"]/div[2]/div[1]/div/div/div/div/div[2]/div[2]/div/div/ul/li[2]");
	
	public By PriceHover=By.cssSelector("[data-group=\"price\"]");
	public By setPrice=By.xpath("//*[@id=\"price_limit_10000-47200\"]");
	
}
