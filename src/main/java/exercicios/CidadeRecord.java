package exercicios;

/**
 * Record que representa uma cidade.
 * Como seu único atributo é uma String (que também é imutável),
 * CidadeRecord é totalmente imutável.
 *
 * @param nome nome da cidade
 */
public record CidadeRecord(String nome) {
}
