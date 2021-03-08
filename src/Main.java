import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String caesar = scan.nextLine();

        Random random = new Random();
        int key = random.nextInt(26);
        char[] chars = caesar.toCharArray();

        System.out.println(key);

        for (char letter : chars) {

            if (letter == 32) {
                System.out.print(" ");

            } else if ((letter + key) >= 65 && (letter + key) <= 90) {

                letter += key;
                System.out.print(letter);

            } else if ((letter + key) >= 97 && (letter + key) <= 122) {

                letter += key;
                System.out.print(letter);

            } else {

                letter += key - 26;
                System.out.print(letter);
            }


        }
    }
}