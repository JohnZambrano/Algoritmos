public class Empleado{
    //Declarando atributos
    private String nombre;
    private String apellido;
    private int genero;
    private Fecha fechaNacimiento;
    private Fecha fechaIngreso;
    private int salario;
    
    //método constructor
    public Empleado(String pNombre, String pApellido, int pGenero,
                    Fecha pFechaN, Fecha pFechaI, int pSalario ){
          nombre = pNombre;
          apellido = pApellido;
          genero = pGenero;
          fechaNacimiento = pFechaN;
          fechaIngreso = pFechaI;
          salario = pSalario;
     }
     
     //métods consultores
     
     public String getApellido(){
         return apellido;
       }
       
     public String getFechaIngreso(){
         return fechaIngreso.formatoCadena();
       }
       
     public String getFechaNacimineto(){
         return fechaNacimiento.formatoCadena();
       }
       
     public String getNombre(){
         return nombre;
       }
       
     public int getSalario(){
         return salario;
       }
       
     public int getGenero(){
         return genero;
       }
       
     // métodos modificadores
     public void setFechaIngreso(Fecha pFechaIngreso){
         fechaIngreso = pFechaIngreso;
       }
       
     public void setSalario( int pSalario){
         salario = pSalario;
       }
       
     //métodos analizadores
     int getEdad(){
         Fecha hoy = new Fecha();
         hoy.inicializarHoy();
         int edad = fechaNacimiento.darDiferenciaEnMeses(hoy)/12;
         return edad;
       }
       
     public int getAntiguedad(){
         Fecha hoy = new Fecha();
         hoy.inicializarHoy();
         //calcular la diferencia de años
         int antiguedad = fechaIngreso.darDiferenciaEnMeses(hoy)/12;
         return antiguedad;
       }
       
     public double getPrestaciones(){
         int antiguedad = getAntiguedad();
         double prestaciones = ((double) (antiguedad * salario))/12;
         return prestaciones;
       }
}