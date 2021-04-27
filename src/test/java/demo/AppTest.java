package demo;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

import org.apache.poi.EncryptedDocumentException;
import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument.Field.Xpath;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private WebDriver driver; 
    @Before
    public void Setup() throws EncryptedDocumentException, IOException{
    
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();   
        driver.manage().window().maximize(); 
    }
    @Test
    public void AviancaTest() throws InterruptedException, EncryptedDocumentException, IOException
    {
     
        for (int i=0; i<poi.a().size(); i++) {
        driver.get("https://www.avianca.com/co/es/");
        String title = driver.getTitle();
        System.out.println(title);   
        Thread.sleep(5000);
        driver.findElement(By.xpath("//fieldset/div/div/div/label/div/input")).clear();
        driver.findElement(By.xpath("//fieldset/div/div/div/label/div/input")).sendKeys(poi.a().get(i));
        driver.findElement(By.xpath("//fieldset/div/div[3]/div[2]/label/div/input")).sendKeys(poi.b().get(i));
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Selecciona un destino'])[4]/following::li[1]")).click();
        driver.findElement(By.xpath("//ul[@id='tab-navigation-1']/li[2]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[2]/fieldset/div/div/div/label/div/input")).sendKeys("Sáb, 15 may.");
        JOptionPane.showMessageDialog(null, "Aquí el vuelo que se seleccionó");
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
        }
      
    }
    @After
    public void End(){
        driver.quit();  
    }
}
