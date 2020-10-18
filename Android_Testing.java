package browserstack;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Android_Testing {
	
	public static final String AUTOMATE_USERNAME = "sabbirahamed1";
	  public static final String AUTOMATE_ACCESS_KEY = "iamNWq4myp2Y1FJzpNxE";
	  public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
	  public static void main(String[] args) throws Exception {
		  DesiredCapabilities caps = new DesiredCapabilities();
		  caps.setCapability("os_version", "10.0");
		  caps.setCapability("device", "Samsung Galaxy S20 Plus");
		  caps.setCapability("real_mobile", "true");
		  caps.setCapability("project", "Android");
		  caps.setCapability("build", "1.2");
		  caps.setCapability("name", "Test2");
		  caps.setCapability("browserstack.local", "false");
		  caps.setCapability("browserstack.debug", "true");
		  caps.setCapability("browserstack.networkLogs", "true");
	    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
	    driver.get("https://www.buyrentbd.com");
	    driver.findElement(By.xpath(".//*[@id='home-properties']/div[2]/article/h4/a")).click();
		driver.navigate().back();
		
		driver.findElement(By.xpath(".//*[@id='home-properties']/div[4]/article/h4/a")).click();
		driver.navigate().back();
		
		driver.findElement(By.xpath(".//*[@id='home-properties']/div[5]/article/h4/a")).click();
		driver.navigate().back();
		
		driver.findElement(By.xpath(".//*[@id='home-properties']/div[7]/article/h4/a")).click();
		driver.navigate().back();
		
		driver.findElement(By.xpath(".//*[@id='home-properties']/div[8]/article/h4/a")).click();
		driver.navigate().back();
		
		driver.findElement(By.xpath(".//*[@id='home-properties']/div[10]/article/h4/a")).click();
		driver.navigate().back();
		
		driver.findElement(By.xpath(".//*[@id='home-properties']/div[11]/article/h4/a")).click();
		driver.navigate().back();
		
		
		driver.findElement(By.xpath(".//*[@id='home-properties-section-inner']/div[3]/a[2]")).click();
	    driver.quit();
	  }
	
	

}
