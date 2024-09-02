package AulaEncapsulamento;
import AulaEncapsulamento.exemplosAcesso.Pessoa;
public class TesteAcesso {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "Jonas";
        //funciona se o String nome for public
    }
}
