package rogeriogentil.cditest.domain;

/**
 *
 * @author Rogerio J. Gentil
 */
public enum Escolaridade {
    
    FUNDAMENTAL("Ensino Fundamental"),
    MEDIO("Ensino Médio"),
    SUPERIOR("Ensino Superior");
    
    private final String nivel;

    private Escolaridade(String nivel) {
        this.nivel = nivel;
    }

    public String getNivel() {
        return nivel;
    }
    
}
