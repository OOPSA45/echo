package ru.job4j.calculator;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Calculate.
 *
 * @author Kirill Komarov (k.komv@ya.ru)
 * @version $Id$
 * @since 0.1
 */
public class CalculatorTest {
	/**
 	* Add.
 	*/
	@Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

	/**
 	* Sub.
 	*/
    public void whenSubTwosubOneThenOne() {
        Calculator calc = new Calculator();
        calc.substruct(2D, 1D);
        double result = calc.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
    }

	/**
 	* Div.
 	*/
    public void whenDivSixdivThreeThenTwo() {
        Calculator calc = new Calculator();
        calc.div(6D, 3D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

	/**
 	* Multi.
 	*/
    public void whenmultiTwomultipleTwoThenFour() {
        Calculator calc = new Calculator();
        calc.div(2D, 2D);
        double result = calc.getResult();
        double expected = 4D;
        assertThat(result, is(expected));
    }
}