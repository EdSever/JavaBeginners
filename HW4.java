package homework.JavaBeginners;

public class HW4 {

    public static final String ANSI_GREEN = "\u001B[32m";

       public static void main(String[] args) {

        String Tabulation = "\n" + "-".repeat(100);
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
        }
        else {
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
           }
        else {
            System.out.println("Вывод значения: Вывод 2");
        }

        System.out.println("\n3.6) (\"Глаза даны, чтобы видеть\") " +
                   "И (\"Под третьим этажом находится второй этаж\");\n");

        String usl1 = "видеть";
        int etag2 = 2;
        int etag3 = 3;

        if (usl1.equals("видеть") && (etag2 == etag3 - 1)) {
            System.out.println("Вывод значения: Вывод 1");
        }
        else {
            System.out.println("Вывод значения: Вывод 2");
        }

        System.out.println("\n3.7) (6/2 = 3) ИЛИ (7*5 = 20);\n");

        if ((6/2 == 3) || (7*5 == 20)) {
            System.out.println("Вывод значения: Вывод 1");
        }
        else {
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
           }
        else {
               System.out.println("Вывод значения: Вывод 2");
           }

        System.out.println("\n4.2) !(28 > 7) И !(300/5 = 60);\n");

        if (!(28 > 7) && !(300/5 == 60)) {
            System.out.println("Вывод значения: Вывод 1");
        }
        else {
            System.out.println("Вывод значения: Вывод 2");
        }

        System.out.println("\n4.3) (\"Телевизор - электрический " +
                "прибор\") И (\"Стекло - дерево\");\n");

        String televizor = "электрический прибор";
        String steklo = "Стекло";
        String derevo = "Дерево";

        if (televizor.equals("электрический прибор") && (steklo == derevo)) {
            System.out.println("Вывод значения: Вывод 1");
        }
        else {
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
        }
        else {
            System.out.println("Нельзя получить водительские права");
        }

        System.out.println(Tabulation);
        System.out.println("7. Петя не едет в автобусе, но при этом " +
                "читает книгу или не смотрит в окно\n");












    }

}
