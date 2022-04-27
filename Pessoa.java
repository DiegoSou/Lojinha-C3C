public class Pessoa{
    // Definir atributos
    // modificador tipoPrimitivo nome
    public String nome; 
    public String rg;
    public int cpf;
    public String email;
    public int telefone;
    public int idade;
    public String endereco;
    
    // Construtor
    // modificador Classe(tipo arg, tipo arg2){
    //     Corpo do Construtor
    //     this -> Variável de referência ao objeto atual
    // }
    public Pessoa(String n, int c){
        this.nome = n;
        this.cpf = c;
    }
    public Pessoa(){

    }

    // Definir os métodos
    // modificador tipoRetorno nome(tipo arg,tipo arg2){
    //     Corpo do método
    // }
    public void dadosPessoais(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade:" + idade);
        System.out.println("Telefone: " + telefone);
        System.out.println("E-mail: " + email);
    }
}
