import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String myBirthday;
        final int NUM = 14;
        String word = "my home";
        myBirthday = word + " " + NUM;
        System.out.println("Все переменные " + myBirthday + word + NUM);

        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили ноль");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ваше имя");
        String name = sc.nextLine();
        System.out.println("Привет " + name);
    }
}