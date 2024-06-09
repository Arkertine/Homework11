import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int thisYear = 2021;
        printIsLeapYear(thisYear);
        int clientOS = 0;
        int releaseYear = 2024;
        printRequiredAppVersion(clientOS, releaseYear);
        int deliveryDistance = 101;
        int deliveryDay = calculateDeliveryDays(deliveryDistance);
        if (deliveryDay > 3) {
            System.out.println("Доставки нет.");
        } else {
            System.out.println("Потребуется для доставки дней: " + deliveryDay);
        }
    }

    public static void printIsLeapYear(int year) {
        if (year > 1584 && (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))) {
            System.out.printf("«%s  год — високосный год».%n", year);
        } else {
            System.out.printf("«%s  год — невисокосный год».%n", year);
        }
    }

    public static void printRequiredAppVersion(int clientOS, int releaseYear) {
        if (clientOS == 0 && releaseYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (clientOS == 0 && releaseYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 1 && releaseYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else if (clientOS == 1 && releaseYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
    }

    public static int calculateDeliveryDays(int deliveryDistance) {
        int deliveryDay = 1;
        if (deliveryDistance > 20) {
            deliveryDay++;
        }
        if (deliveryDistance > 60) {
            deliveryDay++;
        }
        if (deliveryDistance > 100) {
            deliveryDay++;
        }
        return deliveryDay;
    }

}
