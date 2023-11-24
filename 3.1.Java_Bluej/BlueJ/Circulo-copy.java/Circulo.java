public class Circulo {
    //miembros privados
  private double x, y; //coordenadas del centro
    //miembros publicos
  public double r; // radio del circulo
    //miembros publicos
  public Circulo(){//contructor sin parametros
      x = 0;
      y = 0;
      r = 1;
    }
  public Circulo(double cx, double cy, double cr) {
      x = cy;
      y = cy;
      if (cr < 0) {
          msgNegativo();
          cr = -cr;
        }
        r = cr;
    }
    
  private void msgNegativo() {
      System.out.println("El radio es negativo-> Se convierte a positivo");
    }
    
  public double longitud() {
      return 2 * Math.PI *getR();
    }
    
  public double area() {
      return Math.PI *getR() * getR();
    }
    
  public double getX() {
      return x;
    }
    
  public void setX(double x1) {
      x = x1;
    }
    
  public double getY() {
      return y;
    }
    
  public double getR() {
      return r;
    }
    
  public void setR(double r1) {
      if (r1 < 0) {
          msgNegativo();
          r1 = -r1;
        }
      r = r1;
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
      
