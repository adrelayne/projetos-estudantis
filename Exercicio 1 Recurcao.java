package exercicios.recursao;

//@author Adrelayne
        
public class ExerciciosRecursao {

    public static int somaRecursiva(int n){
        if(n >= 0){
            int resultado = n + somaRecursiva(n-1);
            return resultado;
        }
        else{
            return 0;
        }
    }
    public static void somaIterativa(int n) {
        int resultado = 0;
        for (int i = 1; i <= n; i++){
            resultado += i;
            System.out.println(resultado);
        }
    }
    
    public static void main(String[] args) {
        System.out.println(somaRecursiva(5));
        somaIterativa(5);
    }
}
