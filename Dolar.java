package cofrinhoMoedas;

public class Dolar extends Moedas{

    public Dolar(double valor){
        this.valor = valor;
    }


    @Override
    public void info() {

    }

    @Override
    public void converter() {
         this.valor = valor * 5.1 ; //Converte o valor do Dólar para Real (taxa de Câmbio do dia 20/05/2024)
    }

    @Override
    public String toString() {
    	String result = "Dólar US$: " + valor; //Converte o valor para String, para ser legível no Console
    	converter();
        return result;
    }
}