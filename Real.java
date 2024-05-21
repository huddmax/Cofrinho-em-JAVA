package cofrinhoMoedas;

public class Real extends Moedas{

    public Real(double valor){
        this.valor = valor;
    }

    @Override
    public void info() {

    }

    @Override
    public void converter() {
       this.valor = valor * 1; // Multiplica o Real por 1, não faz efeito no resultado, mas mantém o padrão da função de converter
    }

    @Override
    public String toString() {
        String result = "Reais R$: " + valor; //Converte o valor para String, para ser legível no Console
        converter();
        return result;
    }
}