import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;


public class LibraryRigistrationForm {
        public static void main(String[] args){
            //System.setProperty()
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\tamta\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://libraryregtest.ccbp.tech/");

            WebElement nameel = driver.findElement(By.name("fullName"));
            nameel.sendKeys("Sudheer");

            WebElement genderEl = driver.findElement(By.id("male"));
            genderEl.click();

            WebElement contactNo = driver.findElement(By.id("contactNumber"));
            contactNo.sendKeys("9603930053");

            WebElement email = driver.findElement(By.id("email"));
            email.sendKeys("anithathalari000@gmail.com");

            WebElement selectDropDown = driver.findElement(By.tagName("select"));
            Select selectEl = new Select(selectDropDown);
            selectEl.selectByValue("individual");



            WebElement checkEl1 = driver.findElement(By.id("fiction"));
            checkEl1.click();

            WebElement chekEl2 = driver.findElement(By.id("science"));
            chekEl2.click();

            WebElement agremenrAndCondEl = driver.findElement(By.id("agreement"));
            agremenrAndCondEl.click();

            WebElement submitBtn = driver.findElement(By.className("submit-btn"));
            submitBtn.submit();

            driver.quit();


    }
}
