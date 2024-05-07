public class Calculadora {

    int num1;
    int num2;
    int resultado;
    
    
    Calculadora(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public static int Soma(int num1, int num2){
        
         return num1 + num2;
        
    }
    
    public static int Subtraição(int num1, int num2){

        return  num1 - num2;

    }

    public static int Divisao(int num1, int num2){

        if (num2 == 0) {
            System.out.println("Valor do segundo número inválido. Tente novamente!");
        }
            return  num1/num2; 
    }

    public static int Multiplicacao( int num1, int num2){
        return num1 * num2;
    }

}
