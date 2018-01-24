package Projects;

import java.util.concurrent.TimeUnit;

/**
 * Simple class that uses recursion to count down from
 * a specified number.
 */
public class Recursion {
    public static void main(String[] args) {
        // create new object
        Recursion r = new Recursion();

        // count down from 10
        try {
            r.countDown(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Recursive method that counts down to 0 from n.
     *
     * @param n the starting point
     * @return decrements of n
     * @throws InterruptedException something went wrong
     */
    private int countDown(int n) throws InterruptedException {
        // base case
        if(n < 1) {
            System.out.println("BOOM!");
            return n;
        }

        // pause the program for 1 second
        TimeUnit.SECONDS.sleep(1);

        // print the current count
        System.out.print(n + " ");

        // decrement
        n--;

        // recursive call
        return countDown(n);
    }
}
