package rogeriogentil.cditest.service;

import rogeriogentil.cditest.domain.Funcionario;

/**
 *
 * @author Rogerio J. Gentil
 */
public interface CalculadoraDeIRPF {
    
    double calcularImpostoDeRenda(Funcionario funcionario);
}
