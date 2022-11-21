package Ejercicio3;

public class Numerica {
    
    private int num1;
    private int num2;
    private int res;

    @Override
    public String toString(Numerica res) {
        int numEntero = 4;    
        String numCadena= String.valueOf(numEntero);
    }

    public Numerica sumar(Numerica numero, Numerica res){
        res = num1 + num2; 
    }
    
    
    public Numerica restar(Numerica numero, Numerica res){
        res = num1 - num2; 
    }

    public Numerica mutiplicar(Numerica numero, Numerica res){
        res = num1 * num2; 
    }
    public Numerica dividir(Numerico numero, Numerica res){
        res = num1 / num2;
    }
}
