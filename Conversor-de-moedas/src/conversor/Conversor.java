package conversor;

import java.util.Scanner;

public class Conversor {

    public static void main (String[]args){

    Scanner valor = new Scanner(System.in);
    Moedas moedas = new Moedas();

        System.out.println("Qual é a moeda a ser convertida para o real?");
        System.out.println("|---------------------|");
        System.out.println("|  1 -     Dólar      |");
        System.out.println("|  2 -     Euro       |");
        System.out.println("|  3 -     Iene       |");
        System.out.println("|  4 -     Sair       |");
        System.out.println("|---------------------|");

        int opcao = valor.nextInt();

        System.out.println("Qual é o valor que você deseja converter?");
        double preco = valor.nextDouble();


        switch (opcao){



            case 1:
                System.out.println("O preço convertido do valor dito em dólar no dia 17/08/2024 é/era: R$ " + moedas.dolar*preco);
                break;

            case 2:
                System.out.println("O preço convertido do valor dito em euro no dia 17/08/2024 é/era: R$ " +moedas.euro*preco);
                break;

            case 3:
                System.out.println("O preço convertido do valor dito em iene no dia é/era : " +moedas.iene*preco);
                break;

            default:
                System.out.println("Opção inválida.");
                break;

            case 4:
                System.out.println("Muito obrigado e até logo!");
                valor.close();

''

        }



    }

}
