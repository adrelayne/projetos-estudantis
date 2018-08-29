package exerciciosmatriz;
import java.util.Scanner;

public class ExerciciosMatriz {

    public static void main(String[] args) {
        /*  Elabore um programa que cria uma matriz 5x2 de Strings. A primeira coluna
            deverá armazenar os nome de amigos e a segunda coluna deverá armazenar os
            números de telefones correspondentes (no formato String). Solicite que o
            usuário digite os dados para preencher a matriz. Depois, solicite que o 
            usuário digite um nome qualquer. Pesquise o nome na matriz e exiba "Nome 
            não encontrado", caso o nome não esteja na matriz, ou exiba o telefone
            correspondente, caso o nome esteja na matriz.        
        */
        String[][] matriz = new String[5][2];
        String nome = "";
        boolean existe = false;
                
        Scanner scan = new Scanner(System.in);
        
        for(int lin = 0; lin < matriz.length; lin++){
            System.out.println("Insira o nome do " + (lin + 1) +
                    "º contato: ");
            matriz[lin][0] = scan.nextLine();
            
            System.out.println("Insira o número do " + (lin + 1) +
                    "º contato: ");
            matriz[lin][1] = scan.nextLine();
        }
        
        System.out.println("Digite um nome para exibir os dados de "
                + "contato");
        nome = scan.next();
        
        for(int i = 0; i < matriz.length; i++){
            if(matriz[i][0].equals(nome)){
                System.out.println("Os dados desse contato são:"
                        + matriz[i][1]);
                existe = true;
            }
        }
        if (existe == false) {
                System.out.println("Não encontrado na lista de "
                        + "contatos");
            }
    }
}
