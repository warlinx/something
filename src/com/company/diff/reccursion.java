package com.company.diff;
// Пример реккурсии
public class reccursion {
    public static void main(String[] args)
    {
        count(10);
    }

    public static void count(int x)
    {
        if (x <=0)
            System.out.println("Boom!");
        else
        {
            System.out.println(x);
            count(x - 1);
        }
    }
}
