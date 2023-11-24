public class LibroCalificaiones{
    String nombreDelCurso = " "; //nombre del curso para este libroCalificaciones
    //El método para establecer el nombre delcurso
    public void establecerNombreDelCurso(String nombre){
        nombreDelCurso = nombre; //almacena el nombre del curso
    }//fin del método establecerNombreDelCurso
    //método para obtener el nombre del curso
    public String obtenerNombreDelCurso(){
        return nombreDelCurso;
    }//fin del método obtenerNobreDelCurso
    //muestra un mensaje de bienvenida al usuario de LibroCalificiones
    public void mostrarMensaje(){
        /* esta instrucción llama a obtenerNombreDelCurso para obtener
           el nombre del curso que representa este LibroCalificaciones
        */
       System.out.printf("Bienvenido al libro calificaciones para "+obtenerNombreDelCurso());
    }//fin del método mostrarMensaje    

}// fin de la clase LibroCalificaciones
