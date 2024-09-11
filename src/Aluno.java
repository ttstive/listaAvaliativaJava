import java.util.ArrayList;
import java.util.Scanner;

public class Aluno {

    private String nome;
    private double nota;
    private String matricula;
    private char conceito;

    // construtor
    public Aluno(String nome, double nota, String matricula, char conceito){
        this.nome = nome;
        this.nota = nota;
        this.matricula = matricula;
        this.conceito = conceito;
    }

    // getters
    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    public String getMatricula() {
        return matricula;
    }

    public char getConceito() {
        return conceito;
    }

    // função para exibir os dados do aluno
    public void mostrarAluno(){
        System.out.println("Nome: " + nome + ", Matrícula: " + matricula + ", Nota: " + nota + ", Conceito: " + conceito);
    }







    // *************************************************** PROGRAMA PRINCIPAL ***************************************************

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // lista que armazena as instâncias criadas de alunos
        ArrayList<Aluno> alunos = new ArrayList<>();

        String adicionar; // variável para controle de looping

        do {
            // recebendo dados
            System.out.print("\nDigite o nome do aluno: ");
            String nome = scanner.nextLine();

            System.out.print("Digite a matrícula do aluno: ");
            String matricula = scanner.nextLine();

            System.out.print("Digite a nota do aluno: ");
            double nota = scanner.nextDouble();

            // definindo o valor de conceito de acordo com o valor da nota
            char conceito = 'x';
            if (nota >= 0 && nota <= 4.9){
                conceito = 'D';

            } else if (nota >= 5 && nota <= 6.9) {
                conceito = 'C';

            } else if (nota >= 7 && nota <= 8.9) {
                conceito = 'B';

            } else if (nota >= 9 && nota <= 10) {
                conceito = 'A';
            }


            // criando nova instância da classe Aluno
            Aluno aluno = new Aluno(nome, nota, matricula, conceito);
            // adicionando instância na lista
            alunos.add(aluno);

            scanner.nextLine(); // limpando o buffer (maldito!)

            // pergunta ao usuário se deseja criar mais alunos
            System.out.print("Deseja inserir outro aluno? (s/n): ");
            adicionar = scanner.nextLine();

        } while (adicionar.equalsIgnoreCase("s")); // enquanto o ususário digitar "s" o loop continua

        // mostrando todos os alunos criados
        System.out.println("\n\nAlunos criados:");
        for (Aluno a : alunos){
            a.mostrarAluno();
        }

        scanner.close(); // fechando o scanner
    }
}
