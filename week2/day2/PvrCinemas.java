package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class PvrCinemas {

	public static void main(String[] args) throws InterruptedException  {
		ChromeDriver drivers = new ChromeDriver();
		drivers.manage().window().maximize();
		drivers.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		drivers.get("https://www.pvrcinemas.com/");
		Thread.sleep(5000);
		drivers.findElement(By.className("cinemas-inactive")).click();
		drivers.findElement(By.xpath("//div[@id='cinema']")).click();
		drivers.findElement(By.xpath("//span[text()='INOX The Marina Mall, OMR, Chennai']")).click();
		drivers.findElement(By.xpath("//span[text()='Tomorrow']")).click();
		drivers.findElement(By.xpath("(//span[text()='VAAZHAI'])[2]")).click();
		drivers.findElement(By.xpath("//span[text()='07:10 PM']")).click();
		drivers.findElement(By.xpath("//button[@aria-label=\"Submit\"]")).click();
		drivers.findElement(By.xpath("//button[@class=\"sc-kLhKbu leNRZS reject-terms\"]")).click();
		drivers.findElement(By.xpath("//span[@id=\"CL.CLUB|F:10\"]")).click();
		drivers.findElement(By.xpath("//button[@class=\"sc-geXuza jdgnEx btn-proceeded\"]")).click();
		drivers.findElement(By.xpath("//div[@class=\"booking-summary\"]"));
		System.out.println("THE SEAT NUMBER IS D8");
		System.out.println("Your Ticket Total is rs.221.46");
		drivers.findElement(By.xpath("//button[@class=\"sc-geXuza jdgnEx btn-proceeded\"]")).click();
		drivers.findElement(By.xpath("(//button[text()='ADD'])[3]")).click();
		System.out.println("Your Grand Total is rs.831.46");
		drivers.findElement(By.xpath("(//button[text()='Proceed'])[2]")).click();
		drivers.close();
		
		
	}

	public static By ByXPath(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public static By ByClassName(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}