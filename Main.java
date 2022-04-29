import java.util.Scanner;
public class Main{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       Funcionario joao = new Funcionario();
        joao.celular.setCodPais(55);
        joao.celular.setDdd(85);
        joao.celular.setNumero(689098);
        joao.dadosPessoais();
    }
}
