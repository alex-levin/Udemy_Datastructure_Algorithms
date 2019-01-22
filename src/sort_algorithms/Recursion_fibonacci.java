package sort_algorithms;

public class Recursion_2 {

    public static void main(String[] args) {

        int n = 7;
//        System.out.println(fibonacci(n));
        printFun(3);

    }


// Finding n-th Element of Fibonacci Sequence

//    Starting with 0 and 1, the Fibonacci Sequence is a sequence of numbers where each number is defined as the sum of the two numbers proceeding it: 0 1 1 2 3 5 8 13 21 34 55 …
//    So, given a number n, our problem is to find the n-th element of Fibonacci Sequence. To implement a recursive solution, we need to figure out the Stop Condition and the Recursive Call.
//    Luckily, it’s really straightforward.
//    Let’s call f(n) the n-th value of the sequence. Then we’ll have f(n) = f(n-1) + f(n-2) (the Recursive Call).
//    Meanwhile, f(0) = 0 and f(1) = 1 ( Stop Condition).
//    Then, it’s really obvious for us to define a recursive method to solve the problem:
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }


    public static void printFun(int n) {
        if (n < 1) {
            return;
        }

        System.out.println(n);
        printFun(n - 1);
        System.out.println(n);
        return;

    }
}
