package br.com.caelum.design.main;

import br.com.caelum.chain.Item;
import br.com.caelum.chain.Orcamento;
import br.com.caelum.design.bo.CalculadorDeImposto;
import br.com.caelum.design.entity.ICCC;
import br.com.caelum.design.entity.ICMS;
import br.com.caelum.design.entity.ISS;
import br.com.caelum.design.interfaces.Imposto;
import br.com.caelum.templateMethod.ICPP;

public class TesteDeImpostoDecorator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Imposto iccc = new ICCC(new ISS());
		
		Imposto icpp = new ICPP(new ICMS());
		

		Orcamento orcamento = new Orcamento(10000);

		orcamento.adicionaItem(new Item("CANETA", 100));
		orcamento.adicionaItem(new Item("CANETA", 200));
		orcamento.adicionaItem(new Item("LAPIS", 100));

		CalculadorDeImposto calculador = new CalculadorDeImposto();

		calculador.realizaCalculo(orcamento, iccc);
		
		calculador.realizaCalculo(orcamento, icpp);

	
	}

}
