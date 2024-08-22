package atividade1a5;

import java.util.Scanner;



public class Atividade2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int x;

        System.out.println("Digite um número:");
        x = scan.nextInt();

        if (x%2 == 0) {      // O operador % significa "resto de divisão", então se algum número foi dividido por 2 e não tem sobras, ele é par.
            System.out.println("O número é par");
        }

        else  {
            System.out.println("O número é ímpar");


        }
    }
}


