package rogeriogentil.cditest.service;

import java.util.ResourceBundle;
import org.apache.log4j.Logger;

/**
 * Classe para auxiliar a implementação do padrão <em>Strategy</em> no
 * cálculo de salários.
 *  
 * @author Rogerio J. Gentil
 */
public class CalculadoraDeSalariosFactory {
    
    private static Logger logger;
    private static ResourceBundle bundle = ResourceBundle.getBundle("dependencias");
    
    public static CalculadoraDeSalarios criarCalculadora() {
        String nomeDaClasse = bundle.getString("calculadora_salarios");
        
        try {
            Class<?> clazz = Class.forName(nomeDaClasse);
            return clazz.asSubclass(CalculadoraDeSalarios.class).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            logger.error(e);
            return null;
        }
    }
}
