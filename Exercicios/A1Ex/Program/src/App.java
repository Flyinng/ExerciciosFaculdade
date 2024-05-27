import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array para armazenar médias e faltas de cada aluno
        double[] medias = new double[20];
        int[] faltas = new int[20];

        // Loop para entrada de dados de cada aluno
        for (int i = 0; i < 20; i++) {
            System.out.println("Aluno " + (i + 1) + ":");
            System.out.print("Digite a média do aluno: ");
            medias[i] = scanner.nextDouble();
            System.out.print("Digite a quantidade de faltas do aluno: ");
            faltas[i] = scanner.nextInt();
        }

        // Chamada do método para calcular a quantidade de alunos aprovados
        int alunosAprovados = calcularAprovados(medias, faltas);

        // Impressão do resultado
        System.out.println("Quantidade de alunos aprovados: " + alunosAprovados);
    }

    // Método para calcular a quantidade de alunos aprovados
    public static int calcularAprovados(double[] medias, int[] faltas) {
        int aprovados = 0;

        for (int i = 0; i < 20; i++) {
            // Verifica se a média é maior ou igual a 70
            if (medias[i] >= 70) {
                aprovados++;
            } else if (medias[i] >= 40 && faltas[i] <= 15) {
                // Verifica se a média está entre 40 e 69 (inclusive) e se as faltas são menores ou iguais a 15
                aprovados++;
            }
        }

        return aprovados;
    }
}
