package cofrinhoMoedas;

public class Principal {

    public static void main(String[] args) {
    	
    	Cofrinho cofrinho = new Cofrinho();

        Moedas dolar = new Dolar(1250);
        Moedas real  = new Real (2500);
        Moedas euro  = new Euro (3750);

        cofrinho.adicionar(dolar);
        cofrinho.adicionar (real);
        cofrinho.adicionar (euro);
        cofrinho.listagemDeMoedas();
        cofrinho.totalConvertido();
    }
}