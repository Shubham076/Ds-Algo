import java.util.Scanner;

public class Sequences {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        scn.close();

        int a = 0;
        int ab = 0;
        int abc = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == 'a') {
                a = 2 * a + 1;
            }
            else if (c == 'b') {
                ab = 2 * ab + a;
            }
            else if (c == 'c') {
                abc = 2 * abc + ab;
            }
        }

        System.out.println(abc);

    }
}
