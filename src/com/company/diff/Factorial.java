package com.company.diff;

public class Factorial {
    public static void main(String[] args) {
        Factorial solution = new Factorial();

        System.out.println(solution.factorial(10));     //362880
        System.out.println(solution.factorial(5));     //1
        System.out.println(solution.factorial(1));     //1
    }

    public int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        else return n * factorial(n - 1);
    }
}
