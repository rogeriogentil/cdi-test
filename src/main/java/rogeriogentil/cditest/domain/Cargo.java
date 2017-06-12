package rogeriogentil.cditest.domain;

/**
 *
 * @author Rogerio J. Gentil
 */
public class Cargo {
 
    private double salarioBase;
    private Escolaridade escolaridade;

    public double getSalarioBase() {
        return 3000.0;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Escolaridade getEscolaridadeEsperada() {
        return Escolaridade.SUPERIOR;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }
    
}
