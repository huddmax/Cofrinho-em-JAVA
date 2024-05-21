package cofrinhoMoedas;

public class Euro extends Moedas{

    public Euro(double valor){
        this.valor = valor;
    }

    @Override
    public void info() {

    }

    @Override
    public void converter() {
        this.valor = valor *  5.55; //Converte o valor do Euro para Real (taxa de Câmbio do dia 20/05/2024)
    }

    @Override
    public String toString() {

    	String result = "Euro €: " + valor; //Converte o valor para String, para ser legível no Console
    	converter();
        return result;

    }
}