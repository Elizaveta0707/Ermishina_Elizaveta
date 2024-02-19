package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner;
        scanner= new Scanner(System.in);
        System.out.print("Введите число a: ");
        int a = scanner.nextInt();
        System.out.print("Введите число b: ");
        int b = scanner.nextInt();
        performOperationsAndComparisonv(a, b);

       System.out.print("Введите  первую строку : ");
       String str1 = scanner.next();

       System.out.print("Введите вторую строку: ");
        String str2 = scanner.next();
        comparisonString(str1,str2);
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        mass(numbers);
    }
        private static void performOperationsAndComparisonv( int a, int b)
        {
                int division;
                if (a > b) {
                    System.out.println("a > b");
                } else if (a < b) {
                    System.out.println("a < b");
                } else {
                    System.out.println("a = b");
                }
                int sum = a + b;
                int difference = a - b;
                int product = a * b;
                System.out.println("Сумма: " + sum);
                System.out.println("Разность: " + difference);
                System.out.println("Произведение: " + product);
                if (b != 0&&a!=0)
                {
                    division = a / b;
                    System.out.println("Частное: " + division);
                } else {
                    System.out.println("ERROR!");
                }
        }
    private static void comparisonString( String a1, String b1)
    {

        if (a1 != " " && b1!= " ") {

            if (a1.equals(b1)) {
                System.out.println("Строки идентичны");
            } else {
                System.out.println("Строки неидентичны");
            }
        }
            else
            {
            System.out.println("Введите значения!");
        }
    }
    private static void mass( int[] numbers)
    {
        if (numbers.length != 0)
        {
        boolean flag = false;
        for (int number : numbers)
        {
            if (number % 2 == 0)
            {
                System.out.println(number);
                flag =true;
            }
        }
        if(!flag)
        {
            System.out.println("В массиве нет четных чисел!");

        }
        }
        else
        {
            System.out.println("Массив пуст.");
        }
    }

}




