package org.test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\JAI KUMAR\\eclipse-workspace\\Navigate\\Driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.facebook.com/login/");
		
		WebElement btnforgate = driver.findElement(By.xpath("//a[@class='_97w4']"));
		btnforgate.click();
		
		driver.navigate().back();
		
	    //driver.navigate().forward();
		
		//driver.navigate().refresh();
		System.out.println("hi this murali");
		
		
	}

}
