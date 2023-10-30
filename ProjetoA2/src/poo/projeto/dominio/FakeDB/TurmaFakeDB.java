package poo.projeto.dominio.FakeDB;
import poo.projeto.dominio.*;
import java.util.ArrayList;

public class TurmaFakeDB extends BaseGenericaFakeDB<Turma>{ // 100 - 199 -> turma
    private DisciplinaFakeDB disciplinas = new DisciplinaFakeDB();
    private ArrayList<Disciplina> listaDisciplinas = disciplinas.getLista();
    private ArrayList<Disciplina> listaDisciplinasTurma1 = new ArrayList<Disciplina>();
    private ArrayList<Disciplina> listaDisciplinasTurma2 = new ArrayList<Disciplina>();
    private ArrayList<Disciplina> listaDisciplinasTurma3 = new ArrayList<Disciplina>();
    private ArrayList<Disciplina> listaDisciplinasTurma4 = new ArrayList<Disciplina>();
    private ArrayList<Disciplina> listaDisciplinasTurma5 = new ArrayList<Disciplina>();
    private ArrayList<Disciplina> listaDisciplinasTurma6 = new ArrayList<Disciplina>();
    private ArrayList<Disciplina> listaDisciplinasTurma7 = new ArrayList<Disciplina>();
    private ArrayList<Disciplina> listaDisciplinasTurma8 = new ArrayList<Disciplina>();

    private ProfessorFakeDB professores = new ProfessorFakeDB();
    private ArrayList<Professor> listaProfessores = professores.getLista();

    private AlunoFakeDB alunos = new AlunoFakeDB();
    private ArrayList<Aluno> listaAlunos = alunos.getLista();
    private ArrayList<Aluno> listaAlunosTurma1 = new ArrayList<Aluno>();
    private ArrayList<Aluno> listaAlunosTurma2 = new ArrayList<Aluno>();
    private ArrayList<Aluno> listaAlunosTurma3 = new ArrayList<Aluno>();
    private ArrayList<Aluno> listaAlunosTurma4 = new ArrayList<Aluno>();
    private ArrayList<Aluno> listaAlunosTurma5 = new ArrayList<Aluno>();
    private ArrayList<Aluno> listaAlunosTurma6 = new ArrayList<Aluno>();
    private ArrayList<Aluno> listaAlunosTurma7 = new ArrayList<Aluno>();
    private ArrayList<Aluno> listaAlunosTurma8 = new ArrayList<Aluno>();
    
    @Override
    protected void CarregarDados(){
        CarregarDisciplinas();
        CarregarAlunos();
        this.lista.add(new Turma(101, listaDisciplinasTurma1, listaProfessores.get(1), listaAlunosTurma1, 10));
        this.lista.add(new Turma(102, listaDisciplinasTurma2, listaProfessores.get(0), listaAlunosTurma2, 15));
        this.lista.add(new Turma(103, listaDisciplinasTurma3, listaProfessores.get(3), listaAlunosTurma3, 20));
        this.lista.add(new Turma(104, listaDisciplinasTurma4, listaProfessores.get(2), listaAlunosTurma4, 15));
        this.lista.add(new Turma(105, listaDisciplinasTurma5, listaProfessores.get(2), listaAlunosTurma5, 30));
        this.lista.add(new Turma(106, listaDisciplinasTurma6, listaProfessores.get(3), listaAlunosTurma6, 45));
        this.lista.add(new Turma(107, listaDisciplinasTurma7, listaProfessores.get(0), listaAlunosTurma7, 25));
        this.lista.add(new Turma(108, listaDisciplinasTurma8, listaProfessores.get(0), listaAlunosTurma8, 15));
    }
    private void CarregarDisciplinas(){
        this.listaDisciplinasTurma1.add(listaDisciplinas.get(8));
        this.listaDisciplinasTurma1.add(listaDisciplinas.get(0)); 
        this.listaDisciplinasTurma1.add(listaDisciplinas.get(6));
        this.listaDisciplinasTurma1.add(listaDisciplinas.get(5));//Disciplinas da turma 1 = ingles, matematica, fisica e biologia
        this.listaDisciplinasTurma2.add(listaDisciplinas.get(0));
        this.listaDisciplinasTurma2.add(listaDisciplinas.get(5)); 
        this.listaDisciplinasTurma2.add(listaDisciplinas.get(8));
        this.listaDisciplinasTurma2.add(listaDisciplinas.get(9));// Disciplinas da turma 2 = matematica, biologia, ingles e espanhol
        this.listaDisciplinasTurma3.add(listaDisciplinas.get(6));
        this.listaDisciplinasTurma3.add(listaDisciplinas.get(7)); 
        this.listaDisciplinasTurma3.add(listaDisciplinas.get(0));
        this.listaDisciplinasTurma3.add(listaDisciplinas.get(9)); // Disciplinas da turma 3 = fisica, quimica, matematica e espanhol
        this.listaDisciplinasTurma4.add(listaDisciplinas.get(10));
        this.listaDisciplinasTurma4.add(listaDisciplinas.get(1)); 
        this.listaDisciplinasTurma4.add(listaDisciplinas.get(0));
        this.listaDisciplinasTurma4.add(listaDisciplinas.get(11));// Disciplinas da turma 4 = Filosofia, Português, Matemática e sociologia
        this.listaDisciplinasTurma5.add(listaDisciplinas.get(4));
        this.listaDisciplinasTurma5.add(listaDisciplinas.get(10)); 
        this.listaDisciplinasTurma5.add(listaDisciplinas.get(5));
        this.listaDisciplinasTurma5.add(listaDisciplinas.get(7)); // Disciplinas da turma 5 = História, Filosofia, Biologia e Química;
        this.listaDisciplinasTurma6.add(listaDisciplinas.get(3));
        this.listaDisciplinasTurma6.add(listaDisciplinas.get(4)); 
        this.listaDisciplinasTurma6.add(listaDisciplinas.get(11));
        this.listaDisciplinasTurma6.add(listaDisciplinas.get(10)); // Disciplinas da turma 6 = Geografia, História, Sociologia e Filosofia
        this.listaDisciplinasTurma7.add(listaDisciplinas.get(2));
        this.listaDisciplinasTurma7.add(listaDisciplinas.get(6)); 
        this.listaDisciplinasTurma7.add(listaDisciplinas.get(5));
        this.listaDisciplinasTurma7.add(listaDisciplinas.get(7));// Disciplinas da turma 7 = Ed fisica, Física, Biologia e Química
        this.listaDisciplinasTurma8.add(listaDisciplinas.get(8));
        this.listaDisciplinasTurma8.add(listaDisciplinas.get(9)); 
        this.listaDisciplinasTurma8.add(listaDisciplinas.get(2));
        this.listaDisciplinasTurma8.add(listaDisciplinas.get(4)); // Disciplinas da Turma 8 = Inglês, espanhol, Ed Física e História
        
        
    }

    private void CarregarAlunos(){
        this.listaAlunosTurma1.add(listaAlunos.get(0));
        this.listaAlunosTurma1.add(listaAlunos.get(1));
        this.listaAlunosTurma1.add(listaAlunos.get(2));
        this.listaAlunosTurma2.add(listaAlunos.get(3)); 
        this.listaAlunosTurma2.add(listaAlunos.get(4));
        this.listaAlunosTurma2.add(listaAlunos.get(5));
        this.listaAlunosTurma3.add(listaAlunos.get(6));
        this.listaAlunosTurma3.add(listaAlunos.get(7));
        this.listaAlunosTurma3.add(listaAlunos.get(8));
        this.listaAlunosTurma4.add(listaAlunos.get(9));
        this.listaAlunosTurma4.add(listaAlunos.get(10));
        this.listaAlunosTurma4.add(listaAlunos.get(11));
        this.listaAlunosTurma5.add(listaAlunos.get(12));
        this.listaAlunosTurma5.add(listaAlunos.get(13));
        this.listaAlunosTurma5.add(listaAlunos.get(14));
        this.listaAlunosTurma6.add(listaAlunos.get(15));
        this.listaAlunosTurma6.add(listaAlunos.get(16));
        this.listaAlunosTurma6.add(listaAlunos.get(17));
        this.listaAlunosTurma7.add(listaAlunos.get(18));
        this.listaAlunosTurma7.add(listaAlunos.get(19));
        this.listaAlunosTurma7.add(listaAlunos.get(20));
        this.listaAlunosTurma8.add(listaAlunos.get(21));
        this.listaAlunosTurma8.add(listaAlunos.get(22));
        this.listaAlunosTurma8.add(listaAlunos.get(23));

    }

    public TurmaFakeDB(){
        super();
    }

}
