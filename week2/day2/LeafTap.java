package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafTap {

	public static void main(String[] args) {

		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//To load the url
		driver.get("http://leaftaps.com/opentaps");
				
		WebElement usernameFiled = driver.findElement(By.id("username"));
		//To enter value of the usernameFiled --> WebElement.sendKeys();
		usernameFiled.sendKeys("demosalesmanager");

		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Priya");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Saravanan");

		
		WebElement sourceWE = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		Select sourceDD = new Select(sourceWE);
		sourceDD.selectByIndex(7);// Select by using index , index starts from zero

		
		WebElement campaignWE = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select campaignDD = new Select(campaignWE);
		campaignDD.selectByValue("9000");

		
		WebElement industryWE = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select industryDD = new Select(industryWE);
		industryDD.selectByVisibleText("Computer Software");


		
		driver.findElement(By.className("smallSubmit")).click();
		String leadId = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(leadId);
		
		String title = driver.getTitle();
		System.out.println(title);
		}

		}