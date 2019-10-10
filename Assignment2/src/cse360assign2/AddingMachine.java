/*
 * Name: Saarthack Sachdeva
 * Classid: CSE 360 (Wed) - 70642
 * Assignment_Number: 2
 * Description: This is a calculator machine which is the updated version which now
 * 				performs all the desired functions of the calculator.
 */

package cse360assign2;

/**
 * Second version of adding machine class now
 * performs the desired functions of the calculator.
 * @author saarthacksachdeva
 *
 */
public class AddingMachine{
    private int total;
    private StringBuilder sb = new StringBuilder();

    /**
     * this is a constructor which initializes the total value to be 0.
     */
    public AddingMachine() {
        total = 0;  // not needed - included for clarity}
        sb.append(total);
    }

    /**
     * returns the total of the calculator
     * @return an integer
     */
    public int getTotal () {
        return total;
    }

    /**
     * adding the value to the total of the calculator.
     * @param value
     */
    public void add(int value) {
        sb.append(" + " + value);
        total = total + value;
    }

    /**
     * subtracts the value from the total
     * @param value
     */
    public void subtract(int value) {
        sb.append(" - " + value);
        total = total - value;
    }

    /**
     * returns the instructions of the calculator as a String
     * @return String
     */
    public String toString() {
        return sb.toString();
    }

    /**
     * clears the instructions given to the calculator
     * and makes the total to be 0.
     */
    public void clear() {
        sb = new StringBuilder();
        sb.append(0);
        total = 0;
    }
}

