import exercicios.Cidade;
import exercicios.CidadeRecord;
import exercicios.PessoaRecord;
import exercicios.PessoaRecordShallow;

/**
 * Classe para você testar suas implementações.
 * Veja o README para mais detalhes.
 */
public class Principal {
    public static void main(final String[] args) {
        final var pessoaShallow = new PessoaRecordShallow("Maria", new Cidade("Palmas"));
        System.out.println("PessoaRecordShallow antes:  " + pessoaShallow);

        // Não dá para reatribuir o campo cidade, mas dá para alterar o objeto Cidade que ele referencia
        pessoaShallow.cidade().setNome("Porto Nacional");
        System.out.println("PessoaRecordShallow depois: " + pessoaShallow + " (imutabilidade superficial)");

        final var pessoa = new PessoaRecord("João", new CidadeRecord("Palmas"));

        // CidadeRecord não tem setters: para "mudar" a cidade é preciso criar um novo objeto
        final var pessoaMudouDeCidade = new PessoaRecord(pessoa.nome(), new CidadeRecord("Gurupi"));
        System.out.println("PessoaRecord original:      " + pessoa + " (imutabilidade profunda)");
        System.out.println("PessoaRecord novo:          " + pessoaMudouDeCidade);
    }
}
