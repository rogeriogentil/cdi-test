package rogeriogentil.cditest.service;

/**
 * Classe para auxiliar a implementação do padrão <em>Strategy</em> no
 * cálculo de salários.
 *  
 * @author Rogerio J. Gentil
 */
public class CalculadoraDeSalariosFactory {
    
    public static CalculadoraDeSalarios criarCalculadora() {
        TabelaDeReferenciaSalarial pisosSalariais = new TabelaDeReferenciaSalarialPadrao();
        
        CalculadoraDeSalarios calculadora = new CalculadoraDeSalarios2017();        
        calculadora.setTabelaDeReferenciaSalarial(pisosSalariais);
        
        return calculadora;
    }
}
