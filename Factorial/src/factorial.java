// Factorial.java
// Recursive factorial method

import javax.swing.*;

public class factorial {

    // Recursive definition of method factorial
    public static int factorial( int n )
    {
        if ( n == 1 || n == 0 )  // base case
            return 1;
        else {
            int result = n * factorial(n-1);
            return result;
        }
    }

    public static int myPow (int x, int y)
    {
        if (x <0 || y<0)
        {
            JOptionPane.showMessageDialog(null, "You must enter a positive variable!");
            throw new IllegalArgumentException();
        }

        if (y !=0)          //if not equal to y run the code
        {
            int result = x * myPow(x, y - 1);
            return result;

        }
        else {              //if equal to zero return 1
            return 1;
        }
    }

    public static String reverse(String str)
    {
        if (str.length()==0)
        {                                                       //error statement is running also for some reason
            System.out.println("This is wrong");
            return str;
        }

        else
        {
            String reversed = reverse(str.substring(1)) + str.charAt(0);

            return reversed;
        }
    }
}

