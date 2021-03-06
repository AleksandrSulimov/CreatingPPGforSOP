package uz.pages;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


/**
 * Добавление вложения
 * @author e.kuzmina 27.04.2016
 *
 */
public class AddAttachmentPage extends BasePage {
	
			
	  public AddAttachmentPage(WebDriver driver) {
		super(driver);
		setField(field);
		setApplet(applet);
		setAppletXpath(appletXpath);
	
	  }
	  
	  @FindBy(xpath=".//div[text()='Добавление вложения']")
	  private WebElementFacade applet;
	  
	  @FindBy(xpath=".//div[text()='Добавление вложения']")
	  private WebElementFacade field;
	  
	  //Кнопка Загрузить
	  @FindBy(xpath=".//div[span[text()='Загрузить']]/input")
	  private String loadButtonXpath = ".//div[span[text()='Загрузить']]/input";
	  
	  //Кнопка Сохранить
	  @FindBy(xpath=".//button[text()='Сохранить']")
	  private WebElementFacade saveButton;
	  
	  private String attachmentType = ".//div[text()='%s']";
		
	  public static void setClipboardData(String string) {
		   StringSelection stringSelection = new StringSelection(string);
		   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		}
	 /**
	   * Загрузить файл
	   * @param path
	   */
	  public void loadFile(String path){
		  waitForLoadJS();
		  getDriver().findElement(By.xpath(loadButtonXpath));
		  setClipboardData(path);
		  getDriver().findElement(By.xpath(loadButtonXpath)).click();
		  /*
		  Robot robot;
		try {
			robot = new Robot();
			robot.delay(3000);
			  robot.keyPress(KeyEvent.VK_CONTROL);
			  robot.delay(100);
			  robot.keyPress(KeyEvent.VK_V);
			  robot.delay(100);
			  robot.keyRelease(KeyEvent.VK_V);
			  robot.delay(100);
			  robot.keyRelease(KeyEvent.VK_CONTROL);
			  robot.delay(100);
			  robot.keyPress(KeyEvent.VK_ENTER);
			  robot.delay(100);
			  robot.keyRelease(KeyEvent.VK_ENTER);
			  robot.delay(1000);	
		} catch (AWTException e) {
			e.printStackTrace();
		}	
		*/  
	  }
		
	  /**
	   * Нажать кнопку Сохранить
	   * @param path
	   */
	  public void clickOnButtonSave(){
		  waitForLoadJS();
		  saveButton.waitUntilClickable().click();	
		  saveButton.waitUntilNotVisible();
	  }

	  /**
	   * Выбрать тип вложения 
	   * @param type
	   */
	  public void clickOnFieldAttachmentType(String type){
		  waitForLoadJS();
		  String xPathLocator = String.format(attachmentType, type); 
		  waitFor(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocator)));
		  getDriver().findElement(By.xpath(xPathLocator)).click();
	  }
}