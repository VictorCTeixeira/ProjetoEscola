package poo.projeto.FakeDB;
import java.util.ArrayList;
import java.time.LocalDate;
import poo.projeto.dominio.*;

public class ProfessorFakeDB extends BaseGenericaFakeDB<Professor>{ //200 - 299 -> professor
    private TurmaFakeDB t1 = new TurmaFakeDB();
    private ArrayList<Turma> listaTurmas = t1.getLista();
    private ArrayList<Turma> listaTurmaProfessor1 = new ArrayList<Turma>();
    private ArrayList<Turma> listaTurmaProfessor2 = new ArrayList<Turma>();
    private ArrayList<Turma> listaTurmaProfessor3 = new ArrayList<Turma>();
    private ArrayList<Turma> listaTurmaProfessor4 = new ArrayList<Turma>();



    @Override
    protected void CarregarDados() {
        CarregarTurmas();
        this.lista.add(new Professor(201, "Oswaldo Marques", "OM123456", LocalDate.of(1996, 05, 20), "Oswaldo", "Professor", this.listaTurmaProfessor1));
        this.lista.add(new Professor(202, "Marcos do Val", "MV987654", LocalDate.of(1992, 03, 25), "Marcos", "Professor", this.listaTurmaProfessor2));
        this.lista.add(new Professor(203, "Beatriz Schimidt", "BM856531", LocalDate.of(1999, 04, 28), "Beatriz", "Professor", this.listaTurmaProfessor3));
        this.lista.add(new Professor(204, "Márcia Souza", "MS228134", LocalDate.of(1985, 8, 13), "Márcia", "Professor", this.listaTurmaProfessor4));    
    }

    private void CarregarTurmas(){

        this.listaTurmaProfessor1.add(listaTurmas.get(1)); // 1, 6 e 7
        this.listaTurmaProfessor1.add(listaTurmas.get(6));
        this.listaTurmaProfessor1.add(listaTurmas.get(7));
        
        this.listaTurmaProfessor2.add(listaTurmas.get(0)); // 0

        this.listaTurmaProfessor3.add(listaTurmas.get(3)); // 3 e 4
        this.listaTurmaProfessor3.add(listaTurmas.get(4));

        this.listaTurmaProfessor4.add(listaTurmas.get(5));
        this.listaTurmaProfessor4.add(listaTurmas.get(2)); // 5 e 2
    }

    public ProfessorFakeDB(){
        super();
    }
    
}
