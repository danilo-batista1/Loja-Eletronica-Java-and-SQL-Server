package Models;

import java.sql.Date;

/**
 *
 * @author Dupla Danilo Batista e Kalil Isac
 */

public class Clientes {
    
    private int Cod_Cli;
    public String Nome;
    public Date Data_Nasc;
    public String Endereco;
    public String Telefone;
    private String Email;
    
    public Clientes() {
    }
    
    public Clientes(int Cod_Cli, String Nome, Date Data_Nasc, String Endereco, String Telefone, String Email){ 
        this.Cod_Cli = Cod_Cli;
        this.Nome = Nome;
        this.Data_Nasc = Data_Nasc;
        this.Endereco = Endereco;
        this.Telefone = Telefone;
        this.Email = Email;
    }

    public int getCod_Cli() {
        return Cod_Cli;
    }

    public void setCod_Cli(int Cod_Cli) {
        this.Cod_Cli = Cod_Cli;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public Date getData_Nasc() {
        return Data_Nasc;
    }

    public void setData_Nasc(Date Data_Nasc) {
        this.Data_Nasc = Data_Nasc;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
   }
}

