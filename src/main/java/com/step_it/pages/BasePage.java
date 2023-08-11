package com.step_it.pages;

import com.step_it.driver.CustomWebDriverManager;
import com.step_it.utils.PageLoader;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

@Getter
public abstract class BasePage {

    private final PageLoader pageLoader;
    private final WebDriver driver;

    public BasePage() {
        driver = CustomWebDriverManager.getDriver();
        pageLoader = new PageLoader(driver);
        PageFactory.initElements(driver, this);
    }
}
