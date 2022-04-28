public class Telefone{
    public int codPais;
    public int ddd;
    public int numero;

    public Telefone(int d, int n){
        this.ddd = d;
        this.numero = n;
    }
    public Telefone(){}

    public String mostrarTelefone(){
        String telefone = "+"+codPais +""+ddd+""+numero;
        return telefone;
    }
}
