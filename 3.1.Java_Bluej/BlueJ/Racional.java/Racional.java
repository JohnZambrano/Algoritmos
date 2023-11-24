
public class Racional{
    public int numerador, denominador;
    public Racional(){
        numerador = 0;
        denominador = 1;
    }
    
    public Racional(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
    }
    
    public Racional(Racional r){
        numerador = r.numerador;
        denominador = r.denominador;
    }
    
    public Racional sumar(Racional r2){
        Racional suma = new Racional(numerador + r2.numerador,
                                    denominador + r2.denominador);
        return suma;
    }
    
    //métodos para operar con números racionales
     public void mostrar(){
         System.out.println(numerador + "/" + denominador);
        }
}
