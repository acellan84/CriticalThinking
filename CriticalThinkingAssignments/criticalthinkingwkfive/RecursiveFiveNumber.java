package criticalthinkingwkfive;

import javax.swing.JOptionPane;

public class RecursiveFiveNumber {

    public static void main(String[] args) {
        int[] num = new int[5];

        // Loop to display dialogs for input
        for (int i = 0; i < 5; i++) {
            String input = JOptionPane.showInputDialog("Enter number " + (i + 1) + ":");
            num[i] = Integer.parseInt(input);
        }

        int total = calculateSum(num, 0, 4);

        // Display the result in a dialog box
        JOptionPane.showMessageDialog(null, "Total of 5 numbers is: " + total);
    }

    public static int calculateSum(int[] num, int firstNum, int lastNum) {
        if (firstNum > lastNum) {
        	// Base case: If start is greater than end, return 0.
            return 0; 
        } else {
            // Recursive case: Add the current number to the sum of the rest of the numbers.
            return num[firstNum] + calculateSum(num, firstNum + 1, lastNum);
        }
    }
}




