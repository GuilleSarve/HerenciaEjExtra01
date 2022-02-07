
package herencia.servicios;

import herencia.Alquiler;
import herencia.Barco;
import herencia.BarcoMotor;
import herencia.Velero;
import herencia.Yate;
import java.util.Date;
import java.util.Scanner;

public class ServicioAlquiler {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Alquiler crearAlquiler(){
    Alquiler a = new Alquiler();
            
        System.out.println("ingrese el nombre ");
        a.setNombre(leer.next());
        System.out.println("ingrese el dni ");
        a.setDni(leer.nextInt());
        System.out.println("ingrese la fecha de ingreso ");
        System.out.println("ingrese el dia ");
        int dia=leer.nextInt();
        System.out.println("ingrese el mes ");
        int mes=leer.nextInt();
        System.out.println("ingre el año ");
        int anio=leer.nextInt();
        Date nuevo= new Date(anio-1900,mes-1,dia);
        a.setFechaAlquiler(nuevo);
        System.out.println("ingrese la fecha de salida ");
        System.out.println("ingrese el dia ");
        int diad=leer.nextInt();
        System.out.println("ingrese el mes ");
        int mesd=leer.nextInt();
        System.out.println("ingre el año ");
        int aniod=leer.nextInt();
        Date nuevod= new Date(aniod-1900,mesd-1,diad);
        a.setFechaDevolucion(nuevod);
        System.out.println("ingrese la pocicion del amarre");
        a.setPosicion(leer.nextInt());  
        System.out.println("Ingrese el tipo de barco que desea "+"\n1.BarcoMotor "+"\n2.Yate "+"\n3.Velero");
         int opcion=leer.nextInt();
        switch(opcion){
            case 1:
                ServicioBarcoMotor sbm= new ServicioBarcoMotor();
                BarcoMotor bm = sbm.crearBarcoMotor();
                a.setBarco(bm);
                break;
            case 2:
                ServicioYate sy= new ServicioYate();
                Yate y = sy.crearYate();
                a.setBarco(y);
                break;
            case 3:
                ServicioVelero sv = new ServicioVelero();
                Velero v = sv.crearVelero();
                a.setBarco(v);
                break;
            default:
                ServicioBarco bar= new ServicioBarco();
                Barco b = bar.crearBarco();
                a.setBarco(b);    
        }
        a.setMonto(this.calcularAlquiler(this.calcularDias(a), a.getBarco().getModulo()));
        System.out.println("tu alquiler sale el increible precio de: "+a.getMonto());
return a;
    }
    public double calcularDias(Alquiler alquiler){
//        Alquiler alquiler=new Alquiler();
    double diferencia = (double) alquiler.getFechaDevolucion().getTime() - (double) alquiler.getFechaAlquiler().getTime();
        diferencia = diferencia / 86400000; // el divisor es la cantidad de milisegundos que hay en el dia. (1000*60*60*24)
        return diferencia;
    }
        public double calcularAlquiler(double dias,double modulo){
        double aux=dias*modulo;
        return aux;
        }
    }
            
        

