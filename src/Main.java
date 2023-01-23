import java.io.IOException;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //try - блок в котором ожидается ошибка
        //catch - блок в котором обрабатывается ошибка
        //throw - который принудительно вызывает ошибку
        //throws - Позволяет пометить метод и предупредить о том,
        // что внутри метода может быть вызвана ошибка

        String test = "Test";
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            try {
                connect(random.nextInt(10));
                return;
            } catch (IOException e) {
                System.out.println("Получили ошибку соединение. Пытаемся сделать заного");
            }
        }

        System.out.println("К сожалению за 10 попыток не удалось сделать соединение");

    }

    public static void connect(int a) throws IOException {
        System.out.println("Попытка получения соединения");

        if (a == 1) {
            System.out.println("Удачное соединение");
        } else {
            throw new IOException();
        }
    }
}