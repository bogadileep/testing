import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebooktest {
  
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("Webdriver.chrome.driver", "I:\\driver\\chroedriver.exe");
		
		
		
		driver = new ChromeDriver();
		driver.manage().window().maximize()	;
		
		driver.get("https://www.facebook.com/?stype=lo&jlo"
				+ "u=AfdAznmw74qXYj3T_jWng4XjkVTKQI7sZ9oJ_2c4TZNfru6"
				+ "pAiWjBQncIpb35c_c2_V6GgXu6c9iTozWqKuvdv-CaTsRclJQGADKuOEPjFNjoQ&s"
				+ "muh=47358&lh=Ac9fDPXaNtEC-E5oB2g");
		
		Thread.sleep(3000);
		

		driver.findElement(By.id("email")).sendKeys("9908584722");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("pass")).sendKeys("pannibhavya");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.linkText("/policies?ref=pf")).click();
		
		
		

	}

}
