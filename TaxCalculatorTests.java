import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigDecimal;

@Test
public class TaxCalculatorTests {
	
	public void testCalculateTax() {
		BigDecimal expected = BigDecimal.valueOf(16.49);
		double taxRate = 0.1;
		BigDecimal price = BigDecimal.valueOf(14.99);
		BigDecimal actual = TaxCalculator.getInstace().calculateTax(price ,taxRate );
		Assert.assertEquals(actual , expected);
	}

	public void testCalculateImportTax() {
		BigDecimal expected = BigDecimal.valueOf(10.50).setScale(2);
		double importTaxRate = .05;
		BigDecimal price = BigDecimal.valueOf(10.00);
		BigDecimal actual = TaxCalculator.getInstace().calculateTax(price, importTaxRate);
		Assert.assertEquals(actual, expected);
	}

	public void testCalculateAllTaxes() {
		BigDecimal expected = BigDecimal.valueOf(32.19).setScale(2);
		double taxRate = 0.1;
		double importTaxRate = .05;
		BigDecimal price = BigDecimal.valueOf(27.99);
		BigDecimal actual = TaxCalculator.getInstace().calculateAllTaxes(price, taxRate, importTaxRate);
		Assert.assertEquals(expected, actual);
	}
}
