package exercicios;

/**
 * Record que representa uma pessoa e é apenas superficialmente imutável (shallow immutability).
 * Os campos não podem ser reatribuídos, mas como {@link Cidade} é mutável,
 * o objeto cidade de uma pessoa pode ser alterado por meio de {@code pessoa.cidade().setNome(...)}.
 *
 * @param nome nome da pessoa
 * @param cidade cidade (mutável) onde a pessoa mora
 */
public record PessoaRecordShallow(String nome, Cidade cidade) {
}
