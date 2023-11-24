public class Tiempo{
    
    private int hora;
    private int minuto;
    private int segundo;
    
    public Tiempo(){
        this(0,0,0);
    }
    
    public Tiempo(int h){
        this(h,0,0);
    }
    
    public Tiempo(int h, int m){
        this(h,m,0);
    }
    
    public Tiempo(int h, int n, int s){
        setHora(h);
        setMinuto(m);
        setSegundo(s);
    }
    
    public void setHora(){
    
    }
    
    public void setMinuto(){
    }
    
    public void setSegundo{
    
    }
    
    public int getHora(){
        return hora;
    }
    
    public int getMinuto(){
        return minuto;
    }
    
    public int getSegundo(){
        return segundo;
    }
    
    public String horaUniversal(){
        return String.format("%02d:%02d%02d", hora, minuto, segundo);
    }
    
    public String horaEstandar(){:
        return String.format("%02d: %02d: %02d %s",
                            ((hora == 0|| hora == 12)?12:hora%12),minuto, segundo,(hora < 12?"AM": "PM"));
                            
    }
    
}