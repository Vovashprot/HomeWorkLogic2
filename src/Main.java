public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Task 1");
        byte clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        System.out.println("Task 2");
        byte clientOS = 0;
        short phoneYear = 2014;
        if (clientOS == 0 && phoneYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");

        }
        else if (clientOS == 0 && phoneYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");

        }
        if (clientOS == 1 && phoneYear >= 2015 ) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientOS == 1 && phoneYear < 2015 ) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }
    public static void task3(){
        System.out.println("Task 3");
        int year = 2024;
        if ((year % 4 == 0 || year % 400 == 0) && (year % 100 != 0)){
            System.out.println(year + " это високосный год");
        }
        else {
            System.out.println(year + " это не високосный год");
        }

    }
    public static void task4(){
        System.out.println("Task 4");
        int deliveryDistance = 95;
        byte days = 0;
        if (deliveryDistance <= 20){
            days = 1;
            System.out.println("Потребуется дней:" +days);
        }
         else if (deliveryDistance > 20 && deliveryDistance <=60){
            days = 2;
            System.out.println("Потребуется дней:" +days);
        }
        else if (deliveryDistance > 60 && deliveryDistance <=100){
            days = 3;
            System.out.println("Потребуется дней: "+days);
        }
        else {
            System.out.println("Доставить не получится");
        }
    }
}