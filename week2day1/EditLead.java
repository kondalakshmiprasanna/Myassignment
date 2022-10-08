package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//open a chrome browser
		ChromeDriver driver = new ChromeDriver();
		//load the url to test
		driver.get("http://leaftaps.com/opentaps/control/login");
		//maximize the browser
		driver.manage().window().maximize();
		//find an element
		WebElement elementUsername = driver.findElement(By.id("username"));
		// action on the element found
		elementUsername.sendKeys("Demosalesmanager");
		
		WebElement elementPassword = driver.findElement(By.id("password"));
		
		elementPassword.sendKeys("crmsfa");
		
		WebElement elementlogin = driver.findElement(By.className("decorativeSubmit"));
		
		elementlogin.click();
		
		WebElement elementCRMlink =driver.findElement(By.linkText("CRM/SFA"));
		
		elementCRMlink.click();
		
		WebElement elementLeads =driver.findElement(By.linkText("Leads"));
		
		elementLeads.click();

		WebElement elementCreateLeads =driver.findElement(By.linkText("Create Lead"));
		
		elementCreateLeads.click();
		
		WebElement elementcompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		
		elementcompanyName.sendKeys("AnjammaEnterprise");
		
		WebElement elementForeName = driver.findElement(By.id("createLeadForm_firstName"));
		
		elementForeName.sendKeys("Anjamma");
		
		WebElement elementSurName = driver.findElement(By.id("createLeadForm_lastName"));
		
		elementSurName.sendKeys("Konda");
		
		WebElement elementFirstName = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		
		elementFirstName.sendKeys("Anjani");
		
		WebElement elementDepartment = driver.findElement(By.id("createLeadForm_departmentName"));
		
		elementDepartment.sendKeys("Executive");
		
		WebElement elementDescription = driver.findElement(By.id("createLeadForm_description"));
		
		elementDescription.sendKeys("Event Management company");
		
		WebElement elementEmail = driver.findElement(By.id("createLeadForm_primaryEmail"));
		
		elementEmail.sendKeys("anjama.events@gmail.com");
		
		WebElement elementCreateLead =driver.findElement(By.className("smallSubmit"));
		
		elementCreateLead.click();
		
		WebElement elementEdit =driver.findElement(By.linkText("Edit"));
		
		elementEdit.click();
		
		WebElement elementEditDescription = driver.findElement(By.id("updateLeadForm_description"));
		
		elementEditDescription.clear();
		
		elementEditDescription.sendKeys("Events& catering Management company");

		WebElement elementupdateLead =driver.findElement(By.className("smallSubmit"));
		
		elementupdateLead.click();
		
		String title = driver.getTitle();
		
		System.out.println(title);

	}

}
