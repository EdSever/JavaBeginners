package homework.JavaBeginners;

public class HW2 {

    public static void main(String[] args) {

        int k = 5;
        int l = 10;
        int m = 15;
        int sumKL = k + l;
        int genKM = k * m;
        int diffLM = l - m;
        int divKL = k / l;
        int divKM = k / m;
        int divLM = l / m;
        int divMK = m / k;
        int divML = m / l;
        int divLK = l / k;
        int apple1 = 40;
        int student1 = 6;
        int studentApple1 = apple1 / student1;
        int teacherApple1 = apple1 % student1;
        int apple2 = 100;
        int student2 = 21;
        int studentApple2 = apple2 / student2;
        int teacherApple2 = apple2 % student2;

        System.out.println("12. Вывести значения переменных в столбик");
        System.out.println(k);
        System.out.println(l);
        System.out.println(m);
        System.out.println();

        System.out.println("13. Вывести значения переменных в строку");
        System.out.println("" + k + " " + l + " " + m);
        System.out.println();

        System.out.print("14. Вывести значения переменных");
        System.out.println(" в строку через запятую");
        System.out.println(k + ", " + l + ", " + m + ", ");
        System.out.println();

        System.out.print("15. Вывести значения этих переменных так,");
        System.out.print(" чтобы было понятно, ");
        System.out.println("какое значение к какой переменной относится.");
        System.out.println("k = " + k);
        System.out.println("l = " + l);
        System.out.println("m = " + m);
        System.out.println();

        System.out.print("16. Распечатать следующие выражения,");
        System.out.print(" где вместо … будет выведен ");
        System.out.println("результат арифметической операции:");
        System.out.println("Сумма переменных k и l = " + sumKL);
        System.out.println("Умножение переменных k и m = " + genKM);
        System.out.println("Разность переменных l и m = " + diffLM);
        System.out.println();

        System.out.println("17. Распечатать следующие выражения: ");
        System.out.print("Результат деления k на l = " + divKL + ",");
        System.out.println(" а остаток от деления = " + (k % l));
        System.out.print("Результат деления k на m = " + divKM + ",");
        System.out.println(" а остаток от деления = " + (k % m));
        System.out.print("Результат деления l на m = " + divLM + ",");
        System.out.println(" а остаток от деления = " + (l % m));
        System.out.print("Результат деления m на k = " + divMK + ",");
        System.out.println(" а остаток от деления = " + (m % k));
        System.out.print("Результат деления m на l = " + divML + ",");
        System.out.println(" а остаток от деления = " + (m % l));
        System.out.print("Результат деления l на k = " + divLK + ",");
        System.out.println(" а остаток от деления = " + (l % k));
        System.out.println();

        System.out.print("18. Создать переменные apple и student и присвоить");
        System.out.print(" им значения 40 и 6 соотетственно. ");
        System.out.println("Распечатать выражение:");
        System.out.print("Если " + apple1 + " яблок поделить на " + student1);
        System.out.print(" учеников, то каждый ученик получит по ");
        System.out.print(studentApple1 + " яблок, и " + teacherApple1);
        System.out.println(" яблок(а) останется учителю.");
        System.out.println();
        System.out.print("Распечатать это же выражение со ");
        System.out.println("значениями 100 и 21:");
        System.out.print("Если " + apple2 + " яблок поделить на " + student2);
        System.out.print(" учеников, то каждый ученик получит по ");
        System.out.print(studentApple2 + " яблок, и " + teacherApple2);
        System.out.println(" яблок(а) останется учителю.");
        System.out.println();

        System.out.println("19. Распечатать вычисления и итоговый результат:");

        int m2 = m;
        int m3 = m;
        m++;
        int sumKLM1 = k + l + m; // 5 + 10 + 15+1 = 31
        int sumKLM2 = k + l + --m2; // 5 + 10 + 15 -1 = 29
        int sumKLM = sumKLM1 + sumKLM2;
        int sumLKM = k + l + m3;
        int diffLKM = m - sumLKM;

        System.out.println("sumKLM1 = " + sumKLM1);
        System.out.println("sumKLM2 = " + sumKLM2);
        System.out.println("Сумма чисел k, l, m++ и sumKLM-- = " + sumKLM);
        System.out.println("а разность m++ и sumLKM = " + diffLKM);
        System.out.println();

        System.out.print("20. Показать, что число 48 кратно 8" );
        System.out.print(" и что оба этих числа - четные. ");
        System.out.println("А числа 47 и 49 - нечетные.");

        int even1 = 48 % 8;
        int even2 = 48 % 2;
        int even3 = 8 % 2;
        int odd1 = 47 % 2;
        int odd2 = 49 % 2;

        System.out.println("48 кратно 8 = " + even1);
        System.out.println("48 четное = " + even2);
        System.out.println(" 8 четное = " + even3);
        System.out.println("47 нечетное = " + odd1);
        System.out.println("49 нечетное = " + odd2);
        System.out.println();

        int x = 2;
        int y = 3;
        int a = k;
        int b = l;
        int c = m3;
        int d = y - x;
        int rezult21 = (x + 3) * (x + 3);
        double rezult22 = ((1.0*(3+4*x)/5)) - (1.0*(10*(y-5)*(a+b+c)/x)) +
                (1.0 *(9*(4/x + (1.0*(9+x)/y))));
        double rezult23 = ((1.0*(5*x+7*y)/(8*x+10*y)) / (1.0*(3*x-y)/(x+y))) /
                ((a+b+(1.0*c/d)+(1.0*(a+b)/(c+d))+a*b));

        System.out.println("-------------------------------");
        System.out.println("| task | result               |");
        System.out.println("-------------------------------");
        System.out.println("| 21   | " + rezult21 + "                   |");
        System.out.println("-------------------------------");
        System.out.println("| 21   | " + rezult22 + "                |");
        System.out.println("-------------------------------");
        System.out.println("| 21   | " + rezult23 + " |");
        System.out.println("-------------------------------");
    }
}
