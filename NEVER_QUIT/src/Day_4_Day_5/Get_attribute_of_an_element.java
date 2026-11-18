package Day_4_Day_5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_attribute_of_an_element {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://interndoor.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.id("q")).sendKeys("QA engineer");
		Thread.sleep(3000);
		driver.findElement(By.id("tab-fulltime")).click();
		Thread.sleep(3000);
		JavascriptExecutor java_pop = (JavascriptExecutor)driver;
		java_pop.executeScript("window.scrollBy( 0 , 400)");
		
		
		//href is the attribute value. Instead of href if we add some other attribute like class then the value of the class will be the output
		String attValue = driver.findElement(By.xpath("//a[text()='Apply']")).getAttribute("href");
		System.out.println(attValue);
		
		
	}

}
