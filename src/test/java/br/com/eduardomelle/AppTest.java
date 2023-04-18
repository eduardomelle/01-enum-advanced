/**
 * 
 */
package br.com.eduardomelle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import br.com.eduardomelle.function.Operation;
import br.com.eduardomelle.strategy.Cook;
import br.com.eduardomelle.strategy.Cooks;

/**
 * 
 */
public class AppTest {

	@Test
	public void shouldAnswerWithTrue() {
		Operation operation = Operation.MINUS;
		double operate = operation.operation(10, 4, operation);
		Assertions.assertEquals(6D, operate);
	}

	@Test
	public void shouldReturnADish() {
		Cook cook = Cooks.ITALIAN;
		Assertions.assertNotNull(cook.prepare());
	}

}
