
package herencia.servicios;

import herencia.Barco;
import herencia.BarcoMotor;
import java.util.Scanner;


public class ServicioBarcoMotor extends ServicioBarco{
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public BarcoMotor crearBarcoMotor(){
    Barco b = super.crearBarco();
        System.out.println("Cual es la potencia del Motor de su BARCO!?");
        int potencia=leer.nextInt();
        double aux = this.calcularModulo(b.getEslora(),potencia);
        BarcoMotor bm= new BarcoMotor(potencia,b.getMatricula(),b.getEslora(),b.getAñoFab(),aux);
    return bm;
    }
   public  double calcularModulo(Integer eslora,Integer potencia){
    double aux=(eslora*10)+potencia;
 
    return aux;
    }
}
