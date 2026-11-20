package Day_4_Day_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload_a_file {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testing.qaautomationlabs.com/file-upload.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		// path 1 : desktop : \\Desktop
		// path 2 : file name : \\8-bit City_1920x1080
		// path 3 : extensions : \\.jpg
		

		driver.findElement(By.id("fileInput")).sendKeys("C:\\Users\\TUF Gaming F15\\Desktop\\8-bit City_1920x1080.jpg");
		
	}

}
