import java.util.ArrayList;
import java.util.Scanner;

public class Sindicato {
    private ArrayList<Professor> professores = new ArrayList<>();

    public void cadastrarProfessor() {
        Scanner sc = new Scanner(System.in);
        Professor professor = new Professor();

        // Validação do nome (somente letras)
        while (true) {
            System.out.println("Digite o nome do professor (somente letras): ");
            professor.nome = sc.nextLine();
            if (professor.nome.matches("[a-zA-Z\\s]+")) {
                break; // Nome válido
            } else {
                System.out.println("Nome inválido! Por favor, digite apenas letras.");
            }
        }

        // Validação de titulação
        while (true) {
            System.out.println("Digite o nível de titulação do professor (Mestre, Doutor ou Especialista): ");
            professor.titulo = sc.nextLine();
            if (professor.titulo.equalsIgnoreCase("Mestre") ||
                    professor.titulo.equalsIgnoreCase("Doutor") ||
                    professor.titulo.equalsIgnoreCase("Especialista")) {
                break; // Titulação válida
            } else {
                System.out.println("Titulação inválida! Escolha entre Mestre, Doutor ou Especialista.");
            }
        }

        // Validação do CPF (somente números)
        while (true) {
            System.out.println("Agora digite o seu CPF (somente números): ");
            professor.cpf = sc.nextLine();
            if (professor.cpf.matches("\\d+")) {  // Verifica se contém apenas números
                break; // CPF válido
            } else {
                System.out.println("CPF inválido! Por favor, digite apenas números.");
            }
        }

        // Validação do salário (somente números)
        while (true) {
            System.out.println("Digite o salário do professor: ");
            if (sc.hasNextDouble()) {
                professor.salario = sc.nextDouble();
                if (professor.salario > 0) {
                    break; // Salário válido
                } else {
                    System.out.println("Salário deve ser maior que zero.");
                }
            } else {
                System.out.println("Entrada inválida! Por favor, digite um número.");
                sc.next(); // Limpa a entrada inválida
            }
        }

        professores.add(professor);
    }

    public double calcularTotalArrec() {
        double totalArr = 0;
        for (Professor professor : professores) {
            totalArr += professor.calculaContribuicao();
        }
        return totalArr;
    }

    public int contarTitulacoesMestre() {
        int count = 0;
        for (Professor professor : professores) {
            if (professor.getTitulo().equalsIgnoreCase("Mestre")) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        return String.format("Total Arrecadado: %.2f\nNúmero de Mestres: %d", calcularTotalArrec(), contarTitulacoesMestre());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sindicato sindicato = new Sindicato();
        boolean continuar = true;

        while (continuar) {
            sindicato.cadastrarProfessor();
            System.out.println("Deseja cadastrar um novo professor? (S/N)");
            continuar = sc.next().equalsIgnoreCase("S");
            System.out.println("Ok...\n...Carregando");
        }
        sindicato.calcularTotalArrec();
        System.out.println(sindicato);
    }
}
