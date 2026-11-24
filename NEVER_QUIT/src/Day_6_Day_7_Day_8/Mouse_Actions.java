package Day_6_Day_7_Day_8;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Actions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vinothqaacademy.com/mouse-event/");
		
		Thread.sleep(3000);
		
		//Whenever we need to perform keyboard actions we will use action class
		
		// DOUBLE CLICK

		Actions double_1 = new Actions(driver);
		WebElement raven = driver.findElement(By.id("doubleBtn"));
		double_1.doubleClick(raven).perform();
		Thread.sleep(3000);
		
		JavascriptExecutor she = (JavascriptExecutor) driver;
		she.executeScript("window.scrollBy(0,800)");
		Thread.sleep(3000);

		// DRAG AND DROP

		Actions see22 = new Actions(driver);
		WebElement drag = driver.findElement(By.id("dragItem"));
		WebElement drop = driver.findElement(By.id("dropZone"));
		see22.dragAndDrop(drag, drop).perform();

		// MOUSE HOVER

		Actions any1 = new Actions(driver);
		WebElement cool_one = driver.findElement(By.id("tooltipTarget"));
		any1.moveToElement(cool_one).perform();
		Thread.sleep(3000);
		

		/*
		 * Actions Class---- Introduction to Actions class moveToElement()---- Move the
		 * mouse pointer over an element click()---- Perform a mouse left-click
		 * doubleClick()----- Perform a double-click contextClick()----- Perform a
		 * right-click clickAndHold()----------- Click and hold an element
		 * release()--------------- Release the pressed mouse button
		 * dragAndDrop()----------------- Drag an element and drop it onto another
		 * element dragAndDropBy()---------------- Drag an element by specific X and Y
		 * coordinates moveByOffset()------------ Move the mouse pointer by specific
		 * coordinates build()------------- Combine multiple actions into a single
		 * action sequence perform()------------------ Execute the mouse action
		 * pause()------------- Pause between mouse actions
		 * perform()-------------	Execute the mouse action
		 */

	}

}
