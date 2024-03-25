package View;

import Controller.FatController;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {

        FatController FC = new FatController();
        Scanner scan = new Scanner(System.in);

        int n = 11;

        while(n < 0 || n > 10) {
            System.out.print("Insira um valor entre 0 e 10: ");
            n = scan.nextInt();
        }


        System.out.println(FC.fatorial(n));

    }
}
