import java.util.Scanner;

public class beec1253 {

    public static String decodeCaesarCipher(String encodedString, int shift) {
        StringBuilder decodedString = new StringBuilder();

        for (char charAt : encodedString.toCharArray()) {

            char originalChar = (char) ((charAt - 'A' - shift + 26) % 26 + 'A');
            decodedString.append(originalChar);
        }

        return decodedString.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество тестов: ");
        int N = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < N; i++) {
            System.out.print("Введите закодированное сообщение: ");
            String encodedString = scanner.nextLine();

            System.out.print("Введите количество сдвига: ");
            int shift = Integer.parseInt(scanner.nextLine());


            String decodedString = decodeCaesarCipher(encodedString, shift);
            System.out.println(decodedString);
        }

        scanner.close();
    }
}
