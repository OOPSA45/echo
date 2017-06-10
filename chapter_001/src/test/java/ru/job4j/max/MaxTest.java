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
        int result = comp.compare(1, 2);
        int expected = 2;
        assertThat(result, is(expected));
    }

}