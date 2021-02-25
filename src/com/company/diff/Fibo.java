package com.company.diff;

public class Fibo {
    public static void main(String[] args) {
        Fibo solution = new Fibo();

        System.out.println(solution.fibonacci(9));     //34
        System.out.println(solution.fibonacci(5));     //5
        System.out.println(solution.fibonacci(2));     //1
        System.out.println(solution.fibonacci(1));     //1
    }

    public int fibonacci(int n) {
        if (n == 1 || n == 2)
            return 1;
        else return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
