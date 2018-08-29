package exercicios.matriz;

import java.util.Scanner;

public class ExerciciosMatriz {
    public static void main(String[] args) {
        /*  Elabore um programa em que leia os valores de dois vetores
            de 4 elementos inteiros cada um. Crie uma matriz 4x2, sendo
            que a primeira coluna dessa matriz deve corresponder ao 
            primeiro vetor e a segunda coluna dessa matriz deve
            corresponder ao segundo vetor. Exiba a matriz.        
        */
        int vetor1[] = new int[4];
        int vetor2[] = new int[4];
        int matriz[][] = new int [4][2];
        Scanner scanner = new Scanner(System.in);
        
        //preenche o vetor 1
        for (int i = 0; i < vetor1.length; i++){
            System.out.println("Digite um valor para o 1º vetor: ");
            vetor1[i] = scanner.nextInt();
        }
        
        //preenche o vetor 2
        for (int j = 0; j < vetor2.length; j++){
            System.out.println("Digite um valor para o 2º vetor: ");
            vetor2[j] = scanner.nextInt();
        }
         
        //prenche a matriz
        for(int lin = 0; lin < matriz.length; lin++){
            matriz[lin][0] = vetor1[lin];
            matriz[lin][1] = vetor2[lin];
        }
        
        System.out.println("");
        
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
