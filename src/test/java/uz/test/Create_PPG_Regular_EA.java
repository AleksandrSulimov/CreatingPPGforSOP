package uz.test;

import java.awt.AWTException;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Title;

import org.junit.Test;
import org.junit.runner.RunWith;

import uz.utils.JSON;

@RunWith(SerenityRunner.class)
public class Create_PPG_Regular_EA extends TestCasesBase{

	@Title("Создание ППГ обычная - Электронный аукцион")
    @Test
	public void create_PPG_Regular() throws AWTException{
		
		
		Serenity.setSessionVariable("start_time").to(h.getFormattedCurrentDate("dd.MM.yyyy HH:mm:ss"));
		Serenity.setSessionVariable("test_name").to("Создание ППГ обычная - Электронный аукцион");

		String ppzNum = JSON.readJSON("ppz_num", "ppz_num");
		
		selectPushedProcurementManagement();
		goToApplicationForms();
		expandProcurementManagementOnApplicationForms();
		expandPositionPlanGraphicsOnApplicationForms();
		applicationFormsSteps.clickOnLinkPositionPlanGraphicsPurches();
		
		positionsPlanGraphicsPurchesSteps.waitingForAppletVisible();
		positionsPlanGraphicsPurchesSteps.clickOnButtonCreteNewDocument();
		
		selectTypeOfProcurementAndProcurementPlanPPZDialogSteps.waitingForAppletVisible();
		selectTypeOfProcurementAndProcurementPlanPPZDialogSteps.checkRadioButtonValue("Позиция плана закупок 200");
		selectTypeOfProcurementAndProcurementPlanPPZDialogSteps.clickOnButtonSelect();
		
		//selectValueInSelectPositionOfProcurementPlanDiictionaryByName("Концентрат апатитовый 1");
		selectValueInSelectPositionOfProcurementPlanDiictionaryByPPZ(ppzNum);
		
		positionsPlanGraphicsPurchesTabSteps.waitingForAppletVisible();
		positionsPlanGraphicsPurchesTabSteps.selectTabBasicInformation();
		
		positionsPlanGraphicsPurchesBasicInformationSteps.waitingForAppletVisible();
		positionsPlanGraphicsPurchesBasicInformationSteps.clickOnFieldProcurementPlanPositionNumber();
		assertSteps.assertFieldEmpty("Номер позиции плана закупок", positionsPlanGraphicsPurchesBasicInformationSteps.getValueProcurementPlanPositionNumber());
		//assertSteps.assertFieldEmpty("Идентификационный код закупки", positionsPlanGraphicsPurchesBasicInformationSteps.getValueIdentificationProcurementCode());
		assertSteps.assertFieldEmpty("Статус", positionsPlanGraphicsPurchesBasicInformationSteps.getValueStatus());
		assertSteps.assertFieldEmpty("Тип закупки позиции плана закупок", positionsPlanGraphicsPurchesBasicInformationSteps.getValueTypeOfPurchasePositionProcurementPlan());
		assertSteps.assertFieldEmpty("Дата создания", positionsPlanGraphicsPurchesBasicInformationSteps.getValueCreationDate());
		assertSteps.assertFieldEmpty("Заказчик", positionsPlanGraphicsPurchesBasicInformationSteps.getValueCustomer());
		assertSteps.assertFieldEmpty("ИНН", positionsPlanGraphicsPurchesBasicInformationSteps.getValueINN());
		assertSteps.assertFieldEmpty("КПП", positionsPlanGraphicsPurchesBasicInformationSteps.getValueKPP());
		assertSteps.assertFieldEmpty("ОГРН", positionsPlanGraphicsPurchesBasicInformationSteps.getValueOGRN());
		assertSteps.assertFieldEmpty("Наименование объекта закупки (предмет контракта)", positionsPlanGraphicsPurchesBasicInformationSteps.getValueObjectOfTenderName());
		assertSteps.assertFieldEmpty("Код ОКПД 2", positionsPlanGraphicsPurchesBasicInformationSteps.getValueOKPD());
		assertSteps.assertFieldEmpty("Наименование кода товара (работы, услуги) по ОКПД 2", positionsPlanGraphicsPurchesBasicInformationSteps.getValueNameOfProductCode());
		
		positionsPlanGraphicsPurchesBasicInformationSteps.clickOnFieldMethodForDeterminingSupplier();
		positionsPlanGraphicsPurchesBasicInformationSteps.clickOnButtonMethodForDeterminingSupplier();
		
		selectValueInMethodForDeterminingSupplierDictionary("Электронный аукцион");
		
		positionsPlanGraphicsPurchesBasicInformationSteps.waitingForAppletVisible();
		positionsPlanGraphicsPurchesBasicInformationSteps.clickOnFieldInvestmentTermOfNoticeYear();
		assertSteps.assertFieldEmpty("Срок размещения извещения (срок заключения контракта) * - Выбрать год", positionsPlanGraphicsPurchesBasicInformationSteps.getValueInvestmentTermOfNoticeYear());
		assertSteps.assertFieldEmpty("Срок размещения извещения (срок заключения контракта) * - Выбрать месяц", positionsPlanGraphicsPurchesBasicInformationSteps.getValueInvestmentTermOfNoticeMonth());
		positionsPlanGraphicsPurchesBasicInformationSteps.clickOnFieldExecutionTermOfContractYear();
		assertSteps.assertFieldEmpty("Срок исполнения контракта * - Выбрать год", positionsPlanGraphicsPurchesBasicInformationSteps.getValueExecutionTermOfContractYear());
		assertSteps.assertFieldEmpty("Срок исполнения контракта * - Выбрать месяц", positionsPlanGraphicsPurchesBasicInformationSteps.getValueExecutionTermOfContractMonth());
		positionsPlanGraphicsPurchesBasicInformationSteps.clickOnFieldEstimatedPriceOfContract();
		assertSteps.assertFieldEmpty("Ориентировочная начальная (максимальная) цена контракта", positionsPlanGraphicsPurchesBasicInformationSteps.getValueEstimatedPriceOfContract());
		assertSteps.assertFieldEmpty("Размер выплат в текущем году исполнения контракта*", positionsPlanGraphicsPurchesBasicInformationSteps.getValueSizeOfPaymentsInCurrentYear());
		assertSteps.assertFieldEmpty("Валюта контракта*", positionsPlanGraphicsPurchesBasicInformationSteps.getValueContractCurrency());

		positionsPlanGraphicsPurchesTabSteps.selectTabSpecificationTRU();
		positionsPlanGraphicsPurchesSpecificationTRUSteps.waitingForAppletVisible();
		assertSteps.assertFieldEmpty("Код ОКПД2", positionsPlanGraphicsPurchesSpecificationTRUSteps.getValueCodeOKPD2());
		assertSteps.assertFieldEmpty("Наименование кода товара (работы, услуги) по ОКПД 2", positionsPlanGraphicsPurchesSpecificationTRUSteps.getValueNameOfProductCode());
		positionsPlanGraphicsPurchesSpecificationTRUSteps.clickCheckBoxTruFirstRow();
		positionsPlanGraphicsPurchesSpecificationTRUSteps.clickOnButtonEditingRow();

		positionsPlanGraphicsPurchesSpecificationTruEditingRecordSteps.waitingForAppletVisible();
		assertSteps.assertFieldEmpty("Код ОКПД2", positionsPlanGraphicsPurchesSpecificationTruEditingRecordSteps.getValueCodeOKPD2());
		assertSteps.assertFieldEmpty("Наименование кода товара (работы, услуги) по ОКПД 2", positionsPlanGraphicsPurchesSpecificationTruEditingRecordSteps.getValueNameOfProductCode());
		positionsPlanGraphicsPurchesSpecificationTruEditingRecordSteps.clickOnButtonCodeOKVED2();
		
		selectValueInOkvedDictionary("26.30.13");
		
		positionsPlanGraphicsPurchesSpecificationTruEditingRecordSteps.waitingForAppletVisible();
		assertSteps.assertField("Код ОКВЭД2", "26.30.13", positionsPlanGraphicsPurchesSpecificationTruEditingRecordSteps.getValueCodeOKVED2());
		assertSteps.assertField("Наименование кода вида экономической деятельности по ОКВЭД 2", "Производство средств связи, выполняющих функцию систем управления и мониторинга", positionsPlanGraphicsPurchesSpecificationTruEditingRecordSteps.getValueCodeEconomicActivityOKVED2());
		assertSteps.assertField("Наименование товара работы или услуги*", "Книжки электронные записные и аналогичная компьютерная техника", positionsPlanGraphicsPurchesSpecificationTruEditingRecordSteps.getValueNameOfProductJobService());
		
		positionsPlanGraphicsPurchesSpecificationTruEditingRecordSteps.clickOnFieldNameOfProductJobService();
		positionsPlanGraphicsPurchesSpecificationTruEditingRecordSteps.setTextMinimumNecessaryRequirements("Материнская плата");
		positionsPlanGraphicsPurchesSpecificationTruEditingRecordSteps.clickOnButtonNameOfMeasure();

		selectValueInNameOfMeasureDictionary("Штука");
		
		assertSteps.assertField("Наименование единицы измерения", "Штука", positionsPlanGraphicsPurchesSpecificationTruEditingRecordSteps.getValueNameOfMeasure());
		assertSteps.assertField("Количество (объем)*", "1,00", positionsPlanGraphicsPurchesSpecificationTruEditingRecordSteps.getValueAmount());
		positionsPlanGraphicsPurchesSpecificationTruEditingRecordSteps.setTextAmount("25");
		positionsPlanGraphicsPurchesSpecificationTruEditingRecordSteps.clickOnButtonOK();
		
		positionsPlanGraphicsPurchesTabSteps.selectTabBasicInformation();
		positionsPlanGraphicsPurchesBasicInformationSteps.waitingForAppletVisible();
		double sum1 = Double.valueOf(positionsPlanGraphicsPurchesBasicInformationSteps.getValueEstimatedPriceOfContract().replaceAll(",", "."));
		double sum3 = Double.valueOf(positionsPlanGraphicsPurchesBasicInformationSteps.getValueSizeOfPaymentsInCurrentYear().replaceAll(",", "."));
		
		positionsPlanGraphicsPurchesTabSteps.selectTabTermsOfPurchase();

		positionsPlanGraphicsPurchesTermsOfPurchaseSteps.waitingForAppletVisible();
		positionsPlanGraphicsPurchesTermsOfPurchaseSteps.clickCheckBoxRequiresApplicationSoftware();
		positionsPlanGraphicsPurchesTermsOfPurchaseSteps.setTextAmountOfSecurityApplication("1");
		positionsPlanGraphicsPurchesTermsOfPurchaseSteps.clickOnFieldAmountOfSecurityApplicationsNMCK();
		double sum2 = Double.valueOf(positionsPlanGraphicsPurchesTermsOfPurchaseSteps.getValueAmountOfSecurityApplicationsNMCK().replaceAll(",", "."));
		sum1 = sum1*0.01;
		assertSteps.assertEqualsDouble("Размер обеспечения заявки - НМЦК", sum1, sum2);

		positionsPlanGraphicsPurchesTermsOfPurchaseSteps.clickCheckBoxRequiresContractSoftware();
		positionsPlanGraphicsPurchesTermsOfPurchaseSteps.setTextAmountOfSecurityContract("20");
		positionsPlanGraphicsPurchesTermsOfPurchaseSteps.clickOnFieldAmountOfSecurityContractNMCK();
		double sum4 = Double.valueOf(positionsPlanGraphicsPurchesTermsOfPurchaseSteps.getValueAmountOfSecurityContractNMCK().replaceAll(",", "."));
		sum3 = sum3*0.20;
		assertSteps.assertEqualsDouble("Размер обеспечения контракта - НМЦК", sum3, sum4);

		positionsPlanGraphicsPurchesTermsOfPurchaseSteps.clickCheckBoxOrganizationOfInvalids();
		positionsPlanGraphicsPurchesTermsOfPurchaseSteps.clickCheckBoxAvailabilityOrganizationOfInvalids();
		positionsPlanGraphicsPurchesTermsOfPurchaseSteps.setTextContentOrganizationOfInvalids("Уменьшается на 15%");
		
		positionsPlanGraphicsPurchesTermsOfPurchaseSteps.clickCheckBoxUniformRequirementsForParticipants();
		positionsPlanGraphicsPurchesTermsOfPurchaseSteps.clickCheckBoxAvailabilityUniformRequirementsForParticipants();
		positionsPlanGraphicsPurchesTermsOfPurchaseSteps.setTextContentUniformRequirementsForParticipants("Единые требования");
		
		positionsPlanGraphicsPurchesTabSteps.selectTabCoordinationSheet();
		
		positionsPlanGraphicsPurchesCoordinationSheetSteps.waitingForAppletVisible();
		assertSteps.assertField("ФИО сотрудника в блоке \"Автор\"", "Олег В. Сафронов", positionsPlanGraphicsPurchesCoordinationSheetSteps.getValueFioEmployeeAuthor());
		assertSteps.assertField("Должность в блоке \"Автор\"", "Начальник", positionsPlanGraphicsPurchesCoordinationSheetSteps.getValuePositionAuthor());
		assertSteps.assertField("Требуется согласование в блоке \"Согласующие\"", "Y", positionsPlanGraphicsPurchesCoordinationSheetSteps.getValueNeedCoordinationCheckBox());
		assertSteps.assertField("Этап в блоке \"Согласующие\"", "1", positionsPlanGraphicsPurchesCoordinationSheetSteps.getValueStageMatcher());
		assertSteps.assertField("Код группы в блоке \"Согласующие\"", "1", positionsPlanGraphicsPurchesCoordinationSheetSteps.getValueCodeGroupMatcher());
		assertSteps.assertField("Порядковый номер согласующего в блоке \"Согласующие\"", "1", positionsPlanGraphicsPurchesCoordinationSheetSteps.getValueSequenceNumberMatching());
		assertSteps.assertField("ФИО сотрудника в блоке \"Согласующие\"", "Сафронов", positionsPlanGraphicsPurchesCoordinationSheetSteps.getValueFioEmployeeMatching());
		assertSteps.assertField("Должность в блоке \"Согласующие\"", "Начальник", positionsPlanGraphicsPurchesCoordinationSheetSteps.getValuePositionMatching());
		assertSteps.assertField("Результат согласования в блоке \"Согласующие\"", "Требует согласования", positionsPlanGraphicsPurchesCoordinationSheetSteps.getValueResultMatching());
		assertSteps.assertField("ФИО сотрудника в блоке \"Утверждающий\"", "Сафронов", positionsPlanGraphicsPurchesCoordinationSheetSteps.getValueFioEmployeePredicating());
		assertSteps.assertField("Должность в блоке \"Утверждающий\"", "Начальник", positionsPlanGraphicsPurchesCoordinationSheetSteps.getValuePositionPredicating());

		positionsPlanGraphicsPurchesCoordinationSheetSteps.clickOnButtonCheckDocument();
		
		saveTestResults();
		
		positionsPlanGraphicsPurchesTabSteps.selectTabBasicInformation();
		positionsPlanGraphicsPurchesBasicInformationSteps.waitingForAppletVisible();
		
		positionsPlanGraphicsPurchesBasicInformationSteps.clickOnFieldPositionsPlanGraphicsPurchesNumber();
		String ppgNum = positionsPlanGraphicsPurchesBasicInformationSteps.getValuePositionsPlanGraphicsPurchesNumber();
		commonSteps.log("Номер позиции плана-графика закупок = "+ppgNum);
		System.out.println("Номер позиции плана-графика закупок = "+ppgNum);
		Serenity.setSessionVariable("ppgNum").to(ppgNum);
		JSON.writeJSON("ppg_num", "ppg_num", ppgNum);
		positionsPlanGraphicsPurchesBasicInformationSteps.clickOnButtonClose();
		
		positionsPlanGraphicsPurchesSteps.waitingForAppletVisible();
		
		//Раскрыли фильтр
		if(!positionsPlanGraphicsPurchesSteps.isPushedLinkFilter()){
			positionsPlanGraphicsPurchesSteps.clickOnLinkFilter();
		}
		//Очистили фильтр
		if(positionsPlanGraphicsPurchesSteps.isFilterExist()){
			positionsPlanGraphicsPurchesSteps.clickOnButtonResetFilter();
		}
		
		positionsPlanGraphicsPurchesSteps.setPositionPlanGraphicInFilter(ppgNum);
		positionsPlanGraphicsPurchesSteps.selectFirstRow();
		assertSteps.assertField("Статус ППГ", "Черновик", positionsPlanGraphicsPurchesSteps.getTextStatus());

		purchasePlanTabSteps.waitingForAppletVisible();
		purchasePlanTabSteps.selectTabAttributes();
		
		attributesPageSteps.waitingForAppletVisible();
		String ppgId = attributesPageSteps.getTextId();
		commonSteps.log("Идентификатор позиции плана-графика закупок = "+ppgId);
		System.out.println("Идентификатор позиции плана-графика закупок = "+ppgId);
		Serenity.setSessionVariable("ppgId").to(ppgId);
		JSON.writeJSON("ppg_id", "ppg_id", ppgId);
		positionsPlanGraphicsPurchesSteps.clickOnLinkClose();
	
	}
	
}
