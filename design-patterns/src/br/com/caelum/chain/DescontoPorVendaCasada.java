package br.com.caelum.chain;

public class DescontoPorVendaCasada implements Desconto {

	private Desconto proximo;
	
	public DescontoPorVendaCasada(Desconto proximo){
		this.proximo = proximo;
	}
	
	
	private boolean existe(String nomeDoItem, Orcamento orcamento) {
        for (Item item : orcamento.getItens()) {
            if(item.getNome().equals(nomeDoItem)) return true;
        }
        return false;
    }
	
	@Override
	public double desconta(Orcamento orcamento) {
		if(existe("CANETA",orcamento) && existe("LAPIS",orcamento)){
			return orcamento.getValor() * 0.05;
		}
			
		return (proximo == null ? 0 : proximo.desconta(orcamento));
	}

	@Override
	public void setProximo(Desconto desconto) {
		
		this.proximo = desconto;
		
	}

}
