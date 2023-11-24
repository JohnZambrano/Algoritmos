
package Integral;

public class ClsPolinomio {
    
    public int grado1;
    public double [] coeficiente;
    
    //Constructores

    public ClsPolinomio(int grado)
    {
        grado1=grado;
        coeficiente=new double [grado1];
    }
    
    public ClsPolinomio(int grado, double[]coef)
    {
        grado1=grado;
        coeficiente=coef;
    }
    
    public ClsPolinomio(ClsPolinomio t)
    {
        grado1=t.grado1;
        coeficiente=t.coeficiente;
    }
    
    //Métodos Set
    
    public void grado(int valor)
    {
        grado1=valor;
    }
    
    public void a(double[] coef)
    {
        coeficiente=coef;
    }

    public void a(int i, float valor)
    {
        coeficiente[i]=valor;
    }
    
    //Métodos Get
    
    public int grado()
    {
        return grado1;
    }
    
    public double[] a()
    {
        return coeficiente;
    }
    
    public double a(int i)
    {
        return coeficiente[i];
    }
    
    
    //Método de Horner
    
    public double Horner(float valx)
    {
        double valor = (coeficiente[grado1-2] + coeficiente[grado1-1])*valx;
        for (int i=grado1-3; i>=0; i--)
        {
            valor = coeficiente[i] + (valor*valx); 
        }
        return valor;
    }
    
    //Integral Método Rectángulo izquierdo
    
    public double izquierdo(float a, float b, int n)
    {
        double deltax = (b-a)/(double)(n);
        double suma = 0;
        for(int i=0; i<n; i++)
        {
            suma+= Horner((float)(a+i*deltax));
        }
        return deltax*suma;
    }
    
    //Integral Método Rectángulo Derecho
    
     public double derecho(float a, float b, int n)
    {
        double deltax = (b-a)/(double)(n);
        double suma = 0;
        for(int i=1; i<=n; i++)
        {
            suma+= Horner((float)(a+i*deltax));
        }
        return deltax*suma;
    }
    
    //Integral Metodo Trapecio
            
    public double trapecio(float a, float b, int n)
    {
        return (izquierdo(a,b,n) + derecho(a,b,n))/2;
    }
    
    //Integral Método Simpson 1/3
    
    public double simpson(float a, float b, int n)
    {
        if(n%2!=0)
        {
            n+=1;
        }
        double deltax = (b-a)/(double)(n);
        double sumpar = 0;
        double sumimpar = 0;
        for(int i=1; i<n; i+=2)
        {
            sumimpar+= Horner((float)(a+i*deltax));
        }
        for(int i=2; i<n-1; i+=2)
        {
            sumpar+= Horner((float)(a+i*deltax));
        }
        return (deltax/3)*(Horner(a)+Horner(b)+4*sumimpar+2*sumpar);
    }
    
    //Metodo Ver
    
    public String ver()
    {
        String polinomio="";
    
        for(int i=grado1-1;i>0;i--)
        {
            if(coeficiente[i]!=0)
            {
                polinomio+= coeficiente[i]+"*"+"X^"+i+" ";
            }
            if(coeficiente[i-1]>=0)
            {
                polinomio+="+";
            }
            
        }
        polinomio+=coeficiente[0];
        return polinomio;
    
    }
}
