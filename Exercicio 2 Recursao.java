package exercicios.recursao;

//@author Adrelayne
        
public class ExerciciosRecursao {
    
    public static int somaVetorRecursivo(int [] v, int i){
        if(i == v.length){
            return 0;
        }
        else{
            int resultado = v[i] + somaVetorRecursivo(v, i+1);
            System.out.println(resultado);
            return resultado;
        }
    }
    
    public static int somaVetorIterativo(int [] v){
        int resultado = 0;
        for(int i = 0; i < v.length; i++){
            resultado += v[i];
        }
        return resultado;
    }
    
    public static void main(String[] args) {
       int[] v = {7, 3, 5, 2}; 
        System.out.println(somaVetorRecursivo(v, 0));
        System.out.println(somaVetorIterativo(v));
    }
}
