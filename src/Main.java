public class Main {
    public static void main(String[] args) {

        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        }
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }


        int clientDeviceYear = 2015;
        if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегчённую версию приложения для IOS по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегчённую версию приложения для Android по ссылке");
        }
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }


        int year = 2024;
        boolean year2 = ((year % 400) == 0) || (((year % 4) == 0) && ((year % 100) != 0));
        if (year > 1584 && year2){
            System.out.println(year + " год является високосным");
            } else {
            System.out.println(year + " год не является високосным");
            }
        if (year < 1584) {
            System.out.println("Год не может быть меньше 1585");
        }


        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Для доставки потребуются сутки");
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Для доставки потребуется двое суток");
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Для доставки потребуется трое суток");
        } else {
            System.out.println("Доставки нет");
        }


        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println(monthNumber + "-й месяц принадлежит сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + "-й месяц принадлежит сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + "-й месяц принадлежит сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + "-й месяц принадлежит сезону осень");
                break;
            default:
                System.out.println("Такого месяца нет");
        }


    }
}