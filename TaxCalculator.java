import java.math.BigDecimal;
import java.math.MathContext;

public class TaxCalculator {
	private TaxCalculator() {
	}
	
	public static TaxCalculator getInstace() {
		
		return new TaxCalculator();
	}

	public BigDecimal calculateTax(BigDecimal price, double taxRate) {
		MathContext mc = new MathContext(4);
		return price.add(price.multiply(BigDecimal.valueOf(taxRate))).round(mc);
	}

	public BigDecimal calculateAllTaxes(BigDecimal price, double taxRate, double importRate) {
		MathContext mc = new MathContext(4);
		BigDecimal afterImport = price.multiply(BigDecimal.valueOf(importRate)).round(mc);
		BigDecimal afterTax = price.multiply(BigDecimal.valueOf(taxRate)).round(mc);
		price = price.add(afterImport);
		price = price.add(afterTax);
		return price;
	}
}
