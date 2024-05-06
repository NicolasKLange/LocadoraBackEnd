package locadoraback;
public class Automovel extends Veiculo {
    private int potenciaHP;
    private int qtdPassageiros;

    @Override
    public boolean abastecer(String tipoCombustivel, 
                             int    qtdCombustivel, 
                             float  precoCombustivel){

        if ((qtdCombustivel * precoCombustivel) > 0)  {
            System.out.println("O valor total abastecido de " + tipoCombustivel + " foi : " + (qtdCombustivel * precoCombustivel));            
            return true;            
        } else {
                return false;
        }

    }
    
    
    public void imprimirDadosVeiculo(){
        System.out.println("Codigo..........: " + this.getCodVeiculo());
        System.out.println("Marca...........: " + this.getMarcaVeiculo());
        System.out.println("Modelo..........: " + this.getModeloVeiculo());
        var locado = 'N';
        
        if (this.isLocado()){
            locado = 'S';
        }
        System.out.println("Locado?(S/N)....: " + locado);
        System.out.println("Potencia .......: " + this.getPotenciaHP() + "HP");
        System.out.println("Qtd.Passageiros.: " + this.getQtdPassageiros());
        
    }
    

    public int getPotenciaHP() {
        return potenciaHP;
    }

    public void setPotenciaHP(int potenciaHP) {
        this.potenciaHP = potenciaHP;
    }

    public int getQtdPassageiros() {
        return qtdPassageiros;
    }

    public void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }
}
