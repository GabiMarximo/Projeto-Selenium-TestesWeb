// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class TestesdecontaTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void incluirconta() {
    driver.get("https://seubarriga.wcaquino.me/");
    driver.findElement(By.linkText("Contas")).click();
    driver.findElement(By.linkText("Adicionar")).click();
    driver.findElement(By.id("nome")).sendKeys("Conta 2");
    driver.findElement(By.cssSelector(".btn")).click();
    assertThat(driver.findElement(By.cssSelector(".alert")).getText(), is("Conta adicionada com sucesso!"));
  }
  @Test
  public void alterarconta() {
    driver.get("https://seubarriga.wcaquino.me/");
    driver.findElement(By.linkText("Contas")).click();
    driver.findElement(By.linkText("Listar")).click();
    driver.findElement(By.cssSelector("tr:nth-child(2) .glyphicon-edit")).click();
    driver.findElement(By.id("nome")).sendKeys("Conta alterada");
    driver.findElement(By.cssSelector(".btn")).click();
    assertThat(driver.findElement(By.cssSelector(".alert")).getText(), is("Conta alterada com sucesso!"));
  }
  @Test
  public void contaexistente() {
    driver.get("https://seubarriga.wcaquino.me/");
    driver.findElement(By.linkText("Contas")).click();
    driver.findElement(By.linkText("Adicionar")).click();
    driver.findElement(By.id("nome")).sendKeys("Conta alterada");
    driver.findElement(By.cssSelector(".btn")).click();
    assertThat(driver.findElement(By.cssSelector(".alert")).getText(), is("Já existe uma conta com esse nome!"));
  }
  @Test
  public void removerconta() {
    driver.get("https://seubarriga.wcaquino.me/");
    driver.findElement(By.linkText("Contas")).click();
    driver.findElement(By.linkText("Listar")).click();
    driver.findElement(By.cssSelector("tr:nth-child(2) .glyphicon-remove-circle")).click();
    assertThat(driver.findElement(By.cssSelector(".alert")).getText(), is("Conta removida com sucesso!"));
  }
}
