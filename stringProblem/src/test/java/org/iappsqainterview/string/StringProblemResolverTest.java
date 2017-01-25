package org.iappsqainterview.string;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringProblemResolverTest {

	private StringProblemResolver resolver = new StringProblemResolver();
	
	private final String TEXT = "Selenium automates browsers. That's it! What you do with that power is entirely up to you.";
	private final String TEXT_c_RESULT = "Selenium automates browsers. That's it! What you do with that power is entirely up to you.";
	private final String TEXT_e_RESULT = "Slnium automats browsrs. That's it! What you do with that powr is ntirly up to you.";
	private final String TEXT_E_RESULT = "Selenium automates browsers. That's it! What you do with that power is entirely up to you.";
	
	@Test
	public void method1Test_e() {
		assertEquals(TEXT_e_RESULT, resolver.resolve1(TEXT, 'e'));
	}

	@Test
	public void method1Test_E() {
		assertEquals(TEXT_E_RESULT, resolver.resolve1(TEXT, 'E'));
	}

	@Test
	public void method1TestC() {
		assertEquals(TEXT_c_RESULT, resolver.resolve1(TEXT, 'c'));
	}
	
	@Test
	public void method1Empty() {
		assertEquals("", resolver.resolve1("", 'e'));
	}

	@Test
	public void method1BothParamsNull() {
		assertEquals(null, resolver.resolve1(null, null));
	}

	@Test
	public void method2Test_e() {
		assertEquals(TEXT_e_RESULT, resolver.resolve2(TEXT, 'e'));
	}

	@Test
	public void method2Test_E() {
		assertEquals(TEXT_E_RESULT, resolver.resolve2(TEXT, 'E'));
	}

	@Test
	public void method2TestC() {
		assertEquals(TEXT_c_RESULT, resolver.resolve2(TEXT, 'c'));
	}
	
	@Test
	public void method2Empty() {
		assertEquals("", resolver.resolve2("", 'e'));
	}
	@Test
	public void method2BothParamsNull() {
		assertEquals(null, resolver.resolve2(null, null));
	}

}
