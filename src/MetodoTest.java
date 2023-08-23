import java.util.Scanner;

class MetodoTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos alunos você irá inserir? ");
        int quantidadeAlunos = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        double somaNotas = 0;
        String alunoMaiorNota = "";
        double maiorNota = Double.MIN_VALUE;

        for (int i = 1; i <= quantidadeAlunos; i++) {
            System.out.print("Digite o nome do " + i + "º aluno: ");
            String nomeAluno = scanner.next();

            System.out.print("Digite a nota do " + i + "º aluno: ");
            double notaAluno = scanner.nextDouble();
            scanner.nextLine(); //

            somaNotas += notaAluno;

            if (notaAluno > maiorNota) {
                maiorNota = notaAluno;
                alunoMaiorNota = nomeAluno;
            } else if (notaAluno == maiorNota && nomeAluno.compareTo(alunoMaiorNota) < 0) {
                alunoMaiorNota = nomeAluno;
            }
        }

        double media = CalculadoraDeMedias.calcularMedia(somaNotas, quantidadeAlunos);

        System.out.println("A média da turma é " + media);
        System.out.println("A Maior nota da turma é: " + maiorNota + ", do aluno " + alunoMaiorNota);
        scanner.close();
    }
}