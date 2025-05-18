public class Aluno {
    private String nome;
    private String matricula;
    private double[] notas;
    private int quantidadeNotas;

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = new double[4];
        this.quantidadeNotas = 0;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public boolean cadastrarNota(double nota) {
        if (quantidadeNotas < 4) {
            notas[quantidadeNotas] = nota;
            quantidadeNotas++;
            return true;
        }
        return false;
    }

    public double calcularMedia() {
        if (quantidadeNotas == 0) {
            return 0;
        }
        
        double soma = 0;
        for (int i = 0; i < quantidadeNotas; i++) {
            soma += notas[i];
        }
        
        return soma / quantidadeNotas;
    }

    public boolean estaAprovado() {
        return calcularMedia() >= 7.0;
    }
}
