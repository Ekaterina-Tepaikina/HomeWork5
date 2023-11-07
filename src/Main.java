public class Main {
    public static void main(String[] args) {
        //Задача 1
        byte clientOS = 1;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Нет такой ОС");
        }
        //Задача 2
        short clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == 0 && clientDeviceYear > 2014) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear > 2014) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //Задача 3
        short year = 2021;
        if (year < 1585) {
            System.out.println("Високосный год ещё не ввели");
        }
        else if (year % 4 == 0 && year % 100 != 0 && year % 400 == 0) {
            System.out.println(year + " год является високосным");
        }
        else {
            System.out.println(year + " год не является високосным");
        }
        //Задача 4
        short deliveryDistance = 95;
        if (deliveryDistance < 21) {
            System.out.println("Потребуется дней: 1");
        }
        else if (deliveryDistance < 61) {
            System.out.println("Потребуется дней: 2");
        }
        else if (deliveryDistance < 101) {
            System.out.println("Потребуется дней: 3");
        }
        else {
            System.out.println("Доставки нет");
        }
        //Задача 5
        byte monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}