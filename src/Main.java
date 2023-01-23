import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи любое число");

        try { // Блок, в котором пишем код для отслеживания ошибок. Если произошла ошибка,
            // то программа ищем блок Catch с данной ошибкой
            System.out.println("Открываем файл");
            String s = scanner.next();
            number = Integer.valueOf(s); // Если ввести строку в консоль, то будет вызвана ошибка NumberFormatException
            System.out.println("Вы ввели число: " + number);
            throw new OutOfMemoryError(); // Ключевое слово для принудительного вызова любой ошибки
        } catch (IllegalArgumentException ex) { // Блок, который отлалвиает ошибку из блока try.
            // Передаётся тип ошибки, который надо обрабатывать текущим блоком и её наследники.
            // Т.к. NumberFormatException является наследником IllegalArgumentException,
            // то её данный блок тоже поймает
            System.out.println("К сожалению вы ввели не число, а что-то иное!");
        } finally { // Блок, который независимо от исходя try всегда будет вызван. Даже если нет блока Catch,
            // который обработает ошибку или был выполнени любой другой блок catch
            System.out.println("Файл закрывается в finally");
        }
    }
}