
package herencia.servicios;

import herencia.Barco;
import herencia.Velero;
import java.util.Scanner;


public class ServicioVelero extends ServicioBarco {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
public Velero crearVelero(){
    Barco b = super.crearBarco();
    System.out.println("ingrese la cantidad de mastiles que tiene el barco ");
    int mastiles=leer.nextInt();
    double aux=this.calcularModulo(b.getEslora(),mastiles);
    Velero v = new Velero(mastiles,b.getMatricula(),b.getEslora(),b.getAñoFab(),aux);
return v;
}
 public  double calcularModulo(Integer eslora,Integer mastil){
    double aux=(eslora*10)+mastil;
 
    return aux;
 }
}
