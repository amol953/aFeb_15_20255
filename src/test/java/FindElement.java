import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class FindElement {
    public static void main(String[]args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement search = driver.findElement(By.xpath("//input[@id='small-searchterms']"));

        System.out.println("the text is "+search.getText());
        System.out.println("the attribute value is "+search.getAttribute("type"));
        Thread.sleep(5000);
        WebElement web1=driver.findElement(By.xpath("//h2[text()='Information']"));
        web1.click();
        List<WebElement> listinfo = driver.findElements(By.xpath("//div[@class='footer-menu footer-menu--active']//div"));

        System.out.println(listinfo.size());
        for(WebElement ele:listinfo){
            System.out.println(ele.getText());
        }


    }

}
