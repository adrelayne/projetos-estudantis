package exerciciosmatriz;
import java.util.Scanner;

public class ExerciciosMatriz {

    public static void main(String[] args) {
        /*  Elabore um método exibe matriz, que recebe uma matriz de inteiros e exibe
            seus valores em forma de matriz. Escreva no main o código que leia os 
            valores de duas matrizes 2x3 de inteiros.
            Depois calcule a soma dessas duas matrizes, armazenando a soma em uma
            terceira matriz e exiba os valores dessa terceira matriz (chame o método
            exibeMatriz para exibir a matriz).        
        */
        int[][] matriz1 = new int [2][3];
        int[][] matriz2 = new int [2][3];
        int[][] matriz3 = new int [2][3];
        
        Scanner scan = new Scanner(System.in);
        
        for(int lin = 0; lin < matriz1.length; lin++){
            for(int col = 0; col < matriz1[0].length; col++){
                System.out.println("Digite o valor da linha " +
                        (lin+1) +" e da " + "coluna " + (col+1) + " da "
                                + "matriz 1:");
                matriz1[lin][col] = scan.nextInt();
            }
        }
        exibeMatriz(matriz1);
        
         for(int lin = 0; lin < matriz2.length; lin++){
            for(int col = 0; col < matriz2[0].length; col++){
                System.out.println("Digite o valor da linha: " +
                        (lin+1) +" e da " + "coluna" + (col+1) + " da"
                                + " matriz 2:");
                matriz2[lin][col] = scan.nextInt();
            }
        }
        
         exibeMatriz(matriz2);
         
        for(int lin = 0; lin < 2; lin++){
            for(int col = 0; col < 3; col++){
                matriz3[lin][col] = matriz1[lin][col] + matriz2[lin][col];
            }
        }
        exibeMatriz(matriz3);
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
