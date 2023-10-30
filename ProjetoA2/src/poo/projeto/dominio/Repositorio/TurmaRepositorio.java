package poo.projeto.dominio.Repositorio;

import poo.projeto.dominio.Turma;
import poo.projeto.dominio.FakeDB.TurmaFakeDB;

public class TurmaRepositorio extends BaseGenericaCRUD<TurmaFakeDB, Turma>{

    public TurmaRepositorio() {
        this.db = new TurmaFakeDB();
        this.dataset = this.db.getLista();
    }

    @Override
    public Turma Create(Turma instancia) {
        int tam = this.dataset.size() - 1;
        int proxCodigo = this.dataset.get(tam).getCodigo();
        proxCodigo++;
        instancia.setCodigo(proxCodigo);
        this.dataset.add(instancia);
        return instancia;
    }

    @Override
    public Turma Read(int codigo) {
          for (Turma turma : this.dataset) {
            if (turma.getCodigo() == codigo)
                turma.toString();
        }
        return null;  
    }

    @Override
    public Turma Update(Turma instancia) {
        Turma turma = this.Read(instancia.getCodigo());
        turma.setAlunos(instancia.getAlunos());
        turma.setCapacidadeTurma(instancia.getCapacidadeTurma());
        turma.setDisciplina(instancia.getDisciplina());
        turma.setProfessor(instancia.getProfessor());
        return turma;
    }

    @Override
    public Turma Delete(int codigo) {
        Turma cod = this.Read(codigo);
        this.dataset.remove(cod);
        return cod;
    }
}
