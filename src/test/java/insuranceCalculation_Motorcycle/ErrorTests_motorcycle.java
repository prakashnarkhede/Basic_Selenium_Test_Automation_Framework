package insuranceCalculation_Motorcycle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.internal.junit.ArrayAsserts;

import com.aventstack.extentreports.Status;

import testBase.TestBase;

public class ErrorTests_motorcycle extends TestBase {

	@Test (enabled = false)
	public void errorMessage_PayLoadField() {
		homepage.clickOnMotorCycleLink();
		vehData.enterCylinderCapacity("33333");
		test.log(Status.PASS, "Cylinder capacity is filled with data: 33333");
		String actualErrorMessage= vehData.getErrorMessageOnCylinderCapacity();
		String expectederrorMessage = "Must be a number between 1 and 2000";
		Assert.assertEquals(actualErrorMessage, expectederrorMessage, "Error message is not as expected on cylinder capacity field.");
		
	}
	@Test (enabled = false)
	public void errorMessage_PayLoadField1() {
		homepage.clickOnMotorCycleLink();
		vehData.enterCylinderCapacity("33333");
		test.log(Status.PASS, "Cylinder capacity is filled with data: 33333");
		String actualErrorMessage= vehData.getErrorMessageOnCylinderCapacity();
		String expectederrorMessage = "Must be a number between 1 and 3000";
		Assert.assertEquals(actualErrorMessage, expectederrorMessage, "Error message is not as expected on cylinder capacity field.");
	}
	
	@Test (enabled = true)
	public void verifyModelDropdownOptions() {
		homepage.clickOnMotorCycleLink();
		List<String> actualValues = vehData.getDropdownOption_model();
		test.log(Status.INFO, "Actual dd contents for model dd is: " +actualValues);
		List<String> expectedValues = Arrays.asList("– please select –", "Scooter", "Three-Wheeler", "Moped", "Motorcycle");
		test.log(Status.INFO, "Expected dd contents for model dd is: " +expectedValues);
		Assert.assertEquals(actualValues, expectedValues, "Error in Dropdown options compare at Model Dropdown");
	}
	
}
