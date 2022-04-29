public class Pessoa{
    private String nome; 
    private String rg;
    private int cpf;
    public Email email = new Email();
	public Telefone celular = new Telefone();
    private int idade;
    private String endereco;
    
    public Pessoa(String n, int c){
        this.nome = n;
        this.cpf = c;
    }
    public Pessoa(){

    }
    public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public void dadosPessoais(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade:" + idade);
        System.out.println("Telefone: " + celular.mostrarTelefone());
        email.exibirEmail();
    }
}
