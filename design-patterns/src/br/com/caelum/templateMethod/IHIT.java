package br.com.caelum.templateMethod;

import java.util.ArrayList;
import java.util.List;

import br.com.caelum.chain.Item;
import br.com.caelum.chain.Orcamento;

public class IHIT extends TemplateDeImposto {
	
	private boolean temDoisItemsComMesmoNome(Orcamento orcamento){
		
		List<String> noOrcamento = new ArrayList<String>();
		
		for(Item item : orcamento.getItens()){
			
			if(noOrcamento.contains(item.getNome())){
				return true;
			} else {
				noOrcamento.add(item.getNome());
			}
		}
		
		return false;
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return temDoisItemsComMesmoNome(orcamento);
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return (orcamento.getValor() * 0.01) * orcamento.getItens().size(); 
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return orcamento.getValor() * 0.13 + 100;
	}

}
