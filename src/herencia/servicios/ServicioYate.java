package herencia.servicios;

import herencia.Barco;
import herencia.Yate;
import java.util.Scanner;

public class ServicioYate extends ServicioBarco {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Yate crearYate() {
        Barco b = super.crearBarco();
        System.out.println("Ingrese la potencia del motor ");
        int potencia = leer.nextInt();
        System.out.println("Ingrese la cantidad de camarotes ");
        int camarotes = leer.nextInt();
        double aux = this.calcularModulo(b.getEslora(),potencia,camarotes);
        Yate y = new Yate(potencia,camarotes, b.getMatricula(), b.getEslora(), b.getAñoFab(),aux);
//        Integer potenciaMotor, Integer camarote, String matricula, Integer eslora, Integer añoFab, Double modulo
        return y;
        
    }
 
    public  double calcularModulo(Integer eslora,Integer potencia,Integer camarotes){
    double aux=(eslora*10)+potencia+camarotes;
 
    return aux;
    }

}
