package amazon;

//import org.openqa.selenium.By;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StartAmazonApp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus-pc\\Downloads\\tools\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--test-type");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.com");
		
		Thread.sleep(1500);
		System.out.println("Opened AMazon Successfully");
	//	driver.findElement(By.id("redir-opt-out")).click();
		//*[@id="redir-go-to-site"]/span[2]
		driver.findElement(By.xpath("//*[@id='redir-go-to-site']/span[2]")).click();
		Thread.sleep(1500);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Lip Care");
		
		
		
		
		
		
		
		
	}
}
