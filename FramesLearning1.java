package week4.day1;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.utils.FileUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesLearning1 {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		WebElement btn = driver.findElement(By.id("Click"));
		File source =btn.getScreenshotAs(OutputType.FILE);
		File des = new File("./image/button1.png");
		FileUtils.copyFile(source, des);
		
		driver.switchTo().defaultContent();
		
		List<WebElement> framecount = driver.findElements(By.tagName("iframe"));
		System.out.println("No of frames in a page - "+framecount.size());

	}

}
