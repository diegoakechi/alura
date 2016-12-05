package br.com.caelum.design.entity;

import br.com.caelum.chain.Orcamento;
import br.com.caelum.design.interfaces.Imposto;

public class ISS extends Imposto {
	
	public ISS(Imposto outroImposto){
		super(outroImposto);
	}
	
	public ISS() {}

	@Override
	public double calcula(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return orcamento.getValor() * 0.06 + calculoDoOutroImposto(orcamento);
	}

}
