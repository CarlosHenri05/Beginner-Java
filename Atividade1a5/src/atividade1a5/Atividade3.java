package atividade1a5;
import java.util.Scanner;
public class Atividade3 {

    public static void main(String[] args) {

        double nota1, nota2, nota3;
        Scanner ver = new Scanner(System.in);

        System.out.println("Digite sua primeira nota: ");
        nota1 = ver.nextDouble();

        System.out.println("Digite a sua segunda nota: ");
        nota2 = ver.nextDouble();

        System.out.println("Digite a sua terceira e última nota: ");
        nota3 = ver.nextDouble();

        double soma = nota1 + nota2+ nota3;
        double media = soma/3;

        if (media >=7) { //se a média for maior ou igual a 7 acontecerá isso.
            System.out.println("Parabéns! Fostes aprovado nessa matéria. A sua média foi: " +media);
        } else if (media < 7) { //Se a média for menor que 7, acontecerá isso.
            System.out.println("Infelizmente, fostes reprovado nessa matéria. A sua média foi: " +media);

        }


    }
}
