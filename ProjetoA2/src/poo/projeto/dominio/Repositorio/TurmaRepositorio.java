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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Create'");
    }

    @Override
    public Turma Read(int codigo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Read'");
    }

    @Override
    public Turma Update(Turma instancia) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Update'");
    }

    @Override
    public Turma Delete(int codigo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Delete'");
    }
}
