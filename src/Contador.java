import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int parametroUm = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int parametroDois = scanner.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } 
        catch (ParametrosInvalidoException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidoException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidoException("O segundo número deve ser maior que o primeiro.");
        }

        int contagem = parametroDois - parametroUm;
        
        for (int indice = 0; indice < contagem; indice++) {
            System.out.println("Número 1: " + parametroUm + " Número 2: " + parametroDois);
        }
    }
}
