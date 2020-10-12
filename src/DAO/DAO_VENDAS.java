package DAO;

import ConnectionFactory.ConnectionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Models.Vendas;

/**
 *
 * @author Dupla Danilo Batista e Kalil Isac
 */

public class DAO_VENDAS {
    
    // MÉTODO PARA A CRIAÇÃO DA LISTA VENDAS //
    public void create(Vendas v) {
        Connection con = ConnectionBD.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO VENDAS (DATA, HORA, TOTAL) VALUES (?,?,?)");
            stmt.setDate(1, v.getData());
            stmt.setString(2, v.getHora());
            stmt.setDouble(3, v.getTotal());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "A venda foi salva com sucesso!!! *-*");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar a Venda fornecida: " + ex);
        } finally {
            ConnectionBD.getConnection();
        }
    }
}
