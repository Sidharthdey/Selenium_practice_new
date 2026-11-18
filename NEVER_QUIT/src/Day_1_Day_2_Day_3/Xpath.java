package Day_1_Day_2_Day_3;

import org.openqa.selenium.By;                             // xpath using contains text function        // gettext()
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://interndoor.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		// xpath using contains text function
		driver.findElement(By.xpath("//a[contains(text(), 'Sign in')]")).click();
		Thread.sleep(3000);

		// gettext() function //output - What your account keeps
		WebElement kyun_obj = driver.findElement(By.xpath("//h2[contains(text(), 'What your account keeps')]"));
		String actual_res = kyun_obj.getText();
		System.out.println(actual_res);
		
		
		//for actual result and expected result we can use if else condition
		//THIS IS A VALIDATION PROCESS
		if (actual_res.equals("What your account keeps")) {

			System.out.println("Test case pass");
		}

		else {
			System.out.println("Test case fail");
		}

	}

}
