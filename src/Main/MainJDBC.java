package Main;

import Conversores.ConversorData;
import DAO.DAO_CLIENTES;
import DAO.DAO_DISTRIBUIDORES;
import DAO.DAO_ITENS_VENDAS;
import DAO.DAO_PRODUTOS;
import DAO.DAO_VENDAS;
import java.sql.Date;
import Models.Clientes;
import Models.Distribuidores;
import Models.Itens_Vendas;
import Models.Produtos;
import Models.Vendas;

/**
 *
 * @author Dupla Danilo Batista e Kalil Isac
 */

public class MainJDBC {

    public static void main(String[] args) {
        
            /*
            ----> A APLICAÇÃO RODARÁ TUDO EM APENAS UM EXECUTAR
            */
        
        // <><><><><><><><><><><> INÍCIO CLIENTES <><><><><><><><><><><> //
        
        
        Clientes c1 = new Clientes();
        c1.setNome("Danilo Batista");
        c1.setData_Nasc((Date) ConversorData.StringParaData("05/03/2001"));
        c1.setEndereco("São José dos Campos, SP");
        c1.setTelefone("98171-6973");
        c1.setEmail("danilo2221@gmail.com");

        Clientes c2 = new Clientes();
        c2.setNome("Kalil Isac");
        c2.setData_Nasc((Date) ConversorData.StringParaData("12/09/1999"));
        c2.setEndereco("São José dos Campos, SP");
        c2.setTelefone("98120-6377");
        c2.setEmail("kalil.isac@gmail.com");

        Clientes c3 = new Clientes();
        c3.setNome("Bruno Brust");
        c3.setData_Nasc((Date) ConversorData.StringParaData("10/03/1999"));
        c3.setEndereco("Sorriso, PR");
        c3.setTelefone("9677-9056");
        c3.setEmail(null);

        Clientes c4 = new Clientes();
        c4.setNome("Maria Lúcia");
        c4.setData_Nasc((Date) ConversorData.StringParaData("23/03/1969"));
        c4.setEndereco("Belo Horizonte, MG");
        c4.setTelefone("98239-7893");
        c4.setEmail("lucia.confeccoes@outlook.com.br");

        Clientes c5 = new Clientes();
        c5.setNome("Leonardo Silva");
        c5.setData_Nasc((Date) ConversorData.StringParaData("15/08/1990"));
        c5.setEndereco("Osasco, SP");
        c5.setTelefone("99372-4080");
        c5.setEmail(null);
        
        DAO_CLIENTES Clientes = new DAO_CLIENTES();
        Clientes.create(c1);
        Clientes.create(c2);
        Clientes.create(c3);
        Clientes.create(c4);
        Clientes.create(c5);
        // EXIBE O EMAIL NULL
        DAO_CLIENTES daoCli  = new DAO_CLIENTES();
        daoCli.ExibirEmailNull();
        
        
         // <><><><><><><><><><><> INÍCIO VENDAS <><><><><><><><><><><> //
        
         
        Vendas v1 = new Vendas();
        v1.setData((Date) ConversorData.StringParaData("01/08/2020"));
        v1.setHora("19:23");
        v1.setTotal(300.00);
        
        Vendas v2 = new Vendas();
        v2.setData((Date) ConversorData.StringParaData("03/03/2023"));
        v2.setHora("16:55");
        v2.setTotal(850.00);

        Vendas v3 = new Vendas();
        v3.setData((Date) ConversorData.StringParaData("08/12/2019"));
        v3.setHora("14:34");
        v3.setTotal(630.00);
        
        Vendas v4 = new Vendas();
        v4.setData((Date) ConversorData.StringParaData("24/05/2018"));
        v4.setHora("04:30");
        v4.setTotal(300.00);

        Vendas v5 = new Vendas();
        v5.setData((Date) ConversorData.StringParaData("20/10/2022"));
        v5.setHora("09:23");
        v5.setTotal(2100.00);

        Vendas v6 = new Vendas();
        v6.setData((Date) ConversorData.StringParaData("31/07/2018"));
        v6.setHora("20:11");
        v6.setTotal(500.00);

        Vendas v7 = new Vendas();
        v7.setData((Date) ConversorData.StringParaData("14/04/2019"));
        v7.setHora("18:19");
        v7.setTotal(2000.00);

        Vendas v8 = new Vendas();
        v8.setData((Date) ConversorData.StringParaData("27/10/2020"));
        v8.setHora("13:52");
        v8.setTotal(450.00);

        Vendas v9 = new Vendas();
        v9.setData((Date) ConversorData.StringParaData("30/06/2025"));
        v9.setHora("10:45");
        v9.setTotal(1900.00);

        Vendas v10 = new Vendas();
        v10.setData((Date) ConversorData.StringParaData("05/10/2017"));
        v10.setHora("12:30");
        v10.setTotal(1200.00);
     
        DAO_VENDAS Vendas = new DAO_VENDAS();
        Vendas.create(v1);
        Vendas.create(v2);
        Vendas.create(v3);
        Vendas.create(v4);
        Vendas.create(v5);
        Vendas.create(v6);
        Vendas.create(v7);
        Vendas.create(v8);
        Vendas.create(v9);
        Vendas.create(v10);
        
        
         // <><><><><><><><><><><> INÍCIO ITENS_VENDAS <><><><><><><><><><><> //
        
         
        Itens_Vendas i1 = new Itens_Vendas();
        i1.setQuantidade(70);
        i1.setSub_Total(250.00);
        
        Itens_Vendas i2 = new Itens_Vendas();
        i2.setQuantidade(10);
        i2.setSub_Total(120.00);

        Itens_Vendas i3 = new Itens_Vendas();
        i3.setQuantidade(17);
        i3.setSub_Total(180.00);

        Itens_Vendas i4 = new Itens_Vendas();
        i4.setQuantidade(15);
        i4.setSub_Total(130.00);

        Itens_Vendas i5 = new Itens_Vendas();
        i5.setQuantidade(3);
        i5.setSub_Total(80.00);

        Itens_Vendas i6 = new Itens_Vendas();
        i6.setQuantidade(17);
        i6.setSub_Total(140.00);

        Itens_Vendas i7 = new Itens_Vendas();
        i7.setQuantidade(19);
        i7.setSub_Total(89.00);

        Itens_Vendas i8 = new Itens_Vendas();
        i8.setQuantidade(14);
        i8.setSub_Total(210.00);

        Itens_Vendas i9 = new Itens_Vendas();
        i9.setQuantidade(7);
        i9.setSub_Total(42.00);

        Itens_Vendas i10 = new Itens_Vendas();
        i10.setQuantidade(11);
        i10.setSub_Total(190.00);

        Itens_Vendas i11 = new Itens_Vendas();
        i11.setQuantidade(5);
        i11.setSub_Total(500.00);

        Itens_Vendas i12 = new Itens_Vendas();
        i12.setQuantidade(10);
        i12.setSub_Total(100.00);

        Itens_Vendas i13 = new Itens_Vendas();
        i13.setQuantidade(47);
        i13.setSub_Total(1500.00);

        Itens_Vendas i14 = new Itens_Vendas();
        i14.setQuantidade(14);
        i14.setSub_Total(1500.00);

        Itens_Vendas i15 = new Itens_Vendas();
        i15.setQuantidade(22);
        i15.setSub_Total(410.00);

        Itens_Vendas i16 = new Itens_Vendas();
        i16.setQuantidade(7);
        i16.setSub_Total(230.00);

        Itens_Vendas i17 = new Itens_Vendas();
        i17.setQuantidade(13);
        i17.setSub_Total(130.00);

        Itens_Vendas i18 = new Itens_Vendas();
        i18.setQuantidade(15);
        i18.setSub_Total(20.00);

        Itens_Vendas i19 = new Itens_Vendas();
        i19.setQuantidade(18);
        i19.setSub_Total(130.00);

        Itens_Vendas i20 = new Itens_Vendas();
        i20.setQuantidade(20);
        i20.setSub_Total(1600.00);

        Itens_Vendas i21 = new Itens_Vendas();
        i21.setQuantidade(27);
        i21.setSub_Total(2010.00);

        Itens_Vendas i22 = new Itens_Vendas();
        i22.setQuantidade(80);
        i22.setSub_Total(350.00);

        Itens_Vendas i23 = new Itens_Vendas();
        i23.setQuantidade(127);
        i23.setSub_Total(580.00);

        Itens_Vendas i24 = new Itens_Vendas();
        i24.setQuantidade(21);
        i24.setSub_Total(457.00);

        Itens_Vendas i25 = new Itens_Vendas();
        i25.setQuantidade(28);
        i25.setSub_Total(854.00);

        Itens_Vendas i26 = new Itens_Vendas();
        i26.setQuantidade(15);
        i26.setSub_Total(487.00);

        Itens_Vendas i27 = new Itens_Vendas();
        i27.setQuantidade(28);
        i27.setSub_Total(210.00);

        Itens_Vendas i28 = new Itens_Vendas();
        i28.setQuantidade(22);
        i28.setSub_Total(530.00);

        Itens_Vendas i29 = new Itens_Vendas();
        i29.setQuantidade(29);
        i29.setSub_Total(230.00);

        Itens_Vendas i30 = new Itens_Vendas();
        i30.setQuantidade(11);
        i30.setSub_Total(420.00);

        DAO_ITENS_VENDAS Itens_Vendas = new DAO_ITENS_VENDAS();
        Itens_Vendas.create(i1);
        Itens_Vendas.create(i2);
        Itens_Vendas.create(i3);
        Itens_Vendas.create(i4);
        Itens_Vendas.create(i5);
        Itens_Vendas.create(i6);
        Itens_Vendas.create(i7);
        Itens_Vendas.create(i8);
        Itens_Vendas.create(i9);
        Itens_Vendas.create(i10);
        Itens_Vendas.create(i11);
        Itens_Vendas.create(i12);
        Itens_Vendas.create(i13);
        Itens_Vendas.create(i14);
        Itens_Vendas.create(i15);
        Itens_Vendas.create(i16);
        Itens_Vendas.create(i17);
        Itens_Vendas.create(i18);
        Itens_Vendas.create(i19);
        Itens_Vendas.create(i20);
        Itens_Vendas.create(i21);
        Itens_Vendas.create(i22);
        Itens_Vendas.create(i23);
        Itens_Vendas.create(i24);
        Itens_Vendas.create(i25);
        Itens_Vendas.create(i26);
        Itens_Vendas.create(i27);
        Itens_Vendas.create(i28);
        Itens_Vendas.create(i29);
        Itens_Vendas.create(i30);
        
        
        // <><><><><><><><><><><> INÍCIO PRODUTOS <><><><><><><><><><><> //
        
        
        Produtos p1 = new Produtos();
        p1.setPreco_Venda(200.00);
        p1.setDescricao("Computador");
        p1.setData_Validade((Date) ConversorData.StringParaData("17/12/2023"));
        p1.setPreco_Custo(150.00);
        p1.setEstoque(23);

        Produtos p2 = new Produtos();
        p2.setPreco_Venda(190.00);
        p2.setDescricao("Headset");
        p2.setData_Validade((Date) ConversorData.StringParaData("18/11/2022"));
        p2.setPreco_Custo(80.00);
        p2.setEstoque(6);

        Produtos p3 = new Produtos();
        p3.setPreco_Venda(120.00);
        p3.setDescricao("Mouse");
        p3.setData_Validade((Date) ConversorData.StringParaData("01/01/2020"));
        p3.setPreco_Custo(85.00);
        p3.setEstoque(4);

        Produtos p4 = new Produtos();
        p4.setPreco_Venda(29.00);
        p4.setDescricao("Mousepad");
        p4.setData_Validade((Date) ConversorData.StringParaData("13/10/2020"));
        p4.setPreco_Custo(15.00);
        p4.setEstoque(5);

        Produtos p5 = new Produtos();
        p5.setPreco_Venda(210.00);
        p5.setDescricao("Teclado");
        p5.setData_Validade((Date) ConversorData.StringParaData("16/09/2021"));
        p5.setPreco_Custo(150.00);
        p5.setEstoque(9);

        Produtos p6 = new Produtos();
        p6.setPreco_Venda(2100.00);
        p6.setDescricao("Computador");
        p6.setData_Validade((Date) ConversorData.StringParaData("06/01/2021"));
        p6.setPreco_Custo(1550.00);
        p6.setEstoque(2);

        Produtos p7 = new Produtos();
        p7.setPreco_Venda(500.00);
        p7.setDescricao("Monitor");
        p7.setData_Validade((Date) ConversorData.StringParaData("01/03/2022"));
        p7.setPreco_Custo(280.00);
        p7.setEstoque(4);

        Produtos p8 = new Produtos();
        p8.setPreco_Venda(2000.00);
        p8.setDescricao("Televisão");
        p8.setData_Validade((Date) ConversorData.StringParaData("12/12/2022"));
        p8.setPreco_Custo(1200.00);
        p8.setEstoque(4);

        Produtos p9 = new Produtos();
        p9.setPreco_Venda(450.00);
        p9.setDescricao("Relógio");
        p9.setData_Validade((Date) ConversorData.StringParaData("01/02/2020"));
        p9.setPreco_Custo(230.00);
        p9.setEstoque(9);

        Produtos p10 = new Produtos();
        p10.setPreco_Venda(1900.00);
        p10.setDescricao("Videogame");
        p10.setData_Validade((Date) ConversorData.StringParaData("03/04/2021"));
        p10.setPreco_Custo(1000.00);
        p10.setEstoque(3);
        
        DAO_PRODUTOS Produtos = new DAO_PRODUTOS();
        Produtos.create(p1);
        Produtos.create(p2);
        Produtos.create(p3);
        Produtos.create(p4);
        Produtos.create(p5);
        Produtos.create(p6);
        Produtos.create(p7);
        Produtos.create(p8);
        Produtos.create(p9);
        Produtos.create(p10);
        // EXIBE A DATA DE VALIDADE VENCIDAS NESTE ANO
        DAO_PRODUTOS daoProd  = new DAO_PRODUTOS();
        daoProd.ExibirData_Validade();
        
        
        // <><><><><><><><><><><> INÍCIO DISTRIBUIDORES <><><><><><><><><><><> //
        
        
        Distribuidores d = new Distribuidores();
        d.setNome_Fantasia("Nova Eletrônica");
        d.setRazao_Social("Nova Eletrônica Ltda");
        d.setTelefone("3902-2010");
        d.setEmail("novaeletronica@novaeletronica.com");

        DAO_DISTRIBUIDORES Distribuidores = new DAO_DISTRIBUIDORES();
        Distribuidores.create(d);
    }
}

        // <><><><><><><><><><><> FIM DA APLICAÇÃO *-* <><><><><><><><><><><> //