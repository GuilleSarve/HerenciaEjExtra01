
package herencia.servicios;

import herencia.Barco;
import java.util.Scanner;


public class ServicioBarco {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
public Barco crearBarco(){
    Barco b = new Barco();
    System.out.println("ingrese la matricula ");
    b.setMatricula(leer.next());
    System.out.println("ingrese eslora bofi ;D");
    b.setEslora(leer.nextInt());
    System.out.println("ingrese el año de fabricacion ");
    b.setAñoFab(leer.nextInt());
    b.setModulo(this.calcularModulo(b.getEslora()));
return b;
}
 public  double calcularModulo(Integer eslora){
    double aux=eslora*10;
    return aux;
    }
}
