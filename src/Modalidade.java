public class Modalidade {

    String nome;
    static int id;
    double preco;

    Modalidade(String nome, double preco){

        this.nome = nome;
        this.id = ++id;
        this.preco = preco;
    }
}