package Day_6_Day_7_Day_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Mouse_hover {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_4uhrie6xi7_e&adgrpid=155259814713&hvpone=&hvptwo=&hvadid=831286012526&hvpos=&hvnetw=g&hvrand=6497073286183040655&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9252915&hvtargid=kwd-776851800707&hvcampaign=20577402623&hydadcr=5619_2525671&mcid=11c0c69d7e1c3f8b89596be6ab98a91e&hvocijid=6497073286183040655--&hvexpln=nav&gad_source=1");
		Thread.sleep(3000);
		
		Actions actions = new Actions(driver);
		WebElement we = driver.findElement(By.id("nav-link-accountList"));
		
		actions.moveToElement(we).perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(@href, 'yout_ya')]")).click();
		
	
	}

}
