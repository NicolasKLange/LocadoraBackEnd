package locadoraback;

import Util.Conexao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class LocadoraBack {
    public static void main(String[] args) throws ParseException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        
        ///CLIENTE
        Cliente cli     = new Cliente();
        
        
        //INCLUIR CLIENTE OK!!!
        
        /*
            DADOS PARA ADICIONAR, ALTERAR OS DADOS DO CLIENTE
        */ 
        
        /*
        cli.setNomeCliente("GABIGOL");
        cli.setEmail("gabigol@gmail.com");
        cli.setFoneCel("(42)98187-1482");
        
        
        //VERIFICACAO PARA VER SE O EMAIL É VALIDO COM O @
        if(cli.getEmail().contains("@")){
            if (cli.incluirCliente()) {
                System.out.println("Cliente incluIdo com sucesso");
            } else {
                System.out.println("Problema na inclusao do cliente");
            }
        } else {
            System.out.println("O email do cliente nao e valido.");
        }
        */
        
        /*
        //ALTERAR CLIENTE OK!!!
        cli.setCodCliente(5);
        cli.setNomeCliente("GABIGOL");
        cli.setEmail("gabigol@gmail.com");
        cli.setFoneCel("(47)99681-8899");
        
        if (cli.alterarCliente()){
            System.out.println("Cliente alterado com sucesso");
        } else {
            System.out.println("Deu problema na alteracao do cliente");
        }   
        */
        
        /*
        //EXCLUIR CLIENTE OK!!!
        cli.setCodCliente(5);
        if (cli.excluirCliente()){
            System.out.println("Cliente excluido com sucesso");
        } else {
            System.out.println("Deu problema na excluido do cliente");
        }
        */
        
        /*
        // CONSULTA UM CLIENTE OK!!!
        cli.setCodCliente(6);

        Cliente cli2 = cli.consultarCliente();
        
        if (cli2 == null) {
            System.out.println("Não localizei o cliente");
        } else {
            System.out.println("Codigo..: " + cli.getCodCliente());
            System.out.println("Nome ...: " + cli2.getNomeCliente());
            System.out.println("Email...: " + cli2.getEmail());
            System.out.println("FoneCel.: " + cli2.getFoneCel());
        }    
        */
        
        /*
        //CONSULTAR TODOS CLIENTES OK!!!
        List<Cliente> listarClientes = new ArrayList<>();
        listarClientes = cli.consultarClienteS();
        if (listarClientes != null) {
            System.out.println("Codigo" +  "\t" + "Nome            " + "\t" + 
                               "Email " + "\t"+ "Fone");
        }
        
        for (Cliente l : listarClientes) {
           System.out.println(l.getCodCliente() + "\t" + 
                              l.getNomeCliente() + "\t" + 
                              l.getEmail() + "\t" + 
                              l.getFoneCel());  
        }
        */
               
        
        ///**** VEICULO ****
        
        Veiculo vei = new Veiculo();  
        
        /*
            DADOS PARA ADICIONAR, ALTERAR OS DADOS DO VEICULO
        */
        
        /*
        vei.setMarcaVeiculo("Nissan");         
        vei.setModeloVeiculo("Kicks");         
        vei.setPlacaVeiculo("LDU-1234");         
        vei.setLocado(true);         
        
        
        //INCLUIR VEICULO OK!!!
        if (vei.incluirVeiculo()){             
            System.out.println("veiculo incluido com sucesso");         
        } else {             
            System.out.println("Deu problema na inclusao do veiculo");         
        }               
        */
        
        /*
        //ALTERAR VEICULO OK!!!
        vei.setCodVeiculo(4);         
        vei.setMarcaVeiculo("Chevrolet");         
        vei.setModeloVeiculo("Camaro");         
        vei.setPlacaVeiculo("WJS-6174");         
        vei.setLocado(false); 
        
        if (vei.alterarVeiculo()){             
            System.out.println("Veiculo alterado com sucesso");         
        } else {             
            System.out.println("Deu problema na alteracao do veiculo");        
        }
        */
        
        /*
        //EXCLUIR VEICULO OK!!!
        vei.setCodVeiculo(1); //Cod do veiculo a ser excluido
        if (vei.excluirVeiculo()){
            System.out.println("Veiculo excluido com sucesso");
        } else {
            System.out.println("Deu problema na exclusao do Veiculo");
        }
        */
        
        /*
        // CONSULTA UM VEICULO OK!!!
        vei.setCodVeiculo(5); //Cod do veiculo para fazer apenas a sua consulta com os seus dados

        Veiculo vei2 = vei.consultarVeiculo();
        
        if (vei2 == null) {
            System.out.println("Não localizei o veiculo");
        } else {
            System.out.println("Codigo.: " + vei.getCodVeiculo());
            System.out.println("Marca..: " + vei2.getMarcaVeiculo());
            System.out.println("Modelo.: " + vei2.getModeloVeiculo());
            System.out.println("Placa..: " + vei2.getPlacaVeiculo());
            
        }
        */
        
        /*
        //CONSULTAR TODOS VEICULOS OK!!!
        List<Veiculo> listarVeiculos = new ArrayList<>();
        listarVeiculos = vei.consultarVeiculoS();
        if (listarVeiculos != null) {
            System.out.println("Codigo " +  "\t" + "Marca " + "\t" + 
                               "Modelo " + "\t"+ "Placa " + "\t"+ "Locado");
        }
        
        for (Veiculo l : listarVeiculos) {
           System.out.println(l.getCodVeiculo() + "\t" + 
                              l.getMarcaVeiculo()+ "\t" + 
                              l.getModeloVeiculo()+ "\t" + 
                              l.getPlacaVeiculo()                 
           );  
        }
        */
    }
}
