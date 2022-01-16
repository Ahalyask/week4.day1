package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='Open Home Page']")).click();
		String originalwindow1 = driver.getWindowHandle();
		Set<String> windwscount1 = driver.getWindowHandles();
		List<String> windowl1 = new ArrayList<String>(windwscount1);
		int noOfwindows1 = windowl1.size();
		System.out.println("no of windows on clicking 1st button - "+noOfwindows1);
		for(String w1 : windowl1) {
	        if (!w1.equals(originalwindow1)) {
	            driver.switchTo().window(w1);
	            driver.close();
	        }
	    }
		driver.switchTo().window(originalwindow1);
		
		
		driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();
		String originalwindow2 = driver.getWindowHandle();
		Set<String> windwscount2 = driver.getWindowHandles();
		List<String> windowl2 = new ArrayList<String>(windwscount2);
		int noOfwindows2 = windowl2.size();
		System.out.println("no of windows on clicking 2nd button - "+noOfwindows2);
		for(String w2 : windowl2) {
	        if (!w2.equals(originalwindow2)) {
	            driver.switchTo().window(w2);
	            driver.close();
	        }
	    }
		driver.switchTo().window(originalwindow2);
		
		
		driver.findElement(By.xpath("//button[text()='Do not close me ']")).click();
		String originalwindow3 = driver.getWindowHandle();
		Set<String> windwscount3 = driver.getWindowHandles();
		List<String> windowl3 = new ArrayList<String>(windwscount3);
		int noOfwindows3 = windowl3.size();
		System.out.println("no of windows on clicking 3rd button - "+noOfwindows3);
		for(String w3 : windowl3) {
	        if (!w3.equals(originalwindow3)) {
	            driver.switchTo().window(w3);
	            driver.close();
	        }
	    }
		driver.switchTo().window(originalwindow3);
		
		driver.findElement(By.xpath("//button[text()='Wait for 5 seconds']")).click();
		Thread.sleep(5000);
		String originalwindow4 = driver.getWindowHandle();
		Set<String> windwscount4 = driver.getWindowHandles();
		List<String> windowl4 = new ArrayList<String>(windwscount4);
		int noOfwindows4 = windowl4.size();
		System.out.println("no of windows on clicking 4th button - "+noOfwindows4);
		for(String w4 : windowl4) {
	        if (!w4.equals(originalwindow4)) {
	            driver.switchTo().window(w4);
	            driver.close();
	        }
	    }
		driver.switchTo().window(originalwindow4);
		

	}

}
