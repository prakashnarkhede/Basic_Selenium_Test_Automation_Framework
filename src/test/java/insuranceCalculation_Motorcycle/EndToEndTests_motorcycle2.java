package insuranceCalculation_Motorcycle;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import reusableComponents.ExcelOperations;
import testBase.TestBase;

public class EndToEndTests_motorcycle2 extends TestBase{
	
	ExcelOperations excel = new ExcelOperations("InsurancePremium");
	
	@Test 
	public void insuranceCalculate_volvo() throws Exception {
		HashMap<String, String> testData = excel.getTestDataInMap(1);
		
		test.log(Status.INFO, "Test data used for execution is: "+ testData);
		homepage.clickOnMotorCycleLink();
		vehData.enterVehicleData(testData);
		vehData.clickOnNextButton();
		insData.enterInsurantData(testData);
		insData.clickOnNextButton();
		prodData.enterProductData(testData);
		prodData.clickOnNextButton();
		
		Assert.assertEquals(priceOptions.getPriceForSelectedOption("Gold"), testData.get("PriceValidation_Gold"), "Pricing for gold plan is not matching.");
		Assert.assertEquals(priceOptions.getPriceForSelectedOption("Silver"), testData.get("PriceValidation_Silver"), "Pricing for silver plan is not matching.");
		Assert.assertEquals(priceOptions.getPriceForSelectedOption("Platinum"), testData.get("PriceValidation_Platinum"), "Pricing for platimum plan is not matching.");
		Assert.assertEquals(priceOptions.getPriceForSelectedOption("Ultimate"), testData.get("PriceValidation_Ultimate"), "Pricing for ultimate plan is not matching.");
		
		priceOptions.selectPriceOption(testData.get("SelectOption"));

		priceOptions.clickOnNextButton();
	}
	
	@Test 
	public void insuranceCalculate_ford() throws Exception {
		HashMap<String, String> testData = excel.getTestDataInMap(2);
		
		test.log(Status.INFO, "Test data used for execution is: "+ testData);
		homepage.clickOnMotorCycleLink();
		vehData.enterVehicleData(testData);
		vehData.clickOnNextButton();
		insData.enterInsurantData(testData);
		insData.clickOnNextButton();
		prodData.enterProductData(testData);
		prodData.clickOnNextButton();
		
		Assert.assertEquals(priceOptions.getPriceForSelectedOption("Gold"), testData.get("PriceValidation_Gold"), "Pricing for gold plan is not matching.");
		Assert.assertEquals(priceOptions.getPriceForSelectedOption("Silver"), testData.get("PriceValidation_Silver"), "Pricing for silver plan is not matching.");
		Assert.assertEquals(priceOptions.getPriceForSelectedOption("Platinum"), testData.get("PriceValidation_Platinum"), "Pricing for platimum plan is not matching.");
		Assert.assertEquals(priceOptions.getPriceForSelectedOption("Ultimate"), testData.get("PriceValidation_Ultimate"), "Pricing for ultimate plan is not matching.");
		
		priceOptions.selectPriceOption(testData.get("SelectOption"));

		priceOptions.clickOnNextButton();
	}
	
	
}
