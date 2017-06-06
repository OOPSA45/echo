package ru.job4j.max;

/**
* Package for max task.
*
* @author Kirill Komarov (mailto:k.komv@ya.ru)
* @version $Id$
* @since 0.1
*/
public class Max {
	/**
	* Main.
	*/
    private double result;

    	/**
    	* Compare.
		* @param first первое число
		* @param second второе число
		*/
    	public void compare(double first, double second) {

        this.result = first > second ? first : second;

    }

		/**
		* Result.
		* @return this.result
		*/
    public double getResult() {
		return this.result;
    }

}
