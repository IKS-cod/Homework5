public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1.");
        int clientOS = 1; // 0-iOS, 1-Android
        switch (clientOS) {
            case (0):
                System.out.println("Установите версию приложения для iOS по ссылке.");
                break;
            case (1):
                System.out.println("Установите версию приложения для Android по ссылке.");
                break;
            default:
                System.out.println("Система не определена");
        }
        System.out.println("Задание 2.");
        int clientDeviceYear = 2015;
        if (clientDeviceYear < 2015) {
            switch (clientOS) {
                case (0):
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
                    break;
                case (1):
                    System.out.println("Установите облегченную версию приложения для Android по ссылке.");
                    break;
                default:
                    System.out.println("Система не определена");
            }
        } else {
            switch (clientOS) {
                case (0):
                    System.out.println("Установите версию приложения для iOS по ссылке.");
                    break;
                case (1):
                    System.out.println("Установите версию приложения для Android по ссылке.");
                    break;
                default:
                    System.out.println("Система не определена");
            }
        }
        System.out.println("Задание 3.");
        int year = 1588;
        int time4 = (year - 1584) % 4;
        int time100 = (year - 1584) % 100;
        int time400 = (year - 1584) % 400;
        if (year > 1584) {
            if (time4 == 0 && time100 != 0 || time400 == 0) {
                System.out.println("Год является високосным.");
            } else if (time4 != 0 || time100 == 0) {
                System.out.println("Год не является високосным.");
            }
        } else {
            System.out.println("Нужно задать год больше 1584.");
        }

        System.out.println("Задание 4.");
        int deliveryDistance = 95;
        int time = 1;
        if (deliveryDistance <= 100) {
            if (deliveryDistance < 20) {
                System.out.println("Потребуется дней: " + time);}
            else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
                time++;
                System.out.println("Потребуется дней: " + time);
            } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
                time = time + 2;
                System.out.println("Потребуется дней: " + time);
            }
        } else {
            System.out.println("Доставки нет.");
        }

        System.out.println("Задание 5.");
        int monthNumber = 12;
        if (monthNumber >= 1 && monthNumber <= 12) {
            switch (monthNumber) {
                case (1):
                    System.out.println("Зима.");
                    break;
                case (2):
                    System.out.println("Зима.");
                    break;
                case (12):
                    System.out.println("Зима.");
                    break;
                case (3):
                    System.out.println("Весна.");
                    break;
                case (4):
                    System.out.println("Весна.");
                    break;
                case (5):
                    System.out.println("Весна.");
                    break;
                case (6):
                    System.out.println("Лето.");
                    break;
                case (7):
                    System.out.println("Лето.");
                    break;
                case (8):
                    System.out.println("Лето.");
                    break;
                case (9):
                    System.out.println("Осень.");
                    break;
                case (10):
                    System.out.println("Осень.");
                    break;
                case (11):
                    System.out.println("Осень.");
                    break;
            }
        } else {
            System.out.println("Месяц должен быть от 1 до 12");
        }

    }
}
