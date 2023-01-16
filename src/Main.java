import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task1();

        System.out.println();
        System.out.println();

        task2();

        System.out.println();
        System.out.println();

        task3();

        System.out.println();
        System.out.println();

        task4();

        System.out.println();
        System.out.println();

        task5();

        System.out.println();
        System.out.println();

        task6();
    }
    public static void task1() {
        System.out.println("Задача #1");

        int number = 1000;
        int quolity = 4;
        int steps = 5;

        while (steps>0){
            if (number % 2 == 0){
                System.out.print(number + " ");
                steps--;
            }
            number++;
        }
    }
    public static void task2(){
        System.out.println("Задача #2");

        int steps = 10;
        int number = 1;
        while(steps>0){
            if (number % 2 == 1){
                System.out.print(number + " ");
                steps--;
            }
            number++;
        }
    }
    public static void task3(){
        System.out.println("Задача #3");

        for (int i = 90; i > 0; i = i - 5){
            System.out.print(i + " " );
        }
    }

    public static void task4(){
        System.out.println("Задача #4");
        int numbers = 2;
        int step = 2;
        for(int i = 0; i < 10; i++){
            int num = numbers * step;
            System.out.print(num + " ");
            step = step * 2;

        }
    }
    public static void task5(){
        System.out.println("Задача #5");
        int data = 1;
        int countMonth = 30;
        while (data < countMonth){
            System.out.print(data + " ");
            data++;
            System.out.print(data + " ");
            data = data + 6;
        }
    }

    public static void task6() {
        System.out.println("Задача #6");

        int result = 0;
        int firstTicket = 1;
        int lastTicket = 999_999;
        for (int current = firstTicket; current <= lastTicket; current++) {
            int firstPart = current / 1000;
            int lastPart = current % 1000;
            if (firstPart == 0 || lastPart == 0) {
                continue;
            }
            int firstSum = calculateSumOfDigits(firstPart);
            int lastSum = calculateSumOfDigits(lastPart);
            if (firstSum == lastSum) {
                result++;
            }
        }
        System.out.println(result);
    }

    private static int calculateSumOfDigits(int number) {
        int result = 0;

        while (number > 0) {
            result += number % 10;
            number /= 10;
        }

        return result;
    }

}