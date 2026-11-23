package Day_4_Day_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS_alert_and_prompt_popup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://qaautomationlabs.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.findElement(By.linkText("Testing")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[text()='JavaScript Alert']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(), 'Show Confirm')]")).click();

		// The alert we are using returns an alert -- is is not mandatory though to create an object for the alerts
		//Alert alt = driver.switchTo().alert();
		
		driver.switchTo().alert().dismiss(); // dismiss() is used to click on cancel
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(), 'Show Confirm')]")).click();
		
		driver.switchTo().alert().accept(); // accept() is used to click on OK
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(), 'Show Confirm')]")).click();


		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(), 'Show Confirm')]")).click();
		Thread.sleep(3000);
		String tex = driver.switchTo().alert().getText(); // getText() is used to get the text
		System.out.println(tex);
		driver.switchTo().alert().accept();

			
		//PROMPT POPUP EXAMPLE
		//driver.switchTo().alert().sendKeys("TYPE ANYTHING YOU WANT TO WRITE");
	}

}
