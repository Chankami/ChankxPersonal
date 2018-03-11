package demo.qa.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQATest1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/home/wso2/Documents/SeleniumClass/chromedriver");


        WebDriver driver =new ChromeDriver();
        driver.get("http://demoqa.com/");


    }


}
