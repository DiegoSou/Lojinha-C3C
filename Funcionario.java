public class Funcionario extends Pessoa{
    public int matricula;
    public String setor;
    
    @Override
    public void dadosPessoais(){
        System.out.println("Matricula: " + matricula);
        System.out.println("Setor: " + setor);
        super.dadosPessoais();
    }
}
