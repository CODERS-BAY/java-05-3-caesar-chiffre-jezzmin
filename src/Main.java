import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String caesar = scan.nextLine();

        Random random = new Random ();
        int key = random.nextInt(26);
        char [] chars = caesar.toCharArray();

        for (char c : chars) {
            c -= key;
            System.out.print(c);
        }
    }
}