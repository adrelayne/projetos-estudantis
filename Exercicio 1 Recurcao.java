package exercicios.recursao;

//@author Adrelayne
        
public class ExerciciosRecursao {

    public static int soma(int n){
        if(n >= 0){
            int resultado = n + soma(n-1);
            return resultado;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        System.out.println(soma(5));
    }
}
