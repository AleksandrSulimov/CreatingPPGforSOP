package uz.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.PositionsPlanGraphicsPurchesPage;

/**
 * Позиции плана-графика закупок Steps
 * @author s.serov 30.04.2016
 *
 */
@SuppressWarnings("serial")
public class PositionsPlanGraphicsPurchesSteps extends ScenarioSteps {


	public PositionsPlanGraphicsPurchesSteps(Pages pages) {
        super(pages);
    }
	
	PositionsPlanGraphicsPurchesPage applet;

	@Step("Ожидаем загрузку страницы \"Позиции плана-графика закупок\"")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisibleInFrame();
	}
	 
	@Step("Нажимаем кнопку \"Создать позицию плана-графика закупок\" на странице \"Позиции плана-графика закупок\"")
	public void clickOnButtonCreteNewDocument(){
		applet.clickOnButtonCreteNewDocument();    	
	}
	
	@Step("Нажимаем кнопку \"Обновить список документов\" на странице \"Позиции плана-графика закупок\"")
	public void clickOnButtonRefreshListOfDocument(){
		applet.clickOnButtonRefreshListOfDocument();    	
	}
	
	@Step("Проверяем задан ли \"фильтр\" на странице \"Позиции плана-графика закупок\"")
	public Boolean isFilterExist(){
		return applet.isFilterExist();   	
	}
	@Step("Нажимаем кнопку \"Сбросить фильтр\" на странице \"Позиции плана-графика закупок\"")
	public void clickOnButtonResetFilter(){
		applet.clickOnButtonResetFilter();    	
	}
	
	@Step("Нажимаем кнопку \"Отправить на согласование\" на странице \"Позиции плана-графика закупок\"")
	public void clickOnButtonSendToMatching(){
		applet.clickOnButtonSendToMatching();    	
	}
		
    @Step("Проверяем нажат ли линк \"Фильтр\" на странице \"Позиции плана-графика закупок\"")
    public Boolean isPushedLinkFilter() {
    	return applet.isPushedLinkFilter();
    }
    
    @Step("Нажимаем линк \"Фильтр\" на странице \"Позиции плана-графика закупок\"")
    public void clickOnLinkFilter(){
    	applet.clickOnLinkFilter();
    }
    
    @Step("Очищаем поле \"Номер позиции плана графика\" в фильтре на странице \"Позиции плана-графика закупок\"")
    public void cleanPositionPlanGraphicInFilter() {
    	applet.cleanPositionPlanGraphicInFilter(); 	
    }
    
    @Step("Вводим текст {0} в поле \"Номер позиции плана графика\" в фильтре на странице \"Позиции плана-графика закупок\"")
    public void setPositionPlanGraphicInFilter(String string) {
    	applet.setPositionPlanGraphicInFilter(string);
    }
    
    @Step("Нажимаем чекбоксу выбора строки в первой строке на странице \"Позиции плана-графика закупок\"")
    public void selectFirstRow(){
    	applet.selectFirstRow();    	
    }
    
    @Step("Возвращаем текст из поля \"Статус\" в первой строке таблицы на странице \"Позиции плана-графика закупок\"")
    public String  getTextStatus(){
    	return applet.getTextStatus();    	
    }
    
    @Step("Закрыть вкладку \"Позиции плана-графика закупок\"")
    public void clickOnLinkClose(){
    	applet.clickOnLinkClose();    	
    }
    
    @Step("Проверить существование строки со значением {0} в поле \"Номер позиции плана графика\" на странице \"Позиции плана-графика закупок\"")
    public boolean checkNumberPositionPlanGraphicEists(String text){
    	return applet.checkNumberPositionPlanGraphicEists(text);    	
    }
    
  /*  @Step("Проверяем было ли создана ППГ по текущей ППЗ")
    public Boolean isButtonExistForNotEnoughFinOb(){
    	return applet.isButtonExistForNotEnoughFinOb();
    }*/
    
}