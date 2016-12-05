package br.com.caelum.design.entity;

import br.com.caelum.chain.Orcamento;
import br.com.caelum.design.interfaces.Imposto;

public class ICMS extends Imposto {
	
	public ICMS(Imposto outroImposto){
		super(outroImposto);
	}
	
	public ICMS() {}

	@Override
	public double calcula(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return orcamento.getValor() * 0.1 + calculoDoOutroImposto(orcamento);
	}
	

}
