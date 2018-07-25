package Form;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Buses {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.traveluruat4u.com/");
		driver.findElement(By.xpath("html/body/div[1]/div[8]/div/a")).click();
		driver.findElement(By.xpath("//a[@class='hdr-sign']")).click();
		driver.findElement(By.xpath(".//*[@id='email_new']")).click();
		driver.findElement(By.xpath(".//*[@id='email_new']")).sendKeys("mahindra.gopi@gmail.com");
		driver.findElement(By.xpath(".//*[@id='password_new']")).click();
		driver.findElement(By.xpath(".//*[@id='password_new']")).sendKeys("gopi12345");
		driver.findElement(By.xpath(".//*[@id='login_submit_new']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='horizontalTab1']/ul/li[3]")).click();
		driver.findElement(By.xpath(".//*[@id='bus-station-from']")).click();
		driver.findElement(By.xpath(".//*[@id='bus-station-from']")).sendKeys("bang");
		driver.findElement(By.xpath("html/body/ul[13]/li[5]/a")).click();
		driver.findElement(By.xpath(".//*[@id='bus-station-to']")).click();
		driver.findElement(By.xpath(".//*[@id='bus-station-to']")).sendKeys("chenn");
		driver.findElement(By.xpath("html/body/ul[14]/li[5]/a/strong")).click();
		//driver.findElement(By.xpath(".//*[@id='bus-date-1']")).click();
		//driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr[1]/td[4]/a")).click();
		driver.findElement(By.xpath("html/body/div[17]/table/tbody/tr[4]/td[4]/a")).click();
		driver.findElement(By.xpath(".//*[@id='bus-form-submit']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@id='route*_*8000002125580090601']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//img[@id='508000002125580090601']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='boarding-8000002125580090601']")).click();
		driver.findElement(By.xpath(".//*[@id='boarding-8000002125580090601']/option[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@class='bookallbtn b-btn']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='booking-slide1-continue_login']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//select[@id='passenger-title-1']")).click();
		driver.findElement(By.xpath("//option[@value='1']")).click();
		driver.findElement(By.xpath("//input[@id='passenger-age-1']")).click();
		driver.findElement(By.xpath("//input[@id='passenger-age-1']")).sendKeys("22");
		driver.findElement(By.xpath("//input[@id='mobile_2']")).sendKeys("9052854858");
	driver.findElement(By.xpath("//input[@id='terms_condition']")).click();
	Thread.sleep(10000);
	System.out.println("task completed");
				
	}

}
