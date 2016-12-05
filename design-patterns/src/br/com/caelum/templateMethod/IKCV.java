package br.com.caelum.templateMethod;

import br.com.caelum.chain.Item;
import br.com.caelum.chain.Orcamento;

public class IKCV extends TemplateDeImposto{
	
	private boolean temItensAcimaDe100Reais(Orcamento orcamento){
		
		for(Item item : orcamento.getItens()){
			if(item.getValor() > 100){
				return true;
			}
		}
		
		return false;
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return orcamento.getValor() > 500 && temItensAcimaDe100Reais(orcamento);
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return orcamento.getValor() * 0.06;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return orcamento.getValor() * 0.1;
	}

}
