package uz.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import uz.utils.AutoIt;
/**
 * AutoIt
 * @author s.serov 29.04.2016
 *
 */
@SuppressWarnings("serial")
public class AutoItSteps extends ScenarioSteps {


	/*
	public AutoItSteps(Pages pages) {
        super(pages);
    }
	*/
	//AutoIt it = new AutoIt();
	
	@Step("В Jinn-Client нажать \"Подписать\"")
	public void signInJinnClient() {
		new AutoIt().signInJinnClient();
	}
	
	@Step("В Jinn-Client выбрать первый сертификат")
	public void selectFirstCertificateInJinnClient() {
		new AutoIt().selectCertInJinnClient();
	}
	
	@Step("В Jinn-Client нажать \"Подписать\" и выбрать первый сертификат")
	public void signInJinnClientAndSelectFirstCertificateInJinnClient() {
		new AutoIt().signInJinnClientAndSelectFirstCertificateInJinnClient();
	}
	
	
	@Step("В окне \"Выгрузка файла\" FireFox указать файл")
	public void selectFileInFireFox() {
		new AutoIt().selectFileInFireFox();
	}
}