package Day30Nov2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://techpub-connect-demo.netlify.app/html/contactus");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		
		// chech Contact us text will foun or not on page
		WebElement ele1 = driver.findElement(By.xpath("//div//h1"));
		if (ele1.getText().contains("Contact Us")) {

			System.out.println("Found it");

		} else {

			System.out.println("Not found");

		}
		
		
		
		WebElement ele2 = driver.findElement(By.xpath("(//div/p[@class='mt-20 fs-25'])[1]"));
		if (ele2.getText().contains("3517 W. Gray St. Utica, Pennsylvania 57867")) {

			System.out.println("Found it");

		} else {

			System.out.println("Not found");

		}
		
		
		
		WebElement ele3 = driver.findElement(By.xpath("(//div/p[@class='mt-20 fs-25'])[2]"));
		if (ele3.getText().contains("(406) 555-0120")) {

			System.out.println("Found it");

		} else {

			System.out.println("Not found");

		}
		
		
		WebElement ele4 = driver.findElement(By.xpath("(//div/p[@class='mt-20 fs-25'])[3]"));
		if (ele4.getText().contains("tranthuy.nute@gmail.com")) {

			System.out.println("Found it");

		} else {

			System.out.println("Not found");

		}
		
		
		
		// chech form is submitting or not
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Samiksha");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("7378610907");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("IT");
		driver.findElement(By.xpath("//div//textarea[@id='commnent']")).sendKeys("hello i am a robot");
		//driver.findElement(By.xpath("//div[@class='text-center']//button")).click();
		
		
		WebElement ele = driver.findElement(By.xpath("//div[@class='text-center']//button"));
		if(ele.isEnabled())
		{
			System.out.println("button is clickable");
		}
		else
		{
			System.out.println("btn is not clickable");
		}
		
		driver.findElement(By.xpath("//input[@placeholder='Write Your E-mail']")).sendKeys("abc@gmail.com");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.quit();
		

	}

}
