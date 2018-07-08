package djiman.samples.kata.dojo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import djiman.samples.kata.config.AppConfig;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class FooBarQixTest {

	@Autowired
	private FooBarQix fooBarQix;

	@Test
	public void test51EnEntree() {
		assertEquals("FooBar", fooBarQix.compute("51"));
	}

	@Test
	public void test53EnEntree() {
		assertEquals("BarFoo", fooBarQix.compute("53"));
	}

	@Test
	public void testDoitAfficher2Si2EnEntree() {
		assertEquals("2", fooBarQix.compute("2"));
	}

	@Test
	public void testDoitAfficherFooBarSiDivisiblePar3Et5() {
		assertEquals("FooBarBar", fooBarQix.compute("15"));
	}

	@Test
	public void testDoitAfficherFooFooSi3EnEntree() {
		assertEquals("FooFoo", fooBarQix.compute("3"));
	}

	@Test
	public void testDoitAfficherFooqixSiDivisiblePar3Et7() {
		assertEquals("FooQix", fooBarQix.compute("21"));
	}

	@Test
	public void testDoitAjouterBarSi5EnEntree() {
		assertEquals("BarBar", fooBarQix.compute("5"));
	}

	@Test
	public void testDoitAjouterQixSi7EnEntree() {
		assertEquals("QixQix", fooBarQix.compute("7"));
	}

	@Test
	public void testDoitRemplacer0parEtoile() {
		assertEquals("*", fooBarQix.compute("0"));
	}

	@Test
	public void testDoitRemplacer0parEtoileAvec303() {
		assertEquals("FooFoo*Foo", fooBarQix.compute("303"));
	}
}
