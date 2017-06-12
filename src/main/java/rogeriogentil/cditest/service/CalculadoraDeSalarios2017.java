package rogeriogentil.cditest.service;

import rogeriogentil.cditest.domain.Escolaridade;
import rogeriogentil.cditest.domain.Funcionario;

/**
 *
 * @author Rogerio J. Gentil
 */
public class CalculadoraDeSalarios2017 implements CalculadoraDeSalarios {

    @Override
    public double calcularSalario(Funcionario funcionario) {
        if (funcionario.getEscolaridade() == Escolaridade.SUPERIOR) {
            return 3000.0;
        } else {
            return 2000.0;
        }
    }
    
}
