package rogeriogentil.cditest.util;

import java.util.ResourceBundle;
import org.apache.log4j.Logger;

/**
 * Classe utilitária para a instanciação de objetos.
 * 
 * @author Rogerio J. Gentil
 */
public class FactoryClass {
    
    private static Logger logger;
    private static final ResourceBundle bundle = ResourceBundle.getBundle("dependencias");

    public static <T> T criarInstancia(Class<T> classe) {
         String nomeDaClasse = bundle.getString(classe.getSimpleName());
         
        try {
            Class<?> clazz = Class.forName(nomeDaClasse);
            return clazz.asSubclass(classe).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            logger.error(e);
            return null;
        }
    }
}
