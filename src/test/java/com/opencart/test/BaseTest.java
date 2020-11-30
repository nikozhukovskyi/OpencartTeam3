package com.opencart.test;

import com.opencart.driver.DriverRepository;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    @BeforeSuite
    public void setup() {
        DriverRepository.downloadWebDriver();
    }

    @BeforeClass
    public void createDriver() {
        DriverRepository.instanceWebBrowser();
    }


    @AfterMethod
    public void closeBrowser() {
        DriverRepository.closeBrowser();
    }
}
