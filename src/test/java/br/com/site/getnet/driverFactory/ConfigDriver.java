package br.com.site.getnet.driverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class ConfigDriver {

    public static WebDriver driver;

    public static WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", new File("src/test/resources/driver/chromedriver").getAbsolutePath());
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        return driver;
    }

}
