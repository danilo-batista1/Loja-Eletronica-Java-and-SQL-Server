package Models;

import java.sql.Date;

/**
 *
 * @author Dupla Danilo Batista e Kalil Isac
 */
    
    public class Produtos {
    
    private int Cod_Prod;
    private double Preco_Venda;
    private String Descricao;
    private Date Data_Validade;
    private double Preco_Custo;
    private int Estoque;
 
    public Produtos() {
    }
    
    public Produtos(int Cod_Prod, double Preco_Venda, String Descricao, Date Data_Validade, double Preco_Custo, int Estoque){ 
        this.Cod_Prod = Cod_Prod;
        this.Preco_Venda = Preco_Venda;
        this.Descricao = Descricao;
        this.Data_Validade = Data_Validade;
        this.Preco_Custo = Preco_Custo;
        this.Estoque = Estoque;
    }

    public int getCod_Prod() {
        return Cod_Prod;
    }

    public void setCod_Prod(int Cod_Prod) {
        this.Cod_Prod = Cod_Prod;
    }

    public double getPreco_Venda() {
        return Preco_Venda;
    }

    public void setPreco_Venda(double Preco_Venda) {
        this.Preco_Venda = Preco_Venda;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public Date getData_Validade() {
        return Data_Validade;
    }

    public void setData_Validade(Date Data_Validade) {
        this.Data_Validade = Data_Validade;
    }

    public double getPreco_Custo() {
        return Preco_Custo;
    }

    public void setPreco_Custo(double Preco_Custo) {
        this.Preco_Custo = Preco_Custo;
    }

    public int getEstoque() {
        return Estoque;
    }

    public void setEstoque(int Estoque) {
        this.Estoque = Estoque;
    }   
} 
