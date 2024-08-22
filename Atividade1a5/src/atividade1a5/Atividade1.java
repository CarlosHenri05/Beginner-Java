package atividade1a5;

import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int x, y;



        System.out.println("Digite um número:");
        x = scan.nextInt();

        System.out.println("Digite outro número:");
        y = scan.nextInt();


        int z = x + y;  // apenas juntei as duas váriaveis em outra e somei elas.

        System.out.println("A sua soma é:" +z); // printa a soma dos dois números digitados pelo usuário.


    }
}
