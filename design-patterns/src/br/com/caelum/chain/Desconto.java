package br.com.caelum.chain;

public interface Desconto {
	
	public double desconta(Orcamento orcamento);
	public void setProximo(Desconto desconto);
	

}
