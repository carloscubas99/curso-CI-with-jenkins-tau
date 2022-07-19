package training;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstSeleniumJavaTest {
    private WebDriver driver;

    @Test
    public void testEasy(){
        driver.get("https://www.linkedin.com/");
        driver.manage().window().maximize();

        String title = driver.getTitle();
        System.out.println(title);
        AssertJUnit.assertTrue(title.equals("Test Automation University | Applitools"));
    }

    @Test
    public void testTwo(){
        driver.get("https://www.google.com");
        driver.manage().window().maximize();

        String title1 = driver.getTitle();
        System.out.println("Titulo de la pagina:  " + title1);
        System.out.println("title is "+title1);
        AssertJUnit.assertTrue(title1.equals("Google"));
        System.out.println("Validacion exitosa...");
    }

    @BeforeTest
    public void beforeTest(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterTest
    public void afterTest(){
        driver.quit();
    }

}
