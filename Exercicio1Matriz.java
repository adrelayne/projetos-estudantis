package exerciciosmatriz;
import java.util.Scanner;

public class ExerciciosMatriz {

    public static void main(String[] args) {
        /* Exercício 1 - Enunciado
            Escreva um programa que leia os valores de uma matriz 2x3 de inteiros e
            depois exiba os valores em forma de matriz.
        */
        int[][] matriz = new int [2][3];
        
        Scanner scan = new Scanner(System.in);
        
        for(int lin = 0; lin < matriz.length; lin++){
            for(int col = 0; col < matriz[0].length; col++){
                System.out.println("Digite o valor da linha: " +
                        (lin+1) +", " + "coluna" + (col+1) + ":");
                matriz[lin][col] = scan.nextInt();
            }
        }
        exibeMatriz(matriz);
    }
    
    public static void exibeMatriz(int[][]m){
        for (int l = 0; l <m.length; l++){
            for (int c = 0; c < m[0].length; c++){
                System.out.print(m[l][c] + "\t");
            }
            System.out.println("");
        }
    }
}
