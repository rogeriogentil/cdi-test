package rogeriogentil.cditest.service;

import rogeriogentil.cditest.domain.Funcionario;

/**
 *
 * @author Rogerio J. Gentil
 */
public class CalculadoraDeSalariosPadrao implements CalculadoraDeSalarios {

    @Override
    public double calcularSalario(Funcionario funcionario) {
        return 2000.0;
    }
    
}
