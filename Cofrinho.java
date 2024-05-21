package cofrinhoMoedas;
import java.util.ArrayList;

public class Cofrinho {

    private ArrayList<Moedas> listaDeMoedas = new ArrayList<>();


    public void adicionar(Moedas moedas){
        this.listaDeMoedas.add(moedas);
    }

    public void remover(Moedas moedas){
        this.listaDeMoedas.remove(moedas);
    }
    
    // Método para listar todas as moedas no cofrinho
    
    public void listagemDeMoedas(){
    	
    	// tive que colocar outro método em cada uma das moedas para listar corretamente a String e não apontar um espaço de memória (No JS não tem isso)
    	
        System.out.println(this.listaDeMoedas);
        
    }
    
    

 // Método para calcular o total convertido das moedas em reais
    
    public void totalConvertido(){

        long contagemDeMoedas = this.listaDeMoedas.size();
        double somatorioDasMoedasEmReal = 0;

        // laço de repetição para fazer o somatorio de toda a lista de moedas
        
        for (int i = 0; i < contagemDeMoedas; i++){
            somatorioDasMoedasEmReal = somatorioDasMoedasEmReal + this.listaDeMoedas.get(i).valor;
            
            
        } 
        

        // Verificação para dar a mensagem corretamente se tiver mais de 1 tipo de moeda
        
        if (contagemDeMoedas>1) {
        	System.out.println("O Cofrinho tem moedas de " + contagemDeMoedas + " países, que convertido em Reais representa um total de: R$ " + somatorioDasMoedasEmReal);
        }
        
        else if (contagemDeMoedas == 1) {
        	System.out.println("O Cofrinho tem moedas de " + contagemDeMoedas + " país, que convertido em Reais representa um total de: R$ " + somatorioDasMoedasEmReal);
        }
        
        else {
        	System.out.println("Não há Moedas");
        }
        
        
    }


}