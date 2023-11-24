public class InformacionEmpleado{
    public static void main(String args[]){
        Empleado emp;
        Fecha fechaNacimiento;
        Fecha fechaIngreso;
        
        fechaNacimiento = new Fecha(16,6,1980);
        fechaIngreso = new Fecha(5,4,2000);
        emp= new Empleado("Pedro", "Rosales", 1,fechaNacimiento, fechaIngreso,1500000);
        System.out.println("La edad actual de  "+emp.getNombre() + " es "+ emp.getEdad()+ " años");
        System.out.println("Tiene una antiguedad en la empresa de "+ emp.getAntiguedad()+ " años");
        System.out.println("Porque su fecha de ingreso en la empresa fue "+emp.getFechaIngreso());
        System.out.println("Sus prestaciones son de $"+ emp.getPrestaciones());
    }
}