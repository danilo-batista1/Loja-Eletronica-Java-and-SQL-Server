package DAO;

import ConnectionFactory.ConnectionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Models.Distribuidores;

/**
 *
 * @author Dupla Danilo Batista e Kalil Isac
 */

public class DAO_DISTRIBUIDORES {

    // MÉTODO PARA A CRIAÇÃO DA LISTA DISTRIBUIDORES //
    public void create(Distribuidores e) {
        Connection con = ConnectionBD.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO DISTRIBUIDORES (NOME_FANTASIA, RAZAO_SOCIAL, TELEFONE, EMAIL) VALUES (?,?,?,?)");
            stmt.setString(1, e.getNome_Fantasia());
            stmt.setString(2, e.getRazao_Social());
            stmt.setString(3, e.getTelefone());
            stmt.setString(4, e.getEmail());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "O distribuidor foi salvo com sucesso!!! *-*");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar o distribuidor fornecido: " + ex);
        } finally {
            ConnectionBD.getConnection();
        }
    }

}
