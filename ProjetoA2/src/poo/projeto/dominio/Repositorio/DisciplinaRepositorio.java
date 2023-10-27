package poo.projeto.dominio.Repositorio;

import poo.projeto.dominio.Disciplina;
import poo.projeto.dominio.FakeDB.DisciplinaFakeDB;

public class DisciplinaRepositorio extends BaseGenericaCRUD<DisciplinaFakeDB, Disciplina>{

    public DisciplinaRepositorio() {
        this.db = new DisciplinaFakeDB();
        this.dataset = this.db.getLista();
    }

    @Override
    public Disciplina Create(Disciplina instancia) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Create'");
    }

    @Override
    public Disciplina Read(int codigo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Read'");
    }

    @Override
    public Disciplina Update(Disciplina instancia) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Update'");
    }

    @Override
    public Disciplina Delete(int codigo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Delete'");
    }
}
