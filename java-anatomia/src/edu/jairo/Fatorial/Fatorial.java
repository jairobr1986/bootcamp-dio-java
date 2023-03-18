package edu.jairo.Fatorial;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();

        int multiplicar = 1;

        System.out.print3(fatorial + "! =");
        for (int i = fatorial; i >= 1; i = i- 1) {
            multiplicar = multiplicar * i;
            
        }

        System.out.println(multiplicar);

    }
    
}
