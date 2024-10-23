import java.util.Scanner;

public class beec1193 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();

        for (int i = 0; i < n; i++) {
            String[] input = in.nextLine().split(" ");
            String number = input[0];
            String base = input[1];

            int decValue;

            switch (base) {
                case "bin":
                    decValue = Integer.parseInt(number, 2);
                    System.out.println(decValue + " dec");
                    System.out.println(Integer.toHexString(decValue).toUpperCase() + " hex");
                    break;
                case "dec":
                    decValue = Integer.parseInt(number);
                    System.out.println(Integer.toHexString(decValue).toUpperCase() + " hex");
                    System.out.println(Integer.toBinaryString(decValue) + " bin");
                    break;
                case "hex":
                    decValue = Integer.parseInt(number, 16);
                    System.out.println(decValue + " dec");
                    System.out.println(Integer.toBinaryString(decValue) + " bin");
                    break;
                default:
                    // Вы можете добавить обработку ошибок, если это необходимо
                    System.out.println("Неверная база");
            }

            if (i < n - 1) {
                System.out.println();
            }
        }
    }
}
