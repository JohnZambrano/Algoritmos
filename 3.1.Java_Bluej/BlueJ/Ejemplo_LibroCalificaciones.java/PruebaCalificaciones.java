import java.util.Scanner; //El programa usa la clase Scanner
public class PruebaCalificaciones{  
    
    //el método main empieza la ejecucuón del programa
    public static void main(String args[]){
        //crea un objeto Scanner para obtener la entrada de la ventana de comandos
        Scanner entrada = new Scanner(System.in);
        //crea un objeto LibroCalificaones y lo asigna a milibroCalificaciones
        LibroCalificaiones libro = new LibroCalificaiones();
        //muestra el valor inicial de nombreDelCurso
        System.out.println("El nombre inicial del curso es: "+libro.obtenerNombreDelCurso());
        //pide y lee el nombre del curso
        System.out.println("Escribe el nombre del curso: ");
        String nombre = entrada.nextLine(); // lee una linea de texto
        libro.establecerNombreDelCurso(nombre); //establece el nombre del curso
        System.out.println(); // imprime una linea en blanco
        
        //muetra el mensaje de bienvenida despúes de especificar el nombre del curso
        libro.mostrarMensaje();
        System.out.println();//impprime una linea en blanco
        
    }// fin de método main
    
}//fin de la clase
