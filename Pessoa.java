public class Pessoa{
    public String nome; 
    public String rg;
    public int cpf;
    public Email email = new Email();
    public Telefone celular = new Telefone();
    public int idade;
    public String endereco;
    public Pessoa(String n, int c){
        this.nome = n;
        this.cpf = c;
    }
    public Pessoa(){

    }

    public void dadosPessoais(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade:" + idade);
        System.out.println("Telefone: " + celular.mostrarTelefone());
        email.exibirEmail();
    }
}
