package br.com.caelum.design.bo;

import br.com.caelum.chain.Orcamento;
import br.com.caelum.design.interfaces.Imposto;

public class CalculadorDeImposto {
	
	public void realizaCalculo(Orcamento orcamento, Imposto imposto){
		double valor = imposto.calcula(orcamento);
		
		System.out.println(valor);
	}

}
