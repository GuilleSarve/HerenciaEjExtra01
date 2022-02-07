
package herencia;


public class Velero extends Barco{
private Integer mastiles;

    public Velero(Integer mastiles, String matricula, Integer eslora, Integer añoFab, Double modulo) {
        super(matricula, eslora, añoFab, modulo);
        this.mastiles = mastiles;
    }

    public Velero() {
    }

 


    public Integer getMastiles() {
        return mastiles;
    }

    public void setMastiles(Integer mastiles) {
        this.mastiles = mastiles;
    }

    @Override
    public String toString() {
        return "velero{" +super.toString()+ "mastiles=" + mastiles + '}';
    }

}
