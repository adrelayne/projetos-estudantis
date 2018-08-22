package exerciciosmatriz;
import java.util.Scanner;

public class ExerciciosMatriz {

    public static void main(String[] args) {
        //Exercicio 3
        int[][] matriz = new int [3][3];
        int[] vetor = new int[3];
        
        Scanner scan = new Scanner(System.in);
        
        for(int lin = 0; lin < matriz.length; lin++){
            for(int col = 0; col < matriz[0].length; col++){
                System.out.println("Digite o valor da linha " +
                        (lin+1) +" e da " + "coluna " + (col+1) + " da "
                                + "matriz:");
                matriz[lin][col] = scan.nextInt();
            }
        }
        
        for(int col = 0; col < matriz[0].length; col++){
            for(int lin = 0; lin < matriz.length; lin++){ 
                vetor[col] += matriz[lin][col];
                
            }
        System.out.print(vetor[col]);
        }
    }
}
