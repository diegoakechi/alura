package br.com.caelum.templateMethod;

import br.com.caelum.chain.Orcamento;
import br.com.caelum.design.interfaces.Imposto;

public abstract class TemplateDeImposto extends Imposto {
	
    public TemplateDeImposto(Imposto outroImposto) {
		super(outroImposto);
	}
    
    public TemplateDeImposto() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public double calcula(Orcamento orcamento) {
        
		if(deveUsarMaximaTaxacao(orcamento)){
			return maximaTaxacao(orcamento) + calculoDoOutroImposto(orcamento);
		} else{
			return minimaTaxacao(orcamento) + calculoDoOutroImposto(orcamento);
		}

	
	}

	public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

	public abstract double minimaTaxacao(Orcamento orcamento);
	

	public abstract double maximaTaxacao(Orcamento orcamento);

	
}
