package Day_6_Day_7_Day_8;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Take_Screenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.roboform.com/filling-test-all-fields");
		
		Thread.sleep(3000);
		
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(f, new File("C:\\Users\\TUF Gaming F15\\Desktop\\ss\\Image1.png"));
			
		
		
		
	}

}
