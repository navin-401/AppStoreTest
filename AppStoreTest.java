import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import java.util.List;

public class AppStoreTest {
    public static void main (String[] args){
        System.setProperty("webdriver.chrome.driver" , "D:\\Getting started with Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qaappstore.ccbp.tech");

        WebElement socialEl = driver.findElement(By.xpath("//button[text() = 'Social']"));
        socialEl.click();
        List<WebElement> socialApps = driver.findElements(By.xpath("//li[@class = 'app-item']"));
        if(socialApps.size() == 10){
            System.out.println("Social apps count is correct");
        }else{
            System.out.println("Social apps count is incorrect");
        }

        WebElement gamesEl = driver.findElement(By.xpath("//button[text() = 'Games']"));
        gamesEl.click();
        List<WebElement> gamesApps = driver.findElements(By.xpath("//li[@class = 'app-item']"));
        if(gamesApps.size() == 10){
            System.out.println("Gaming apps count is correct");
        }else{
            System.out.println("Gaming apps count is incorrect");
        }

        WebElement newsEl = driver.findElement(By.xpath("//button[text() = 'News']"));
        newsEl.click();
        List<WebElement> newsApps = driver.findElements(By.xpath("//li[@class = 'app-item']"));
        if(newsApps.size() == 10){
            System.out.println("News apps count is correct");
        }else{
            System.out.println("News apps count is incorrect");
        }

        WebElement foodEl = driver.findElement(By.xpath("//button[text() = 'Food']"));
        foodEl.click();
        List<WebElement> foodApps = driver.findElements(By.xpath("//li[@class = 'app-item']"));
        if(foodApps.size() == 10){
            System.out.println("Food apps count is correct");
        }else{
            System.out.println("Food apps count is incorrect");
        }

        //Testing the search functionality
        newsEl.click();
        WebElement searchInputEl = driver.findElement(By.xpath("//input[@class = 'search-input']"));
        searchInputEl.sendKeys("News");
        List<WebElement> newsSearchEl = driver.findElements(By.xpath("//li[@class = 'app-item']"));
        if(newsSearchEl.size() == 7){
            System.out.println("News apps count is correct");
        }else{
            System.out.println("News apps count is incorrect");
        }
        List<WebElement> appList = driver.findElements(By.xpath("//p[contains(text() , 'News')]"));
        if(appList.size() == 7) {
            System.out.println("Search results for /'News/':");
            for (WebElement i : appList) {


                System.out.println(i.getText());
            }
        }
    }
}
