package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		driver.switchTo().alert().sendKeys("Ahalya");
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//button[text()='Line Breaks?']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//button[text()='Sweet Alert']")).click();
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		
		driver.close();

	}

}
