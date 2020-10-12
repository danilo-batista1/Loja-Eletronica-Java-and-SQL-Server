package DAO;

import ConnectionFactory.ConnectionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Models.Produtos;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dupla Danilo Batista da Silva
 */

public class DAO_PRODUTOS {
    
    // MÉTODO PARA A CRIAÇÃO DA LISTA PRODUTOS //
    public void create(Produtos p) {
        Connection con = ConnectionBD.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO PRODUTOS (PRECO_VENDA, DESCRICAO, DATA_VALIDADE, PRECO_CUSTO, ESTOQUE) VALUES (?,?,?,?,?)");
            stmt.setDouble(1, p.getPreco_Venda());
            stmt.setString(2, p.getDescricao());
            stmt.setDate(3, p.getData_Validade());
            stmt.setDouble(4, p.getPreco_Custo());
            stmt.setInt(5, p.getEstoque());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "O produto foi salvo com sucesso!!! *-*");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar o Produto fornecido: " + ex);
        } finally {
            ConnectionBD.getConnection();
        }
    }
    
    // MÉTODO PARA LISTAR OS PRODUTOS QUE ESTÃO VENCIDOS NA DATA ATUAL //
    public List<Produtos> DataValidade() {

        Connection con = ConnectionBD.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Produtos> prodList = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM PRODUTOS WHERE DATA_VALIDADE < (SELECT GETDATE())");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Produtos p = new Produtos();

                p.setPreco_Venda(rs.getDouble("PRECO_VENDA"));
                p.setDescricao(rs.getString("DESCRICAO"));
                p.setData_Validade(rs.getDate("DATA_VALIDADE"));
                p.setPreco_Custo(rs.getDouble("PRECO_CUSTO"));
                p.setEstoque(rs.getInt("ESTOQUE"));
                prodList.add(p);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na Consulta: " + ex);
        } finally {
            ConnectionBD.closeConnection(con, stmt, rs);
        }

        return prodList;
    }
    
    // MÉTODO PARA EXIBIR A DATA DOS PRODUTO QUE JÁ FORAM VENCIDO //
    public void ExibirData_Validade() {

        List<Produtos> DATA_VALIDADE = DataValidade();

        for (Produtos p : DATA_VALIDADE) {
            if (p.getData_Validade() != Conversores.ConversorData.StringParaData("10/10/2020")) {
                System.out.println(p.getData_Validade());
            }
        }
    }

}
