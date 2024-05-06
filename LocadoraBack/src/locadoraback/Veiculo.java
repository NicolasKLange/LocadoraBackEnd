package locadoraback;

import Util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Veiculo {
    private int     codVeiculo;
    private String  marcaVeiculo;
    private String  modeloVeiculo;
    private String  placaVeiculo;
    private boolean locado;
    
    ///CLASSE PARA INCLUIR O VEICULO 
    public boolean incluirVeiculo() throws ClassNotFoundException{
        String sql = "insert into veiculo ";
               sql+= "( marcaVeiculo,modeloVeiculo,placaVeiculo, locado) ";
               sql+= "values (?,?,?,?)";
        Connection con = Conexao.conectar();
        try {
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, this.marcaVeiculo);
            stm.setString(2, this.modeloVeiculo);
            stm.setString(3, this.placaVeiculo);
            stm.setBoolean(4, this.locado);
            stm.execute();
            
        } catch (SQLException error){
            System.out.println("Inclusao do veiculo com problema " + error);
            return false;
        }
        return true;
    }
    
    
    ///CLASSE PARA ALTERAR O VEICULO 
    public boolean alterarVeiculo() throws ClassNotFoundException{
        String sql = "update Veiculo ";
               sql+= "set marcaVeiculo  = ?,  ";
               sql+= "    modeloVeiculo = ?,  ";
               sql+= "    placaVeiculo  = ?,   ";
               sql+= "    locado        = ?   ";
               sql+= "where codveiculo  = ?   ";
        Connection con = Conexao.conectar();
        try {
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, this.marcaVeiculo);
            stm.setString(2, this.modeloVeiculo);
            stm.setString(3, this.placaVeiculo);
            stm.setBoolean(4, this.locado);
            stm.setInt(5, this.codVeiculo);
            stm.execute();
        } catch (SQLException error){
            System.out.println("Alteracao do veiculo com problema");
            return false;
        }
        return true;
    }
    
    ///CLASSE PARA EXCLUIR O VEICULO 
     public boolean excluirVeiculo() throws ClassNotFoundException{
        String sql = "delete from veiculo ";
               sql+= "where codveiculo = ? ";
        Connection con = Conexao.conectar();
        try {
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setInt(1, this.codVeiculo);
            stm.execute();
        } catch (SQLException error){
            System.out.println("Exclusao do veiculo com problema " + error);
            return false;
        }
        return true;
    }
    
    ///CLASSE PARA CONSULTAR O VEICULO
    public Veiculo consultarVeiculo() throws ClassNotFoundException{
        String sql = "select marcaVeiculo,modeloVeiculo,placaVeiculo, locado ";
               sql+= "from veiculo ";
               sql+= "where codveiculo = ?";
        Connection con = Conexao.conectar();
        Veiculo vei = null;
        try{
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setInt(1, this.codVeiculo);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                vei = new Veiculo();
                vei.setMarcaVeiculo(rs.getString("marcaVeiculo"));
                vei.setModeloVeiculo(rs.getString("modeloVeiculo"));
                vei.setPlacaVeiculo(rs.getString("placaVeiculo"));
                vei.setLocado(rs.getBoolean("locado"));
                
            }
        } catch (SQLException ex) {
            System.out.println("Problema na consulta de um veiculo " + ex);
        }
        return vei;
    }
    
    
    public List<Veiculo> consultarVeiculoS() throws ClassNotFoundException{
        String sql = "select codVeiculo, marcaVeiculo,modeloVeiculo,placaVeiculo, locado ";
               sql+= "from veiculo ";
               sql+= "order by 2 desc";
        Connection con = Conexao.conectar();
        List<Veiculo> listaveiculo = new ArrayList<>();
        
        try{
            PreparedStatement stm = con.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Veiculo vei = new Veiculo();
                vei.setCodVeiculo(rs.getInt("codVeiculo"));
                vei.setMarcaVeiculo(rs.getString("marcaVeiculo"));
                vei.setModeloVeiculo(rs.getString("modeloVeiculo"));
                vei.setPlacaVeiculo(rs.getString("placaVeiculo"));
                vei.setLocado(rs.getBoolean("locado"));
                listaveiculo.add(vei);
            }   
        } catch (SQLException ex) {
            System.out.println("Problema na consulta dos veiculo " + ex);
        }
        return listaveiculo;
    }
    
    
     
    
    public boolean abastecer(String tipoCombustivel, 
                             int    qtdCombustivel, 
                             float  precoCombustivel){
        return true;
    }
    
    @Override
    public String toString() {
        return "codVeiculo= " + codVeiculo 
             + " marcaVeiculo=" + marcaVeiculo 
             + " modeloVeiculo=" + modeloVeiculo 
             + " placaVeiculo=" + placaVeiculo 
             + " locado=" + locado + '}';
    }

    
    
    
    
    
// area de getters e setters
    public int getCodVeiculo() {
        return codVeiculo;
    }

    public void setCodVeiculo(int codVeiculo) {
        this.codVeiculo = codVeiculo;
    }

    public String getMarcaVeiculo() {
        return marcaVeiculo;
    }

    public void setMarcaVeiculo(String marcaVeiculo) {
        this.marcaVeiculo = marcaVeiculo;
    }

    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    public void setModeloVeiculo(String modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }

    public boolean isLocado() {
        return locado;
    }

    public void setLocado(boolean locado) {
        this.locado = locado;
    }
    
}
