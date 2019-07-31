package com.cbt.tests;

import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;
import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationTests {

    public static void main(String[] args)  {

        NavigationTests.testSafari();
        NavigationTests.testChrome();
        NavigationTests.testFirefox();
    }

    private static void testFirefox() {
        WebDriver driver1 = BrowserFactory.getDriver("firefox");
        driver1.get("http://www.google.com");
        //  Thread.sleep(2000);
        String title1=  driver1.getTitle();
        driver1.navigate().to("http://etsy.com");
        // Thread.sleep(2000);
        String title2=  driver1.getTitle();
        driver1.navigate().back();
        System.out.println( StringUtility.verifyEquals(title1,title2));
        driver1.close();
    }

    private static void testChrome() {
        WebDriver driver2 = BrowserFactory.getDriver("chrome");
        driver2.get("http://www.google.com");
        // Thread.sleep(2000);
        String title1=  driver2.getTitle();
        driver2.navigate().to("http://etsy.com");
        // Thread.sleep(2000);
        String title2=  driver2.getTitle();
        driver2.navigate().back();
        System.out.println( StringUtility.verifyEquals(title1,title2));
        driver2.close();
    }

    private static void testSafari() {
        WebDriver driver3 = BrowserFactory.getDriver("chrome");
        driver3.get("http://www.google.com");
        // Thread.sleep(2000);
        String title1=  driver3.getTitle();
        driver3.navigate().to("http://etsy.com");
        // Thread.sleep(2000);
        String title2=  driver3.getTitle();
        driver3.navigate().back();
        System.out.println( StringUtility.verifyEquals(title1,title2));
        driver3.close();
    }

}
