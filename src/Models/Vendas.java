package Models;

import java.sql.Date;

/**
 *
 * @author Dupla Danilo Batista e Kalil Isac
 */
public class Vendas {

    private int Cod_Vendas;
    private Date Data;
    private String Hora;
    private double Total;

    public Vendas() {
    }

    public Vendas(int Cod_Vendas, Date Data, String Hora, double Total) {
        this.Cod_Vendas = Cod_Vendas;
        this.Data = Data;
        this.Hora = Hora;
        this.Total = Total;
    }

    public int getCod_Vendas() {
        return Cod_Vendas;
    }

    public void setCod_Vendas(int Cod_Vendas) {
        this.Cod_Vendas = Cod_Vendas;
    }

    public Date getData() {
        return Data;
    }

    public void setData(Date Data) {
        this.Data = Data;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }
    
}
