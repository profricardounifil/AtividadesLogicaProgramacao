import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {
        int tamanho = 5;
        int [] vet1 = new int[tamanho];
        int x, soma = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < tamanho; i++) {
            vet1[i] = scanner.nextInt();
        }

        for (int i = 0; i < tamanho; i++) {
            System.out.println(vet1[i]);
            soma = soma + vet1[i];
        }

        System.out.println("O valor da soma dos elementos é igual a: " + soma);



    }
}
