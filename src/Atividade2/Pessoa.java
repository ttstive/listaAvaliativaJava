package Atividade2;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;
    private double altura;

    public Pessoa(String nome, LocalDate dataNascimento, double altura) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int calcularIdade(){
        LocalDate today = LocalDate.now();
        if (dataNascimento != null){
            return Period.between(dataNascimento, today).getYears();
        }
        return 0;
    }
    public void retornaDados(){
        System.out.println("Nome>  " + nome);
        System.out.println("Data de Nascimento>>  " + dataNascimento);
        System.out.println("Idade>  " + calcularIdade() + "anos");
        System.out.println("Altura>  " + altura);


    }
}