import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Long> listaNumeros = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        Long numero = scanner.nextLong();

        if (numero >= 10) {
            for (Long i = 0L; i < numero; i++) {
                listaNumeros.add(fibonacci(i));
            }
        } else {
            for (Long i = 0L; i < 10; i++) {
                listaNumeros.add(fibonacci(i));
            }
        }
        System.out.println(listaNumeros);

        if (listaNumeros.contains(numero)) {
            System.out.println("O número " + numero + " faz parte da sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " NÃO faz parte da sequência de Fibonacci.");
        }
    }

    static Long fibonacci(Long n) {

        Long anterior = 0L;
        Long atual = 1L;
        Long proximo;

        for (int x = 1; x <= n; x++) {
            proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
        return atual;
    }
}