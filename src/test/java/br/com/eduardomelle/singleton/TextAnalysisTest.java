/**
 * 
 */
package br.com.eduardomelle.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * 
 */
public class TextAnalysisTest {

	@Test
	public void shouldPrepare() {
		TextAnalysis instance = TextAnalysis.getInstance();
		Assertions.assertNotNull(instance);
		String text = instance.prepare("hello poliana");
		Assertions.assertNotNull(text);
		Assertions.assertEquals("hello poliana".toUpperCase(), text);
	}

}
