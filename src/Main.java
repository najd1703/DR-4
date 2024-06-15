public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int age = 18;
        if (age == 18) {
            System.out.println("С окончанием школы");
        } else if (age ==21) {
            System.out.println("Теперь тебе можно пить алко");
        } else if (age ==7) {
            System.out.println("иди в школу");
        } else {
            System.out.println("Пока сказать нечего");
        }
            // ЗАДАЧА 1//
            int clientOSi = 1;
            if (clientOSi ==1) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientOSi ==0) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
      // ЗАДАЧА 2//

            int clientOS = 0;
            int clientDeviceYear =2014;
            if (clientOS == 1 && clientDeviceYear < 2015)  {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");}
            if (clientOS == 1 && clientDeviceYear >= 2015) {
                    System.out.println("Установите новую версию приложения для iOS по ссылке");}
            else if (clientOS == 0 && clientDeviceYear < 2015) {
                        System.out.println("Установите облегченную версию приложения для Android по ссылке");}
            else if (clientOS == 0 && clientDeviceYear >= 2015) {
                        System.out.println("Установите новую версию приложения для Android по ссылке");}
        // ЗАДАЧА 3//
        int year = 1824;
        if (year < 1584) {

        } if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        // ЗАДАЧА 4//
        int deliveryDistance = 101;
        if (deliveryDistance<=20) {
            System.out.println("Для доставки потребуется: 1 день");
        } else {
            if (deliveryDistance>20 && deliveryDistance <=60) {
                System.out.println("Для доставки потребуется: 2 дня");
            }
            if (deliveryDistance >60 && deliveryDistance<=100) {
                System.out.println("Для доставки потребуется: 3 дня");
            } else if (deliveryDistance>100) {
                System.out.println("Доставка не осуществляется");
            }
            // ЗАДАЧА 4//
            int monthNumber = 12;
            switch (monthNumber) {
                case 12,1,2:
                    System.out.println("Зима");
                    break;
                case 3,4,5:
                    System.out.println("Весна");
                    break;
                case 6,7,8:
                    System.out.println("Лето");
                    break;
                case 9,10,11:
                    System.out.println("Осень");
                    break;
                default:
                    System.out.println("Такого времени года не существует");
            }
        }




                    }

}










