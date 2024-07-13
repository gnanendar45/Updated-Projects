package com.ReusableFunctions;

import java.io.File;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.BaseClass.Library;

import io.cucumber.java.Scenario;


public class SeleniumReusable extends Library{
	
	Actions act;
	 public SeleniumReusable(WebDriver driver) {
		 this.driver=driver;
	 }
	


	//Enter the text element
	 public void EnterValue(WebElement element,String Text) {
		 try
		 {
			 element.sendKeys(Text);
		 
		 }
		 catch(Exception e) {
			 
		 
		 System.out.println("No such element Exception");
		 }
	 }
	 // click the element
	 public void click(WebElement element) {
		 try {
			 element.click();
		 }
		 catch(Exception e) {
			 System.out.println("No such element Exception");
		 }
	 }
	 //Get the title of the page
	 public void getTitle() {
		 try {
			 System.out.println(driver.getTitle());
		 }
		 catch(Exception e) {
			 System.out.println("couldnt get the title");
		 }
	 }
	 //take the screenshot
	 public void screenshot(String path) {
		 TakesScreenshot TS= (TakesScreenshot)driver;
		 File source=TS.getScreenshotAs(OutputType.FILE);
		 
		 try {
			 FileUtils.copyFile(source, new File(path));
			 
		 }
		 catch(Exception e) {
			 System.out.println("Screenshot not found");
		 }
	 }
	 
	 public void MultipleGettext(List<WebElement> element) {
		 List<WebElement> text=element;
		 System.out.println(text.size());
		 
		 for(WebElement textcount:text) {
			 String Totalist=textcount.getText();
			 System.out.println("*******************************");
			 System.out.println(Totalist);
		 }
	 }
	 
	 public void Getvalue(WebElement element) {
		 String Text=element.getText();
		 System.out.println(Text);
	 }
	 
	 public void Dropdown(WebElement element, String Text) {
		 
		 Select drp=new Select(element);
		 drp.selectByValue(Text);
		 
	 }
	 
	 public void Scrolldown(WebElement element) {
		// JavascriptExecutor js=(JavascriptExecutor)driver;
		 //js.executeScript("arguments(0).click()", element);
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].scrollIntoView(true); arguments[0].click();", element);
	 }
	 
	 public void waits() throws InterruptedException {
		 Thread.sleep(2000);
	 }
	 
	 public void moucehover(WebElement element) throws InterruptedException {
		 act=new Actions(driver);	
		 Thread.sleep(2000);
		 act.moveToElement(element).build().perform();
	 }
	 
	 public void movelement(WebElement element) {
		act.moveToElement(element).click().build().perform();
	 }
	 
	 public void screenshot1(String path) {
		 TakesScreenshot ts=(TakesScreenshot)driver;
		 File source=ts.getScreenshotAs(OutputType.FILE);
		 try {
			 FileUtils.copyFile(source, new File(path));
		 }
		 catch(Exception e) {
			 System.out.println("couldnt take screenshot");
		 }
	 }
	 
	 public void windowhandlink(WebElement element) throws InterruptedException {
		 String parrentwindow=driver.getWindowHandle();
		 Thread.sleep(2000);
		 element.click();
		 System.out.println(parrentwindow);
		 
		 Set<String>allwindow=driver.getWindowHandles();
		 System.out.println(allwindow.size());
		 for(String Childwindow:allwindow) {
			 driver.switchTo().window(Childwindow);
			 System.out.println(Childwindow);
		 }
	 }
	 
	 public void attachscreenshot(Scenario CucumberScenario) {
		 final byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		 CucumberScenario.attach(screenshot, "flipkart/png", "FlipkartAutomation");
	 }
	 
	 public void closeapp() {
			driver.close();
			System.out.println("Browser closed");
		}

}	
