
package herencia;


public class BarcoMotor extends Barco{
    private Integer potenciMotor;

    public BarcoMotor(Integer potenciMotor, String matricula, Integer eslora, Integer añoFab, Double modulo) {
        super(matricula, eslora, añoFab, modulo);
        this.potenciMotor = potenciMotor;
    }

    public BarcoMotor() {
    }

  

    public Integer getPotenciMotor() {
        return potenciMotor;
    }

    public void setPotenciMotor(Integer potenciMotor) {
        this.potenciMotor = potenciMotor;
    }

    @Override
    public String toString() {
        return "barcoMotor{" +super.toString() +"potenciMotor=" + potenciMotor + '}';
    }
    

}
