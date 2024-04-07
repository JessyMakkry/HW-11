import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int year = 2384;
        checkLeapYear(year);
        System.out.println("Task 2");//
        byte ios = 1;
        byte android = 0;
        year = 2019;
        checkClientDevice(ios, year);
        System.out.println("Task 3");
        int distance = 228;
        cardDelivery(distance);
    }
    public static void checkLeapYear (int leapYear) {
        byte testYear4 = (byte) ((leapYear-1584) % 4);
        byte testYear100 = (byte) ((leapYear - 1584) % 100);
        short testYear400 = (short) ((leapYear - 1584) % 400);
        if (leapYear < 1584) {
            System.out.println("Год не является високосным");
        } else if (testYear400 == 0) {
            System.out.println("Год является високосным");
        } else if (testYear100 == 0) {
            System.out.println("Год не является високосным");
        } else if (testYear4==0) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }
    }
    public static void checkClientDevice (byte oS, int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (deviceYear == currentYear) {
            if (oS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else if (oS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }
    public static void cardDelivery (int deliveryDistance) {
        if (deliveryDistance<=20) {
            System.out.println("Доставка займет сутки");
        } else if (deliveryDistance<60) {
            System.out.println("Доставка займет двое суток");
        } else if (deliveryDistance<100) {
            System.out.println("Доставка займет трое суток");
        } else {
            System.out.println("Доставка не может быть осуществима");
        }
    }
}