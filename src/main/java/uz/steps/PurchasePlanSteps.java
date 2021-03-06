package uz.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.PurchasePlanPage;

/**
 * План закупок
 * @author ekuzmina 29.04.2016
 *
 */
@SuppressWarnings("serial")
public class PurchasePlanSteps extends ScenarioSteps {


	public PurchasePlanSteps(Pages pages) {
        super(pages);
    }
	
	PurchasePlanPage applet;

	@Step("Ожидаем загрузку страницы \"План закупок\"")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisibleInFrame();
	}
	 
	@Step("Нажимаем кнопку \"Создать новый документ\" на странице \"План закупок\"")
	public void clickOnButtonCreteNewDocument(){
		applet.clickOnButtonCreteNewDocument();    	
	}
	
	@Step("Нажимаем кнопку \"Обновить список документов\" на странице \"План закупок\"")
	public void clickOnButtonRefreshListOfDocument(){
		applet.clickOnButtonRefreshListOfDocument();    	
	}
	
	@Step("Проверяем задан ли \"фильтр\" на странице \"План закупок\"")
	public Boolean isFilterExist(){
		return applet.isFilterExist();   	
	}
	@Step("Нажимаем кнопку \"Сбросить фильтр\" на странице \"План закупок\"")
	public void clickOnButtonResetFilter(){
		applet.clickOnButtonResetFilter();    	
	}
	
	@Step("Нажимаем кнопку \"Отправить на согласование\" на странице \"План закупок\"")
	public void clickOnButtonSendToMatching(){
		applet.clickOnButtonSendToMatching();    	
	}
		
    @Step("Проверяем нажат ли линк \"Фильтр\" на странице \"План закупок\"")
    public Boolean isPushedLinkFilter() {
    	return applet.isPushedLinkFilter();
    }
    
    @Step("Нажимаем линк \"Фильтр\" на странице \"План закупок\"")
    public void clickOnLinkFilter(){
    	applet.clickOnLinkFilter();
    }
    
    @Step("Очищаем поле \"Номер плана закупок\" в фильтре на странице \"План закупок\"")
    public void cleanPlanPurshedInFilter() {
    	applet.cleanPlanPurshedInFilter();    	
    }
    
    @Step("Вводим текст {0} в поле \"Номер плана закупок\" в фильтре на странице \"План закупок\"")
    public void setPlanPurshedInFilter(String string) {
    	applet.setPlanPurshedInFilter(string);    	
    }
    @Step("Нажимаем чекбоксу выбора строки в первой строке на странице \"План закупок\"")
    public void selectFirstRow(){
    	applet.selectFirstRow();    	
    }
    
    @Step("Возвращаем текст из поля \"Статус\" в первой строке таблицы на странице \"План закупок\"")
    public String  getTextStatus(){
    	return applet.getTextStatus();    	
    }
    @Step("Возвращаем текст из поля \"Номер плана закупок\" в первой строке таблицы на странице \"План закупок\"")
    public String  getTextNumberPlanPurshed(){
    	return applet.getTextNumberPlanPurshed();    	
    }
    
    @Step("Закрыть вкладку \"План закупок\"")
    public void clickOnLinkClosePZ(){
    	applet.clickOnLinkClosePZ();    	
    }
    
    @Step("Проверить существование строки со значением {0} в поле \"Номер закупки\" на странице \"План закупок\"")
    public boolean checkNumberPlanPurshedEists(String text){
    	return applet.checkNumberPlanPurshedEists(text);    	
    }
    
}