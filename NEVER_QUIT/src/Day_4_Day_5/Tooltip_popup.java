package Day_4_Day_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltip_popup {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dribbble.com/search/tooltip-on-hover");
		
		//THIS WON'T WORK BECAUSE COULDN'T FIND A WEBSITE TO CHECK
		String attValue = driver.findElement(By.xpath("//a[@href='/search/shots/popular/?q=tooltip-on-hover']")).getAttribute("title");
		System.out.println(attValue);
		
		
		
		
	}

}
