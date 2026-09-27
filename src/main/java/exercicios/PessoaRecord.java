package exercicios;

/**
 * Record que representa uma pessoa e é profundamente (totalmente) imutável (deep immutability).
 * Todos os seus campos são imutáveis, inclusive a cidade, que agora é um {@link CidadeRecord}.
 *
 * @param nome nome da pessoa
 * @param cidade cidade (imutável) onde a pessoa mora
 */
public record PessoaRecord(String nome, CidadeRecord cidade) {
}
