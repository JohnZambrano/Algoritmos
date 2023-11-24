public class Lavadora{
    //atributos
    private String marca;
    private String volumen;
    
    //métodos
    public Lavadora(String m, String v){
        marca = m;
        volumen = v;
    }
    
    public void lavar(){
        System.out.println("Estoy lavando su ropa");
        
    }
    
    public void secar(){
        System.out.println("Estoy secando su ropa");
        
    }
    
    public String decirMarca(){
        return marca;
        
    }
    
    public void cambiarMarca(String m){
        marca = m;
    }
    
}
