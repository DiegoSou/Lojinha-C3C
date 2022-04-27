import java.util.Scanner;
public class Main{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       Pessoa emanuela = new Pessoa(); // Instância do Objeto
       Pessoa gabriel = new Pessoa("João Gabriel", 11);
       emanuela.dadosPessoais();
       System.out.println(emanuela.cpf);
       gabriel.dadosPessoais();
    }
}
