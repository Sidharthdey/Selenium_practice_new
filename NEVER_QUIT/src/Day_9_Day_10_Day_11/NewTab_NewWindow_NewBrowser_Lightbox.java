package Day_9_Day_10_Day_11;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTab_NewWindow_NewBrowser_Lightbox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://vinothqaacademy.com/multiple-windows/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("New Browser Tab Link")).click();
		
		Set<String> rackon = driver.getWindowHandles();
		
		Iterator<String> hell = rackon.iterator();
		
		String test_me = hell.next(); //This is the parent window
		String no_me = hell.next();  //This is the child window
		
		System.out.println(test_me);
		System.out.println(no_me);
		
		driver.switchTo().window(no_me);  //We have to switch to the child window to perform action in it
		driver.findElement(By.id("nameInput")).sendKeys("Sidharth Dey");
		Thread.sleep(3000);
		driver.switchTo().window(no_me).close();
		
		driver.switchTo().window(test_me); // We have to switch back to the parent window if we want to perform action in it
										   // Without switching we cannot perform action
	
	}
	

}
