package Models;

/**
 *
 * @author Dupla Danilo Batista e Kalil Isac
 */

public class Distribuidores {
    
    private int Cod_Dist;
    private String Nome_Fantasia;
    private String Razao_Social;
    private String Telefone;
    private String Email;
    
    public Distribuidores() {
    }
    
    public Distribuidores(int Cod_Dist, String Nome_Fantasia, String Razao_Social, String Telefone, String Email){ 
        this.Cod_Dist = Cod_Dist;
        this.Nome_Fantasia = Nome_Fantasia;
        this.Razao_Social = Razao_Social;
        this.Telefone = Telefone;
        this.Email = Email;
    }

    public int getCod_Dist() {
        return Cod_Dist;
    }

    public void setCod_Dist(int Cod_Dist) {
        this.Cod_Dist = Cod_Dist;
    }

    public String getNome_Fantasia() {
        return Nome_Fantasia;
    }

    public void setNome_Fantasia(String Nome_Fantasia) {
        this.Nome_Fantasia = Nome_Fantasia;
    }

    public String getRazao_Social() {
        return Razao_Social;
    }

    public void setRazao_Social(String Razao_Social) {
        this.Razao_Social = Razao_Social;
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