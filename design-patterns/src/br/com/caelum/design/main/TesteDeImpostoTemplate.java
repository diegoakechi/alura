package br.com.caelum.design.main;

import java.util.ArrayList;
import java.util.List;

import br.com.caelum.chain.Item;
import br.com.caelum.chain.Orcamento;
import br.com.caelum.design.bo.CalculadorDeImposto;
import br.com.caelum.design.interfaces.Imposto;
import br.com.caelum.templateMethod.ICPP;
import br.com.caelum.templateMethod.IHIT;
import br.com.caelum.templateMethod.IKCV;

public class TesteDeImpostoTemplate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Imposto icpp = new ICPP();
        Imposto ikcv = new IKCV();
        Imposto ihit = new IHIT();
        
        Orcamento orcamento = new Orcamento(10000);
        
        orcamento.adicionaItem(new Item("CANETA", 100));
        orcamento.adicionaItem(new Item("CANETA", 200));
        orcamento.adicionaItem(new Item("LAPIS", 100));
        
        
        
        CalculadorDeImposto calculador = new CalculadorDeImposto();
        
        calculador.realizaCalculo(orcamento, icpp);
        
        calculador.realizaCalculo(orcamento, ikcv);
        
        calculador.realizaCalculo(orcamento, ihit);
        
   
	}

}
