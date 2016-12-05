package br.com.caelum.templateMethod;

import br.com.caelum.chain.Orcamento;
import br.com.caelum.design.interfaces.Imposto;

public class ICPP extends TemplateDeImposto {

	public ICPP(Imposto outroImposto){
		super(outroImposto);
	}
	
	public ICPP() {}
	
	
	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500;
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		
		return orcamento.getValor() * 0.05;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}

}
