package exercicios;

/**
 * Classe mutável que representa uma cidade.
 * Possui os mesmos atributos de {@link CidadeRecord}, mas como tem setters,
 * o estado de um objeto Cidade pode ser alterado depois de criado.
 */
public class Cidade {
    private String nome;

    public Cidade() {
    }

    public Cidade(final String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cidade[nome=%s]".formatted(nome);
    }
}
