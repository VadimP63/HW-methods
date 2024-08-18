public class Main {
    public static void main(String[] args) {
        isLeapYear(2021);
        isLeapYear(2040);
        isLeapYear(1900);
        isClientDeviceYear(2014, 0);
        isClientDeviceYear(2016, 1);
        isDeliveryDistance(10);
        isDeliveryDistance(50);
        isDeliveryDistance(99);
        isDeliveryDistance(101);
    }
    public static void isLeapYear (int year) {
        if ((year >= 1584 && year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void isClientDeviceYear(int clientDeviceYear, int clientOS) {
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
    }
    public static void isDeliveryDistance (int deliveryDistance) {
        if (deliveryDistance <=20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance >20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance >60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставки нет");
        }
    }
}