package rogeriogentil.cditest.service;

import rogeriogentil.cditest.domain.Funcionario;

/**
 *
 * @author Rogerio J. Gentil
 */
public interface CalculadoraDeSalarios {
    
    double calcularSalario(Funcionario funcionario);
    
    void setTabelaDeReferenciaSalarial(TabelaDeReferenciaSalarial tabela);
}
