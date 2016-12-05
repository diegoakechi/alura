package br.com.caelum.chain;

public class TestaChainDescontos {

	public static void main(String[] args) {
		
			
		//Desconto desc3 = new SemDesconto();
		Desconto descNovo = new DescontoPorVendaCasada(null);
		Desconto desc2 = new DescontoMaisQuinhentosReais(descNovo);
		Desconto desc1 = new DescontoMaisCincoItens(desc2);
		
				
		Orcamento orcamento = new Orcamento(400.00);
		
		orcamento.adicionaItem(new Item("Caneca", 100));
		orcamento.adicionaItem(new Item("LAPIS", 100));
		orcamento.adicionaItem(new Item("Tesoura", 100));
		orcamento.adicionaItem(new Item("clips", 100));

		
		double desconto = desc1.desconta(orcamento);
		
		System.out.println(desconto);
		
		
		

	}

}
