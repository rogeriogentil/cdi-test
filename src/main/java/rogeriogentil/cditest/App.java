package rogeriogentil.cditest;

import rogeriogentil.cditest.domain.Funcionario;
import rogeriogentil.cditest.service.CalculadoraDeSalarios;
import rogeriogentil.cditest.service.CalculadoraDeSalariosPadrao;

/**
 *
 * @author Rogerio J. Gentil
 */
public class App {
    
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        CalculadoraDeSalarios calculadora = new CalculadoraDeSalariosPadrao();
        double salario = calculadora.calcularSalario(funcionario);
        
        System.out.println("Salário: " + salario);
    }
}
