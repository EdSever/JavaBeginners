package homework.JavaBeginners;

public class HW4 {

    public static void text(int k, int l, int m) {

        System.out.println("Результат деления k на l = " + (k / l) + " а остаток от деления = " + (k % l) + "\n" +
                "Результат деления k на m = " + (k / m) + " а остаток от деления = " + (k % m) + "\n" +
                "Результат деления k на k = " + (k / k) + " а остаток от деления = " + (k % k) + "\n" +
                "Результат деления l на m = " + (l / m) + " а остаток от деления = " + (l % m) + "\n" +
                "Результат деления l на k = " + (l / k) + " а остаток от деления = " + (l % k) + "\n" +
                "Результат деления l на l = " + (l / l) + " а остаток от деления = " + (l % l) + "\n" +
                "Результат деления m на k = " + (m / k) + " а остаток от деления = " + (m % k) + "\n" +
                "Результат деления m на l = " + (m / l) + " а остаток от деления = " + (m % l) + "\n" +
                "Результат деления m на m = " + (m / m) + " а остаток от деления = " + (m % m));
    }

    public static void apple (int apple, int student) {

        System.out.println("Если " + apple + " яблок поделить на " + student +
                " учеников, то каждый ученик получит по " + apple / student +
                " яблок(а), и " + apple % student + " яблок(а) останется " +
                "учителю.");
    }

    public static void main(String[] args) {

        String Tabulation = "\n" + "-".repeat(100);
        int task = 12;
        String Tabulation2 = "-".repeat(48);
        System.out.println(Tabulation);

        System.out.println("3. Записать в виде кода следующие логические " +
                "выражения:");
        System.out.println("\n3.1) (2 = 2) И (7 = 7);\n");

        if (2 == 2 && 7 == 7) {
            System.out.println("Вывод значения: (2 = 2) И (7 = 7);");
        }

        System.out.println("\n3.2) Не(15 < 3);");

        if (!(15 < 3)) {
            System.out.println("\nВывод значения: Не(15 < 3)");
        }
        System.out.println();

        System.out.println("3.3) (\"Сосна\" = \"Дуб\") ИЛИ (\"Вишня\" = " +
                "\"Клён\");\n");

        if ("Сосна" == "Дуб" || "Вишня" == "Клён") {
            System.out.println("Вывод значения: Вывод 1");
        } else {
            System.out.println("Вывод значения: Вывод 2");
        }

        System.out.println("\n3.4) Не(\"Сосна\" = \"Дуб\");\n");

        if (!("Сосна" == "Дуб")) {
            System.out.println("Вывод значения: Не(\"Сосна\" = \"Дуб\");");
        }

        System.out.println("\n3.5) (Не(15 < 3)) И (10 > 20);");
        System.out.println();

        if (!(15 < 3) && (10 > 20)) {
            System.out.println("Вывод значения: Вывод 1");
        } else {
            System.out.println("Вывод значения: Вывод 2");
        }

        System.out.println("\n3.6) (\"Глаза даны, чтобы видеть\") " +
                "И (\"Под третьим этажом находится второй этаж\");\n");

        String usl1 = "видеть";
        int etag2 = 2;
        int etag3 = 3;

        if (usl1.equals("видеть") && (etag2 == etag3 - 1)) {
            System.out.println("Вывод значения: Вывод 1");
        } else {
            System.out.println("Вывод значения: Вывод 2");
        }

        System.out.println("\n3.7) (6/2 = 3) ИЛИ (7*5 = 20);\n");

        if ((6 / 2 == 3) || (7 * 5 == 20)) {
            System.out.println("Вывод значения: Вывод 1");
        } else {
            System.out.println("Вывод значения: Вывод 2");
        }

        System.out.println(Tabulation);
        System.out.println("4. Записать в виде кода:");
        System.out.println("\n4.1) (\"В минуте 70 секунд\") ИЛИ " +
                "(\"Работающие часы показывают время\");\n");

        int minuta = 60;
        String clock = "time";

        if ((minuta == 70) || clock.equals("time")) {
            System.out.println("Вывод значения: Вывод 1");
        } else {
            System.out.println("Вывод значения: Вывод 2");
        }

        System.out.println("\n4.2) !(28 > 7) И !(300/5 = 60);\n");

        if (!(28 > 7) && !(300 / 5 == 60)) {
            System.out.println("Вывод значения: Вывод 1");
        } else {
            System.out.println("Вывод значения: Вывод 2");
        }

        System.out.println("\n4.3) (\"Телевизор - электрический " +
                "прибор\") И (\"Стекло - дерево\");\n");

        String televizor = "электрический прибор";
        String steklo = "Стекло";
        String derevo = "Дерево";

        if (televizor.equals("электрический прибор") && (steklo == derevo)) {
            System.out.println("Вывод значения: Вывод 1");
        } else {
            System.out.println("Вывод значения: Вывод 2");
        }

        System.out.println("\n4.4) Не((300 < 100))  → (\"Жажду можно " +
                "утолить водой\");\n");

        if (!(300 < 100)) {
            System.out.println("Жажду можно утолить водой");
        }

        System.out.println("\n4.5) (75 < 81) → (88 = 88);\n");

        if (75 < 81) {
            System.out.println("88 == 88");
        }

        System.out.println(Tabulation);
        System.out.println("5. Записать в виде кода следующие выражения:");
        System.out.println("\n5а) Андрей старше Светы. Наташа старше Светы.\n");

        int andrei = 30;
        int sveta = 25;
        int natasha = 28;
        if ((andrei > sveta) && (natasha > sveta)) {
            System.out.println("Света младше Андрея и Наташи!");
        }
        System.out.println("\n5б) На полке стоят учебники, а на столе " +
                "лежат справочники.\n");

        String textbooks = "shelf";
        String directory = "table";

        if (textbooks.equals("shelf")) {
            System.out.println("Учебники стоят на полке");
        }
        if (directory.equals("table")) {
            System.out.println("Справочники лежат на столе");
        }

        System.out.println("\n5в) БОльшая часть детей — девочки. " +
                "Остальные - мальчики.\n");

        int children = 30;
        int girls = 20;
        if (children / 2 < girls) {
            System.out.println("БОльшая часть детей — девочки");
            int boys = children - girls;
            System.out.println("Мальчиков = " + boys);
        }

        System.out.println(Tabulation);
        System.out.println("6. Водительские права можно получить, " +
                "только когда исполнится 16 лет.\n");

        int prava = 16;
        int voditel = 20;
        if (voditel >= prava) {
            System.out.println("Можно получить водительские права");
        } else {
            System.out.println("Нельзя получить водительские права");
        }

        System.out.println(Tabulation);
        System.out.println("7. Петя не едет в автобусе, но при этом " +
                "читает книгу или не смотрит в окно\n");

        String pet1 = "едет в автобусе";
        String pet2 = "читает книгу";
        String pet3 = "смотрит в окно";

        //pet = (!pet1 && (pet2 || !pet3));

        System.out.println(Tabulation);
        System.out.println("8. Если с другом ты, это хорошо, а когда " +
                "наоборот - плохо\n");

        String you = "friends";

        if (you.equals("friends")) {
            System.out.println("Если с другом ты, это хорошо");
        } else {
            System.out.println("Если ты без друга, это плохо");
        }

        System.out.println(Tabulation);
        System.out.println("9. Записать выражения в виде условий if-else:");
        System.out.println("* Если тебе больше 18 лет, то ты взрослый. " +
                "Иначе, ты - ребенок.\n");

        int to = 18;
        if ((to >= 18) && (to >= 0) && (to <= 150)) {
            System.out.println("Ты взрослый человек!");
        }
        if ((to < 0) || (to >= 150)) {
            System.out.println("Вы ввели не корректные данные");
        }
        if ((to >= 0) && (to < 18)) {
            System.out.println("Ты ещё ребенок!");
        }


        System.out.println("\n* Если земля сухая, значит, нет дождя. " +
                "Если земля мокрая, то идет дождь.\n");

        /**Влажность земли берется из диапазона:
         *  от -бесконечности до 0 - это сухая земля
         *  от 1 до +бесконечности - это влажная земля
         *  + значение переменной rain должно быть наличие дождя с неба,
         *  а не поливыали землю например из лейки!
         */

        int earth = 1;
        String rain = "Дождь"; //
        if ((earth >= 0) && (rain.equals("Дождь"))) {
            System.out.println("То идет дождь.");
        } else {
            System.out.println("Значит нет дождя.");
        }

        System.out.println("\n* Если земля сухая, значит, нет дождя. " +
                "Если земля мокрая, то идет дождь. Иначе идет снег. \n");

        String dry = "Сухая";
        if (dry == "Сухая") {
            System.out.println("\u001B[32m" + "Если земля сухая," +
                    "\u001B[31m" + " значит, нет дождя" + "\u001B[0m");
        } else if (dry == "Мокрая") {
            System.out.println("\u001B[32m" + "Если земля мокрая " +
                    "\u001B[31m" + "то идет дождь" + "\u001B[0m");
        } else {
            System.out.println("\u001B[34m" + "Иначе идёт снег" + "\u001B[31m");
        }

        System.out.println("\n* Если на небе тучи, идет дождь, " +
                "иначе идет “слепой” дождь.\n");

        String sky = "Тучи";
        if (sky.equals("Тучи")) {
            System.out.println("Если на небе тучи, идет дождь");
        } else {
            System.out.println("Иначе идет “слепой” дождь");
        }

        System.out.println("\n* Если сегодня суббота, значит, завтра " +
                "воскресенье. Если сегодня пятница, значит, вчера был " +
                "четверг. \nИначе вчера был не четверг, а завтра - " +
                "не воскресенье\n");

        String day = "пятница";
        if (day == "суббота") {
            System.out.println("Если сегодня суббота, значит, завтра " +
                    "воскресенье");
        } else if (day == "пятница") {
            System.out.println("Если сегодня пятница, значит, " +
                    "вчера был четверг");
        } else {
            System.out.println("Иначе вчера был не четверг, а завтра - " +
                    "не воскресенье");
        }

        System.out.println("\n* Если на горе свистнул рак, значит, " +
                "прошла вечность, иначе ждите дальше.");

        String mountain = "свистнул рак1";
        if (mountain.equals("свистнул рак")) {
            System.out.println("Если на горе свистнул рак, значит, " +
                    "прошла вечность");
        } else {
            System.out.println("Если на горе не свистнул рак, " +
                    "иначе прошла вечность");
        }

        System.out.println("\n* Если тебе 18 или ты закончил школу, то ты " +
                "можешь не жить с родителями, иначе живи с родителями.\n");

        int age = 18;
        String age1 = "ты закончил школу";
        if ((age >= 18) || (age1 == "ты закончил школу")) {
            System.out.println("то ты можешь не жить с родителями");
        } else {
            System.out.println("иначе живи с родителями.");
        }

        System.out.println(Tabulation);
        System.out.println("10. Проверьте число на четность. Если число " +
                "четное, удвойте это число, иначе возведите число в квадрат.\n" +
                "Выведите результат работы алгоритма на печать.\n");

        int nm = 4;

        if (nm % 2 == 0) {
            nm = nm * 2;
            {
                System.out.println("nm = " + nm);
            }
        } else {
            nm = nm * nm;
            System.out.println("nm = " + nm);
        }

        System.out.println(Tabulation);
        System.out.println("11. Напишите алгоритм проверки возраста на " +
                "соответствие условиям (if-else):\n" +
                "Голосовать можно с 18 лет\n" +
                "Машину можно водить с 16 лет\n" +
                "В школу можно идти с 5 лет\n" +
                "Выведите результат работы алгоритма на печать.\n");

        int ag = 17;
        if (ag >= 18) {
            System.out.println("Голосовать можно с 18 лет");
        } else {
            System.out.println("Голосовать нельзя");
        }

        if (ag >= 16) {
            System.out.println("Машину можно водить с 16 летт");
        } else {
            System.out.println("Машину водить нельзя");
        }

        if (ag >= 5) {
            System.out.println("В школу можно идти с 5 лет");
        } else {
            System.out.println("В школу нельзя идти");
        }

        System.out.println(Tabulation2 + task + Tabulation2);
        /**Напишите алгоритм программы, которая проверяет оценку ученика и в
         * ыполняет следующие действия:
         * a) 5 - выдать похвальную грамоту и перевести в следующий класс
         * b) 4 - перевести в следующий класс
         * c) 3 - дать задание на лето и перевести в следующий класс
         * d) 2 - вызвать родителей и оставить в текущем классе на второй год
         */
        int student = 4;
        if (student == 5) {
            System.out.println("Выдаем похвальную грамоту и переводим " +
                    "в следующий класс");
        } else if (student == 4) {
            System.out.println("Переводим в следующий класс");
        } else if (student == 3) {
            System.out.println("Дать задание на лето и перевести в " +
                    "ледующий класс");
        } else if (student == 2) {
            System.out.println("Вызвать родителей и оставить в текущем " +
                    "классе на второй год");
        } else {
            System.out.println("Таких оценок не используют в этой школе!");
        }

        System.out.println(Tabulation2 + ++task + Tabulation2);
        /**
         * Напишите алгоритм программы, которая проверяет 2 числа.
         * Программа складывает числа, которые делятся на 3 без остатка,
         * и вычитает числа, которые делятся на 5 без остатка. Программа
         * умножает числа, которые делятся на 2 без остатка, но если хотя
         * бы одно число отрицательное, программа умножает результат
         * предыдущего действия на (-1).
         * Если числа не прошли ни одну проверку, программа выводит на
         * печать ошибку о невозможности произвести действия.
         */

        int r = 30;
        int t = -30;

        if (r % 3 == 0 && t % 3 == 0) {
            int sumrt = t + r;
            System.out.println("sumrt = " + sumrt);
        }
        if (r % 5 == 0 && t % 5 == 0) {
            int subrt = r - t;
            System.out.println("subrt = " + subrt);
        }
        if (r % 2 == 0 && t % 2 == 0) {
            long multrt = r * t;
            System.out.println("multrt = " + multrt);
            if (r < 0 || t < 0) {
                long multrn2 = multrt * -1;
                System.out.println("multrn2 = " + multrn2);
            }
        }

        System.out.println(Tabulation2 + ++task + Tabulation2);
        /**
         * Распечатать следующие выражения, используя метод и параметры:
         * Результат деления k на l = …, а остаток от деления  = …
         * Результат деления k на m = …, а остаток от деления  = …
         * Результат деления l на m = …, а остаток от деления  = …
         * Результат деления m на k = …, а остаток от деления  = …
         * И так далее все возможные варианты.
         */

        text(10, 20, 30);

        System.out.println(Tabulation2 + ++task + Tabulation2);
        /**
         *Создать переменные apple и  student и присвоить им значения 40 и 6
         * соответственно. Распечатать выражение:
         * Если … яблок(а) поделить на … учеников, то каждый ученик получит
         * по … яблок(a), и … яблок(а) останется учителю.
         * Распечатать это же выражение со значениями 100 и 21.
         */

        apple(40, 6);
        apple(100, 21);

        System.out.println(Tabulation2 + ++task + Tabulation2);
        /**
         *Написать метод так, чтобы правильные склонения слов
         * (н-р, яблок или яблока) печатались автоматически в зависимости от
         * значений параметров.
         * Распечатать выражение с параметрами:
         * apple = 42, 55, 1
         * student = 42, 5, 2
         */








    }
}
