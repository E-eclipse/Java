package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        scan.useLocale(Locale.US);

        String[] firms = {"Casio", "Rolex", "Apple"};
        String[][] models = {{firms[0],"G-SHOCK"}, {firms[0],"BABY-G"}, {firms[1],"Submariner"}, {firms[1], "Cosmograph"},
                {firms[2], "Series 7"}, {firms[2], "Series 9"}};

        ArrayList<Object> orders = new ArrayList<>();
        int Number_of_laws = 0;

        int selected_watches = 0;



        do {
            System.out.println("        Новое время");
            System.out.println("1) Я хочу заказать часы");
            System.out.println("2) Мама забери меня отсюда");


            selected_watches = scan.nextInt();

            if (selected_watches == 2) {
                break;
            }

            System.out.println("\n\n\n\n");

            for (int i = 0; i < models.length; i++) {
                System.out.println((i + 1) + ") " + models[i][0] + " - " + models[i][1]);
            }

            System.out.println("\n\nВыберите желаемые часы: ");
            int model = scan.nextInt(); scan.nextLine();
            System.out.println("Ввведите кол-во: ");
            int count = scan.nextInt(); scan.nextLine();
            System.out.println("Введите ФИО: ");
            String phio = scan.nextLine();
            System.out.println("Введите номер телефона: ");
            String number = scan.nextLine();

            int order_number = (int) ((Math.random() * ((9999999 - 1000000))) + 1000000);

            Object[] order = {phio, number, model, count, order_number};
            orders.add(Arrays.asList(order));

            System.out.println(
                    "Заказ номер: " + order[4] +
                    "\nФио заказчика" + order[0] +
                    "\nНомер телефона заказчика: " + order[1] +
                    "\nМодель часов: " + order[2] +
                    "\nКолличество экземпляров: " + order[3]
            );

            System.out.println("\n\n");

            Number_of_laws = Number_of_laws + 1;

        } while (true);
        System.out.println("\n\n\n\n\n\n\n\n ");
        System.out.println("Спасибо за посещение магазина <Новое время>!\nЗаказов сделано: " + Number_of_laws);
    }
}