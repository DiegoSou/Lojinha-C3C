public class Email{
    private String usuario;
    private String servidor;

    public Email(String u, String s){
        this.usuario = u;
        this.servidor = s;
    }
    public Email(){

    }
    public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getServidor() {
		return servidor;
	}
	public void setServidor(String servidor) {
		this.servidor = servidor;
	}
	public void exibirEmail(){
        System.out.println(this.usuario + "@"+ this.servidor);
    }
}
