package br.com.caelum.design.entity;

import br.com.caelum.chain.Orcamento;
import br.com.caelum.design.interfaces.Imposto;

public class ICCC extends Imposto {

	public ICCC(Imposto outroImposto){
		super(outroImposto);
	}
	
	public ICCC() {}
	
	
	@Override
	public double calcula(Orcamento orcamento) {
		// TODO Auto-generated method stub
		double valorCalculado;
		
		if (orcamento.getValor() < 1000){
			valorCalculado = orcamento.getValor() * 0.05;
		} else if (orcamento.getValor() > 3000) {
			valorCalculado = (orcamento.getValor() * 0.08) + 30;
		} else {
			valorCalculado = orcamento.getValor() * 0.07;
		}
		return valorCalculado + calculoDoOutroImposto(orcamento);
	}

}
