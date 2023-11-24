import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha{
    //atributos
    private int dia;
    private int mes;
    private int año;
    
    public Fecha(int d, int m, int a){
        dia = d;
        mes = m;
        año = a;
        
    }
    
    public Fecha(){
        this(1,1,1);
    }
    
    // se crean los métodos consultores para cada atributo
    
    public int getDia(){
        return dia;
    }
    
      public int getMes(){
        return mes;
    }
    
      public int getAño(){
        return año;
    }
    
    public void inicializarHoy(){
        //usamos  un calendario Gregoriano inicializado el dia de hoy
        GregorianCalendar gc = new GregorianCalendar();
        
        // sacamos los vslores de dia, mes y año del calendario
        dia = gc.get( Calendar.DAY_OF_MONTH );
        mes = gc.get( Calendar.MONTH )+1;
        año = gc.get( Calendar.YEAR );
        
    }
    
   public int darDiferenciaEnMeses(Fecha fecha){
        int diferencia = 0;
        
        int otroAño = fecha.getAño();
        int otroMes = fecha.getMes();
        int otroDia = fecha.getDia();
        
        //calcular la diferencia de meses
        diferencia = 12*(otroAño-año)+(otroMes-mes);
        //si el dia no es mayor, resta un mes
        if(otroDia < dia)
           diferencia --;
           return diferencia;
        }
        
        public String formatoCadena(){
            return " dd/mm/aa " + dia + "/" + mes + "/" + año;
        }
    }    


