package rogeriogentil.cditest;

import rogeriogentil.cditest.domain.Cargo;
import rogeriogentil.cditest.domain.Escolaridade;
import rogeriogentil.cditest.domain.Funcionario;
import rogeriogentil.cditest.service.CalculadoraDeIRPF;
import rogeriogentil.cditest.service.CalculadoraDeIRPF2013;
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
        funcionario.setCargo(new Cargo());
        
        CalculadoraDeSalarios calculadora = CalculadoraDeSalariosFactory.criarCalculadora();
        double salario = calculadora.calcularSalario(funcionario);
        
        System.out.println("Salário: " + salario);
        
        CalculadoraDeIRPF calculadoraIRPF = new CalculadoraDeIRPF2013();
        double imposto = calculadoraIRPF.calcularImpostoDeRenda(funcionario);
        
        System.out.println("IRPF: " + imposto);
    }
}
