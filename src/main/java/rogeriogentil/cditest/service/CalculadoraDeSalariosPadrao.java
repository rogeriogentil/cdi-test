package rogeriogentil.cditest.service;

import rogeriogentil.cditest.domain.Funcionario;

/**
 *
 * @author Rogerio J. Gentil
 */
public class CalculadoraDeSalariosPadrao implements CalculadoraDeSalarios {

    private TabelaDeReferenciaSalarial tabela;
    
    @Override
    public double calcularSalario(Funcionario funcionario) {
        return 2000.0;
    }

    @Override
    public void setTabelaDeReferenciaSalarial(TabelaDeReferenciaSalarial tabela) {
        this.tabela = tabela;
    }
    
}
