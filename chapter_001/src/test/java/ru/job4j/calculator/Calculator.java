package ru.job4j.calculator;

/**
* Package for calculator task.
*
* @author Kirill Komarov (mailto:k.komv@ya.ru)
* @version $Id$
* @since 0.1
*/
public class Calculator {
	/**
	* Main.
	*/
    private double result;

    	/**
    	* Add.
		* @param first первое число
		* @param second второе число
		*/
    	public void add(double first, double second) {

        this.result = first + second;
    }

    	/**
    	* Substruct.
		* @param first первое число
		* @param second второе число
		*/
    public void substruct(double first, double second) {

        this.result = first - second;
    }

    	/**
    	* Div.
		* @param first первое число
		* @param second второе число
		*/
    public void div(double first, double second) {

        this.result = first / second;
    }

    	/**
    	* Multiple.
		* @param first первое число
		* @param second второе число
		*/
    public void multiple(double first, double second) {

        this.result = first * second;
    }

		/**
		* Result.
		* @return this.result
		*/
    public double getResult() {
		return this.result;
    }
}
