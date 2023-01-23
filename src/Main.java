import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи номер от 1 до 5");

        int a = scanner.nextInt();
        try {
            switch (a) {
                case 1:
                    throw new RuntimeException("Отработала единичка");
                case 2:
                    throw new IllegalArgumentException("Отработала двоичка");
                case 3:
                    throw new NumberFormatException("Отработала Троичка");
                case 4:
                    throw new UserNotFoundException("3578");
                case 5:
                    throw new UserNotFoundException("3578", "Maxim");
            }
        } catch (UserNotFoundException e) { // При работе с несколькими Catch, очень важно соблюдать иерархию наследования.
            // Потому-что catch ловит саму ошибку и всех её наследников
            System.out.println(e.getMessage());
        } catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
            System.out.println(Arrays.toString(ex.getStackTrace()));
        } catch (IllegalArgumentException exception) {
            System.out.println("Что-нибудь да хотим!");
        } catch (Exception e) {
            System.out.println("Где-то там, далеко. Что-то произошло, что я не знал");
        }

        System.out.println("Мы ещё живы и работаем!");

    }
}