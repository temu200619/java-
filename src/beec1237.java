import java.util.Scanner;

public class beec1237 {

    public static int beec1237(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();


        int[][] dp = new int[len1 + 1][len2 + 1];
        int maxLength = 0;


        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    maxLength = Math.max(maxLength, dp[i][j]);
                } else {
                    dp[i][j] = 0;
                }
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String str1 = scanner.nextLine();
            if (!scanner.hasNextLine()) break;
            String str2 = scanner.nextLine();

            int length = beec1237(str1, str2);
            System.out.println(length);
        }

        scanner.close();
    }
}