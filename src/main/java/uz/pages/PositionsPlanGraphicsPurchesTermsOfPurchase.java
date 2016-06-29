package uz.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebDriver;


/**
 * Вкладка Условия закупки
 * на странице 'Позиция плана-графика закупок' 
 * @author e.kuzmina 04.05.2016
 *
 */
public class PositionsPlanGraphicsPurchesTermsOfPurchase extends BasePage {
	
			
	  public PositionsPlanGraphicsPurchesTermsOfPurchase(WebDriver driver) {
		super(driver);
		setField(field);
		setApplet(applet);
		setAppletXpath(appletXpath);
		
	  }
	  
	  @FindBy(xpath=".//span[text()='Условия финансового обеспечения заявки']")
	  private WebElementFacade applet;
	  private String appletXpath = ".//span[text()='Условия финансового обеспечения заявки']";
	  
	  @FindBy(xpath=".//span[text()='Условия финансового обеспечения заявки']")
	  private WebElementFacade field;

	  //Кнопка Закрыть
	  @FindBy(xpath=".//span[text()='Позиция плана-графика закупок']/ancestor::table[3]/descendant::button[@title='Закрыть окно']")
	  private WebElementFacade closeButton;
	  
	  //Чекбокс Требуется обеспечение заявки
	  @FindBy(xpath=".//span[label='Требуется обеспечение заявки']/div")
	  private WebElementFacade requiresApplicationSoftwareCheckBox;

	  //Поле Размер обеспечения заявки *
	  @FindBy(xpath=".//td[div[span='Размер обеспечения заявки *']]/following-sibling::td[1]/div")
	  private WebElementFacade amountOfSecurityApplicationField;
	  @FindBy(xpath=".//td[div[span='Размер обеспечения заявки *']]/following-sibling::td[1]/div/input")
	  private WebElementFacade amountOfSecurityApplicationInput;

	  //Поле Размер обеспечения заявки - НМЦК
	  @FindBy(xpath=".//td[div[span='Размер обеспечения заявки *']]/following-sibling::td[3]/div")
	  private WebElementFacade amountOfSecurityApplicationsNMCKField;
	  @FindBy(xpath=".//td[div[span='Размер обеспечения заявки *']]/following-sibling::td[3]/div/input")
	  private WebElementFacade amountOfSecurityApplicationsNMCKInput;

	  //Чекбокс Требуется обеспечение исполнения контракта
	  @FindBy(xpath=".//span[@title='Введите условия о финансовом обеспечении контракта']/div")
	  private WebElementFacade requiredProvisionOfContractCheckBox;

	  //Поле Размер обеспечения контракта *
	  @FindBy(xpath=".//td[div[span='Размер обеспечения контракта *']]/following-sibling::td[1]/div")
	  private WebElementFacade amountOfSecurityContractField;
	  @FindBy(xpath=".//td[div[span='Размер обеспечения контракта *']]/following-sibling::td[1]/div/input")
	  private WebElementFacade amountOfSecurityContractInput;

	  //Поле Размер обеспечения контракта - НМЦК
	  @FindBy(xpath=".//td[div[span='Размер обеспечения контракта *']]/following-sibling::td[3]/div")
	  private WebElementFacade amountOfSecurityContractNMCKField;
	  @FindBy(xpath=".//td[div[span='Размер обеспечения контракта *']]/following-sibling::td[3]/div/input")
	  private WebElementFacade amountOfSecurityContractNMCKInput;

	  //Чекбокс Организациям инвалидов (в соответствии со Статьей 29 Федерального закона № 44-ФЗ)
	  @FindBy(xpath=".//td[div/textarea[text()='Организациям инвалидов (в соответствии со Статьей 29 Федерального закона № 44-ФЗ)']]/preceding-sibling::td[1]/div")
	  private WebElementFacade organizationOfInvalidsCheckBox;

	  //Чекбокс Наличие/требуется в строке Организациям инвалидов (в соответствии со Статьей 29 Федерального закона № 44-ФЗ)
	  @FindBy(xpath=".//td[div/textarea[text()='Организациям инвалидов (в соответствии со Статьей 29 Федерального закона № 44-ФЗ)']]/following-sibling::td[1]//span[@title='Наличие/требуется']/div")
	  private WebElementFacade availabilityOrganizationOfInvalidsCheckBox;

	  //Поле Содержание в строке Организациям инвалидов (в соответствии со Статьей 29 Федерального закона № 44-ФЗ)
	  @FindBy(xpath=".//td[div/textarea[text()='Организациям инвалидов (в соответствии со Статьей 29 Федерального закона № 44-ФЗ)']]/following-sibling::td[2]/div/textarea")
	  private WebElementFacade contentOrganizationOfInvalidsField;

	  //Чекбокс Единые требования к участникам (в соответствии с частью 2.1 Статьи 31 Федерального закона № 44-ФЗ)
	  @FindBy(xpath=".//td[div/textarea[text()='Единые требования к участникам (в соответствии с частью 2.1 Статьи 31 Федерального закона № 44-ФЗ)']]/preceding-sibling::td[1]/div")
	  private WebElementFacade uniformRequirementsForParticipantsCheckBox;

	  //Чекбокс Наличие/требуется в строке Единые требования к участникам (в соответствии с частью 2.1 Статьи 31 Федерального закона № 44-ФЗ)
	  @FindBy(xpath=".//td[div/textarea[text()='Единые требования к участникам (в соответствии с частью 2.1 Статьи 31 Федерального закона № 44-ФЗ)']]/following-sibling::td[1]//span[@title='Наличие/требуется']/div")
	  private WebElementFacade availabilityUniformRequirementsForParticipantsCheckBox;

	  //Поле Содержание в строке Единые требования к участникам (в соответствии с частью 2.1 Статьи 31 Федерального закона № 44-ФЗ)
	  @FindBy(xpath=".//td[div/textarea[text()='Единые требования к участникам (в соответствии с частью 2.1 Статьи 31 Федерального закона № 44-ФЗ)']]/following-sibling::td[2]/div/textarea")
	  private WebElementFacade contentUniformRequirementsForParticipantsField;

		
	  /**
	   * Нажать кнопку Завершить
	   */
	  public void clickOnButtonClose(){
		  waitForLoadJS();
		  closeButton.waitUntilClickable().click();
		  closeButton.waitUntilNotVisible();
	  }
	  
	  /**
	   * Кликнуть чекбокс Требуется обеспечение заявки
	   */
	  public void clickCheckBoxRequiresApplicationSoftware(){
		  waitForLoadJS();
		  requiresApplicationSoftwareCheckBox.click();
	  }
	  
	  /**
	   * Клик по полю Размер обеспечения заявки *
	   */
	  public void clickOnFieldAmountOfSecurityApplication(){
		  waitForLoadJS();
		  amountOfSecurityApplicationField.waitUntilClickable().click();
	  }
	  /**
	   * Забрать значение из поля Размер обеспечения заявки *
	   */
	  public String getValueAmountOfSecurityApplication(){
		  waitForLoadJS();
		  return amountOfSecurityApplicationInput.getAttribute("value");
	  }
	  /**
	   * Ввести текст в поле Размер обеспечения заявки *
	   */
	  public void setTextAmountOfSecurityApplication(String text){
		  waitForLoadJS();
		  amountOfSecurityApplicationInput.waitUntilClickable().clear();
		  amountOfSecurityApplicationInput.waitUntilClickable().sendKeys(text);
	  }
	  /**
	   * Клик по полю Размер обеспечения заявки - НМЦК
	   */
	  public void clickOnFieldAmountOfSecurityApplicationsNMCK(){
		  waitForLoadJS();
		  amountOfSecurityApplicationsNMCKField.waitUntilClickable().click();
	  }
	  /**
	   * Забрать значение из поля Размер обеспечения заявки - НМЦК
	   */
	  public String getValueAmountOfSecurityApplicationsNMCK(){
		  waitForLoadJS();
		  return amountOfSecurityApplicationsNMCKInput.getAttribute("value");
	  }
	  
	  /**
	   * Кликнуть чекбокс Требуется обеспечение исполнения контракта
	   */
	  public void clickCheckBoxRequiresContractSoftware(){
		  waitForLoadJS();
		  requiredProvisionOfContractCheckBox.click();
	  }
	  
	  /**
	   * Клик по полю Размер обеспечения контракта  *
	   */
	  public void clickOnFieldAmountOfSecurityContract(){
		  waitForLoadJS();
		  amountOfSecurityContractField.waitUntilClickable().click();
	  }
	  /**
	   * Забрать значение из поля Размер обеспечения контракта  *
	   */
	  public String getValueAmountOfSecurityContract(){
		  waitForLoadJS();
		  return amountOfSecurityContractInput.getAttribute("value");
	  }
	  /**
	   * Ввести текст в поле Размер обеспечения контракта  *
	   */
	  public void setTextAmountOfSecurityContract(String text){
		  waitForLoadJS();
		  amountOfSecurityContractInput.waitUntilClickable().clear();
		  amountOfSecurityContractInput.waitUntilClickable().sendKeys(text);
	  }
	  /**
	   * Клик по полю Размер обеспечения контракта - НМЦК
	   */
	  public void clickOnFieldAmountOfSecurityContractNMCK(){
		  waitForLoadJS();
		  amountOfSecurityContractNMCKField.waitUntilClickable().click();
	  }
	  /**
	   * Забрать значение из поля Размер обеспечения контракта - НМЦК
	   */
	  public String getValueAmountOfSecurityContractNMCK(){
		  waitForLoadJS();
		  return amountOfSecurityContractNMCKInput.getAttribute("value");
	  }

	  /**
	   * Кликнуть чекбокс Организациям инвалидов (в соответствии со Статьей 29 Федерального закона № 44-ФЗ)
	   */
	  public void clickCheckBoxOrganizationOfInvalids(){
		  waitForLoadJS();
		  organizationOfInvalidsCheckBox.click();
	  }

	  /**
	   * Кликнуть чекбокс Наличие/требуется в строке Организациям инвалидов (в соответствии со Статьей 29 Федерального закона № 44-ФЗ)
	   */
	  public void clickCheckBoxAvailabilityOrganizationOfInvalids(){
		  waitForLoadJS();
		  availabilityOrganizationOfInvalidsCheckBox.click();
	  }

	  /**
	   * Ввести текст в поле Содержание в строке Организациям инвалидов (в соответствии со Статьей 29 Федерального закона № 44-ФЗ)
	   */
	  public void setTextContentOrganizationOfInvalids(String text){
		  waitForLoadJS();
		  contentOrganizationOfInvalidsField.waitUntilClickable().sendKeys(text);;
	  }
	  
	  /**
	   * Кликнуть чекбокс Единые требования к участникам (в соответствии с пунктом 1 части 1 Статьи 31 Федерального закона № 44-ФЗ)
	   */
	  public void clickCheckBoxUniformRequirementsForParticipants(){
		  waitForLoadJS();
		  uniformRequirementsForParticipantsCheckBox.click();
	  }
	  /**
	   * Кликнуть чекбокс Наличие/требуется в строке Единые требования к участникам (в соответствии с пунктом 1 части 1 Статьи 31 Федерального закона № 44-ФЗ)
	   */
	  public void clickCheckBoxAvailabilityUniformRequirementsForParticipants(){
		  waitForLoadJS();
		  availabilityUniformRequirementsForParticipantsCheckBox.click();
	  }

	  /**
	   * Ввести текст в поле Содержание в строке Единые требования к участникам (в соответствии с пунктом 1 части 1 Статьи 31 Федерального закона № 44-ФЗ)
	   */
	  public void setTextContentUniformRequirementsForParticipants(String text){
		  waitForLoadJS();
		  contentUniformRequirementsForParticipantsField.waitUntilClickable().sendKeys(text);;
	  }
}