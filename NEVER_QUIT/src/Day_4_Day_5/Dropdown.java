package Day_4_Day_5;

import org.openqa.selenium.By;                          //dropdown //ByVisibleText
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.roboform.com/filling-test-all-fields");
		
		//selectByVisibleText("One");
		//selectByIndex("2");
		//selectByValue(6);
		//getOptions();
		//deSelectAll();
		

	/*   Select - org.openqa.selenium.support.ui **select this
		 identify the element using name, xpath or id whatever you want. Then paste it  inside the webelement of the Select
		 select has properties like ByVisibileText, ByVisibleIndex, etc. assign the properties with the object */
		Select se = new Select(driver.findElement(By.name("40cc__type")));
		se.selectByVisibleText("Master Card");

		/* OR ELSE YOU CAN ALSO USE LIKE THIS --
		   WebElement this_obj = driver.findElement(By.name("40cc__type"));
		   Select se = new Select(this_obj);
		   se.selectByVisibleText("Master Card"); */
	}

}
     