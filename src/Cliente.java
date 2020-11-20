
import builder.Banco;
import builder.BancoBradesco;
import builder.BancoCaixa;
import produto.Boleto;


public class Cliente {

	public static void main(String[] args) {

		// Bradesco
		// TODO instanciar o builder do Bradesco
                Banco bancoBradesco = new BancoBradesco();
		GeradorBoleto gerador1 = new GeradorBoleto(bancoBradesco);
                gerador1.construir("Bino", "001", "01010101");
		Boleto boleto = bancoBradesco.getBoleto();
                System.out.println(boleto);
		
		// Caixa
		// TODO instanciar o builder da Caixa
//                Banco bancoCaixa = new BancoCaixa();
//                GeradorBoleto gerador2 = new GeradorBoleto(bancoCaixa);
//                gerador2.construir("Bino", "001", "01010101");
//                Boleto boletoCaixa = bancoCaixa.getBoleto();
//                System.out.println(boletoCaixa);
	}

}
