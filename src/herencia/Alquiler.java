
package herencia;

import java.util.Date;


public class Alquiler {
private String nombre;
private Integer dni;
private Date fechaAlquiler;
private Date fechaDevolucion;
private Integer Posicion;
private Barco barco;
private Double monto; 
    public Alquiler() {
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public Alquiler(String nombre, Integer dni, Date fechaAlquiler, Date fechaDevolucion, Integer Posicion, Barco barco,Double monto) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.Posicion = Posicion;
        this.barco = barco;
        this.monto=monto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Integer getPosicion() {
        return Posicion;
    }

    public void setPosicion(Integer Posicion) {
        this.Posicion = Posicion;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "nombre=" + nombre + ", dni=" + dni + ", fechaAlquiler=" + fechaAlquiler + ", fechaDevolucion=" + fechaDevolucion + ", Posicion=" + Posicion + ", barco=" + barco + ", monto=" + monto + '}';
    }


}
//el nombre, documento del cliente, la fecha de alquiler, fecha de
////devolución, la posición del amarre y el barco que lo ocupará.