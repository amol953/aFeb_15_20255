import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Dropdown {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
// Dropdown using Select Class
        //        try {
//            driver.get("https://practice.expandtesting.com/dropdown?utm_source=chatgpt.com");
//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//            WebElement element = driver.findElement(By.xpath("//select[@id='elementsPerPageSelect']"));
//            Select select = new Select(element);
//            select.selectByValue("50");
//            Thread.sleep(3000);
//            select.selectByIndex(0);
//        } catch (Exception e) {
//            System.out.println("Error : Dropdown list error" + e.getMessage());
//            e.printStackTrace();
//        }


        // methods for framework
//public void dropDownList(driver,element,value,index){
//    Select sel = new Select(element);
//sel.selectByIndex(index);
//sel.selectByValue(value);
//
//        }
// Dropdown without using select class
        driver.get("https://practice.expandtesting.com/dropdown?utm_source=chatgpt.com");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement ele = driver.findElement(By.xpath("//select[@id='country']"));
        JavascriptExecutor js =(JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true)",ele);
            try {

                Select sel = new Select(ele);
                List<WebElement> elements = sel.getOptions();
                for (WebElement elem : elements) {
                    if (elem.getText().contains("Australia")) {
                        Thread.sleep(2000);
                        elem.click();
                        break;
                    }

                }
            }catch(Exception e){
                System.out.println("error generated "+ e.getMessage());
                e.printStackTrace();
            }

    }
}


















