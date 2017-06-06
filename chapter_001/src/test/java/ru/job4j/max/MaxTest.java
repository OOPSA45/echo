package ru.job4j.max;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Max.
 *
 * @author Kirill Komarov (k.komv@ya.ru)
 * @version $Id$
 * @since 0.1
 */
public class MaxTest {
	/**
 	* Compare.
 	*/
	@Test
    public void compareOneAndTwo() {
        Max comp = new Max();
        comp.compare(1D, 2D);
        double result = comp.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

}