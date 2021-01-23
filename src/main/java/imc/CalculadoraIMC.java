package imc;

import pessoa.Pessoa;

public class CalculadoraIMC {
    /* Uma pequena tabela:
     * ** Menor que 18,5 - MAGREZA
     * ** Entre 18,5 e 24,9 - NORMAL
     * ** Entre 25,0 e 29,9 - SOBREPESO
     * ** Entre 30,0 e 39,9 - OBESIDADE
     * ** Maior que 40,0 - OBESIDADE MÓRBIDA
     * */

    public Double calcula(final Pessoa pessoa) {
        final var altura = pessoa.getAltura();
        final var imc = pessoa.getPeso() / (altura * altura);

        return imc;
    }

}
