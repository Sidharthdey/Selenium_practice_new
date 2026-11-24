package Day_6_Day_7_Day_8;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyboard_actions {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vinothqaacademy.com/demo-site-keyboard-events/");

		Thread.sleep(3000);
		
		//Whenever we need to perform keyboard actions we will use Robot class
		
		
		driver.findElement(By.id("vts-search")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("vts-search")).sendKeys("JavaScript");
		Thread.sleep(3000);
		
		Robot tikki = new Robot();
		tikki.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		tikki.keyPress(KeyEvent.VK_ENTER);
		
		
		

	}

}
