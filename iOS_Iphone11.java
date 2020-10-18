package browserstack;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class iOS_Iphone11 {
	
	public static final String AUTOMATE_USERNAME = "sabbirahamed1";
	  public static final String AUTOMATE_ACCESS_KEY = "iamNWq4myp2Y1FJzpNxE";
	  public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
	  public static void main(String[] args) throws Exception {
	    DesiredCapabilities caps = new DesiredCapabilities();
	    caps.setCapability("browserName", "iPhone");
	    caps.setCapability("device", "iPhone 11");
	    caps.setCapability("realMobile", "true");
	    caps.setCapability("os_version", "14");
	    caps.setCapability("name", "BStack-[Java] Sample Test"); // test name
	    caps.setCapability("build", "BStack Build Number 1"); // CI/CD job or build name
	    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
	    driver.get("https://xolaircopay.com");
	    
	    driver.findElement(By.xpath(".//*[@id='container']/div[2]/div/a[1]")).click();
	    
	    driver.findElement(By.xpath("//input[@name='enroll'][@value='lap']")).click();
		driver.findElement(By.id("agree")).click();
		
		driver.findElement(By.id("enroll-no")).click();
		
		driver.findElement(By.xpath(".//*[@id='container']/form/p[3]/input")).click();

		driver.findElement(By.name("apply-step-one-submit")).click();
		
		
		driver.findElement(By.name("question-1")).click();

		driver.findElement(By.name("question-2")).click();

		driver.findElement(By.name("question-3")).click();

		driver.findElement(By.name("question-4")).click();

		driver.findElement(By.xpath("//input[@name='question-5'][@value='no']")).click();

		WebElement list_by_state = driver.findElement(By.name("state"));
		Select List_by_State = new Select(list_by_state);

		List_by_State.selectByValue("NJ");

		driver.findElement(By.xpath("//input[@name='question-7'][@value='no']")).click();

		driver.findElement(By.xpath(".//*[@id='container']/form/table/tbody/tr[8]/td[2]/p[3]/input")).click();

		driver.findElement(By.name("question-9")).click();

		driver.findElement(By.name("question-10")).click();

		driver.findElement(By.name("question-11")).click();

		driver.findElement(By.name("apply-step-one-submit")).click();
		
		long currentTime = System.currentTimeMillis();
		driver.findElement(By.id("guardian_first_name")).clear();
		driver.findElement(By.id("guardian_first_name")).sendKeys("Samione" + currentTime);

		driver.findElement(By.id("guardian_last_name")).clear();
		driver.findElement(By.id("guardian_last_name")).sendKeys("Zaza" + currentTime);

		driver.findElement(By.id("guardian_address_1")).clear();
		driver.findElement(By.id("guardian_address_1")).sendKeys("1 Hudson Ave" + currentTime);

		driver.findElement(By.id("guardian_address_2")).clear();
		driver.findElement(By.id("guardian_address_2")).sendKeys("Apt 2" + currentTime);

		driver.findElement(By.id("guardian_city")).clear();
		driver.findElement(By.id("guardian_city")).sendKeys("Clifton" + currentTime);

		WebElement list_by_state1 = driver.findElement(By.name("guardian_state"));
		Select List_by_State1 = new Select(list_by_state1);

		List_by_State1.selectByValue("NJ");

		driver.findElement(By.id("guardian_zip")).sendKeys("07432");

		driver.findElement(By.id("guardian_phone_number")).sendKeys("9874322323");

		driver.findElement(By.id("first_name")).clear();
		driver.findElement(By.id("first_name")).sendKeys("Kelly" + currentTime);

		driver.findElement(By.id("last_name")).clear();
		driver.findElement(By.id("last_name")).sendKeys("Heldon" + currentTime);

		WebElement list_by_gender = driver.findElement(By.name("sex"));
		Select List_by_Gender = new Select(list_by_gender);

		List_by_Gender.selectByValue("F");

		driver.findElement(By.xpath(".//*[@id='container']/form/p[13]/span[1]/div/span/a/span[1]")).click();
		driver.findElement(By.xpath(".//*[@id='container']/form/p[13]/span[1]/select/option[9]")).click();

		driver.findElement(By.xpath(".//*[@id='container']/form/p[13]/span[2]/div/span/a/span[1]")).click();
		driver.findElement(By.xpath(".//*[@id='container']/form/p[13]/span[2]/select/option[17]")).click();

		driver.findElement(By.xpath(".//*[@id='container']/form/p[13]/span[3]/div/span/a/span[1]")).click();
		driver.findElement(By.xpath(".//*[@id='container']/form/p[13]/span[3]/select/option[46]")).click();

		driver.findElement(By.xpath(".//*[@id='same-address']")).click();

		driver.findElement(By.id("SocialSecurityNumber")).sendKeys("4321");
		
		
		WebElement list_by_insurance = driver.findElement(By.id("insuranceCompanyName"));
		Select List_by_Insurance = new Select(list_by_insurance);

		List_by_Insurance.selectByValue("Cigna");

		WebElement list_by_plan = driver.findElement(By.name("insurancePlanType"));
		Select List_by_Plan = new Select(list_by_plan);

		List_by_Plan.selectByValue("Indemnity");

		driver.findElement(By.id("insuranceGroupNumber")).clear();
		driver.findElement(By.id("insuranceGroupNumber")).sendKeys("111111");

		driver.findElement(By.id("insuranceMemberNumber")).clear();
		driver.findElement(By.id("insuranceMemberNumber")).sendKeys("222222");

		driver.findElement(By.id("insuranceBINNumber")).clear();
		driver.findElement(By.id("insuranceBINNumber")).sendKeys("333333");

		driver.findElement(By.id("insurancePCNNumber")).clear();
		driver.findElement(By.id("insurancePCNNumber")).sendKeys("444444");

		driver.findElement(By.name("apply-step-one-submit")).click();
   
	    driver.quit();
	  }

}
