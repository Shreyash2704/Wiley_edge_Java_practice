package RandomConcepts;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class CurrencyClass {

	public void convertToINR_EURO(String cur) {
		
	}
	public static void main(String[] args) {
		NumberFormat frm = NumberFormat.getCurrencyInstance(Locale.US);
		String formattedVal = frm.format(2000);
		System.out.println(formattedVal);
		
		
		
		double price = 2000.24;
		Locale local = new Locale("en","US");
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(local);
		String finalPrice = currencyFormatter.format(price);
		System.out.println(finalPrice);
		
		
		Currency cur = Currency.getInstance("INR");
		String symbol = cur.getSymbol();
		String code = cur.getCurrencyCode();
		
		System.out.println(symbol+" "+code);
		
		
		
		

	}

}
