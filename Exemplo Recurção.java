package exemplorecursao;

//@author Adrelayne

public class ExemploRecursao {
    
    public static void contagemRegressiva(int n){
        if (n == 0){
            System.out.println(n);
            return;
        }
        
        else{
            System.out.println(n);
            contagemRegressiva(n-1);
        }
    }
    
    public static int potencia (int base, int exp){
        if (exp == 0){
            System.out.println(base + " elevado a " + exp + " = 1");
            return 1;
        }
        else {
            int resultado = base * potencia(base, exp - 1);
             System.out.println(base + " elevado a " + exp + " = " + resultado);
            return resultado;
        }
    }
    
    public static int fatorial (int n){
        if (n == 0){
            System.out.println(n + "! = 1");
            return 1;
        }
        else{
            int resultado = n * fatorial(n-1);
            System.out.println(n + "! = " + resultado);
            return resultado;
        }
    }
    
    public static void exibeVetor(int[] v, int i){
        if (i  == v.length){
            return;
        }
        else{
            System.out.println(v[i]);
            exibeVetor(v, i+1);
        }
    } 
    
    public static void exibeVetorInvertido(int[] v, int i){
        if (i < 0){
            return;
        }
        else{
            System.out.println(v[i]);
            exibeVetorInvertido(v, i-1);
        }
    }

    public static void main(String[] args) {
        int [] vetor = {10, 20, 30, 40, 50};
        contagemRegressiva(5);
        System.out.println(potencia(3, 4));
        System.out.println(potencia(2, 10));
        System.out.println(fatorial(4));
        System.out.println(fatorial(6));
        exibeVetor(vetor, 0);
        exibeVetorInvertido(vetor, vetor.length-1);
    }   
}
