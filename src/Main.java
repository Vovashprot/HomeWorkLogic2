public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }
    public static void task1(){
        System.out.println("Task 1");
        byte clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public static void task2(){

    }
}