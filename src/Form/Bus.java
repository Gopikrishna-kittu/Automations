package Form;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bus {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.traveluruat4u.com");
		driver.findElement(By.xpath("html/body/div[1]/div/div/div[1]/div/div[4]/div/ul/li[3]")).click();
		driver.findElement(By.xpath("html/body/div[1]/div/div/div[1]/div/div[4]/div/div/div[3]/form/div/div/div[1]/div[1]/div[2]/input[1]")).sendKeys("bang");
		driver.findElement(By.xpath("html/body/ul[13]/li[5]/a")).click();
		driver.findElement(By.xpath("html/body/div[1]/div/div/div[1]/div/div[4]/div/div/div[3]/form/div/div/div[1]/div[2]/div[2]/input[1]")).sendKeys("chennai");
		driver.findElement(By.xpath("html/body/ul[14]/li[2]/a/strong")).click();
		driver.findElement(By.xpath("html/body/div[7]/table/tbody/tr[2]/td[3]/a")).click();
		driver.findElement(By.xpath(".//*[@id='bus-form-submit']")).click();
		


	}

}
