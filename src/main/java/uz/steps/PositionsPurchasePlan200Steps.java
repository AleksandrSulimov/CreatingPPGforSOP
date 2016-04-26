package uz.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.PositionsPurchasePlan200Page;

/**
 * Позиции плана закупок 200
 * @author s.serov 26.04.2016
 *
 */
@SuppressWarnings("serial")
public class PositionsPurchasePlan200Steps extends ScenarioSteps {


	public PositionsPurchasePlan200Steps(Pages pages) {
        super(pages);
    }
	
	PositionsPurchasePlan200Page applet;

	@Step("Ожидаем загрузку страницы \"Позиции плана закупок 200\"")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisibleInFrame();
	}
	 
	@Step("Нажимаем кнопку \"Создать новый документ\" на странице \"Позиции плана закупок 200\"")
	public void clickOnButtonCreteNewDocument(){
		applet.clickOnButtonCreteNewDocument();    	
	}
	
	@Step("Нажимаем кнопку \"Отправить на согласование\" на странице \"Позиции плана закупок 200\"")
	public void clickOnButtonSendToMatching(){
		applet.clickOnButtonSendToMatching();    	
	}
		
    @Step("Проверяем нажат ли линк \"Фильтр\" на странице \"Позиции плана закупок 200\"")
    public Boolean isPushedLinkFilter() {
    	return applet.isPushedLinkFilter();
    }
    
    @Step("Нажимаем линк \"Фильтр\" на странице \"Позиции плана закупок 200\"")
    public void clickOnLinkFilter(){
    	applet.clickOnLinkFilter();    	
    }
    
    @Step("Очищаем поле \"Номер позиции плана закупок\" в фильтре на странице \"Позиции плана закупок 200\"")
    public void cleanPositionPlanPurshedInFilter() {
    	applet.cleanPositionPlanPurshedInFilter();    	
    }
    
    @Step("Вводим текст {0} в поле \"Номер позиции плана закупок\" в фильтре на странице \"Позиции плана закупок 200\"")
    public void setPositionPlanPurshedInFilter(String string) {
    	applet.setPositionPlanPurshedInFilter(string);    	
    }
    
    @Step("Нажимаем чекбоксу выбора строки в первой строке на странице \"Позиции плана закупок 200\"")
    public void selectFirstRow(){
    	applet.selectFirstRow();    	
    }
}