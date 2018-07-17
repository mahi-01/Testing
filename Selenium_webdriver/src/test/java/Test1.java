import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 
{
 @Test 
	public void test()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\edghyowe8\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8080/login");
		driver.findElement(By.id("j_username")).sendKeys("Mahesh");
		driver.findElement(By.name("j_password")).sendKeys("Jenkins");
		
		//driver.findElement(By.className("class=\"submit-button primary\"")).click();
		driver.findElement(By.name("Submit")).click();
		
		String title=driver.getTitle();
		
		System.out.println(title);
		Assert.assertEquals(title, "Dashboard [Jenkins]");
		
		
	}

}
