import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();

        try {
            int contar = contar(parametroUm, parametroDois);
            for (int i = 0; i <= contar; i++) {
                System.out.println("Imprimindo numero " + (i+1));
            }
        } catch (ParametrosInvalidosException e) {
            throw new RuntimeException(e);
        }
    }

    static int contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        return parametroDois - parametroUm;
    }
}
