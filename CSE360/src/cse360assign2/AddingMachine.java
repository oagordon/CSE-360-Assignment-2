/**
 * @author Osan Gordon
 * Student ID: 1212938400
 * Assignment 2
 * 
 * This function can add or subtract amounts from the 'total'
 * variable. It can also display the current total, as well
 * as keep and display the history of all transactions.
 */
package cse360assign2;

public class AddingMachine {

	private int total;
	private String history = "0";
	
	/**
	 * Constructor for the 'total' variable
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * Returns the current total
	 * @return the current value of 'total'
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Adds an integer 'value' to 'total'
	 * Updates 'history' to keep track of transactions
	 * @param value the amount to be added to 'total'
	 */
	public void add (int value) {
		total += value;
		history += " + " + value;
	}
	
	/**
	 * Subtracts an integer 'value' from 'total'
	 * Updates 'history' to keep track of transactions
	 * @param value the amount to be subtracted from 'total'
	 */
	public void subtract (int value) {
		total -= value;
		history += " - " + value;
	}
	
	/**
	 * Returns a history of the transactions	
	 */
	public String toString () {
		return history;
	}

	/**
	 * Resets the value of 'total'
	 */
	public void clear() {
		total = 0;
	}
}
