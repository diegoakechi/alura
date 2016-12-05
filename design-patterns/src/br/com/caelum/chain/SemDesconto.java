package br.com.caelum.chain;

public class SemDesconto implements Desconto {

	@Override
	public double desconta(Orcamento orcamento) {
		
		return 0;
	}

	@Override
	public void setProximo(Desconto desconto) {
		/// Nao faz nada. Fim da Cadeia de Responsabilidade.
		
	}

}
