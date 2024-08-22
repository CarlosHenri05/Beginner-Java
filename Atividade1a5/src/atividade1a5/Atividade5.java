package atividade1a5;
import java.util.Scanner;
public class Atividade5 {

    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número que você quer a tabuada: "); // Usuário escolhe a tabuada que quer
        int x = scan.nextInt();


        for(int y = 1; y<=10;y++){ // Enquanto o 10 for maior ou igual a variável y, vai continuar printando a multiplicação.
            System.out.println(x*y); // Tabuada do número escolhido pelo usúario do 1 até o 10


        }

    }
}
