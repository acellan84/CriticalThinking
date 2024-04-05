package criticalthinkingwkthree;

public class Recursive {
	  //a recursive method to add numbers starting from 1 through a number
    public static int sum(int n) {
        if (n == 1) {
        	//base case -- sum of 1 is 1
            return 1; 
        } else {
        	//recursive case
            return n + sum(n - 1); 
        }
    }

    public static void main(String[] args) {
        int n = 10;
        int result = sum(n);
        System.out.println("The sum of numbers starting at 1 is " + result);
    }
}

