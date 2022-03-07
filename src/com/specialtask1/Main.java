package com.specialtask1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println();

        /* 1. Используя цикл вывести на экран сто раз надпись:
        «Я никогда не буду работать за копейки. Амиго» */

        for (int i = 1; i <= 10; i++)
            System.out.println("Я никогда не буду работать за копейки. Амиго.");
        System.out.println();

        /* 2. Ввести с клавиатуры три числа, вывести на экран среднее из них, т.е. не самое большое и не самое маленькое. */

        System.out.println("Давай найдем среднее число среди a, b и c?");
        int average = 0;
        String average_variable = null;
        System.out.print("a = ");
        int a = scan.nextInt();
        System.out.print("b = ");
        int b = scan.nextInt();
        System.out.print("c = ");
        int c = scan.nextInt();

        if ((a > b) && (a < c)) {
            average = a;
            average_variable = "a";
        } else if ((b > a) && (b < c)) {
            average = b;
            average_variable = "b";
        } else if ((c > a) && (c < b)) {
            average = c;
            average_variable = "c";
        }

        System.out.println("Самое среднее число - " + average_variable + ": " + average);
        System.out.println();

        /* 3. Вводить с клавиатуры числа и считать их сумму.
        Если пользователь ввел -1, вывести на экран сумму и завершить программу.
        -1 должно учитываться в сумме. */

        System.out.println("Если хочешь - можешь вводить числа");
        System.out.println("Если ты введешь значение -1 - всё прекратится");
        int sum = 0;
        while (a != -1) {
            System.out.print("Вводи число - ");
            a = scan.nextInt();
            sum = sum + a;
        }
        System.out.println("Сумма всех введенных тобой чисел, считая -1, - " + sum);
        System.out.println();

        /* 4. Ввести с клавиатуры строку name.
        Ввести с клавиатуры дату рождения (три числа): y, m, d.
        Вывести на экран текст:
        «Меня зовут name
        Я родился d.m.y» */

        String name;
        int d,m,y;

        System.out.println("Расскажи о себе");
        System.out.print("Как тебя зовут? - ");
        name = scan.nextLine();
        System.out.print("В каком году ты родился? - ");
        y = scan.nextInt();
        System.out.print("В каком месяце ты родился? - ");
        m = scan.nextInt();
        System.out.print("В какой день ты родился? - ");
        d = scan.nextInt();

        System.out.println("Ха-ха! Я украду твою личность!");
        System.out.println("Меня зовут " + name);
        System.out.println("Я родился " + d + "." + m + "." + y);
    }
}