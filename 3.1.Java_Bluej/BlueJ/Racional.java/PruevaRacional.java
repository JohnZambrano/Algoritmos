 class PruevaRacional{
     public static void main(String args[]){
        Racional r1,r2,r3;
        r1 = new Racional();
        r2 = new Racional(1,5);
        r1 = new Racional(r2);
        r3 = r2.sumar(r1);
        System.out.println("r1 = ");r1.mostrar();
        System.out.println("r2 = ");r2.mostrar();
        System.out.println("r1 + r2 = ");r3.mostrar();
    }  
}
