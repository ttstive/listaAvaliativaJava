public class Professor {
    public String nome, cpf, titulo;
    public double salario;


    public double calculaContribuicao (){
        double taxa = 0;
        switch (titulo) {
            case "Especialista":
                taxa = 0.012;
                break;
            case "Mestre":
                taxa = 0.014;
                break;
            case "Doutor":
                taxa = 0.016;
                break;
            default:
                System.out.println("Titulação inválida.");
                return 0;
        }
        return salario * taxa;
    }
    public String getTitulo(){
        return titulo;
    }
}
