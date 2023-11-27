package practice;

import java.util.Scanner;

public class TrucksAndContainers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //получение количество коробок от пользователя
        int boxes = scanner.nextInt();

        // TODO: вывести в консоль коробки разложенные по грузовикам и контейнерам
        // пример вывода при вводе 2
        // для отступа используйте табуляцию - \t

        /*
        Грузовик: 1
            Контейнер: 1
                Ящик: 1
                Ящик: 2
        Необходимо:
        грузовиков - 1 шт.
        контейнеров - 1 шт.
        */

        int container = boxes / 27 + (boxes % 27 == 0 ? 0 : 1);
        int truck = container / 12 + (container % 12 == 0 ? 0 : 1);
        int boxesNumber = 1;

        for (int truckNumber = 1; truckNumber <= truck; truckNumber++) {
            System.out.println("Грузовик: " + truckNumber);
            for (int containerNumber = (truckNumber - 1) * 12 + 1; containerNumber <= truckNumber * 12 && boxesNumber <= boxes; containerNumber++) {
                System.out.println("\tКонтейнер: " + containerNumber);
                for (int boxInContainer = 1; boxInContainer <= 27 && boxesNumber <= boxes; boxInContainer++) {
                    System.out.println("\t\tЯщик: " + boxesNumber);
                    boxesNumber++;
                }
            }
        }
        System.out.println("Необходимо:");
        System.out.println("грузовиков - " + truck + " шт.");
        System.out.println("контейнеров - " + container + " шт.");
    }
}

