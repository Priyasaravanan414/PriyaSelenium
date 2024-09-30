package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooklogin {

	public static void main(String[] args) {

		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//To load the url
		driver.get("https://www.facebook.com/");
		
				
		WebElement usernameField = driver.findElement(By.id("email"));
		
		//To enter value of the usernameFiled --> WebElement.sendKeys();
		usernameField.sendKeys("priya87.as@yahoo.com");

		//Locate the password field and enter the password as crmsfa
		driver.findElement(By.id("password")).sendKeys("Aditya@414");
		
		//Locate the login button and click on the login button
		driver.findElement(By.className("Submit")).click();
		//Locate the CRM/SFA link and click
		driver.findElement(By.linkText("CRM/SFA")).click();
		}

		}


