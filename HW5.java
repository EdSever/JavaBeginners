package homework.JavaBeginners;

import java.sql.SQLOutput;

public class HW5 {

    public static int numb = 1;

    public static void task() {
        System.out.println("----------Task #  " + numb++ + "  #----------");

    }

    public static void verifyEquals(String expectedResult,
                                    String actualResult) {
        if (expectedResult.equals(actualResult)) {
            System.out.println("\u001B[32m" + "pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "fail" + "\u001B[0m");
        }
    }

    public static void verifyEquals(int expectedResult, int actualResult) {
        if (expectedResult == actualResult) {
            System.out.println("\u001B[32m" + "pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "fail" + "\u001B[0m");
        }
    }

    public static void verifyEquals(Double expectedResult,
                                    Double actualResult) {
        if (expectedResult == actualResult) {
            System.out.println("\u001B[32m" + "pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "fail" + "\u001B[0m");
        }
    }

// 2
    public static String daysOfTheWeek(int number) {
        String day = "";
        if (number >= 1 && number <= 7) {
            if (number == 1) {
                day = "Monday";
            } else if (number == 2) {
                day = "Tuesday";
            } else if (number == 3) {
                day = "Wednesday";
            } else if (number == 4) {
                day = "Thursday";
            } else if (number == 5) {
                day = "Friday";
            } else if (number == 6) {
                day = "Saturday";
            } else if (number == 7) {
                day = "Sunday";
            }
        } else {
            day = "Bad Day";
        }
        return day;
    }

// 3
    public static int MathMethod(int x, int y, int z) {
        int max = (Math.max(Math.max(x, y), z));
        return max;
    }

// 4
    public static int theSmallestValue (int a, int b, int c) {
        int min = a;
        if(min > b) {
            System.out.println(min = b);
        } else if(min >c) {
            System.out.println(min = c);
        } else {
            System.out.println(min);
        }
        return min;
    }

// 5
    public static String tempereturaCat(double a, double b, double c, double d,
                                        double e) {
        String result = " ";
        double catMax = 40.55;
        double catMin = 35.15;

        if ((a >= catMin) && (a <= catMax) && (b >= catMin) && (b <= catMax)
                && (c >= catMin) && (c <= catMax) && (d >= catMin) &&
                (d <= catMax) && (e >= catMin) && (e <= catMax)) {
            double value = ((a + b + c + d + e) / 5);
            result = String.format("%.2f", value);
        } else {
            result = "Error";
        }
        return result;
    }

// 6
    public static String printRubles(double money) {
        String result;
        if (money >= 0) {
            double whole = money;
            whole = (int) whole;
            double cents = (money - whole) * 100;
            result = (int) money + " руб. " + (int) cents + " коп.";
        } else {
            result = "Error";
        }
        return result;

    }

// 7
    public static String wKg(double weight) {

        String result;

        if (weight >= 0) {
            Double whole = weight;
            whole = (double) whole.intValue();
            double grams = (weight - whole) * 1000;
            result = (int) weight + " кг. " + (int) grams + " гр.";
        } else {
            result = "Error";
        }
        return result;
    }

// 8
    public static String purchase(double price, double weight) {

        double count = price * weight;
        return String.format("%.2f", count);
    }

// 9
// Метод для вывода гомер чека
    static int numberC = 1;

    public static String check() {

        String result;
        result = "Чек " + numberC;
        numberC++;
        return result;
    }
// Вывод чека для килограммов
    public static String ReceptKg(String product, double price1, double weight1) {

        String result;
        double payResult = Double.parseDouble(purchase(price1, weight1));
        String finePayResult = printRubles(payResult);

        result = "| Цена за 1 кг.       " + printRubles(price1)
                + "\n| Количество товара         " + wKg(weight1)
                + "\n| Сумма к оплате     " + finePayResult;

        return result;
    }
// Вывод чека для штук
    public static String ReceiptPc(String product, double price1, int piеces) {

        String result;
        double payResult = Double.parseDouble(purchase(price1, piеces));
        String finePayResult = printRubles(payResult);

        result = "| Цена за 1 шт.       " + printRubles(price1)
                + "\n| Количество товара         " + piеces + "шт"
                + "\n| Сумма к оплате     " + finePayResult;

        return result;
    }

// 10
    public static String countSalary(double worksDay, double priceHour) {
        int salary = ((int) (worksDay * priceHour * 21));
        double salary1 = worksDay * priceHour * 21;
        int coins = (int) ((salary1 - salary) * 100);

        return  (salary + " руб " + coins + " коп");
    }

// 12
    public static String checkX (int x) {
        if (x < 0) {
            return x + " is negative";
        } else if (x > 0) {
            return x + " is positive";
        } else {
            return x + " is sero";
        }
    }

// 13
    public static void NumbIsLucky(int year) {

        int first = year / 1000;
        int second = year / 100 % 10;
        int third = year % 100 / 10;
        int fourth = year % 10;
        int NumbLucky = (first + second + third + fourth);
        if (NumbLucky <= 9) {
            System.out.println("Счастливое число - " + NumbLucky);
        } else {
            first = NumbLucky / 10;
            second = NumbLucky % 10;
            NumbLucky = first + second;
            if (NumbLucky <= 9) {
                System.out.println("Счастливое число - " + NumbLucky);
            } else {
                first = NumbLucky / 10;
                second = NumbLucky % 10;
                NumbLucky = first + second;
                if (NumbLucky <= 9) {
                    System.out.println("Счастливое число - " + NumbLucky);
                }
            }
        }
    }

// 15
    public static String customer(double b) {

        int c = (int) Math.floor(b);
        String sum = c + " руб " + (c / 100) + "0" + " коп";

        return sum;
    }

// 16
    public static double mathMet (int a, int b, int c) {

        double res = (Math.sqrt((Math.fma(a, b, c)) * Math.pow(a, b)) / Math.PI);

        return Math.ceil(res);
    }

// 17.1
    public static void assignOne (int y) {
        int x;
        if (y > 10) {
                x = 1;
                System.out.println(x);
//            } else {
//                System.out.println("y less than 10");
        }
    }

// 17.2
    public static double suppose (double score) {
        if (score >= 80 && score <= 90) {
            score += 5;
        }
        return score;
    }

// 17.3
    public static boolean rewrite (int i, int v) {
        boolean item = (i >= 10) || (v < 50);
        return (item);
    }






    public static void main(String[] args) {

        task();
        /** 1
         * ВСЕ!!! результаты должны быть протестированы, для этого необходимо
         * создать метод с названием verifyEquals(expectedResult, actualResult)
         */

        task();
        /** 2
         * Написать метод, который принимает на вход число от 1 до 7
         * и возвращает день недели.
         */

        System.out.println(daysOfTheWeek(0));
        System.out.println(daysOfTheWeek(1));
        System.out.println(daysOfTheWeek(2));
        System.out.println(daysOfTheWeek(3));
        System.out.println(daysOfTheWeek(4));
        System.out.println(daysOfTheWeek(5));
        System.out.println(daysOfTheWeek(6));
        System.out.println(daysOfTheWeek(7));
        System.out.println(daysOfTheWeek(8));
        verifyEquals("Monday", daysOfTheWeek(1));

        task();
        /** 3
         * Example 2 - Given three values x, y, and z, determine the largest
         * value and assign this value to the variable largest
         */
        System.out.println(MathMethod(1, 2, -3));
        verifyEquals(MathMethod(1, 2, -3), 2);

        task();
        /** 4
         * Using nested if statements write a fragment of code that prints
         * the smallest value contained in the variables a, b, and c.
         */
        theSmallestValue(0,2,-13);
        verifyEquals(theSmallestValue(0, 2, -13), -13);

        task();
        /** 5
         * Написать алгоритм вычисления среднего значения из 5 показателей
         * температуры тела кота.
         */
        double t1 = 37.5;
        double t2 = 35.4;
        double t3 = 39.3;
        double t4 = 38.6;
        double t5 = 40.5;

        System.out.println(tempereturaCat(t1, t2, t3, t4, t5));
        // Test
        verifyEquals(tempereturaCat(37.5, 35.4, 39.3, 38.6, 40.5), "38,26");
        verifyEquals(tempereturaCat(37.7, 35.4, 34.3, 35.6, 40.5), "37.1");
        verifyEquals(tempereturaCat(37.7, 35.4, 34.3, 35.6, 40.5), "37.0");

        task();
        /** 6
         * Написать метод, который принимает на вход десятичное число
         * (например, 10.75), и возвращает строку “10 руб 75 коп”.
         */

        System.out.println(printRubles(10.75));

        verifyEquals("10 руб. 75 коп", "10 руб. 75 коп");

        task();
        /** 7
         * Написать метод, который принимает на вход десятичное число и
         * возвращает строку “10 кг 75 гр”.
         */

        System.out.println(wKg(10.75));

        verifyEquals(wKg(10.75), "10 кг. 750 гр.");

        task();
        /** 8
         *Написать метод, который принимает на вход 2 параметра -  цену и
         * количество товара (может быть вес товара, или количество в штуках).
         * Алгоритм возвращает сумму покупки в виде десятичного числа.
         */

        System.out.println(purchase(50, 4));

        verifyEquals(purchase(50,4), "200,00");

        task();
        /** 9
         * Написать метод, который принимает на вход необходимые параметры,
         * и печатает чек.
         * Например:
         *
         * Яблоки
         * Цена за 1 кг			50 руб 13 коп
         * Количество товара	         3 кг 400 гр
         * _______________________________________
         * Сумма к оплате		170 руб 44 коп
         *
         * или
         *
         * Хлеб
         * Цена за 1 шт		30 руб 50 коп
         * Количество товара	5 шт
         */

        String product = "Яблоки";
        double price1 = 50.14;
        double weight1 = 53;
        //System.out.println(ReceptKg(product, price1, weight1));

        double price2 = 14.14;
        int pieces = 6;
        //System.out.println(ReceiptPc(product, price2, pieces));

        task();
        /** 10
         * Написать метод, который принимает на вход количество часов работы
         * в день и стоимость одного часа работы, и возвращает заработную
         * плату в месяц.
         */

        System.out.println(countSalary(12, 166.8));

        verifyEquals(countSalary(12,166.8), "42033 руб 60 коп");

        task();
        /** 11
         * Написать метод, который принимает на вход необходимые параметры и
         * печатает строку ведомости выдачи зарплаты сотрудникам.
         * Например:
         *
         * Смирнова Мария Ивановна 		70000 руб 00 коп
         *
         * Распечатать ведомость для нескольких сотрудников, например:
         *
         * Март 2022
         * Смирнова Мария Ивановна 		70000 руб 00 коп
         * Серебряков Иван Петрович 		128059 руб 00 коп
         */

        task();
        /** 12
         *
         */
        System.out.println(checkX(-3));
        System.out.println(checkX(0));
        System.out.println(checkX(3));

        verifyEquals(checkX(-3), "-3 is negative");
        verifyEquals(checkX(0), "0 is sero");
        verifyEquals(checkX(3), "3 is positive");

        task();
        /** 13
         * Написать метод, который принимает на вход год рождения и возвращает
         * ваше счастливое число. Счастливое число рассчитывается по формуле:
         * сумма всех чисел, если результат больше 9, снова считается сумма
         * всех чисел.
         * Например:
         * год рождения 1999
         * 1 + 9 + 9 + 9 = 28
         * 2 + 8 = 10
         * 1 + 0 = 1
         * Счастливое число - 1
         */

        NumbIsLucky(1983);

        task();
        /** 14
         * а) Дано 3 числа. Необходимо рассчитать разницу между средним
         * значением и медианой (median) значением.
         * Если разница больше 2, необходимо показать сообщение: “Среднее
         * значение … отличается от медианы … на … “.
         * Иначе показать сообщение: “Среднее значение =  …, медиана =  … ”.
         *
         * b) Посчитать все то же самое с помощью методов класса Math, где
         * возможно их использовать
         *
         * *Медиана - это серединное число в отсортированном наборе чисел.
         * 1, 3, 9 → медиана 3
         * 12, 13, 101 → медиана 13
         * 14, 2, 12 → медиана 12
         */

        task();
        /** 15
         * Написать метод, который использует методы класса Math, принимает на
         * вход сумму к оплате (например, 10.75) и округляет сумму в пользу
         * покупателя. Метод возвращает новую сумму к оплате в виде строки,
         * например “10 руб 00 коп”.
         */

         System.out.println(customer(10.75));

         task();
        /** 16
         * Посчитать с помощью методов класса Math
         * a = 3
         * b = 4
         * c = 20
         * "пример с дробью"
         * Вернуть значение с округлением в бОльшую сторону.
         */

        System.out.println( mathMet(3,4,20));

        task();

        System.out.println("17.1---------");
        assignOne(1);
        System.out.println();

        System.out.println("17.2---------");
        System.out.println(suppose(79));
        System.out.println(suppose(80));
        System.out.println();

        System.out.println("17.3---------");
        System.out.println(rewrite(10,50));
        System.out.println();

        System.out.println("17.4---------");






















    }

































}
