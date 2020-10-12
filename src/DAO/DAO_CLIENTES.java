package DAO;

import ConnectionFactory.ConnectionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Models.Clientes;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dupla Danilo Batista e Kalil Isac
 */

public class DAO_CLIENTES {

    // MÉTODO PARA A CRIAÇÃO DA LISTA CLIENTES //
    public void create(Clientes c) {
        Connection con = ConnectionBD.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO CLIENTES(NOME, DATA_NASC, ENDERECO, TELEFONE, EMAIL) VALUES (?,?,?,?,?)");
            stmt.setString(1, c.getNome());
            stmt.setDate(2, c.getData_Nasc());
            stmt.setString(3, c.getEndereco());
            stmt.setString(4, c.getTelefone());
            stmt.setString(5, c.getEmail());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "O cliente foi salvo com sucesso!!! *-*");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar o cliente fornecido: " + e);
        } finally {
            ConnectionBD.getConnection();
        }
    }

    // MÉTODO PARA A CRIAÇÃO DA LISTAGEM DO EMAIL NULO //
    public List<Clientes> EmailNull() {

        Connection con = ConnectionBD.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Clientes> cliList = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM CLIENTES WHERE EMAIL IS NULL");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Clientes c = new Clientes();

                c.setNome(rs.getString("NOME"));
                c.setData_Nasc(rs.getDate("DATA_NASC"));
                c.setEndereco(rs.getString("ENDERECO"));
                c.setTelefone(rs.getString("TELEFONE"));
                c.setEmail(rs.getString("EMAIL"));
                cliList.add(c);

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na Consulta: " + ex);
        } finally {
            ConnectionBD.closeConnection(con, stmt, rs);
        }

        return cliList;
    }

    // MÉTODO PARA EXIBIR O EMAIL NULO //
    public void ExibirEmailNull() {

        List<Clientes> EMAIL = EmailNull();

        for (Clientes c : EMAIL) {
            if (c.getEmail() == null) {
                System.out.println(c.getNome());
            }
        }
    }
}
