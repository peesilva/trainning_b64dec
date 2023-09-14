import java.util.Base64;
import java.util.Scanner;

public class decode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Write a base64 to decode: ");
        String base64Input = sc.nextLine();
        sc.close();

        String decodedString = decodeFromBase64(base64Input);

        System.out.println("The decoded answer is: " + decodedString);
    }

    public static String decodeFromBase64(String base64Input) {
        try {
            byte[] decodedBytes = Base64.getDecoder().decode(base64Input);
            return new String(decodedBytes);
        } catch (IllegalArgumentException e) {
            return "ERROR: Your code written doesnt is a Base64 code valid.";
        }
    }
}
