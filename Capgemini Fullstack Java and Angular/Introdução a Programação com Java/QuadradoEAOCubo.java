/*
Desafio
Você terá o desafio de escrever um programa que leia um valor inteiro N (1 < N < 1000). Este N é a quantidade de linhas de saída que serão apresentadas na execução do programa.

Entrada
O arquivo de entrada contém um número inteiro positivo N.

Saída
Imprima a saída conforme o exemplo fornecido.

 */




import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();

        for (int i=1; i<=N; i++) {
            System.out.println(i + " " + i*i + " " + i*i*i);
        }

    }
}