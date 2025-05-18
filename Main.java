public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João", "123");
        aluno1.cadastrarNota(7.5);
        aluno1.cadastrarNota(8.0);
        aluno1.cadastrarNota(6.5);
        aluno1.cadastrarNota(9.0);
        
        Aluno aluno2 = new Aluno("Maria", "456");
        aluno2.cadastrarNota(5.0);
        aluno2.cadastrarNota(6.0);
        aluno2.cadastrarNota(6.5);
        aluno2.cadastrarNota(5.5);
        
        Turma turma = new Turma(10);
        turma.adicionarAluno(aluno1);
        turma.adicionarAluno(aluno2);
        
        turma.listarAprovados();
        turma.listarReprovados();
    }
}
