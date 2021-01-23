import imc.CalculadoraIMC;
import pessoa.Pessoa;

public class ProgramaIMC {

    public static void main(String[] args) {
        final Pessoa pessoa = new Pessoa("Walter", 1.73, 89.2);

        final var calculadoraIMC = new CalculadoraIMC();
        final var imc = calculadoraIMC.calcula(pessoa);

        System.out.printf("ICM = %.2f\n", imc);

        if (imc < 18.5) {
            System.out.println("Sua faixa é considerada: MAGREZA.");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Sua faixa é considerada: NORMAL");
        } else if (imc >= 25.0 && imc < 29.9) {
            System.out.println("Sua faixa é considerada: SOBREPESO");
        } else if (imc >= 30.0 && imc < 39.9) {
            System.out.println("Sua faixa é considerada: OBESIDADE");
        } else {
            System.out.println("Sua faixa é considerada: OBESIDADE MÓRBIDA");
        }
    }
}
