public class Telefone{
    private int codPais;
    private int ddd;
    private int numero;

    public Telefone(int d, int n){
        this.ddd = d;
        this.numero = n;
    }
    public Telefone(){}
    
    public int getCodPais(){
        return codPais;
    }
    public void setCodPais(int codPais){
        this.codPais = codPais;
    }
    public int getDdd(){
        return ddd;
    }
    public void setDdd(int ddd){
        this.ddd = ddd;
    }
    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }


    public String mostrarTelefone(){
        String telefone = "+"+codPais +""+ddd+""+numero;
        return telefone;
    }
}
