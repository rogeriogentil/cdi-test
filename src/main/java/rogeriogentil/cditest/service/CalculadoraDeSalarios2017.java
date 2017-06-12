package rogeriogentil.cditest.service;

import java.util.Calendar;
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
        double salario = funcionario.getCargo().getSalarioBase();

        Escolaridade escolaridadeDoFuncionario = funcionario.getEscolaridade();
        Escolaridade escolaridadeEsperada = funcionario.getCargo().getEscolaridadeEsperada();

        if (escolaridadeDoFuncionario.compareTo(escolaridadeEsperada) < 0) {
            salario = salario * 0.8;
        } else if (escolaridadeDoFuncionario.compareTo(escolaridadeEsperada) > 0) {
            salario = salario * 1.2;
        }

        int anoAtual = getAnoAtual();
        int anoAdmissao = funcionario.getAnoDeAdmissao();

        // Ganha 1% de aumento para cada ano trabalhado
        double anosTrabalhados = anoAtual - anoAdmissao;
        double aumentoAntiguidade = anosTrabalhados / 100;
        salario = salario * (1 + aumentoAntiguidade);

        // Recebe aumento de 10% se tem mais de 5 anos
        if (anosTrabalhados > 5) {
            salario = salario * 1.1;
        }

        return salario;
    }

    private int getAnoAtual() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.YEAR);
    }
    
    @Override
    public void setTabelaDeReferenciaSalarial(TabelaDeReferenciaSalarial tabela) {
        this.tabela = tabela;
    }
    
}
