/**
 * 
 */
package br.com.eduardomelle.function;

/**
 * @author eduardo
 *
 */
public enum Operation {

	PLUS, MINUS;

	public double operation(double valueA, double valueB, Operation operation) {
		switch (operation) {
		case PLUS:
			return valueA + valueB;
		case MINUS:
			return valueA - valueB;
		default:
			throw new UnsupportedOperationException("We don't have support yet.");
		}
	}

}
