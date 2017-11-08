public class Funcionario {

    String nome, cargo, cpf, login, senha;
    double salario;

    Funcionario(String nome, String cpf, String cargo, String senha, double salario){

        this.nome = nome;
        this.cpf = cpf;
        this.login = cpf;
        this.senha = senha;
        this.cargo = cargo;
        this.salario = salario;
    }
}