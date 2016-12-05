package br.com.caelum.design.main;

import br.com.caelum.chain.Orcamento;
import br.com.caelum.design.bo.CalculadorDeImposto;
import br.com.caelum.design.entity.ICCC;
import br.com.caelum.design.entity.ICMS;
import br.com.caelum.design.entity.ISS;
import br.com.caelum.design.interfaces.Imposto;

public class TesteDeImposto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Imposto iss = new ISS();
        Imposto icms = new ICMS();
        Imposto iccc = new ICCC();
        
        Orcamento orcamento = new Orcamento(500.00);
        
        CalculadorDeImposto calculador = new CalculadorDeImposto();
        
        calculador.realizaCalculo(orcamento, iss);
        
        calculador.realizaCalculo(orcamento, icms);
        
        
        calculador.realizaCalculo(orcamento, iccc);
        
        orcamento.setValor(1500.00);
        
        calculador.realizaCalculo(orcamento, iccc);
        
        orcamento.setValor(3500.00);
        
        calculador.realizaCalculo(orcamento, iccc);
        
	}

}
