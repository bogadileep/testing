import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	System.setProperty("Webdriver.chrome.driver", "I:\\driver\\chroedriver.exe");
		
		
		
		driver = new ChromeDriver();
		driver.manage().window().maximize()	;
		
		driver.get("http://ashok-env.eba-kwu2rksg.ap-south-1.elasticbeanstalk.com/Login");
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Registration")).click();
		
		
		
		
		driver.close();

	}

}
