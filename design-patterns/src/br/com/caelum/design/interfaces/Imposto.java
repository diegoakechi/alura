package br.com.caelum.design.interfaces;

import br.com.caelum.chain.Orcamento;

public abstract class Imposto {
	
	protected final Imposto outroImposto;
	
	public Imposto(Imposto outroImposto){
		this.outroImposto = outroImposto;
		
	}
	
	public Imposto() {
		this.outroImposto = null;
	}
	
	public abstract double calcula(Orcamento orcamento);
	
	protected double calculoDoOutroImposto(Orcamento orcamento){
		if(this.outroImposto == null) return 0;
		
		return this.outroImposto.calcula(orcamento);
	}


}
