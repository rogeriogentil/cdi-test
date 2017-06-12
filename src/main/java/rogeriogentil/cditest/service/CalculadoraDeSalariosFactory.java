package rogeriogentil.cditest.service;

import java.util.ResourceBundle;
import org.apache.log4j.Logger;
import rogeriogentil.cditest.util.FactoryClass;

/**
 * Classe para auxiliar a implementação do padrão <em>Strategy</em> no
 * cálculo de salários.
 *  
 * @author Rogerio J. Gentil
 */
public class CalculadoraDeSalariosFactory {
       
    public static CalculadoraDeSalarios criarCalculadora() {
        TabelaDeReferenciaSalarial tabela = FactoryClass.criarInstancia(TabelaDeReferenciaSalarial.class);
       
        CalculadoraDeSalarios calculadora = FactoryClass.criarInstancia(CalculadoraDeSalarios.class);        
        calculadora.setTabelaDeReferenciaSalarial(tabela);
        
        return calculadora;
    }
}
