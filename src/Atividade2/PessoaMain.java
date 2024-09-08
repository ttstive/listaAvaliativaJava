package Atividade2;

import java.time.LocalDate;
import java.util.Scanner;

public class PessoaMain {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            // Criando uma nova pessoa
            Pessoa pessoa = new Pessoa("João", LocalDate.of(1990, 5, 10), 1.75);


            // Imprimindo todos os dados da pessoa
            pessoa.retornaDados();

            // Alterando alguns dados
            pessoa.setDataNascimento(LocalDate.of(1999, 4, 12));
            pessoa.setNome("Joaozinho");
            pessoa.setAltura(1.68);

            System.out.println("\nApós mudanças:");
            pessoa.retornaDados();

        }
    }

