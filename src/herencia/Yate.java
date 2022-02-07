
package herencia;


public class Yate extends Barco{
private Integer potenciaMotor;
private Integer camarote;
    public Yate() {
    }

    public Yate(Integer potenciaMotor, Integer camarote, String matricula, Integer eslora, Integer añoFab, Double modulo) {
        super(matricula, eslora, añoFab, modulo);
        this.potenciaMotor = potenciaMotor;
        this.camarote = camarote;
    }

    public Integer getCamarote() {
        return camarote;
    }

    public void setCamarote(Integer camarote) {
        this.camarote = camarote;
    }

    

    public Integer getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(Integer potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    @Override
    public String toString() {
        return "yate{" +super.toString()+ "potenciaMotor=" + potenciaMotor + ", camarote=" + camarote + '}';
    }

}
