package rogeriogentil.cditest.service;

import rogeriogentil.cditest.domain.Escolaridade;
import rogeriogentil.cditest.domain.Funcionario;

/**
 *
 * @author Rogerio J. Gentil
 */
public class CalculadoraDeSalarios2017 implements CalculadoraDeSalarios {
    
    private TabelaDeReferenciaSalarial tabela;

    @Override
    public double calcularSalario(Funcionario funcionario) {
        if (funcionario.getEscolaridade() == Escolaridade.SUPERIOR) {
            return 3000.0;
        } else {
            return 2000.0;
        }
    }

    @Override
    public void setTabelaDeReferenciaSalarial(TabelaDeReferenciaSalarial tabela) {
        this.tabela = tabela;
    }
    
}
