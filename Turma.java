public class Turma {
    private Aluno[] alunos;
    private int quantidadeAlunos;

    public Turma(int capacidade) {
        this.alunos = new Aluno[capacidade];
        this.quantidadeAlunos = 0;
    }

    public boolean adicionarAluno(Aluno aluno) {
        if (quantidadeAlunos < alunos.length) {
            alunos[quantidadeAlunos] = aluno;
            quantidadeAlunos++;
            return true;
        }
        return false;
    }

    public void listarAprovados() {
        System.out.println("Alunos Aprovados:");
        for (int i = 0; i < quantidadeAlunos; i++) {
            if (alunos[i].estaAprovado()) {
                System.out.println(alunos[i].getNome() + " - " + alunos[i].getMatricula());
            }
        }
    }

    public void listarReprovados() {
        System.out.println("Alunos Reprovados:");
        for (int i = 0; i < quantidadeAlunos; i++) {
            if (!alunos[i].estaAprovado()) {
                System.out.println(alunos[i].getNome() + " - " + alunos[i].getMatricula());
            }
        }
    }
}
