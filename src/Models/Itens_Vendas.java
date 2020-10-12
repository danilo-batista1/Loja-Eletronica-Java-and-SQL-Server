package Models;

/**
 *
 * @author Dupla Danilo Batista e Kalil Isac
 */
    
    public class Itens_Vendas {
    
    private int Quantidade;
    private double Sub_Total;
 
    public Itens_Vendas() {
    }
    
    public Itens_Vendas(int Quantidade, double Sub_Total){ 
        this.Quantidade = Quantidade;
        this.Sub_Total = Sub_Total;
        
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }

    public double getSub_Total() {
        return Sub_Total;
    }

    public void setSub_Total(double Sub_Total) {
        this.Sub_Total = Sub_Total;
        
    }     
} 