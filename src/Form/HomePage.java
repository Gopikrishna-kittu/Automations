package Form;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePage {
	public static void main(String[] args) throws InterruptedException {

	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.traveluruat4u.com/");
	driver.findElement(By.xpath("html/body/div[1]/div/div/div[1]/div/div[4]/div/ul/li[2]")).click();
	driver.findElement(By.xpath("html/body/div[1]/div/div/div[1]/div/div[4]/div/div/div[2]/form/div/div/div[1]/div/label[1]/input")).click();
	driver.findElement(By.xpath("html/body/div[1]/div/div/div[1]/div/div[4]/div/div/div[2]/form/div/div/div[2]/div/div[1]/div[1]/div[2]/input[1]")).click();
	driver.findElement(By.xpath("html/body/ul[1]/li[2]/a")).click();
	driver.findElement(By.xpath("html/body/div[1]/div/div/div[1]/div/div[4]/div/div/div[2]/form/div/div/div[2]/div/div[1]/div[2]/div[2]/input[1]")).click();
	driver.findElement(By.xpath("html/body/ul[2]/li[3]/a")).click();
	driver.findElement(By.xpath("html/body/div[7]/table/tbody/tr[4]/td[3]/a")).click();
	driver.findElement(By.xpath("html/body/div[1]/div/div/div[1]/div/div[4]/div/div/div[2]/form/div/div/div[4]/div[2]/div/div/input")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("html/body/div[2]/div[1]/section/div[1]/div/div[2]/div/div[11]/div/div/div[1]/div[1]/div[2]/div/div[2]/div/form/button")).click();
    
	}
}

