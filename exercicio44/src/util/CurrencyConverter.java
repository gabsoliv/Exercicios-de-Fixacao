package util;

public class CurrencyConverter {

	public static double IOF = 0.06;
	
	public static double dollarToReal(double manyDollars, double dollarPrice) {
	return manyDollars * dollarPrice * (1.0 + IOF);
	}

}
