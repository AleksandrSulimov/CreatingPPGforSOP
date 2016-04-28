package uz.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * План закупок
 * @author s.serov 28.04.2016
 *
 */
public class PlanPurchasePage extends BasePage {
	
			
	  public PlanPurchasePage(WebDriver driver) {
		super(driver);
		setField(field);
		setApplet(applet);
		setAppletXpath(appletXpath);
	
	  }
	  
	
	  @FindBy(xpath=".//th[@title='Номер документа']") 
	  private WebElementFacade applet; 
	  private String appletXpath = ".//th[@title='Номер документа']";
		    
	  @FindBy(xpath=".//th[@title='Номер документа']")
	  private WebElementFacade field;
	  
	  //Закрыть
	  @FindBy(xpath=".//div[button[@title[contains(.,'План закупок')]]]/a[@title='Закрыть']")
	  protected WebElementFacade closeLink;
	  
	  //Кнопка Создать новый документ
	  @FindBy(xpath=".//button[@title='Создать новый документ']")
	  protected WebElementFacade creteNewDocumentButton;

	  //Отправить на согласование
	  @FindBy(xpath=".//img[contains(@src,'ico_dollar.png')]/..")
	  protected WebElementFacade sendToMatchingButton;
	  
	  //Фильтр
	  @FindBy(xpath=".//img[@title='Видимость фильтров']")
	  protected WebElementFacade filterLink;
	  
	  //Поле Номер позиции плана закупок с переданным значением
	  protected String numberPlanPurshedXpath = ".//td[@title='%s']";
	  
	  //Номер позиции плана закупок
	  @FindBy(xpath=".//div[3]/table/tbody/tr[1]/td[position() = (count(//th[contains(.,'Номер плана закупок')]/preceding-sibling::*)+1)]/div")
	  protected WebElementFacade numberPlanPurshedField;
	  //Номер позиции плана закупок в фильтре
	  @FindBy(xpath=".//div/table/tbody/tr[2]/th[position() = (count(//th[contains(.,'Номер плана закупок')]/preceding-sibling::*)+1)]/div/descendant::input")
	  protected WebElementFacade numberPlanPurshedInFilterInput;
	  //Сбросить фильтр
	  @FindBy(xpath="(.//img[@src[contains(.,'funnel_delete.png')]]/..)[2]")
	  protected WebElementFacade resetFilterButton;
	  
	  //Статус
	  @FindBy(xpath=".//div[3]/table/tbody/tr[1]/td[position() = (count((//th[contains(.,'Статус')])[1]/preceding-sibling::*)+1)]/div")
	  protected WebElementFacade statusField;
	  
	  //Бокс выбрать первую позицию
	  @FindBy(xpath=".//div[3]/table/tbody/tr[1]/td[1]/div/span")
	  protected WebElementFacade checkBoxOnFirstRow;
	  
	  //Кнопка Создать новый документ
	  @FindBy(xpath=".//button[@title='Обновить список документов']")
	  protected WebElementFacade refreshListOfDocumentButton;
	 
		
	  /**
		 * Ожидаем, когда аплет будет visible
		 */
		public void waitingForAppletVisible(){
			waitForLoadJS();
			waitFor(new ExpectedCondition<Boolean>() {
			    public Boolean apply(final WebDriver dirver) {
			    	getDriver().switchTo().defaultContent();
			    	try {
			    		int countFrame = getDriver().findElements(By.xpath(".//iframe")).size();
			    		for(int i=1; i<=countFrame; i++){
			    			getDriver().switchTo().defaultContent();
			    			getDriver().switchTo().frame(getDriver().findElement(By.xpath("(.//iframe)["+i+"]")));
			    			if(getDriver().findElements(By.xpath(appletXpath)).size() > 0){
				    			return true;
				    		}
			    		}
			    		return false;
			    		
					} catch (Exception e) {
						 return false;
					}
			    }
			});
			waitFor(ExpectedConditions.elementToBeClickable(applet));
			//getDriver().switchTo().defaultContent();
		}
		
		public void clickOnLinkClose(){
			waitForLoadJS();
			getDriver().switchTo().defaultContent();
			closeLink.waitUntilClickable().click();
			
		}
	
		
	  /**
	   * Клик по кнопке Создать новый документ
	   */
	  public void clickOnButtonCreteNewDocument(){
		  waitingForFieldVisible(creteNewDocumentButton);
		  creteNewDocumentButton.waitUntilClickable().click();
	  }
	  
	  /**
	   * Клик по кнопке Отправить на согласование
	   */
	  public void clickOnButtonSendToMatching(){
		  waitingForFieldVisible(sendToMatchingButton);
		  sendToMatchingButton.waitUntilClickable().click();
	  }
	  /**
	   * Проверяем нажат ли фильтр
	   * @return Boolean (true - если линк нажат)
	   */
	  public Boolean isPushedLinkFilter(){
		  waitingForFieldVisible(filterLink);
		  String src = filterLink.waitUntilClickable().getAttribute("src");
		  if(!src.contains("filter_on.png")){
			  return true;
		  }
		  return false;
	  }
	  /**
	   * Клик по линку Фильтр
	   */
	  public void clickOnLinkFilter(){
		  waitingForFieldVisible(filterLink);
		  filterLink.waitUntilClickable().click();
		  waitingForFieldVisible(numberPlanPurshedInFilterInput);
	  }
	  /**
	   * Очищаем Номер позиции плана закупок в фильтре
	   */
	  public void cleanPositionPlanPurshedInFilter(){
		  waitingForFieldVisible(numberPlanPurshedInFilterInput);
		  numberPlanPurshedInFilterInput.waitUntilClickable().clear();
		  numberPlanPurshedInFilterInput.waitUntilClickable().typeAndEnter("");
	  }
	  /**
	   * Устанавливаем Номер позиции плана закупок в фильтре
	   * @param string
	   */
	  public void setPositionPlanPurshedInFilter(String string){
		  waitingForFieldVisible(numberPlanPurshedInFilterInput);
		  numberPlanPurshedInFilterInput.waitUntilClickable().clear();
		  numberPlanPurshedInFilterInput.waitUntilClickable().typeAndEnter(string);
	  }
	  /**
	   * Клик по чекбоксу выбора строки в первой строке
	   */
	  public void selectFirstRow(){
		  waitingForFieldVisible(checkBoxOnFirstRow);
		  checkBoxOnFirstRow.waitUntilClickable().click();
	  }
	  /**
	   * Возвращаем текст поля Состояние
	   * @return String
	   */
	  public String getTextStatus(){
		  waitForLoadJS();
		  return statusField.waitUntilClickable().getText();
	  }

	  /**
	   * Нажать копку обновить список документов
	   */
	  public void clickOnButtonRefreshListOfDocument() {
		  waitingForFieldVisible(refreshListOfDocumentButton);
		  refreshListOfDocumentButton.waitUntilClickable().click();
	  }
	  
	  /**
	   * Проверем задан ли фильтр поиска
	   * @return Boolean
	   */
	  public Boolean isFilterExist(){
		  try {
			  (new WebDriverWait(getDriver(), waitForUnviseble)).until(new ExpectedCondition<Boolean>() {
					public Boolean apply(final WebDriver dirver) {
				    	try {
				    		if(!resetFilterButton.isCurrentlyVisible()){
				    			return true;
				    		}else{
				    			return false;
				    		}
				    		
						} catch (Exception e) {
							 return false;
						}
		
				    }
				});
				
			} catch (Exception e) {
			}
		return resetFilterButton.isCurrentlyVisible();
	  }

	  /**
	   * Нажать копку Сбросить фильтр
	   */
	  public void clickOnButtonResetFilter() {
		  waitingForFieldVisible(resetFilterButton);
		  resetFilterButton.waitUntilClickable().click();

	  }
	  
	  /**
	   * Проверить существование строки с переданным Номером плана закупок
	   */
	  public boolean checkNumberPositionPlanPurshedEists(String text) {
		  String xPathLocator = String.format(numberPlanPurshedXpath, text); 
		  if(getDriver().findElements(By.xpath(xPathLocator)).size()>0){
			  return true;
		  }
		  return false;
	  }
}