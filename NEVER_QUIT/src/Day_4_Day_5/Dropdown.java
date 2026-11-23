package Day_4_Day_5;

import org.openqa.selenium.By;                          //dropdown //ByVisibleText
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qaautomationlabs.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Testing")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@href, 'select-dropdown.php')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(), 'Selenium')]")).click();
		Thread.sleep(3000);
		//selectByVisibleText("One");
		//selectByIndex("2");
		//selectByValue(6);
		//getOptions();
		//deSelectAll();
			
	/*   Select - org.openqa.selenium.support.ui **select this
		 identify the element using name, xpath or id whatever you want. Then paste it  inside the webelement of the Select
		 select has properties like ByVisibileText, ByVisibleIndex, etc. assign the properties with the object */
		WebElement wee = driver.findElement(By.xpath("//select[contains(@id, 'fruitDropdown')]"));
		Select se = new Select(wee);
		se.selectByVisibleText("Apple");
		Thread.sleep(3000);
		se.selectByValue("Banana");
		
		
		/* OR ELSE YOU CAN ALSO USE LIKE THIS --
		   WebElement this_obj = driver.findElement(By.name("40cc__type"));
		   Select se = new Select(this_obj);
		   se.selectByVisibleText("Master Card"); */
		
		JavascriptExecutor hinje1 = (JavascriptExecutor)driver;
		hinje1.executeScript("window.scrollBy( 0 , 400)");
		
		WebElement wee1 = driver.findElement(By.xpath("//select[contains(@id, 'countryDropdown')]"));
		Select se2 = new Select(wee1);
		se2.selectByVisibleText("India");
		driver.findElement(By.xpath("//button[contains(text(), 'First Selected')]")).click();
		Thread.sleep(3000);
		se2.selectByValue("Canada");
		Thread.sleep(3000);
		se2.selectByIndex(3);
		Thread.sleep(3000);
		se2.deselectAll();
		driver.findElement(By.xpath("//button[contains(text(), 'Last Selected')]")).click();
		
		
		
	}

}
     