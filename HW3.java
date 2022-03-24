package homework.JavaBeginners;

import static java.lang.Byte.MAX_VALUE;

public class HW3 {

    public static void main(String[] args) {

        System.out.println("------------------------------------------------" +
                "---------------------------------------------------------");
        System.out.println("Если необходимо выбрать тип переменных, " +
                "выбираем тип данных с минимально достаточным диапазоном " +
                "значений; \nили выбираем тот тип, который позволяет " +
                "хранить максимально точное значение.");
        System.out.println("------------------------------------------------" +
                "---------------------------------------------------------");

        byte a = 127;
        byte b = -128;

        System.out.println("2. Создать переменные a и b типа byte, " +
                "присвоить им значения из допустимого диапазона.");
        System.out.println();

        System.out.println("byte a = " + a);
        System.out.println("byte b = " + b);
        System.out.println("Максимальное значение byte = " + MAX_VALUE);
        System.out.println("Минимальное значение byte = " + Byte.MIN_VALUE);
        System.out.println();
        System.out.println("------------------------------------------------" +
                "---------------------------------------------------------");

        System.out.println("3. Создать переменные s и t типа short, " +
                "присвоить им негативное и позитивное значения " +
                "с разницей 60000.");
        System.out.println();

        short s = 30000;
        short t = -30000;

        System.out.println("s = " + s);
        System.out.println("t = " + t);
        System.out.println("Разница между переменными s и t = " +
                Short.valueOf(s).compareTo(Short.valueOf(t)));
        System.out.println("Максимальное значение short = " + Short.MAX_VALUE);
        System.out.println("Минимальное значение short = " + Short.MIN_VALUE);
        System.out.println();
        System.out.println("------------------------------------------------" +
                "---------------------------------------------------------");

        System.out.println("4. Создать переменную i типа int и присвоить ей" +
                " минимально возможное значение этого типа. \nЗатем присвоить" +
                " максимально возможное значение этого типа. " +
                "\nРаспечатать оба значения в виде таблицы");
        System.out.println();

        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;

        System.out.println("------------------------------------------------");
        System.out.println("| int min                    |  " + i2 + "    |");
        System.out.println("------------------------------------------------");
        System.out.println("| int max                    |  " + i + "     |");
        System.out.println("------------------------------------------------");
        System.out.println();
        System.out.println("------------------------------------------------" +
                "---------------------------------------------------------");

        int number = 5338371;
        int cityCode = 843;
        String kod = "+7";
        String parentheses1 = "(";
        String parentheses2 = ")";
        String phoneNumber = kod + parentheses1 + cityCode +
                parentheses2 + number;


        System.out.println("5. Создать переменную phoneNumber и присвоить " +
                "ей значение номера телефона с кодом страны и города \nможно" +
                " ненастоящий номер телефона, например, 18009998877)");
        System.out.println();
        System.out.println("phoneNumber = " + phoneNumber);
        System.out.println();
        System.out.println("------------------------------------------------" +
                "---------------------------------------------------------");


        System.out.println("6. Создать переменную f типа float и присвоить " +
                "ей значение 100.101101. ");
        System.out.println("Создать переменную d типа double и присвоить" +
                " ей значение 100.101101.");
        System.out.println("Распечатать результат в виде таблицы.");
        System.out.println();

        float f =  100.101101F;
        double d = 100.101101D;

        System.out.println("------------------------------------------------");
        System.out.println("| float f = 100.101101    |  " + f + "        |");
        System.out.println("------------------------------------------------");
        System.out.println("| double d = 100.101101   |  " + d + "        |");
        System.out.println("------------------------------------------------");
        System.out.println();
        System.out.println("------------------------------------------------" +
                "---------------------------------------------------------");

        System.out.println("7a. Создать переменную типа Double с именем " +
                "dd  и инициализировать её результатом \nсуммы " +
                "чисел 10.09999 и 20.099999.");
        System.out.println();

        double dd1 = 10.09999;
        double dd2 = 20.09999;
        double dd = dd1 + dd2;

        System.out.println("7b. Создать переменную типа Float с именем " +
                "ff  и инициализировать её результатом \nсуммы " +
                "чисел 10.09999 и 20.099999. \n");

        float ff1 = 10.09999F;
        float ff2 = 20.09999F;
        float ff = ff1 + ff2;

        System.out.println("------------------------------------------------");
        System.out.println("| float ff       |  " + ff + "                  |");
        System.out.println("------------------------------------------------");
        System.out.println("| double dd      |  " + dd + "         |");
        System.out.println("------------------------------------------------");
        System.out.println();
        System.out.println("------------------------------------------------" +
                "---------------------------------------------------------");

        System.out.println("8. Создать переменную result и присвоить ей " +
                "значение выражения 10 / 3 (с максимальной точностью)");
        System.out.println();

        double result = 10/3D;

        System.out.println("result = " + result);
        System.out.println();
        System.out.println("------------------------------------------------" +
                "---------------------------------------------------------");

        System.out.println("9. Создать переменные sum, product, quotient и " +
                "remainder, и  присвоить им значения " +
                "\nвычислений переменных f и d");
        System.out.println();

        double sum = f + d;
        double product = f * d;
        double quotient = f / d;
        double remainder = f % d;

        System.out.println("sum = " + sum);
        System.out.println("product = " + product);
        System.out.println("quotient = " + quotient);
        System.out.println("remainder = " + remainder);
        System.out.println();
        System.out.println("------------------------------------------------" +
                "---------------------------------------------------------");

        System.out.println("10. Распечатать слово HELLO точками");
        System.out.println("" +
                "\n.     .    . . . .    .          .          . . . ." +
                "\n.     .    .          .          .          .     ." +
                "\n. . . .    . . . .    .          .          .     ." +
                "\n.     .    .          .          .          .     ." +
                "\n.     .    . . . .    . . . .    . . . .    . . . .");
        System.out.println();
        System.out.println("------------------------------------------------" +
                "---------------------------------------------------------");

        System.out.println("11. Создать переменные подходящего ссылочного " +
                "типа данных(выбирать минимально достаточный " +
                "диапазон значений)");
        System.out.println();

        byte t1 = 0;
        short t2 = 150;
        byte t3 = -120;
        double t4 = -505.505;
        int t5 = 100100;
        long t6 = 100010001000L;
        double t7 = 2.66666666666666;
        double t8 = - 1000000.001;
        int t9 = 1010;


        System.out.println("t1 = " + t1);
        System.out.println("t2 = " + t2);
        System.out.println("t3 = " + t3);
        System.out.println("t4 = " + t4);
        System.out.println("t5 = " + t5);
        System.out.println("t6 = " + t6);
        System.out.println("t7 = " + t7);
        System.out.println("t8 = " + t8);
        System.out.println("t9 = " + t9);
        System.out.println();
        System.out.println("------------------------------------------------" +
                "---------------------------------------------------------");

        System.out.println("12. С помощью полей классов ссылочного " +
                "типа распечатать таблицу");

        System.out.println("" +
                "\n---------------------------------------------------------" +
                "------------------" +
                "\n| Type   | Size in bits | min                    | max   " +
                "                 |" +
                "\n----------------------------------------------------------" +
                "----------------" +
                "\n| byte   | 8            | " + Byte.MIN_VALUE + "          " +
                "         | " + MAX_VALUE + "                    |" +
                "\n---------------------------------------------------------" +
                "------------------" +
                "\n| short  | 16           | " + Short.MIN_VALUE + "       " +
                "          | " + Short.MAX_VALUE + "                  |" +
                "\n---------------------------------------------------------" +
                "------------------" +
                "\n| int    | 32           | " + Integer.MIN_VALUE + "      " +
                "      | " + Integer.MAX_VALUE + "             |" +
                "\n---------------------------------------------------------" +
                "------------------" +
                "\n| long   | 64           | " + Long.MIN_VALUE + "   | "
                + Long.MAX_VALUE + "    |" +
                "\n----------------------------------------------------------" +
                "-----------------" +
                "\n| float  | 32           | " + Float.MIN_VALUE + "         " +
                "       | " + Float.MAX_VALUE + "           |" +
                "\n----------------------------------------------------------" +
                "-----------------" +
                "\n| double | 64           | " + Double.MIN_VALUE + "        " +
                "       | " + Double.MAX_VALUE + " |" +
                "\n----------------------------------------------------------" +
                "-----------------");
        System.out.println();
        System.out.println("------------------------------------------------" +
                "---------------------------------------------------------");

        System.out.println("13. Создать 2 переменные референсного типа " +
                "Integer - num1 и num2, присвоить им одинаковые значения, " +
                "\nсравнить 2 переменные друг с другом с помощью метода .equal." +
                "\nВывести результат сравнения на печать в виде выражения:\n" +
                "“Если num1 = num2, то результат сравнения " +
                "методом .equal = …”\n" +
                "\n" +
                "Присвоить переменным разные значения, сравнить, " +
                "и вывести результат на печать:\n" +
                "“Если num1 не равно num2, то результат сравнения " +
                "методом .equal = …”\n");
        System.out.println();

        int num1 = 10;
        int num2 = 10;
        boolean num3;
        num3 = num1 == num2;
        int num4 = 11;
        boolean num5;
        num5 = num4 == num2;

        System.out.println("Если num1 = num2, то результат сравнения " +
                "методом .equal = " + num3);
        System.out.println();
        System.out.println("Если num1 не равно num2, то результат " +
                "сравнения методом .equal = " + num5);
        System.out.println();
        System.out.println("------------------------------------------------" +
                "---------------------------------------------------------");

        System.out.println("14. Создать 2 переменные примитивного типа int - " +
                "number1 and number2. Инициализаровать их\n" +
                "а) одинаковыми значениями\n" +
                "b) number1 < number2\n" +
                "c) number1 > number2\n" +
                "сравнить их подходящим методом класса Integer (посмотрите, " +
                "какой метод подойдет), и вывести результаты " +
                "\nсравнения на печать в виде выражений:\n" +
                "“Если number1 = number2, то результат сравнения " +
                "методом … = …”\n" +
                "“Если number1 < number2, то результат сравнения " +
                "методом … = …”\n" +
                "“Если number1 > number2, то результат сравнения " +
                "методом … = …”\n");

        int number1 = 10;
        int number2 = 10;
        int number3 = 20;
        int number4 = 5;

        System.out.println("Если number1 = number2, то результат сравнения " +
                "методом compare(int x, int y) = "
                + Integer.compare(number1, number2));
        System.out.println("Если number1 < number2, то результат сравнения " +
                "методом compare(int x, int y) = "
                + Integer.compare(number1, number3));
        System.out.println("Если number1 > number2, то результат сравнения " +
                "методом compare(int x, int y) = "
                + Integer.compare(number1, number4));
        System.out.println();
        System.out.println("------------------------------------------------" +
                "---------------------------------------------------------");

        System.out.println("15. Создать переменную типа Float, присвоить " +
                "ей значение 234.9999 и распечатать значение в int");
        System.out.println();

        float fl = 234.9999F;
        int fl2 = (int)fl;

        System.out.println("Переменная Float = " + fl2);
        System.out.println();
        System.out.println("------------------------------------------------" +
                "---------------------------------------------------------");

        System.out.println("16. С помощью метода sum() класса Double " +
                "посчитать сумму двух переменных типа double.");
        System.out.println();

        double d1 = 12.13;
        double d2 = 15.00010001;
        double d3 = Double.sum(d1, d2);

        System.out.println(d3);
        System.out.println();
        System.out.println("------------------------------------------------" +
                "---------------------------------------------------------");

        System.out.println("17. С помощью метода sum() класса Integer " +
                "посчитать сумму двух переменных типа Integer.");
        System.out.println();

        int in1 = 13;
        int in2 = 17;
        int in3 = Integer.sum(in1, in2);

        System.out.println(in3);
        System.out.println();
        System.out.println("------------------------------------------------" +
                "---------------------------------------------------------");

        System.out.println("18. Создать 2 переменные типа Short:\n" +
                "short1 = 12000\n" +
                "short2 = 12300\n" +
                "a) Распечатать фразу:\n" +
                "“12000 - 12300 = -300”\n" +
                "где значение -300 выведено с помощью метода класса Short, " +
                "а не операцией вычисления\n" +
                "b) Присвоить переменной short1 значение 12500, вывести " +
                "фразу:“12500 - 12300 = 200”\n" +
                "где значение 200 выведено с помощью метода класса Short, " +
                "а не операцией вычисления\n");

        short short1 = 12000;
        short short2 = 12300;

        System.out.println("a) 12000 - 12300 = "
                + Short.compare(short1, short2));

        short short3 = 12500;

        System.out.println("b) 12500 - 12300 = "
                + Short.compare(short3, short2));
        System.out.println();
        System.out.println("------------------------------------------------" +
                "---------------------------------------------------------");

        System.out.println("19. Создать переменные:\n" +
                "String str1 = \"123.56\";\n" +
                "String str2 = \"123.55\";\n" +
                "Double doub1 = 123.56;\n" +
                "Double doub2 = 123.55;\n" +
                "\n" +
                "Распечатать результат doub1 - doub2\n" +
                "\n" +
                "Используя методы ссылочного типа данных, посчитать и " +
                "распечатать результат str1 - str2\n");

        String str1 = "123.56";
        String str2 = "123.55";
        Double doub1 = 123.56;
        Double doub2 = 123.55;
        Double dou = doub1 - doub2;
        String st12 = str1 + " - " + str2;

        System.out.println("doub1 - doub2 = " + dou);
        System.out.println("str1 - str2 = " + st12);
        System.out.println();
        System.out.println("------------------------------------------------" +
                "---------------------------------------------------------");

        System.out.println("20. Создать переменную подходящего типа данных " +
                "для хранения результатов измерения температуры тела кота " +
                "\n(значения температуры в Цельсиях). Присвоить этой " +
                "переменной сначала максимальное значение, затем " +
                "\nминимальное значение. Посчитать и распечатать среднее " +
                "значение, округленное с помощью метода класса Math. " +
                "\nРаспечатать результат среднего значения температуры " +
                "тела кота.");
        System.out.println();

        double kot1 = 37.5;
        double kot2 = 39.5;
        double kot3 = (kot1 + kot2) / 2;
        long kot4 = Math.round(kot3);

        System.out.println("Максимальная температура кота = "
                + Double.max(kot1, kot2) + " °C");
        System.out.println("Минимальная температура кота = "
                + Double.min(kot1, kot2) + " °C");
        System.out.println("Среднее значение температуры кота = "
                + kot4 + " °C");
        System.out.println();
        System.out.println("------------------------------------------------" +
                "---------------------------------------------------------");









    }
}
