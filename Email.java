public class Email{
    public String usuario;
    public String servidor;

    public Email(String u, String s){
        this.usuario = u;
        this.servidor = s;
    }
    public Email(){

    }
    public void exibirEmail(){
        System.out.println(this.usuario + "@"+ this.servidor);
    }
}
