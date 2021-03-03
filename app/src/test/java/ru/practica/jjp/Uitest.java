package ru.practica.jjp;

import org.junit.Test;

import io.restassured.http.ContentType;

import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;



public class Uitest {

    
    @Test public void testTwonumber() {

        /// путь "C:/Users/USER/Desktop/Practica/resurse/chromedriver.exe" для каждого компьютера разный !!!
        System.setProperty( "webdriver.chrome.driver", "C:/Users/USER/Desktop/Practica/resurse/chromedriver.exe"); 

        WebDriver driver = new ChromeDriver();
 
        driver.manage().window().maximize();    
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("scroll(0, 25000);");

        WebElement selectBuild = driver.findElement(By.id("selectBuild"));
        Select select0 = new Select(selectBuild);
        select0.selectByIndex(0);

        WebElement number1Field = driver.findElement(By.id("number1Field"));
        number1Field.sendKeys("1");
        WebElement number2Field = driver.findElement(By.id("number2Field"));
        number2Field.sendKeys("2");

        WebElement selectOperationDropdown = driver.findElement(By.id("selectOperationDropdown"));
        Select select1 = new Select(selectOperationDropdown);
        select1.selectByIndex(1);

        WebElement calculate = driver.findElement(By.cssSelector("input[type='button']"));
        calculate.click();

        WebElement numberAnswerField = driver.findElement(By.id("numberAnswerField"));
        String valueNumber = numberAnswerField.getAttribute("value");
        assertEquals("-1", valueNumber);

        driver.quit();

    }
    @Test public void testTwostring() {

        /// путь "C:/Users/USER/Desktop/Practica/resurse/chromedriver.exe" для каждого компьютера разный !!!
        System.setProperty( "webdriver.chrome.driver", "C:/Users/USER/Desktop/Practica/resurse/chromedriver.exe"); 

        WebDriver driver = new ChromeDriver();
 
        driver.manage().window().maximize();    
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("scroll(0, 25000);");

        WebElement selectBuild = driver.findElement(By.id("selectBuild"));
        Select select0 = new Select(selectBuild);
        select0.selectByIndex(0);

        WebElement number1Field = driver.findElement(By.id("number1Field"));
        number1Field.sendKeys("gs");
        WebElement number2Field = driver.findElement(By.id("number2Field"));
        number2Field.sendKeys("bu");

        WebElement selectOperationDropdown = driver.findElement(By.id("selectOperationDropdown"));
        Select select1 = new Select(selectOperationDropdown);
        select1.selectByIndex(4);

        WebElement calculate = driver.findElement(By.cssSelector("input[type='button']"));
        calculate.click();

        WebElement numberAnswerField = driver.findElement(By.id("numberAnswerField"));
        String valueNumber = numberAnswerField.getAttribute("value");
        assertEquals("gsbu", valueNumber);

        driver.quit();
       
    
    }
    @Test public void testTwomessangestring() {

        /// путь "C:/Users/USER/Desktop/Practica/resurse/chromedriver.exe" для каждого компьютера разный !!!
        System.setProperty( "webdriver.chrome.driver", "C:/Users/USER/Desktop/Practica/resurse/chromedriver.exe"); 

        WebDriver driver = new ChromeDriver();
 
        driver.manage().window().maximize();
        driver.get("https://testsheepnz.github.io/random-number.html");

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("scroll(0, 25000);");

        WebElement buildNumber = driver.findElement(By.id("buildNumber"));
        Select select0 = new Select(buildNumber);
        select0.selectByIndex(1);

        WebElement rollTheDice = driver.findElement(By.id("rollDiceButton"));
        rollTheDice.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement numberGuess = driver.findElement(By.id("numberGuess"));
        String str = "string";
        numberGuess.sendKeys(str);

        WebElement sumbit = driver.findElement(By.id("submitButton"));
        sumbit.click();

        js.executeScript("scroll(0, 25000);");

        WebElement feedbackLabel = driver.findElement(By.id("feedbackLabel")).findElement(By.xpath("//font/b/i"));
        String valueNumber = feedbackLabel.getText();
        assertEquals(str + ": Not a number!", valueNumber);

        driver.quit();
       
    
    }

}

