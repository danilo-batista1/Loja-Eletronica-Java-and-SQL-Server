package DAO;

import ConnectionFactory.ConnectionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Models.Itens_Vendas;

/**
 *
 * @author Dupla Danilo Batista e Kalil Isac
 */

public class DAO_ITENS_VENDAS {
    
    // MÉTODO PARA A CRIAÇÃO DA LISTA ITENS_VENDAS //
    public void create(Itens_Vendas c) {
        Connection con = ConnectionBD.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO ITENS_VENDAS (QUANTIDADE, SUB_TOTAL) VALUES (?,?)");
            stmt.setInt(1, c.getQuantidade());
            stmt.setDouble(2, c.getSub_Total());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "O Itens_Vendas foi salvo com sucesso!!! *-*");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar o Itens_Vendas fornecido: " + ex);
        } finally {
            ConnectionBD.getConnection();
        }
    }

}
