/**
 * 
 */
package br.com.eduardomelle.vo;

import java.util.function.Supplier;

import javax.money.CurrencyUnit;
import javax.money.Monetary;

/**
 * @author eduardo
 *
 */
public enum Currencies implements Supplier<CurrencyUnit> {

	EURO("EUR"), DOLLAR("USD");

	private final CurrencyUnit currency;

	private Currencies(String currencyCode) {
		this.currency = Monetary.getCurrency(currencyCode);
	}

	@Override
	public CurrencyUnit get() {
		return currency;
	}

}
