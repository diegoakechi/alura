package br.com.caelum.chain;

public class DescontoMaisQuinhentosReais implements Desconto{
 
	private Desconto proximo;
	
	public DescontoMaisQuinhentosReais(Desconto proximo) {
		this.proximo = proximo;
	}
	
	@Override
	public double desconta(Orcamento orcamento) {

		if(orcamento.getValor() > 500){
			return orcamento.getValor() * 0.07;
		}
		
		return proximo.desconta(orcamento); 
	}

	@Override
	public void setProximo(Desconto desconto) {
		this.proximo = desconto;
		
	}

}
