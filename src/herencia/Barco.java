
package herencia;


public class Barco {
protected String matricula;
protected Integer eslora;
protected Integer añoFab;
protected Double modulo;

    public Double getModulo() {
        return modulo;
    }

    public void setModulo(Double modulo) {
        this.modulo = modulo;
    }

    public Barco() {
    }

    public Barco(String matricula, Integer eslora, Integer añoFab,Double modulo) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.añoFab = añoFab;
        this.modulo= modulo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getEslora() {
        return eslora;
    }

    public void setEslora(Integer eslora) {
        this.eslora = eslora;
    }

    public Integer getAñoFab() {
        return añoFab;
    }

    public void setAñoFab(Integer añoFab) {
        this.añoFab = añoFab;
    }

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", a\u00f1oFab=" + añoFab + ", modulo=" + modulo + '}';
    }



}
//Un Barco se caracteriza por: su matrícula, su eslora en metros y año de
////fabricación.