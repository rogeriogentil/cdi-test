package rogeriogentil.cditest.service;

import rogeriogentil.cditest.domain.Funcionario;

/**
 *
 * @author Rogerio J. Gentil
 */
public class CalculadoraDeIRPF2013 implements CalculadoraDeIRPF {

    private CalculadoraDeSalarios calculadora;

    public CalculadoraDeIRPF2013(CalculadoraDeSalarios calculadora) {
        this.calculadora = calculadora;
    }
    
    
    @Override
    public double calcularImpostoDeRenda(Funcionario funcionario) {
        calculadora = CalculadoraDeSalariosFactory.criarCalculadora();
        double salario = calculadora.calcularSalario(funcionario);

        // Tabela de IR de 2013
        double aliquota = 0.0;
        double parcelaDeduzir = 0.0;
        
        if (salario <= 1710.78) {
            aliquota = 0.0;
            parcelaDeduzir = 0.0;
        } else if (salario > 1710.78 && salario <= 2563.91) {
            aliquota = 7.5 / 100;
            parcelaDeduzir = 128.31;
        } else if (salario > 2563.91 && salario <= 3418.59) {
            aliquota = 15.0 / 100;
            parcelaDeduzir = 320.60;
        } else if (salario > 3418.59 && salario <= 4271.59) {
            aliquota = 22.5 / 100;
            parcelaDeduzir = 577.0;
        } else if (salario > 4271.59) {
            aliquota = 27.5 / 100;
            parcelaDeduzir = 790.58;
        }
        
        double impostoSemDesconto = salario * aliquota;
        
        return impostoSemDesconto - parcelaDeduzir;
    }
}
