/**
 * 
 */
package br.com.eduardomelle.singleton;

import java.util.Objects;

/**
 * 
 */
public final class TextAnalysis {

	private static final TextAnalysis INSTANCE = new TextAnalysis();

	private TextAnalysis() {

	}

	public static TextAnalysis getInstance() {
		return INSTANCE;
	}

	public static String prepare(String text) {
		Objects.requireNonNull(text, "text is required");
		return text.toUpperCase();
	}

}
