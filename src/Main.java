import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner tgb = new Scanner(System.in);
        System.out.printf("Vilket tal vill du veta tabell till?");
        int tal = tgb.nextInt();
        tgb.nextLine();

        //while loop
        int i = 1;
        while (i < 11) {
            System.out.println(i * tal);
            i += 1;
        }


        /* //for loop
        for (int i = 1; i < 11; i++) {
            System.out.println(i * tal);
        }
        */

        /* // do while loop
        int i = 1;
        do {
            System.out.println(i * tal);
            i++;
        } while(i < 11);
        */
    }
}
