import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int parametroUm = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int parametroDois = scanner.nextInt();

        try {
            contar(parametroUm,parametroDois);
        } catch (ParametroInvalidoException exception){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }

    static void contar(int parametroUm, int parametroDois) {
        if (parametroUm > parametroDois) {
            throw new ParametroInvalidoException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;

        for (int i = 0; i < contagem; i++) {
            System.out.println("Imprimindo o número " + (i+1));
        }
    }
}
