package com.company.diff;
// Поиск индекса элемента массива
public class Find {


    public static void main(String[] args) {

        int[] array = {1,9,3,4,5};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 5) {
                int index = i;
                System.out.println(index);

            }
            System.out.println(array[i] == 5);
        }
    }
}
