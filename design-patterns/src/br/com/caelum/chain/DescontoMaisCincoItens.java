package br.com.caelum.chain;

public class DescontoMaisCincoItens implements Desconto {

	private Desconto proximo;
	
	public DescontoMaisCincoItens(Desconto proximo){
		this.proximo = proximo;
	}

	public void setProximo(Desconto desconto) {
		this.proximo = desconto;
	}

	@Override
	public double desconta(Orcamento orcamento) {

		if (orcamento.getItens().size() > 5) {
			return orcamento.getValor() * 0.1;
		}

		return proximo.desconta(orcamento);
	}

}
