package rogeriogentil.cditest;

import rogeriogentil.cditest.domain.Escolaridade;
import rogeriogentil.cditest.domain.Funcionario;
import rogeriogentil.cditest.service.CalculadoraDeSalarios;
import rogeriogentil.cditest.service.CalculadoraDeSalariosFactory;

/**
 *
 * @author Rogerio J. Gentil
 */
public class App {
    
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setEscolaridade(Escolaridade.SUPERIOR);
        
        CalculadoraDeSalarios calculadora = CalculadoraDeSalariosFactory.criarCalculadora();
        double salario = calculadora.calcularSalario(funcionario);
        
        System.out.println("Salário: " + salario);
    }
}
